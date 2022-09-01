package com.project.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.project.base.baseclass;

public class Oraganiztion extends baseclass {

	@FindBy(xpath = "//span[normalize-space()='Organization']")
	WebElement oraganiztion;

	@FindBy(xpath = "//a[normalize-space()='General Information']")
	WebElement general;

	@FindBy(xpath = "//span[@class='oxd-switch-input oxd-switch-input--active --label-left']")
	WebElement editclick;

	@FindBy(xpath = "//input[@class='oxd-input oxd-input--active oxd-input--error']")
	WebElement oraganizname;

	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input")
	WebElement registration;

	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input")
	WebElement tax;

	@FindBy(xpath = "//input[@modelmodifiers='[object Object]']")
	WebElement phone;

	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[3]/div/div[2]/input")
	WebElement email;


	@FindBy(xpath = "//div[@class='oxd-select-text-input']")
	WebElement country;

	public Oraganiztion() {
		PageFactory.initElements(driver, this);
	}

	public void oraganiztions() {
		oraganiztion.click();
	}

	public void general() {
		general.click();
		editclick.click();

	}

	public void oraganizname(String name) {
		oraganizname.clear();
		oraganizname.sendKeys(name);
	}
	
	public void registration(String rname) {
		registration.clear();
		registration.sendKeys(rname);
	}

	public void taxid(String name) {
		tax.sendKeys(name);
	}
	
	public void phone(String name) {
		phone.sendKeys(name);
	}
	
	public void email(String name) {
		email.clear();
		email.sendKeys(name);
		
	}

	public void country(String name) {
		country.click();
		Select se=new Select(country);
		se.selectByValue(name);
	}

}
