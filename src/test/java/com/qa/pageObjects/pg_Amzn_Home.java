package com.qa.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pg_Amzn_Home {
	
	private static WebElement element = null;
	 
    public static WebElement tb_Search(WebDriver driver){element = driver.findElement(By.id("twotabsearchtextbox")); return element;}
    
    public static WebElement btn_Search(WebDriver driver){element = driver.findElement(By.xpath("//input[@type='submit' and @value]")); return element;}
    
    public static WebElement txt_ProdTitle(WebDriver driver){element = driver.findElement(By.xpath("//span[contains(@class,'a-size-medium')]")); return element;}
    
    
  
}
