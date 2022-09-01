package com.project.test;

import org.testng.annotations.Test;

import com.project.base.baseclass;
import com.project.page.jobcategories;
import com.project.page.jobtitleage;

public class Test_jobcategories_001 extends baseclass {

	jobcategories jb;
	jobtitleage jbt;
	@Test
	public void jobcategoriesTest() throws Exception {
		jbt=new jobtitleage();
		jbt.job();
		jb=new jobcategories();
		jb.jobcategoriesa();
		jb.jobverify();
		Thread.sleep(3000);
		jb.addnew();
		Thread.sleep(3000);
		jb.namecategories(random());
		Thread.sleep(3000);
		jb.save();
		Thread.sleep(3000);
		logger.info("job categories successfully saved");
		jb.jobverify();
		Thread.sleep(3000);
		
	}
	
	
}
