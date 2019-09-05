package com.zh.miaosha.common.redis;

public interface KeyPrefix {
		
	public int expireSeconds();
	
	public String getPrefix();
	
}
