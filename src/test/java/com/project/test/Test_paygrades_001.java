package com.project.test;

import org.testng.annotations.Test;

import com.project.base.baseclass;
import com.project.page.jobtitleage;
import com.project.page.paygrades;

public class Test_paygrades_001 extends baseclass {

	paygrades pay;
	jobtitleage jbt;
	@Test
	public void paygradestest() throws Exception {
		jbt=new jobtitleage();
		jbt.job();
		pay=new paygrades();
		pay.paygrades();
		pay.add();
		pay.addverify();
		Thread.sleep(2000);
		pay.name(random());
		Thread.sleep(2000);
		pay.save();
		Thread.sleep(2000);		
		pay.addCurrencies();
		Thread.sleep(2000);
		pay.selectcurrenies();
		Thread.sleep(2000);
		pay.minimumSalary("800000");
		Thread.sleep(2000);
		pay.maxmimumSalary("1000000");
		pay.save3();

	}




}
