package org.testing.testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC2 {
	
	ChromeDriver driver;
	
	@BeforeMethod
	public void browser_launch()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jitender.ahuja\\Downloads\\Jar Files\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://www.youtube.com");
		driver.manage().window().maximize();
	}
	
	@Test
	public void test_case() throws InterruptedException
	{
		
		WebElement signin = driver.findElement(By.xpath("//yt-formatted-string[text()='Sign in']"));
		signin.click();
		Thread.sleep(3000);
		
		WebElement email = driver.findElement(By.xpath("//input[@id='identifierId']"));
		email.sendKeys("jitenderahuja06@gmail.com");
		Thread.sleep(3000);
		
		WebElement nextemail = driver.findElement(By.xpath("//span[text()='Next']"));
		nextemail.click();
		Thread.sleep(3000);
		
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("@naukrijob");
		Thread.sleep(3000);
		
		WebElement nextpwd = driver.findElement(By.xpath("//span[text()='Next']"));
		nextpwd.click();
		Thread.sleep(3000);
		
		WebElement subscriptions = driver.findElement(By.xpath("//span[text()='Subscriptions']"));
		subscriptions.click();
		Thread.sleep(3000);
		
	}
	
	@AfterMethod
	public void browser_close()
	{
		driver.close();
	}

}