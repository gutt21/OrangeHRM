package com.project.test;

import org.testng.annotations.Test;

import com.project.base.baseclass;
import com.project.page.Workshift;
import com.project.page.jobtitleage;

public class Test_workshift_001 extends baseclass {
	
	Workshift w;
	jobtitleage jbt;
	@Test
	public void workshiftTest() throws Exception {
		jbt=new jobtitleage();
		jbt.job();
		w=new Workshift();
		w.workshift();
		w.workshiftverify();
		w.addnew();
		Thread.sleep(3000);
		w.addworkverify();
		Thread.sleep(3000);
		w.shiftname(random());
		Thread.sleep(3000);
		w.fromdate("09", "45", "AM");
		Thread.sleep(3000);
		w.Todate("05", "00", "PM");
		Thread.sleep(3000);
		w.duration();
		w.Assigned(random());
		Thread.sleep(3000);
		w.save();
		Thread.sleep(3000);
		logger.info("wrokshift successfully saved");
	}
	
	
}
