package com.toonecn.taotaomall.service;

import com.toonecn.taotaomall.entity.Goods;
import com.toonecn.taotaomall.entity.ResultMap;

/**
 * @author yang
 */
public interface IMainService {
	/**
	 * 添加商品信息
	 *
	 * @param goods 商品实体对象
	 * @return 包含商品添加是否成功信息在内的接口统一返回格式
	 */
	ResultMap saveGoodsInfo(Goods goods);

	/**
	 * 获取所有商品的信息
	 *
	 * @return 包含所有商品信息在内的接口统一返回格式
	 */
	ResultMap listGoodsInfo();
}
