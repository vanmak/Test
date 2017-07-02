package com.imakogon.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import com.opera.core.systems.OperaDriver;

public abstract class BaseTest {
	protected WebDriver driver;
	
	@BeforeSuite(alwaysRun = true)
	@Parameters({"browser"})
	public void setUp(@Optional("chrome")String browser){
		if (browser.equals("firebox")){
			driver = new FirefoxDriver();
		}else if (browser.equals("ie")){
			driver = new InternetExplorerDriver();
		}else if (browser.equals("chrome")){
			driver = new ChromeDriver();
		}else if (browser.equals("opera")){
			driver = new OperaDriver();
		}
	}
	
	@AfterSuite(alwaysRun = true)
	public void tearDown(){
		getDriver().quit();
		
}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}}
