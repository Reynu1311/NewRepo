package org.test.sample;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class Sample {
	public static WebDriver driver;

	@BeforeClass
	public static void launchBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium Workspace\\SeleniumBrowserLaunch\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@AfterClass
	public static void closeBrowser() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();

	}

	@Before
	public void startTime() {
		Date d = new Date();
		System.out.println(d);
	}

	@After
	public void endTime() {
		Date d = new Date();
		System.out.println(d);
	}

	@Test
	public void tc1() {
		driver.get("https://www.facebook.com/");
		Assert.assertTrue("verify title",driver.getTitle().contains("facebook"));
		WebElement txtEmail = driver.findElement(By.id("email"));
		txtEmail.sendKeys("Java");
		String attribute = txtEmail.getAttribute("value");
		Assert.assertEquals("Verify email", "Java", attribute);
		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys("selenium");
		WebElement loginBtn = driver.findElement(By.xpath("//input[@data-testid='royal_login_button']"));
		loginBtn.click();

	}

	@Test
	public void tc2() {
		driver.get("https://www.facebook.com/");
		WebElement txtEmail = driver.findElement(By.id("email"));
		txtEmail.sendKeys("oracle");
		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys("sql");
		WebElement loginBtn = driver.findElement(By.xpath("//input[@data-testid='royal_login_button']"));
		loginBtn.click();

	}

	@Test
	public void tc3() {
		driver.get("https://www.facebook.com/");
		WebElement txtEmail = driver.findElement(By.id("email"));
		txtEmail.sendKeys("python");
		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys("hadoop");
		WebElement loginBtn = driver.findElement(By.xpath("//input[@data-testid='royal_login_button']"));
		loginBtn.click();

	}
@Test
	public void tc4() {
		driver.get("https://www.facebook.com/");
		WebElement txtEmail = driver.findElement(By.id("email"));
		txtEmail.sendKeys("aws");
		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys("devops");
		WebElement loginBtn = driver.findElement(By.xpath("//input[@data-testid='royal_login_button']"));
		loginBtn.click();
	}
}
