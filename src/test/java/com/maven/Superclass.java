package com.maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Superclass {
	static WebDriver driver;

	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver.manage().window().maximize();

	}
	public static void debug(int milleseconds) throws InterruptedException {
		Thread.sleep(milleseconds);
	}
	static Actions a;
	public static void movetoelement(WebElement ele) {

		a = new Actions(driver);
		a.moveToElement(ele).perform();
	}
	public static void  dragAnddrop(WebElement source,WebElement target) {
		a = new Actions(driver);
		a.dragAndDrop(source, target).perform();

	}









}
