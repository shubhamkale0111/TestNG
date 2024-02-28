package AxisQA.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {

public static WebDriver driver;

	
	@SuppressWarnings("Deprecation")
	@Test
	public void testSoftAssert() throws InterruptedException {
		
		
		System.setProperty("webdriver.firefox.driver",
				"C:\\Program Files\\Mozilla Firefox\\firefox.exe");

		driver = new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
		
		
		Thread.sleep(500);
		
		driver.manage().window().maximize();
		
		
		String actualTitle = driver.getTitle();
		
		String expectedTitle = "Orange";
		
		Assert.assertEquals(actualTitle, expectedTitle);
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		
		driver.close();
		
		

	}

}
