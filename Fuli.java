package fuli;

import java.util.Scanner;

public class Fuli {
	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner caculate = new Scanner(System.in);
		int a = 0;
		while (a == 0 || a == 1) {
			System.out.println("请选择1/2:\n1.年数大于5年 2.年数小于5年");
			int a1 = caculate.nextInt();
			if(a1==1){
				Fuli.jisuan();
				break;
			}else if (a1==2){
				Fuli.jisuan2();
				break;
			}
		}
	}
	static  void jisuan(){
		Scanner Fuli = new Scanner(System.in);
		System.out.println("输入存储金额：");
		double P = Fuli.nextDouble();
		System.out.println("输入存储年数：");
		int year = Fuli.nextInt();
		if(year<5)
		{
			System.out.println("输入错误！");
			System.out.println("输入存储年数：");
		    
		}
		 int year1= Fuli.nextInt();
		double sum;
		sum=P*Math.pow(1+0.05, year1);
		System.out.println("终值："+sum);
	}
	static  void jisuan2(){
		Scanner Fuli = new Scanner(System.in);
		System.out.println("输入存储金额：");
		double P = Fuli.nextDouble();
		System.out.println("输入存储年数：");
		int year = Fuli.nextInt();
		double sum;
		sum=P*Math.pow(1+0.03, year);
		System.out.println("终值："+sum);
	}




}
