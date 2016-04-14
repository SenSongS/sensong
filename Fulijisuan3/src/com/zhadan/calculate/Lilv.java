package com.zhadan.calculate;

import java.text.DecimalFormat;

public class Lilv {
	double i2;
	public String i;
	public void calculate(String p2,String sum2,String year2){
		double p = Double.parseDouble(p2);
		double sum = Double.parseDouble(sum2);
		double year = Integer.parseInt(year2);
		DecimalFormat df=new DecimalFormat("0.0");
		i2=Math.pow(sum/p, 1/year)-1;
		i=String.valueOf(df.format(i2));
	}
}
