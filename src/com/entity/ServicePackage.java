package com.entity;

	 //�ײ��ࣨ���ࣩ
	public abstract class ServicePackage { 
		//�ײ����ʷ�
		public double price;

		 public double getPrice() {
			 return price;
		 }

		 public void setPrice(double price) {
			 this.price = price;
		 }

		 //��ʾ�ײ���Ϣ
		public abstract void showInfo();
	}
	

