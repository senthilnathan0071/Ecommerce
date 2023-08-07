package org.purchase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Amazon {

	public static WebDriver driver;
	public static void main(String[] args) {
		
	
	ChromeOptions v =new ChromeOptions();
	v.addArguments("--remote-allow-origins=*");
	 driver = new ChromeDriver(v);
	 
	
	/*driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=486458755421&hvpos=&hvnetw=g&hvrand=3270591459158382114&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9061909&hvtargid=kwd-10573980&hydadcr=14453_2154373");

	driver.manage().window().maximize();
	driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[2]")).click(); */
	
	 driver.get("https://www.globalsqa.com/demo-site/");
	 driver.manage().window().maximize();
	 
	 

	
	
	}
}