package org.purchase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Check_box {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		ChromeOptions v =new ChromeOptions();
		v.addArguments("--remote-allow-origins=*");
		 driver = new ChromeDriver(v);
		 driver.get("https://demoqa.com/checkbox");
			
			driver.manage().window().maximize();
				driver.findElement(By.xpath("//button[@class='rct-collapse rct-collapse-btn']")).click();
				driver.findElement(By.xpath("//label[@for='tree-node-documents']//span[@class='rct-checkbox']//*[name()='svg']")).click();
				
				driver.findElement(By.xpath("//li[3]//span[1]//button[1]//*[name()='svg']")).click();
				Thread.sleep(7000);

				
				driver.findElement(By.xpath("//label[@for='tree-node-excelFile']//span[@class='rct-checkbox']//*[name()='svg']")).click();								
	}

}
