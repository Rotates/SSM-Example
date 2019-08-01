package com.toonecn.taotaomall.controller;

import com.toonecn.taotaomall.entity.Goods;
import com.toonecn.taotaomall.entity.ResultMap;
import com.toonecn.taotaomall.service.IMainService;
import com.toonecn.taotaomall.utils.UUIDUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.math.BigDecimal;

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
	 * @return 包含商品添加是否成功信息在内的接口统一返回格式
	 */
	@RequestMapping(value = "/goods/savegoods", method = RequestMethod.POST)
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
		return iMainService.saveGoodsInfo(goods);
	}

	/**
	 * 获取所有商品的信息
	 *
	 * @return 包含所有商品信息在内的接口统一返回格式
	 */
	@RequestMapping(value = "/goods/all", method = RequestMethod.GET)
	@ResponseBody
	public ResultMap listGoodsInfo() {
		return iMainService.listGoodsInfo();
	}

	/**
	 * 上架指定商品ID的商品
	 *
	 * @param goodsId 商品ID
	 * @return 包含指定商品在架状态信息在内的接口统一返回格式
	 */
	@RequestMapping(value = "/goods/putaway/{goods_id}", method = RequestMethod.PUT)
	@ResponseBody
	public ResultMap updateGoodsPutawayById(@PathVariable("goods_id") String goodsId) {
		return iMainService.updateGoodsPutawayById(goodsId);
	}

	/**
	 * 下架指定商品ID的商品
	 *
	 * @param goodsId 商品ID
	 * @return 包含指定商品在架状态信息在内的接口统一返回格式
	 */
	@RequestMapping(value = "/goods/soldout/{goods_id}", method = RequestMethod.PUT)
	@ResponseBody
	public ResultMap updateGoodsSoldoutById(@PathVariable("goods_id") String goodsId) {
		return iMainService.updateGoodsSoldoutById(goodsId);
	}


}
