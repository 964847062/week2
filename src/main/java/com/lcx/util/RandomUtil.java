package com.lcx.util;

import java.math.BigDecimal;
import java.util.Random;

public class RandomUtil {
	public static BigDecimal getValue(final double min, final double max,final int scale){
		
		BigDecimal bigDecimal = new BigDecimal(Math.random()*(max-min)+min);
		return bigDecimal.setScale(scale, BigDecimal.ROUND_HALF_UP);
	
		}
	
	
	
	
	public static int random(int min, int max){
		if(max<=min) 
			throw new RuntimeException("请输入正确的值");
			
			Random r = new Random();
			
			return r.nextInt(max-min+1)+min;
		
		

		
	} 
}
