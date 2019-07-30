package com.toonecn.taotaomall.mapper;

import com.toonecn.taotaomall.entity.Goods;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;

/**
 * @author yang
 */
@Repository
public interface IMainMapper {
	/**
	 * 添加商品信息
	 *
	 * @param goods 商品实体对象
	 * @return 语句影响的记录数
	 * @throws SQLException 添加商品信息失败
	 */
	int saveGoodsInfo(Goods goods) throws SQLException;
}
