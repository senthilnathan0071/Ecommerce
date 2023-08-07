package org.purchase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Radio {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

			ChromeOptions v =new ChromeOptions();
			v.addArguments("--remote-allow-origins=*");
			 driver = new ChromeDriver(v);
		 
		 driver.get("https://demoqa.com/radio-button");
		 
		 driver.manage().window().maximize();
		 
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("//label[@for='impressiveRadio']")).click();
	}

}
