package AxisQA.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(ListnerClass.class)
public class InvokeEdge {
	
	
	@Test
	public void invokeedge() {
		
		System.setProperty("webdriver.edge.driver", 
				"\"C:\\Program Files (x86)\\Microsoft\\Edge\\Application\"");
				
				WebDriver driver = new EdgeDriver();
				
				driver.get("https://www.sele");
				
	}

}
