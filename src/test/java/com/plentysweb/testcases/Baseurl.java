package com.plentysweb.testcases;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import com.plentysweb.utilities.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseurl {
	
	Readconfig readconfig=new Readconfig();
	
	String url=readconfig.getBaseUrl();
	String browser=readconfig.getBrowser();
	
	public static WebDriver driver;
	public static Logger logs;
	
	@BeforeClass
	public void setup() {
		
		
		switch(browser.toLowerCase())
		{
		case "chrome":
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(options);
			break;

		case "msedge":
			EdgeOptions options2=new EdgeOptions();
			options2.addArguments("--remote-allow-origins=*");
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;

		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		default:
			driver = null;
			break;

		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

		logs=LogManager.getLogger("PlentysWeb");
		
		driver.get(url);
		logs.info("url opened");
	
	
		
	
		
	}
	
	@AfterClass
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}
