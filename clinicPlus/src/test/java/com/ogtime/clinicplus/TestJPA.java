package com.ogtime.clinicplus;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestJPA {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test1() {
		try{
			ClassPathXmlApplicationContext app=new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
			assertTrue(true);
		}catch(Exception ex){
			assertTrue(ex.getMessage(),false);
		}
	}

}
