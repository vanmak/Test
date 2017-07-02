package com.imakogon.test;

import org.testng.annotations.Test;
import com.imakogon.core.BaseTest;

public class FirstTest extends BaseTest{
	
	
	@Test
	public void testMethod ()throws Exception{
	driver.get("http://localhost:8080/mysite");
		try{Thread.sleep(2000);}catch(Exception e){}
	}
}


	


