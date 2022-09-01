package com.project.test;

import org.testng.annotations.Test;

import com.project.page.jobtitleage;

public class Test_commonpage_001 {

	jobtitleage jbt;
	@Test
	public void commontest() {		
		jbt=new jobtitleage();
		jbt.admin();
		
		
	}	
}
