package com.selenium.test.maven_project;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Proj1 {
	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ITSupport\\Desktop\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.irctc.co.in/eticketing/pageUnderConstruction.jsf");
	driver.manage().window().maximize();
	/*driver.findElement(By.xpath("//div[@class='h_container_sm']//a")).click();
	driver.findElement(By.className("search_btn")).click();*/
	
	driver.findElement(By.id("loginbutton")).click();
	Alert alert=driver.switchTo().alert();
	alert.accept();
			//push
	
	
	//WebElement drive=driver.findElement(By.id("userId"));fhgfdnhjgfgh
	//drive.sendKeys("pooja");hjadgfjutfgfhdghdtdtfgjfrjufrju
	//online commit https://github.com/poojadarsinia/pooja.git
	//online commit https://github.com/poojadarsinia/pooja.git

}}



