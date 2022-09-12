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
		tax.clear();
		tax.sendKeys(name);
	}

	public void phone(String name) {
		phone.clear();
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

	@FindBy(xpath = "//button[normalize-space()='Add']")
	WebElement addnew;

	@FindBy(xpath = "(//input[@placeholder='Type here ...'])[1]")
	WebElement locationname;

	@FindBy(xpath = "(//input[@placeholder='Type here ...'])[2]")
	WebElement city;

	@FindBy(xpath = "(//input[@placeholder='Type here ...'])[3]")
	WebElement state;

	@FindBy(xpath = "(//input[@placeholder='Type here ...'])[4]")
	WebElement postcode;

	@FindBy(xpath = "//div[@class='oxd-select-text oxd-select-text--active']")
	WebElement locationcountry;

	@FindBy(xpath = "(//input[@placeholder='Type here ...'])[5]")
	WebElement mobile;


	@FindBy(xpath = "(//input[@placeholder='Type here ...'])[6]")
	WebElement fax;

	@FindBy(xpath = "(//textarea[@placeholder='Type here ...'])[1]")
	WebElement addresslocation;

	@FindBy(xpath = "(//textarea[@placeholder='Type here ...'])[2]")
	WebElement noteslocation;

	@FindBy(xpath = "//button[normalize-space()='Save']")
	WebElement savelocation;

	public void loction() {
		loction.click();
		boolen(loctionverify);

	}

	public void addnewloction() {
		addnew.click();
	}

	public void locationname(String name) {
		locationname.sendKeys(name);
	}

	public void city(String name) {
		city.sendKeys(name);
	}

	public void state(String name) {
		state.sendKeys(name);
	}

	public void zipcode(String name) {
		postcode.sendKeys(name);
	}

	public void locationcountry(String name) {
		locationcountry.click();


		List<WebElement> akash=driver.findElements(By.xpath("//div[@role='listbox']/div"));

		for(WebElement ak:akash) {

			String as=ak.getText();

			if(as.equals(name)) {
				ak.click();
				break;
			}
		}


	}

	public void mobile(String name) {
		mobile.sendKeys(name);
	}

	public void fax(String name) {
		fax.sendKeys(name);
	}

	public void addresslocation(String name) {
		addresslocation.sendKeys(name);
	}


	public void noteslocation(String name) {
		noteslocation.sendKeys(name);
	}


	public void locationsave() {
		savelocation.click();
	}


	//Structure

	@FindBy(xpath = "//a[normalize-space()='Structure']")
	WebElement structure;

	@FindBy(xpath = "//label[normalize-space()='Edit']")
	WebElement structureedit;

	@FindBy(xpath = "//button[normalize-space()='Add']")
	WebElement addnewstructure;

	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	WebElement unitid;

	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[3]")
	WebElement structurename;

	@FindBy(xpath = "(//textarea[@placeholder='Type description here'])[1]")
	WebElement structuredescription;
	
	
	
	
	
	public void structure() {
		structure.click();
	}
	

	public void structureedit() {
		structureedit.click();
	}
	
	
	public void addnewstructure() {
		addnewstructure.click();
	}
	
	
	public void unitid(String id) {
		unitid.sendKeys(id);
	}
	
	public void structurename(String name) {
		structurename.sendKeys(name);
	}
	
	public void structuredescription(String description) {
		structuredescription.sendKeys(description);
	}
	
	

}
