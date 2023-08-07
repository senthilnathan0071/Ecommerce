package org.purchase;

import java.awt.AWTException;
import java.awt.RenderingHints.Key;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Robot {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, AWTException {

		ChromeOptions v = new ChromeOptions();
		v.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(v);

		driver.get("https://en-gb.facebook.com/");

		driver.manage().window().maximize();
		WebElement robot = driver.findElement(By.xpath("//input[@id='email']"));
		robot.sendKeys("senthilnathan0071@gmail.com");

//		Actions a =new Actions(driver);
//		a.contextClick(robot).perform(); 
//		
		java.awt.Robot r = new java.awt.Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
//		r.keyRelease(KeyEvent.VK_CONTROL);
//		r.keyRelease(KeyEvent.VK_A);

		// r.keyPress(KeyEvent.VK_DOWN);
		// r.keyRelease(KeyEvent.VK_DOWN);

//		for (int i = 0; i <=2; i++) {
//			r.keyPress(KeyEvent.VK_DOWN);
//			r.keyRelease(KeyEvent.VK_DOWN);
//			
//		}

		r.keyPress(KeyEvent.VK_X);
//		r.keyRelease(KeyEvent.VK_CONTROL);
//		r.keyRelease(KeyEvent.VK_X);

		WebElement done = driver.findElement(By.xpath("//*[@id=\"passContainer\"]"));
		done.click();

		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
	}
}
