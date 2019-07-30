package com.toonecn.taotaomall.entity;

import javax.persistence.Entity;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * 商品类
 *
 * @author yang
 */
@Entity
public class Goods {
	/**
	 * 商品ID
	 */
	private String goodsId;
	/**
	 * 商品名
	 */
	private String goodsName;
	/**
	 * 商品类型
	 */
	private int goodsType;
	/**
	 * 成本价
	 */
	private BigDecimal goodsCost;
	/**
	 * 销售价
	 */
	private BigDecimal goodsPrice;
	/**
	 * 产品图网址
	 */
	private String goodsMedia;
	/**
	 * 商品图宽度（像素）
	 */
	private double goodsMediaWidth;
	/**
	 * 商品图高度（像素）
	 */
	private double goodsMediaHeight;
	/**
	 * 商品描述
	 */
	private String goodsDescription;
	/**
	 * 商品是否在架
	 */
	private boolean goodsIsPutaway;
	/**
	 * 商品库存量
	 */
	private int goodsStorage;
	/**
	 * 商品销售量
	 */
	private int goodsSalesVolume;
	/**
	 * 商品添加时间
	 */
	private Timestamp goodsAddTime;

	/**
	 * 构造函数
	 */
	public Goods() {
	}

	public Goods(String goodsId, String goodsName, int goodsType, BigDecimal goodsCost, BigDecimal goodsPrice, String goodsMedia, double goodsMediaWidth, double goodsMediaHeight, String goodsDescription, boolean goodsIsPutaway, int goodsStorage, int goodsSalesVolume) {
		this.goodsId = goodsId;
		this.goodsName = goodsName;
		this.goodsType = goodsType;
		this.goodsCost = goodsCost;
		this.goodsPrice = goodsPrice;
		this.goodsMedia = goodsMedia;
		this.goodsMediaWidth = goodsMediaWidth;
		this.goodsMediaHeight = goodsMediaHeight;
		this.goodsDescription = goodsDescription;
		this.goodsIsPutaway = goodsIsPutaway;
		this.goodsStorage = goodsStorage;
		this.goodsSalesVolume = goodsSalesVolume;
	}

	/**
	 * getter方法
	 */
	public String getGoodsId() {
		return goodsId;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public int getGoodsType() {
		return goodsType;
	}

	public BigDecimal getGoodsCost() {
		return goodsCost;
	}

	public BigDecimal getGoodsPrice() {
		return goodsPrice;
	}

	public String getGoodsMedia() {
		return goodsMedia;
	}

	public double getGoodsMediaWidth() {
		return goodsMediaWidth;
	}

	public double getGoodsMediaHeight() {
		return goodsMediaHeight;
	}

	public String getGoodsDescription() {
		return goodsDescription;
	}

	public boolean isGoodsIsPutaway() {
		return goodsIsPutaway;
	}

	public int getGoodsStorage() {
		return goodsStorage;
	}

	public int getGoodsSalesVolume() {
		return goodsSalesVolume;
	}

	public Timestamp getGoodsAddTime() {
		return goodsAddTime;
	}

	/**
	 * setter方法
	 */
	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public void setGoodsType(int goodsType) {
		this.goodsType = goodsType;
	}

	public void setGoodsCost(BigDecimal goodsCost) {
		this.goodsCost = goodsCost;
	}

	public void setGoodsPrice(BigDecimal goodsPrice) {
		this.goodsPrice = goodsPrice;
	}

	public void setGoodsMedia(String goodsMedia) {
		this.goodsMedia = goodsMedia;
	}

	public void setGoodsMediaWidth(double goodsMediaWidth) {
		this.goodsMediaWidth = goodsMediaWidth;
	}

	public void setGoodsMediaHeight(double goodsMediaHeight) {
		this.goodsMediaHeight = goodsMediaHeight;
	}

	public void setGoodsDescription(String goodsDescription) {
		this.goodsDescription = goodsDescription;
	}

	public void setGoodsIsPutaway(boolean goodsIsPutaway) {
		this.goodsIsPutaway = goodsIsPutaway;
	}

	public void setGoodsStorage(int goodsStorage) {
		this.goodsStorage = goodsStorage;
	}

	public void setGoodsSalesVolume(int goodsSalesVolume) {
		this.goodsSalesVolume = goodsSalesVolume;
	}

	/**
	 * toString方法
	 */
	@Override
	public String toString() {
		return "Goods{" +
				"goodsId='" + goodsId + '\'' +
				", goodsName='" + goodsName + '\'' +
				", goodsType=" + goodsType +
				", goodsCost=" + goodsCost +
				", goodsPrice=" + goodsPrice +
				", goodsMedia='" + goodsMedia + '\'' +
				", goodsMediaWidth=" + goodsMediaWidth +
				", goodsMediaHeight=" + goodsMediaHeight +
				", goodsDescription='" + goodsDescription + '\'' +
				", goodsIsPutaway=" + goodsIsPutaway +
				", goodsStorage=" + goodsStorage +
				", goodsSalesVolume=" + goodsSalesVolume +
				", goodsAddTime=" + goodsAddTime +
				'}';
	}
}
