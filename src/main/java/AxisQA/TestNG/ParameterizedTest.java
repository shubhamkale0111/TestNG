package AxisQA.TestNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedTest {

	@Test
	@Parameters("browser")
	public void parameter(String browser) {
		
		if(browser.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64/chromedriver.exe");

			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.selenium.dev/");
		}else {
			System.setProperty("webdriver.firefox.driver",
					"C:\\Program Files\\Mozilla Firefox\\firefox.exe");

			FirefoxDriver driver = new FirefoxDriver();
			driver.get("https://www.selenium.dev/");
		}
		
	}
	

}
