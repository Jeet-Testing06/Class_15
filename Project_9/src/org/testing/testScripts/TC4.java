package org.testing.testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC4 {
	
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
		Thread.sleep(6000);
		
		List <WebElement> ls1 = driver.findElements(By.id("video-title"));
		ls1.get(0).click();
		Thread.sleep(12000);
		
		WebElement subscribe = driver.findElement(By.xpath("/html[1]/body[1]/ytd-app[1]/div[1]/ytd-page-manager[1]/ytd-watch-flexy[1]/div[3]/div[1]/div[1]/div[7]/div[3]/ytd-video-secondary-info-renderer[1]/div[1]/div[2]/div[1]/ytd-subscribe-button-renderer[1]/paper-button[1]/yt-formatted-string[1]"));
		Thread.sleep(3000);
		subscribe.click();
		
		
		
		
	}
	
	@AfterMethod
	public void browser_close()
	{
		driver.close();
	}

}