package AxisQA.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(ListnerClass.class)
public class InvokeFirefox {
	
		public static WebDriver driver;
		@Test
		public void inovkefirefox() {
			System.setProperty("webdriver.firefox.driver",
					"C:\\Program Files\\Mozilla Firefox\\firefox.exe");

			driver = new FirefoxDriver();
			driver.get("https://www.selenium.dev/");

	}

}
