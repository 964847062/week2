package com.lcx.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class ZHStringUtilTest {

	@Test
	public void testGetZHString() {
	
		
		String zhString = ZHStringUtil.getZHString(10);
		System.out.println(zhString);
	}

	@Test
	public void testGetZHName() {
		String name = ZHStringUtil.getZHName();
		System.out.println(name);
	}

}
