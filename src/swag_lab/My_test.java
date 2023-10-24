package swag_lab;

import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class My_test extends Parameter {

	
	
	@BeforeMethod
	public void mySetup() 
	{
		
	driver.get(Url);

	}

	@Test()
	
	public void LoginWithStandardUSer() throws InterruptedException {
		
		loginFunction(StandardUserName ,passWord);
		Thread.sleep(3000);
			  
	}

	@Test()
	public void LoginWithProblemUser() throws InterruptedException {
		loginFunction(ProblemUserName ,passWord);
		Thread.sleep(3000);
			
			

	}
	@Test()
	public void LoginWithPerformanceUser() throws InterruptedException {
		
		loginFunction(PerformanceUserName ,passWord);
		Thread.sleep(3000);
		
	}

	@AfterMethod
	public void myPostTesting() {
	

		
	}
}