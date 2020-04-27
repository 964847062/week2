package com.lcx.util;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

public class RandomUtilTest {

	@Test
	public void testRandom() {
		for(int i = 0 ; i < 10;i++) {
			System.out.println(RandomUtil.random(1, 3));
		}
	}
	
	@Test
	public void testGetValue() {
		BigDecimal value = RandomUtil.getValue(25400.56, 67078.94, 2);
		System.out.println(value);
	}

}
