package com.project.utilies;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.project.base.baseclass;

import io.netty.handler.codec.DateFormatter;

public class reporting implements ITestListener{

	
	String time;
	ExtentSparkReporter report;
    ExtentReports extent;
	ExtentTest test;
	@Override
	public void onTestStart(ITestResult result) {
	    time=new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
	    String name="Test-Report"+time+".html";
		report=new ExtentSparkReporter(".\\test-output\\"+name);		
		extent=new ExtentReports();
		extent.attachReporter(report);		
		extent.setSystemInfo("Host name", "localhost");
		extent.setSystemInfo("Environment", "QA");
		extent.setSystemInfo("User", "akash guttedar");
		report.config().setDocumentTitle(" Admin area demo test");
		report.config().setReportName("Funtional Test Automation Project");
		report.config().setTheme(Theme.DARK);
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
	test=extent.createTest(result.getName());
	test.log(Status.PASS,MarkupHelper.createLabel(result.getName(), ExtentColor.GREEN));
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		test=extent.createTest(result.getName());
		test.log(Status.FAIL,MarkupHelper.createLabel(result.getName(), ExtentColor.RED));
		baseclass base= new baseclass();		
		base.screnshot(result.getName(), time);
		
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		test=extent.createTest(result.getName());
		test.log(Status.SKIP,MarkupHelper.createLabel(result.getName(), ExtentColor.WHITE));
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		test=extent.createTest(result.getName());
		test.log(Status.WARNING,MarkupHelper.createLabel(result.getName(), ExtentColor.BLUE));
		
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
		extent.flush();
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
}
