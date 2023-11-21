package com.task18;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task_1 {

	public static void main(String[] args) throws InterruptedException {
		//open chrome browser
		WebDriver driver = new ChromeDriver();
				
				//navigate the url
		driver.navigate().to("https://www.facebook.com/");
				
				//maximize window]
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

				
		String title = driver.getTitle();
		System.out.println(title);
		if(title.contains("Facebook Home page")) {
		System.out.println("It is redirected to facebook home page ");
		}else {
		System.out.println("It is not redirected to facebook home page ");

				}
		Thread.sleep(2000);
				
		driver.findElement(By.linkText("Create new account")).click();
	    driver.findElement(By.name("firstname")).sendKeys("text");
		driver.findElement(By.name("lastname")).sendKeys("user");
		driver.findElement(By.name("reg_email__")).sendKeys("testuser@test.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("testuser@test.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Pass@0304");
		WebElement date = driver.findElement(By.id("day"));		
		Select drop = new Select(date);
		drop.selectByVisibleText("11");
		WebElement month = driver.findElement(By.id("month"));
		Select drop1 = new Select(month);
		drop1.selectByVisibleText("May");
		WebElement year = driver.findElement(By.id("year"));
		Select drop2 = new Select(year);
		drop2.selectByVisibleText("1985");
		
		WebElement radiobutton = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		radiobutton.click();
		
		driver.findElement(By.name("websubmit")).click();
	}

}
