package com.qa.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pg_FB_Home {
	
	private static WebElement element = null;
	 
    public static WebElement tb_UserName(WebDriver driver){element = driver.findElement(By.id("email")); return element;}
 
    public static WebElement tb_Password(WebDriver driver){element = driver.findElement(By.id("pass")); return element;}
    
    public static WebElement btn_Login(WebDriver driver){element = driver.findElement(By.id("u_0_2")); return element;}
    
    public static WebElement btn_Signup(WebDriver driver){element = driver.findElement(By.name("websubmit")); return element;}
    
    public static WebElement img_ErrorIcom(WebDriver driver){element = driver.findElement(By.xpath("//i[contains(@class,'_5dbc')][1]")); return element;}
  
}
