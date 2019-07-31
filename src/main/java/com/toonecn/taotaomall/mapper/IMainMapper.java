package com.toonecn.taotaomall.mapper;

import com.toonecn.taotaomall.entity.Goods;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;

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

	/**
	 * 获取所有商品的信息
	 *
	 * @return 所有商品信息list集合
	 * @throws SQLException 获取商品信息失败
	 */
	List<Goods> listGoodsInfo() throws SQLException;

	/**
	 * 上架指定商品ID的商品
	 *
	 * @param goodsId 商品ID
	 * @return 语句影响的记录数
	 * @throws SQLException 状态信息变更失败
	 */
	int updateGoodsStateById(@Param("goodsId") String goodsId) throws SQLException;
}
