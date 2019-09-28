package com.qa.cyborgAutomation;

import com.frameworkBuilder.utils.propertyDealer;

public class testCommands extends initializer{
	
	/**
     * The Constructor.
     */
    public testCommands() {
        super();
        propertyDealer propHandler = new propertyDealer("runtime.properties");
//        retryInterval =
//                Integer.parseInt(propHandler
//                        .getRuntimeProperty("RETRY_INTERVAL"));

    }

}
