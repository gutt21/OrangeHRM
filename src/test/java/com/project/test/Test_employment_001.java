package com.project.test;

import org.testng.annotations.Test;

import com.project.base.baseclass;
import com.project.page.employmentstatus;
import com.project.page.jobtitleage;

public class Test_employment_001 extends baseclass{

	
	employmentstatus em;
	jobtitleage jbt;
	
	
	@Test
	public void employmenttest() throws Exception {
		jbt=new jobtitleage();
		jbt.job();
		em=new employmentstatus();
		em.employment();
		em.statuserify();
		em.addnew();
		Thread.sleep(3000);
		em.nameadd(random());
		Thread.sleep(3000);
		em.save();
		Thread.sleep(3000);
		logger.info("employment status successfully saved");
		em.statuserify();
		Thread.sleep(3000);
		
	}
	
}
