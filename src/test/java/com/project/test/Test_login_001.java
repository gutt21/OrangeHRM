package com.project.test;
import org.testng.annotations.Test;
import com.project.base.baseclass;
import com.project.page.loginpage;

public class Test_login_001 extends baseclass{

	
	loginpage lg;

	@Test
	public void logitest() {
		lg= new loginpage();
		lg.user(username);
		lg.pass(password);
        lg.login();
        lg.verifylogin();
        logger.info("login successfully");
        logger.debug("debug");
      
		
	}
}
