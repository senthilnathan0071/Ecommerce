package org.purchase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Web_table {
	public static WebDriver driver;
	public static void main(String[] args) {
		
	
	ChromeOptions v =new ChromeOptions();
	v.addArguments("--remote-allow-origins=*");
	 driver = new ChromeDriver(v);
	 
	 driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html#google_vignette");
	 int find = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr")).size();
	System.out.println("no. of rows:" +find);
	
	int size = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th/td")).size();
	System.out.println("number od colum" + size);
	
	
	
	}
}
