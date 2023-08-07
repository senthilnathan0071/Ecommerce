package org.purchase;

import java.awt.AWTException;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Select {
	public static WebDriver driver;

	public static void main(String[] args) throws AWTException {

		ChromeOptions v = new ChromeOptions();
		v.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(v);

		driver.get("https://www.globalsqa.com/demo-site/select-elements/");
		driver.manage().window().maximize();
		
		WebElement lo = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(lo);

		Actions a = new Actions(driver);
		a.keyDown(Keys.CONTROL);
		WebElement findElement1 = driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[1]"));
		a.click(findElement1).perform();
		WebElement findElement2 = driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[2]"));
		a.click(findElement2).perform();

		WebElement findElement = driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[3]"));
		a.click(findElement).perform();
		WebElement findElement3 = driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[4]"));
		a.click(findElement3).perform();
		WebElement findElement4 = driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[5]"));
		a.click(findElement4).perform();
		WebElement findElement5 = driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[6]"));
		a.click(findElement5).perform();

		WebElement findElement6 = driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[7]"));
		a.click(findElement6).perform();

		
	}
}
