package com.project.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.project.base.baseclass;

public class employmentstatus extends baseclass {

	@FindBy(xpath = "//a[contains(text(),'Employment Status')]")
	WebElement status;

	@FindBy(xpath = "//h6[normalize-space()='Employment Status']")
	WebElement statusverify;

	@FindBy(xpath = "//button[normalize-space()='Add']")
	WebElement add;

	@FindBy(xpath = "//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")
	WebElement name;

	@FindBy(xpath = "//button[normalize-space()='Save']")
	WebElement save;







	public employmentstatus() {
		PageFactory.initElements(driver, this);

	}


	public void employment() {
		status.click();
	}

	public void statuserify() {
		boolean akash1=statusverify.isDisplayed();
		Assert.assertTrue(akash1);
	}

	
	public void addnew() {
		add.click();
	}
	
	public void nameadd(String nam) {
		name.sendKeys(nam);
	}
	
	public void save() {
		save.click();
	}
	

}
