package com.project.page;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.project.base.baseclass;

public class jobtitleage extends baseclass {



	@FindBy(xpath = "//span[normalize-space()='Admin']")
	WebElement admin;

	@FindBy(xpath = "//span[normalize-space()='Job']")
	WebElement job;

	@FindBy(xpath = "//a[normalize-space()='Job Titles']")
	WebElement jobtitle;

	@FindBy(xpath = "//h6[normalize-space()='Job Titles']")
	WebElement jobtitleverify;

	@FindBy(xpath = "//button[normalize-space()='Add']")
	WebElement add;

	@FindBy(xpath = "//h6[normalize-space()='Add Job Title']")
	WebElement addtitleverify;

	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")
	WebElement title;

	@FindBy(xpath = "//textarea[@placeholder='Type description here']")
	WebElement JobDescription;

	@FindBy(xpath = "//div[@class='oxd-file-button']")
	WebElement fileupload;

	@FindBy(xpath = "//textarea[@placeholder='Add note']")
	WebElement note;

	@FindBy(xpath = "//button[normalize-space()='Save']")
	WebElement save;

	
	
	public jobtitleage() {
		PageFactory.initElements(driver, this);
	}

	public void admin() {
		admin.click();
	}

	public void job() {
		job.click();
	}


	public void jobtitle() {
		jobtitle.click();
	}


	public void jobtitleverify() {
		boolean akash=jobtitleverify.isDisplayed();
		Assert.assertTrue(akash);
	}


	public void addnewjob() {
		add.click();
	}

	public void addjobtitleverify() {
		boolean akash=addtitleverify.isDisplayed();
		Assert.assertTrue(akash);
	}


	public void title(String titlename) {
		title.sendKeys(titlename);
	}

	public void Description(String Description) {
		JobDescription.sendKeys(Description);
	}

	public void fileupload(String upload) throws Exception {		
			fileupload.click();
			uploadfile(upload);
			
				
	}
	public void note(String noten) {
		note.sendKeys(noten);
		
	}

	public void save() {
		save.click();						
	}
	
	
}
