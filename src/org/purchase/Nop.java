package org.purchase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Nop {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		
		ChromeOptions copt = new ChromeOptions();
		copt.addArguments("--remote-allow-origins=*");

		 driver = new ChromeDriver(copt);
		 driver.get("");
		 driver.manage().window().maximize();
		 
		 
		
		
		
	}

}
