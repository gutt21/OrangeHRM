package com.project.page;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


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

	@FindBy(xpath = "//textarea[@class='oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical']")
	WebElement notes;

	@FindBy(xpath = "//button[normalize-space()='Save']")
	WebElement save;


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
		List<WebElement> akash=driver.findElements(By.xpath("//div[@class='oxd-select-dropdown --positon-bottom']/div"));		
		for(WebElement gs:akash) {
			if(gs.getText().equals("India")) {
				gs.click();
				break;
			}
		}


	}

	public void notes(String note) {
		notes.clear();
		notes.sendKeys(note);
	}

	public void save() {
		save.click();
	}

	
	
	// loctions 
	
	
	@FindBy(xpath = "//a[normalize-space()='Locations']")
	WebElement loction;
	
	@FindBy(xpath = "//h5[normalize-space()='Locations']")
	WebElement loctionverify;
	
	
	
	
	
	
}
