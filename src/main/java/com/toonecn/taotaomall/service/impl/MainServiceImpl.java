package com.toonecn.taotaomall.service.impl;

import com.toonecn.taotaomall.entity.Goods;
import com.toonecn.taotaomall.entity.ResultMap;
import com.toonecn.taotaomall.mapper.IMainMapper;
import com.toonecn.taotaomall.service.IMainService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author yang
 */
@Service("mainService")
public class MainServiceImpl implements IMainService {
	/**
	 * 注入IMainMapper接口
	 */
	@Resource
	private IMainMapper mainMapper;

	/**
	 * 添加商品信息
	 *
	 * @param goods 商品实体对象
	 * @return 包含商品添加是否成功信息在内的接口统一返回格式
	 */
	@Override
	public ResultMap saveGoodsInfo(Goods goods) {
		Map<String, String> map = new HashMap<>(4);
		// 如果影响记录数大于等于1，即商品信息成功插入数据表
		try {
			if (mainMapper.saveGoodsInfo(goods) >= 1) {
				map.put("save_state", "成功添加一条商品信息");
				return ResultMap.success("请求成功", map);
			}
		} catch (SQLException e) {
			return ResultMap.failure("1001", "添加失败啦，请稍后再试");
		}
		return null;
	}

	/**
	 * 获取所有商品的信息
	 *
	 * @return 含所有商品信息在内的接口统一返回格式
	 */
	@Override
	public ResultMap listGoodsInfo() {
		try {
			mainMapper.listGoodsInfo();
		} catch (SQLException e){

		}
		return null;
	}
}
