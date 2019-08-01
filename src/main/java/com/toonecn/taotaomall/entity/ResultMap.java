package com.toonecn.taotaomall.entity;

import javax.persistence.Entity;
import java.util.HashMap;
import java.util.Map;

/**
 * 返回数据的结构
 *
 * @author yang
 */
@Entity
public class ResultMap {
	private String code;
	private String msg;
	private Map<String, Object> data = new HashMap<>();

	/**
	 * 构造函数
	 */
	public ResultMap() {
	}

	public ResultMap(String code, String msg, Map<String, Object> data) {
		this.code = code;
		this.msg = msg;
		this.data = data;
	}

	/**
	 * 成功方法
	 */
	public static ResultMap success(String msg) {
		ResultMap resultMap = new ResultMap();
		resultMap.setCode("0");
		resultMap.setMsg(msg);
		return resultMap;
	}

	/**
	 * 失败方法
	 */
	public static ResultMap failure(String code, String msg) {
		ResultMap resultMap = new ResultMap();
		resultMap.setCode(code);
		resultMap.setMsg(msg);
		return resultMap;
	}

	/**
	 * data内容填充
	 */
	public ResultMap addData(String key, Object data) {
		this.getData().put(key, data);
		return this;
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

	public Map<String, Object> getData() {
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

	public void setData(Map<String, Object> data) {
		this.data = data;
	}
}
