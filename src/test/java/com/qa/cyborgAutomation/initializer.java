package com.qa.cyborgAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class initializer {

	/** The driver. */
    private static WebDriver driver = null;

    /** The browser string. */
    private static String browserString;

    /** The web driver capabilities. */
    private static DesiredCapabilities webDriverCapabilities;
    
    
    /**
     * Gets the driver.
     * 
     * @return the driver
     */
    public final static WebDriver getDriver() {
        return driver;
    }
    
    /**
     * Sets the driver.
     * 
     * @param driverObj
     *            the driver to set
     */
    public final void setDriver(final WebDriver driverObj) {
        this.driver = driverObj;
    }
	
}
