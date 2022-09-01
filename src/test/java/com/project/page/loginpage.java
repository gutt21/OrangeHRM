package com.project.page;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.project.base.baseclass;

public class loginpage extends baseclass {

	@FindBy(name = "username")
	WebElement id;

	@FindBy(name = "password")
	WebElement pass;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement click;
	
	public loginpage() {		
		PageFactory.initElements(driver, this);
	}



	public void user(String name) {
		id.sendKeys(name);
	}

	public void pass(String pas) {
		pass.sendKeys(pas);
	}

	public void login() {
		click.click();

	}
	
	public void verifylogin() {
	String ag=driver.getTitle();
	String exe="OrangeHRM";
	Assert.assertEquals(ag, exe);
	
	}
	
	
	
	
	
}
