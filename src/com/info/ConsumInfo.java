package com.info;

public class ConsumInfo {
	//消费记录
	public String cardNumber;
	public String type;         //类型（通话、短信、上网）
	public int consumDate;            //当前消费量 
	
	public ConsumInfo() {
	}
	public ConsumInfo(String cardNumber, String type, int consumDate) {
		super();
		this.cardNumber = cardNumber;
		this.type = type;
		this.consumDate = consumDate;
	}
}



