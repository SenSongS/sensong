package com.zhadan.calculate;

import java.text.DecimalFormat;

public class Benjin {
	double p2;
	public String p;
	public void calculate(String sum2,String i2,String year2){
		double sum = Double.parseDouble(sum2);
		double i = Double.parseDouble(i2);
		int year = Integer.parseInt(year2);
		i=1+i;
		for(int j=1;j<=year;j++){
			sum=sum/i;
		}
		DecimalFormat df=new DecimalFormat("0.0");
		Math.round(sum);
		p2=sum;
		p=String.valueOf(df.format(p2));
	}
}
