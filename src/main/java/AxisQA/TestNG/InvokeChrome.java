package AxisQA.TestNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListnerClass.class)
public class InvokeChrome {
	@Test
	public void invokechrome() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
	}

}
