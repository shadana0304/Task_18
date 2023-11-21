package com.task18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task_2 {

	public static void main(String[] args) {
		//open chrome browser
		WebDriver driver = new ChromeDriver();
		
		//navigate the url
		driver.navigate().to("https://jqueryui.com/droppable/");
		
		//maximize window
		driver.manage().window().maximize();
		
		//switch frame
		driver.switchTo().frame(0);
		
		//find the source element
		WebElement drag =driver.findElement(By.id("draggable"));
		
		//find the target element
		WebElement drop =driver.findElement(By.id("droppable"));
		
		//create a action class
		Actions a = new Actions(driver);
		
		//perform drag drop operation
		a.dragAndDrop(drag, drop).perform();
		
		//checking the colour property of the target elements
		//System.out.println(drop.getCssValue("background"));
		
          String background =drop.getCssValue("background");
          if(background.equals("rgb(255, 250, 144)")) {
    			
    			System.out.println("Drag and Drop is successful");
    		}else {
    			System.out.println("Drag and Drop is not successful");
    		}
          
		//verify that the target element changed dropped
		String targetelement=drop.getText();		
		if(targetelement.equals("Dropped!")) {
  			
  			System.out.println("Target element has changed to dropped");
  		}else {
  			System.out.println("Target element has not changed to dropped");
  		}
		
	}

}
