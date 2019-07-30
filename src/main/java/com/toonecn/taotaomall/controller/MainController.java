package com.toonecn.taotaomall.controller;

import com.toonecn.taotaomall.entity.Goods;
import com.toonecn.taotaomall.entity.ResultMap;
import com.toonecn.taotaomall.service.IMainService;
import com.toonecn.taotaomall.utils.UUIDUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author yang
 */
@Controller
@RequestMapping("/v1.api.21cn.com")
public class MainController {
	/**
	 * 注入依赖
	 */
	@Resource(name = "mainService")
	private IMainService iMainService;

	/**
	 * 添加商品信息
	 *
	 * @param goodsName        商品名
	 * @param goodsType        商品类型
	 * @param goodsCost        成本价
	 * @param goodsPrice       销售价
	 * @param goodsMedia       商品图地址
	 * @param goodsMediaWidth  商品图宽度
	 * @param goodsMediaHeight 商品图高度
	 * @param goodsDescription 商品描述
	 * @param goodsIsPutaway   是否在架
	 * @param goodsStorage     库存量
	 * @param goodsSalesVolume 销售量
	 * @return 成功添加否
	 */
	@RequestMapping("/savegoodsinfo")
	@ResponseBody
	public ResultMap saveGoodsInfo(@RequestParam(value = "goods_name") String goodsName,
	                               @RequestParam(value = "goods_type") int goodsType,
	                               @RequestParam(value = "goods_cost") String goodsCost,
	                               @RequestParam(value = "goods_price") String goodsPrice,
	                               @RequestParam(value = "goods_media") String goodsMedia,
	                               @RequestParam(value = "goods_media_width") double goodsMediaWidth,
	                               @RequestParam(value = "goods_media_height") double goodsMediaHeight,
	                               @RequestParam(value = "goods_description") String goodsDescription,
	                               @RequestParam(value = "goods_isputaway", required = false) boolean goodsIsPutaway,
	                               @RequestParam(value = "goods_storage") int goodsStorage,
	                               @RequestParam(value = "goods_sales_volume") int goodsSalesVolume) {
		// 商品实体对象
		Goods goods = new Goods(UUIDUtil.getUuidstring(), goodsName, goodsType, new BigDecimal(goodsCost),
				new BigDecimal(goodsPrice), goodsMedia, goodsMediaWidth, goodsMediaHeight, goodsDescription,
				goodsIsPutaway, goodsStorage, goodsSalesVolume);

		System.out.println(goods.toString());
		Map<String, String> map = new HashMap<>(4);
		try {
			// 如果影响记录数大于等于1，即商品信息成功插入数据表
			if (iMainService.saveGoodsInfo(goods)) {
				map.put("save_state", "成功添加一条商品信息");
				return ResultMap.success("请求成功", map);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return ResultMap.failure("1001", "请稍后再试");
		}
		return null;
	}

}
