package com.project.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.project.base.baseclass;

public class Workshift extends baseclass {

	
	
	@FindBy(xpath = "//a[normalize-space()='Work Shifts']")
	WebElement work;
	
	@FindBy(xpath = "//h6[normalize-space()='Work Shifts']")
	WebElement workverify;
	
	@FindBy(xpath = "//button[normalize-space()='Add']")
	WebElement add;
	
	@FindBy(xpath = "//h6[normalize-space()='Add Work Shift']")
	WebElement addworkverify;
	
	@FindBy(xpath = "//div[@class='oxd-grid-2 orangehrm-full-width-grid']//div[@class='oxd-grid-item oxd-grid-item--gutters']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")
	WebElement shiftname;
	 
	@FindBy(xpath = "//div[@class='oxd-grid-4 orangehrm-full-width-grid']//div[1]//div[1]//div[2]//div[1]//div[1]//i[1]")
	WebElement fromdate;
	
	@FindBy(xpath = "//div[@class='oxd-form-row']//div[2]//div[1]//div[2]//div[1]//div[1]//i[1]")
	WebElement todate;
	
	@FindBy(xpath = "//input[@class='oxd-input oxd-input--active oxd-time-hour-input-text']")
	WebElement hours;
	
	@FindBy(xpath = "//input[@class='oxd-input oxd-input--active oxd-time-hour-input-text']")
	WebElement hours2;
	
	@FindBy(xpath = "//input[@class='oxd-input oxd-input--active oxd-time-minute-input-text']")
	WebElement minute;
	
	@FindBy(xpath = "//input[@class='oxd-input oxd-input--active oxd-time-minute-input-text']")
	WebElement minute2;
	
	@FindBy(xpath = "//input[@name='pm']")
	WebElement pm;
	
	@FindBy(xpath = "//input[@name='am']")
	WebElement am;
	
	@FindBy(xpath = "//p[@class='oxd-text oxd-text--p orangehrm-workshift-duration']")
	WebElement duration;
	
	@FindBy(xpath = "//button[normalize-space()='Save']")
	WebElement save;
	
	public Workshift() {
		PageFactory.initElements(driver, this);
	}
	
	public void workshift() {
		work.click();
	}
	
	public void workshiftverify() {
	boolean akaa=workverify.isDisplayed();
	Assert.assertTrue(akaa);
	
	}
	
	public void addnew() {
		add.click();
	}
	
	
	public void addworkverify() {
		boolean akaa=addworkverify.isDisplayed();
		Assert.assertTrue(akaa);
		
		}
	
	public void shiftname(String name) {
		shiftname.sendKeys(name);
	}
	
	
	public void fromdate(String hs,String mn,String tm) {
		
		fromdate.click();
		hours.clear();
		hours.sendKeys(hs);
		minute.clear();
		minute.sendKeys(mn);
		
		if(tm.equals("PM")) {
			pm.click();
		}else if(tm.equals("AM")) {
			am.click();
		}else {
			System.out.println("no time");
		}
	}
	

	public void Todate(String hs,String mn,String tm) {
		
		todate.click();
		hours.clear();
		hours.sendKeys(hs);
		minute.clear();
		minute.sendKeys(mn);
		
		if(tm.equals("PM")) {
			pm.click();
		}else if(tm.equals("AM")) {
			am.click();
		}else {
			System.out.println("no time");
		}
	}
	
	public void duration() {
	String rsg=	duration.getText();
	   System.out.println("total Duration time "+rsg);
	}
	
	public void Assigned(String asg) {
	driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys(asg);
	
	}
	
	public void save() {
		save.click();
	}
	
}
