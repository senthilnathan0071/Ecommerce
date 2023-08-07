package org.purchase;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Text_box {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions v =new ChromeOptions();
		v.addArguments("--remote-allow-origins=*");
		 driver = new ChromeDriver(v);
		
		driver.get("https://demoqa.com/text-box");
		
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.xpath("//input[@id='userName']"));
		username.sendKeys("senthil");
		
		WebElement email = driver.findElement(By.xpath("//input[@id='userEmail']"));
		email.sendKeys("senthilnathan0071@gmail.com");
		
		WebElement address = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
		address.sendKeys("A/5,police quarters");
		
		
		
		//Thread.sleep(2000);
		
		//WebElement submit = driver.findElement(By.xpath("//button[@id='submit']"));
		
		WebElement currentaddress = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
		
		
		Actions n =new Actions(driver);
		n.moveToElement(currentaddress).perform();
		
		n.keyDown(Keys.SHIFT).perform();
		currentaddress.sendKeys("a/5,police quarters");
		n.keyUp(Keys.SHIFT).perform();
		
		Thread.sleep(2000);
		
		
		

		
		
	}

}
