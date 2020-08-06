package com.qa.cyborgAutomation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.pageObjects.*;

public class testCommands extends initializer{
	
	WebDriver driver;

	
	/**
     * The Constructor.
     */
    public testCommands() {
        super();
        driver = super.getDriver();
//        propertyDealer propHandler = new propertyDealer("runtime.properties");
//        retryInterval =
//                Integer.parseInt(propHandler
//                        .getRuntimeProperty("RETRY_INTERVAL"));

    }
    
    public WebElement getElementLocator(String eleLcoator) {
    	

        try {

            Class< ? > clz = Class.forName("com.qa.pageObjects."+ eleLcoator.split("\\.")[0]);
            
            //Method[] consts = clz.getMethods();
            
            Method test;
			try {
				test = clz.getDeclaredMethod("btn_Search", WebDriver.class);
				return (WebElement) test.invoke(clz.getClass(),driver);
			} catch (NoSuchMethodException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            
            
            

//            for (int i = 0; i < consts.length; i++) {
//            	
//            	System.out.println(consts[i]);
//         
//
//                if (consts[i].toString().contains(eleLcoator.split("\\.")[1])) {
//                	
//                	return (WebElement) consts[i].invoke(driver);
//                	
//                	
////                    Class< ? > sub = consts[i].getClass();
////                    System.out.println(sub);
////                    Method mth = sub.getDeclaredMethod(eleLcoator.split("\\.")[1]);
////                    System.out.println(mth);
////                    System.out.println((String) mth.invoke(driver));
////                    return (WebElement) mth.invoke(driver);
//
//                }
//
//            }
        } catch (ClassNotFoundException e) {
            return null;
//        } catch (NoSuchMethodException e) {
//            return null;
        } catch (InvocationTargetException e) {
            return null;
        } catch (IllegalAccessException e) {
            return null;
        } catch (IllegalArgumentException e) {
            return null;
        }
//        System.out.println("object definition not found for " + eleLcoator);
//		return null;
		return null;
    	
    	
    }
    
    

    
    public void clickElement(String eleLocator) {
    	
    	getElementLocator(eleLocator).click();
    	
    	System.out.println("Clicked on element using function in testCommands.");
    	
    }

}
