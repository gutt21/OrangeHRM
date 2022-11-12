package com.project.test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.project.base.baseclass;
import com.project.page.Oraganiztion;

public class Test_oraganiztion_001 extends baseclass {

	Oraganiztion or;
	
	@Test
	public void generalTest() throws Exception {
		or=new Oraganiztion();
		or.oraganiztions();
		or.general();
		//or.oraganizname(random());
		or.registration(randomnumber());
		or.taxid(randomnumber());
		or.phone("7019844842");
		Thread.sleep(2000);
		//or.email(random()+"@orangehrm.com");
		or.country("India");
		Thread.sleep(3000);
		or.notes("HRM Software");
		or.save();


	}

	
	@Test
	public void locationtest() throws Exception {
		or.oraganiztions();
		or.loction();
		or.addnewloction();
		or.locationname(random());
		Thread.sleep(2000);
		or.city("gulbarga");
		Thread.sleep(2000);
		or.state("karantaka");
		Thread.sleep(2000);
		or.zipcode("585103");
		Thread.sleep(2000);
		or.locationcountry("India");
		Thread.sleep(2000);
		or.mobile("7019844842");
		or.fax(randomnumber());
		or.addresslocation(random());
		Thread.sleep(2000);
		or.notes(random());
		Thread.sleep(2000);
		or.locationsave();
		

	}







	@Test
	public void Structuretest() throws Exception {
		
	    or.oraganiztions();
		or.structure();
		or.structureedit();
		or.addnewstructure();
		//or.unitid(random());
		Thread.sleep(3000);
		or.structurename(random());
		or.structuredescription("OrangeHRM "+random());




	}



}
