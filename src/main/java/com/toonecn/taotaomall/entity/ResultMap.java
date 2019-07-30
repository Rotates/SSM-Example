package com.toonecn.taotaomall.entity;

import javax.persistence.Entity;

/**
 * 返回数据的结构
 *
 * @author yang
 */
@Entity
public class ResultMap {
	private String code;
	private String msg;
	private Object data;

	/**
	 * 构造函数
	 */
	public ResultMap() {
	}

	public ResultMap(String code, String msg, Object data) {
		this.code = code;
		this.msg = msg;
		this.data = data;
	}

	/**
	 * 成功方法
	 */
	public static ResultMap success(String msg, Object data) {
		ResultMap resultMap = new ResultMap();
		resultMap.setCode("0");
		resultMap.setMsg(msg);
		resultMap.setData(data);
		return resultMap;
	}

	/**
	 * 失败方法
	 */
	public static ResultMap failure(String code, String msg) {
		ResultMap resultMap = new ResultMap();
		resultMap.setCode(code);
		resultMap.setMsg(msg);
		resultMap.setData(null);
		return resultMap;
	}

	/**
	 * getter方法
	 */
	public String getCode() {
		return code;
	}

	public String getMsg() {
		return msg;
	}

	public Object getData() {
		return data;
	}

	/**
	 * setter方法
	 */
	private void setCode(String code) {
		this.code = code;
	}

	private void setMsg(String msg) {
		this.msg = msg;
	}

	private void setData(Object data) {
		this.data = data;
	}
}
