package com.Service;

import com.info.MobileCard;

public interface SendService {
	/**
	 * 套餐内短信免费
	 * 套餐外短信每条1毛
	 * 余额不足抛出异常
	 */
	public  int send(int count,MobileCard card)throws Exception;
}

