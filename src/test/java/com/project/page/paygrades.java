package com.project.page;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.project.base.baseclass;

public class paygrades extends baseclass{


	@FindBy(xpath = "//a[normalize-space()='Pay Grades']")
	WebElement paygrades;

	@FindBy(xpath = "//button[normalize-space()='Add']")	
	WebElement add;

	@FindBy(xpath = "//h6[normalize-space()='Add Pay Grade']")
	WebElement addverify;

	@FindBy(xpath = "//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")
	WebElement name;

	@FindBy(xpath = "//button[normalize-space()='Save']")
	WebElement save;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement save1;
	
	@FindBy(xpath = "//button[normalize-space()='Add']")
	WebElement addCurrencies;
	
	@FindBy(xpath = "//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']")
	WebElement selectcurrenies;
	
	
	
	public paygrades() {
		PageFactory.initElements(driver, this);
	}


	public void paygrades() {
		paygrades.click();
	}

	public void add() {
		add.click();
	}

	public void addverify() {
		boolean akash= addverify.isDisplayed();
		Assert.assertTrue(akash);
		
	}


	public void name(String name1) {

		name.sendKeys(name1);
	}

	public void save() {
		save.click();
	}

	public void save2() {
		save1.click();
	}


	public void addCurrencies() {
		addCurrencies.click();
	}
	
	public void selectcurrenies() throws Exception {	
		selectcurrenies.click();
		
		
		Actions a=new Actions(driver);
	
		
			a.sendKeys("i").build().perform();
			Thread.sleep(3000);		
		    a.sendKeys(Keys.ENTER).build().perform();
		
		
		
		
		
		
//		Thread.sleep(2000);
//	    WebElement ab=driver.findElement(By.xpath("//div[text()='BND - Brunei Dollar']"));
//
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("arguments[0].scrollIntoView();", ab);
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//div[text()='BND - Brunei Dollar']")).click();	
//		
//		//Select se=new Select(selectcurrenies);	
//		//se.selectByVisibleText("IDR - Indonesian Rupiah");
//		
	}

}
