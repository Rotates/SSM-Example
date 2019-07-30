package com.toonecn.taotaomall.service.impl;

import com.toonecn.taotaomall.entity.Goods;
import com.toonecn.taotaomall.mapper.IMainMapper;
import com.toonecn.taotaomall.service.IMainService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.SQLException;

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
	 * @return 添加是否成功
	 * @throws SQLException 添加商品信息失败
	 */
	@Override
	public boolean saveGoodsInfo(Goods goods) throws SQLException {
		return mainMapper.saveGoodsInfo(goods) >= 1;
	}
}
