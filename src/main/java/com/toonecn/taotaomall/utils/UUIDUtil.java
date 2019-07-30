package com.toonecn.taotaomall.utils;

import java.util.UUID;

/**
 * 生成不带短横线的UUID
 *
 * @author yang
 */
public class UUIDUtil {
	public static String getUuidstring() {
		return UUID.randomUUID().toString().replaceAll("-", "");
	}
}
