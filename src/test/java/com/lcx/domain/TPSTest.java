package com.lcx.domain;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.Bidi;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

import com.lcx.common.utils.DateUtil;
import com.lcx.common.utils.RandomUtil;
import com.lcx.common.utils.StringUtil;

public class TPSTest {

	@Test
	public void testToString() {
		for(int i=0;i<100;i++) {
			TPS tps = new TPS();
			 tps.setId(BigInteger.valueOf(i)); 
			tps.setName(StringUtil.generateChineseName());
			tps.setAge(RandomUtil.random(1, 100));
			tps.setMoney(RandomUtil.getValue(25400.56, 67078.94, 2)); 
			Calendar c = Calendar.getInstance();
			c.set(2012, 0, 1);
			
			tps.setCreated(DateUtil.random(c.getTime(), new Date()));
			System.out.println(i+1+""+tps);
		}
	}

}
