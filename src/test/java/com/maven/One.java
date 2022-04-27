package com.maven;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class One extends BaseClass{
	@Test
	private void inernet() {
     launchChrome();
     maxwindow();
     getUrl("https://en-gb.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjQ3NjgyODU5LCJjYWxsc2l0ZV9pZCI6MjY5NTQ4NDUzMDcyMDk1MX0%3D");
	
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("jjsdsjdsdsdsds");
	
	driver.findElement(By.cssSelector("input[type=password]")).sendKeys("xhhxzhzh");
	driver.findElement(By.cssSelector("#loginbutton")).click();
	quiteChrome();
	
	}
	

}
