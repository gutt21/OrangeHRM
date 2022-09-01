package com.project.page;
import java.util.List;

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

	@FindBy(xpath = "//button[normalize-space()='Add']")
	WebElement addCurrencies;

	@FindBy(xpath = "//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']")
	WebElement selectcurrenies;

	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[2]/form/div[2]/div/div[1]/div/div[2]/input")
	WebElement minimum;

	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[2]/form/div[2]/div/div[2]/div/div[2]/input")
	WebElement maximum;

	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[2]/form/div[3]/button[2]")
	WebElement save2;











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

	public void addCurrencies() {
		addCurrencies.click();
	}

	public void selectcurrenies() throws Exception {	
		selectcurrenies.click();
		List<WebElement> akash=driver.findElements(By.xpath("//div[@class='oxd-select-dropdown --positon-bottom']/div"));
		System.out.println(akash.size());
		for(WebElement gs:akash) {
			if(gs.getText().equals("INR - Indian Rupee")) {
				gs.click();
				break;
			}
		}
	}

	public void minimumSalary(String mini) {
		minimum.sendKeys(mini);
	}

	public void maxmimumSalary(String max) {
		maximum.sendKeys(max);
	}
	
	public void save3() {
		save2.click();
	}

}
