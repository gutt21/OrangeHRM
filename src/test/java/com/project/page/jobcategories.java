package com.project.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.project.base.baseclass;

public class jobcategories extends baseclass {

	@FindBy(xpath = "//a[normalize-space()='Job Categories']")
	WebElement job;

	@FindBy(xpath = "//h6[normalize-space()='Job Categories']")
	WebElement jobverify;

	@FindBy(xpath = "//button[normalize-space()='Add']")
	WebElement addnew;

	@FindBy(xpath = "//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")
	WebElement name;

	@FindBy(xpath = "//button[normalize-space()='Save']")
	WebElement save;


	
	public jobcategories() {
		PageFactory.initElements(driver, this);

	}


	public void jobcategoriesa() {
		job.click();
	}

	public void jobverify() {
		boolean akash1=jobverify.isDisplayed();
		Assert.assertTrue(akash1);
	}

	
	public void addnew() {
		addnew.click();
	}
	
	public void namecategories(String nam) {
		name.sendKeys(nam);
	}
	
	public void save() {
		save.click();
	}
	

	
	
}
