package org.purchase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Register {
	public static WebDriver driver;
	public static void main(String[] args) {
		
	
	ChromeOptions v =new ChromeOptions();
	v.addArguments("--remote-allow-origins=*");
	 driver = new ChromeDriver(v);
	 
	 driver.get("https://demoqa.com/automation-practice-form");
	 driver.manage().window().maximize();
	 driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("senthil");
	 driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("nathan");
	 driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("senthilnathan0071");
	 
	 
	 WebElement radio = driver.findElement(By.xpath("//input[@id='gender-radio-1']"));
	 Actions a =new Actions(driver);
	 a.moveToElement(radio).click().perform();
	 driver.findElement(By.xpath("//input[@id='userNumber']")).sendKeys("8072988172");
	 
	

}
}