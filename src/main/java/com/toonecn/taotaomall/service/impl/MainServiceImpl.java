package com.toonecn.taotaomall.service.impl;

import com.toonecn.taotaomall.entity.Goods;
import com.toonecn.taotaomall.entity.ResultMap;
import com.toonecn.taotaomall.mapper.IMainMapper;
import com.toonecn.taotaomall.service.IMainService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.util.List;


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
		// 如果影响记录数大于等于1，即商品信息成功插入数据表
		try {
			if (mainMapper.saveGoodsInfo(goods) >= 1) {
				return ResultMap.success("成功添加一条商品信息");
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
			List<Goods> goodsList = mainMapper.listGoodsInfo();
			return ResultMap.success("请求成功").addData("goodsList", goodsList);
		} catch (SQLException e) {
			return ResultMap.failure("1001", "拉取商品信息出错啦，请稍后再试");
		}
	}

	/**
	 * 上架指定商品ID的商品
	 *
	 * @param goodsId 商品ID
	 * @return 包含指定商品在架状态信息在内的接口统一返回格式
	 */
	@Override
	public ResultMap updateGoodsPutawayById(String goodsId) {
		try {
			if (mainMapper.updateGoodsPutawayById(goodsId) >= 1) {
				return ResultMap.success("已变更为在架状态");
			} else {
				return ResultMap.failure("1002", "未找到对应商品ID的信息");
			}
		} catch (SQLException e) {
			return ResultMap.failure("1003", "状态变更失败，请稍后再试");
		}
	}

	/**
	 * 下架指定商品ID的商品
	 *
	 * @param goodsId 商品ID
	 * @return 包含指定商品在架状态信息在内的接口统一返回格式
	 */
	@Override
	public ResultMap updateGoodsSoldoutById(String goodsId) {
		try {
			if (mainMapper.updateGoodsSoldoutById(goodsId) >= 1) {
				return ResultMap.success("已变更为下架状态");
			} else {
				return ResultMap.failure("1002", "未找到对应商品ID的信息");
			}
		} catch (SQLException e) {
			return ResultMap.failure("1003", "状态变更失败，请稍后再试");
		}
	}
}
