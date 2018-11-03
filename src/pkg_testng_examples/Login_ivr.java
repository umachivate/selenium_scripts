package pkg_testng_examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login_ivr {
	
	@Test
	public void  login()
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get ("http://172.20.24.211:8080/ivrweb/");
//		System.out.println("Hello");
	}

}
