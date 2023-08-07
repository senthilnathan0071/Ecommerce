package org.purchase;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Button {


		public static WebDriver driver;
		public static void main(String[] args) {
			
		
		ChromeOptions v =new ChromeOptions();
		v.addArguments("--remote-allow-origins=*");
		 driver = new ChromeDriver(v);
		 
		 driver.get("https://demoqa.com/buttons");
		 WebElement doubl = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		 Actions s =new Actions(driver);
		 s.doubleClick(doubl).build().perform();
		 WebElement right = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		s.contextClick(right).build().perform();
		
		

		
	}

}
