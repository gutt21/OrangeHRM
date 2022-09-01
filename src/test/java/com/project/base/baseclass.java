package com.project.base;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.time.Duration;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import com.project.utilies.readconfig;
import io.github.bonigarcia.wdm.WebDriverManager;


public class baseclass {
	readconfig read=new readconfig();
	public String username=read.email();
	public String password=read.pass();
	public String url=read.url();
	public static WebDriver driver;	
	public static Logger logger;
	
	@Parameters("browsername")
	@BeforeTest
	public void setup(String browsername)
	
	{
		if(browsername.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else if (browsername.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		else if (browsername.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else {
			System.out.println("invalid browser");
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));		
		driver.get(url);		
		logger=Logger.getLogger("noncommerce");
		PropertyConfigurator.configure("log4j.properties");
		
	}


	@AfterTest
	public void teardown() throws Exception {
		Thread.sleep(5000);
		//driver.close();
	}
	
	public void screnshot( String name,String time) {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File file=ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, new File(".\\screenshot\\"+name+" "+time+".png"));
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	
	
	public void uploadfile(String upload) throws Exception {
		Robot r=new Robot();
		r.setAutoDelay(2000);
		StringSelection ss=new StringSelection(upload);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		
	}
	
	public String random() {
		String akash=RandomStringUtils.randomAlphabetic(5);
		return akash;
	}
	public String randomnumber() {
		String akash=RandomStringUtils.randomNumeric(10);
		return akash;
	}

}
