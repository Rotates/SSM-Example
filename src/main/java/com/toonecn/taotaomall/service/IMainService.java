package com.toonecn.taotaomall.service;

import com.toonecn.taotaomall.entity.Goods;

import java.sql.SQLException;

/**
 * @author yang
 */
public interface IMainService {
	/**
	 * 添加商品信息
	 *
	 * @param goods 商品实体对象
	 * @return 添加是否成功
	 * @throws SQLException 添加商品信息失败
	 */
	boolean saveGoodsInfo(Goods goods) throws SQLException;
}
