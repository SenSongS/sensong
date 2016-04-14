package com.zhadan.calculate;

public class Nianxian {
	int year2=0;
	public String year;
	public void calculate(String p2,String i2,String sum2){
		double p = Double.parseDouble(p2);
		double i = Double.parseDouble(i2);
		double sum = Double.parseDouble(sum2);
		while(p<sum){
			for(int j=1;j<100;j++);{
				p=p*(1+i);
				year2++;
			}
		}
		year=String.valueOf(year2);
		System.out.println(year);
	}

}
