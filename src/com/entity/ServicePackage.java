package com.entity;

	 //套餐类（父类）
	public abstract class ServicePackage { 
		//套餐月资费
		public double price;

		 public double getPrice() {
			 return price;
		 }

		 public void setPrice(double price) {
			 this.price = price;
		 }

		 //显示套餐信息
		public abstract void showInfo();
	}
	

