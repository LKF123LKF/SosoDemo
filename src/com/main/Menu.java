package com.main;

import java.util.Scanner;


public class Menu {
	//���� 
	public void start(){
		Scanner input = new Scanner(System.in);
		CardUtil cardUtil = new CardUtil();
		cardUtil.initData();
		boolean iscontinue = true;// �Ƿ����
		do {
			System.out.println();
			System.out.println("*************��ӭʹ�����ƶ�ҵ�����***************");
			System.out.println("1.�û���¼   2.�û�ע��   3.ʹ����   4.���ѳ�ֵ  5.�ʷ�˵��  6.�˳�ϵͳ");
			System.out.print("��ѡ��");
			int option = input.nextInt();
			switch (option) {   //ʹ��do-whileѭ����Ƕswitch��֧�ṹ

			case 1:
				cardUtil.login();
				break;
			case 2:
				cardUtil.signIn();
				break;
			case 3:
				cardUtil.uesSoso();
				break;
			case 4:
				cardUtil.addPayMoney();
				break;
			case 5:
				cardUtil.ziFei();
				break;
			case 6:
				System.out.println("��ӭ���´μ���ʹ�ã�");
				iscontinue=false;
				break;
			default:
				System.out.println("������������������");
				break;
			}
		} while (iscontinue);
	}

}




