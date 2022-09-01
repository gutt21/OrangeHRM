package com.project.test;

import org.testng.annotations.Test;

import com.project.base.baseclass;
import com.project.page.Oraganiztion;

public class Test_oraganiztion_001 extends baseclass {

	Oraganiztion or;
	
	@Test
	public void generalTest() {
		or=new Oraganiztion();
		or.oraganiztions();
		or.general();
		//or.oraganizname(random());
	    or.registration(randomnumber());
	    or.taxid(randomnumber());
	    or.phone("7019844842");
	    //or.email(random()+"@orangehrm.com");
	    or.country("India");
	
	
	}
}
