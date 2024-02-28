package AxisQA.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallelTesting {
	@Test
	public void InvokeChrome() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
	}
	
	
	@Test
	public void InvokeFirefox() {
		System.setProperty("webdriver.firefox.driver",
				"C:\\Program Files\\Mozilla Firefox\\firefox.exe");

		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.selenium.dev/");
		
	}

}
