 package com.zhadan.calculate;

import java.text.DecimalFormat;

public class Fuli {
	double sum2;
	public String sum;
	public void calculate(String p2,String i2,String year2){
		double p = Double.parseDouble(p2);
		double i = Double.parseDouble(i2);
		int year = Integer.parseInt(year2);
		for(int j=1;j<=year;j++){
			p=p+p*i;
			
		}
		DecimalFormat df=new DecimalFormat("0.0");
		sum2=p;
		sum=String.valueOf(df.format(sum2));
	}
}

