package com.project.test;

import org.testng.annotations.Test;

import com.project.base.baseclass;
import com.project.page.jobtitleage;
import com.project.page.loginpage;

public class Test_job_001 extends baseclass {
	
	jobtitleage jb;
	@Test	
	public void addjobtest() throws Exception {		
		jb=new jobtitleage();
		jb.job();
		jb.jobtitle();
		jb.jobtitleverify();
		jb.addnewjob();
		jb.addjobtitleverify();
		jb.title("Test-engineer-automated1");
		jb.Description("ui automated test2");
		jb.fileupload("C:\\Users\\akash\\OneDrive\\Desktop\\PhotoResizer\\logo.pdf");
		jb.note("i worked in testng framework");
		jb.save();
		logger.info("job title successfully saved");
		
	}
	
	
	
	
}
