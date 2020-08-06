package com.qa.cyborgAutomation;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;

public class initializer {

	/** The one time setup */
    public static boolean executionSetupComplete = false;
    
    /** The webdriver */
    private static WebDriver driver = null;
    
    private static testCommands userAction = null;

    /** The string that contains execution browser name. */
    private static String browserString;

    /** The web driver capabilities - will have default values unless assigned */
    private static DesiredCapabilities webDriverCapabilities;
    
    /** The Constant THIS_IS_WINDOWS. */
    private static final boolean THIS_IS_WINDOWS = ";".equals(File.pathSeparator);
    
    /** The default Firefox profile. */
    private static FirefoxProfile defaultProfile;
    
    /** Test case faliure status. */
    private static boolean testCaseFailStatus;
    
    /** The verification errors. */
    private StringBuffer verificationErrors = new StringBuffer();
    
    /** The capture screen shot on failure. */
    private boolean captureScreenShotOnFailure = false;
    
    /** The selenium instances. */
    private Map<String, WebDriver> seleniumInstances =
            new HashMap<String, WebDriver>();
    
    
    /**
     * Gets the driver.
     * @return the driver
     */
    public final static WebDriver getDriver() {
        return driver;
    }
    
    /**
     * Sets the driver.
     * @param driverObj the driver to set
     */
    public final void setDriver(final WebDriver driverObj) {
        this.driver = driverObj;
    }
    
    public final static testCommands gettestCommands() {
        return userAction;
    }
    
    public final void settestCommands(final testCommands tstCmm) {
        this.userAction = tstCmm;
    }
    
    
    
    /**
     * Sets the default profile.
     * @param defaultProfileFirefox the defaultProfile to set
     */
    public static final void setDefaultProfile(
            final FirefoxProfile defaultProfileFirefox) {
        initializer.defaultProfile = defaultProfileFirefox;
    }
    
    /**
     * Indicate Failure
     * @param message - the message
     */
    public static void failure(final Object message) {
        throw new AssertionError(message.toString());
    }
    
    /**
     * Gets the browser string.
     * 
     * @return the browserString
     */
    public static final String getBrowserString() {
        return browserString;
    }
    
    /**
     * Sets the test case failed status.
     * 
     * @param isFailed
     *            the new test case failed status
     */
    public static void setTestCaseFailedStatus(final boolean isFailed) {
        testCaseFailStatus = isFailed;
    }

    /**
     * Gets the test case failed status.
     * 
     * @return the test case failed status
     */
    public static boolean getTestCaseFailedStatus() {
        return testCaseFailStatus;
    }
    
    /**
     * Assert true.
     * 
     * @param message
     *            the message
     * @param condition
     *            the condition
     */
    public static void assertTrue(final String message, final boolean condition) {
        if (!condition) {
            setTestCaseFailedStatus(true);
            failure(message);
        }
    }
    
    /**
     * Runtime browser string.
     * @return the string
     */
    protected final String runtimeBrowserString() {
        String defaultBrowser = System.getProperty("selenium.defaultBrowser");
        if (defaultBrowser == null) {
            if (THIS_IS_WINDOWS) {
                defaultBrowser = "*iexplore";
            } else {
                defaultBrowser = "*chrome";
            }
        }
        return defaultBrowser;
    }
    /**
     * Sets the web driver capabilities.
     * 
     * @param capabilities
     *            the webDriverCapabilities to set
     */
    public static final void setWebDriverCapabilities(
            final DesiredCapabilities capabilities) {
        initializer.webDriverCapabilities = capabilities;
    }
    
    /**
     * Gets the web driver capabilities.
     * 
     * @return the webDriverCapabilities
     */
    public static final DesiredCapabilities getWebDriverCapabilities() {
        return webDriverCapabilities;
    }
    
    /**
     * Gets the selenium instances.
     * 
     * @return the seleniumInstances
     */
    public final Map<String, WebDriver> getSeleniumInstances() {
        return seleniumInstances;
    }

    /**
     * Sets the selenium instances.
     * 
     * @param seleniumInstancesMap
     *            the seleniumInstances to set
     */
    public final void setSeleniumInstances(
            final Map<String, WebDriver> seleniumInstancesMap) {
        this.seleniumInstances = seleniumInstancesMap;
    }

    /**
     * Put selenium instances.
     * 
     * @param instanceName
     *            the instanceName to put
     * @param webDriver
     *            the webDriver to put
     */
    public final void putSeleniumInstances(final String instanceName,
            final WebDriver webDriver) {
        this.seleniumInstances.put(instanceName, webDriver);
    }
    
    /**
     * Gets the default port.
     * @return the default port
     */
    private int getDefaultPort() {
        final int num = 4444;
        try {
            Class< ? > c =
                    Class.forName("org.openqa.selenium.server.RemoteControlConfiguration");
            Method getDefaultPort = c.getMethod("getDefaultPort", new Class[0]);
            Integer portNumber =
                    (Integer) getDefaultPort.invoke(null, new Object[0]);
            return portNumber.intValue();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {

            e.printStackTrace();
        }
        return Integer.getInteger("selenium.port", num).intValue();
    }
    
    /**
     * Sets the up.
     * @param address the URL
     * @param browserName the browser string
     * @param port the port
     */
    public final void setUp(final String address, final String browserName,
            final int port) {

        this.configWebDriver(browserName);
    }
    
    /**
     * Sets the up. 
     * @param instanceName the instance name
     * @param browserName the browser string
     * @param serverConfig the server config
     */
    public final void setUp(final String browserName) {

        this.configWebDriver(browserName);
        
    }

    /**
     * Configuration of web driver.
     * @param browserName - the browser string
     */
    public final void configWebDriver(final String browserName) {
        if (browserName.toLowerCase().contains("chrome")) {

            setBrowserString(browserString);
            File chromedriver = getChromeDriverServerExecutables();
            System.setProperty("webdriver.chrome.driver",chromedriver.getAbsolutePath());
            setWebDriverCapabilities(new DesiredCapabilities());
        } else if (browserName.contains("safari")) {

            setBrowserString(browserString);
            setWebDriverCapabilities(new DesiredCapabilities());
        } else if (browserName.contains("iexplore")) {

            setBrowserString(browserString);
            setWebDriverCapabilities(new DesiredCapabilities());
            File iedriver;
            if (isx64bit()) {
                iedriver = new File("src" + File.separator + "resources" + File.separator + "lib" + File.separator + "IEDriver_win64.exe");
            } else {
                iedriver = new File("src" + File.separator + "resources" + File.separator + "lib" + File.separator + "IEDriver_win32.exe");
            }
            System.setProperty("webdriver.ie.driver", iedriver.getAbsolutePath());

        } else if (browserName.contains("firefox")) {

            setBrowserString(browserString);
            setWebDriverCapabilities(new DesiredCapabilities());
            setDefaultProfile(new FirefoxProfile());
        } else {
            throw new AssertionError("Cyborg does not support this browser: " + browserName);
        }
    }

    /**
     * Checks the OS and Chrome browser related parameter from system
     * @return File of the Chrome driver executable.
     */
    private  File getChromeDriverServerExecutables() {
    	
        String os =System.getProperty("os.name").toLowerCase(Locale.getDefault());
        File file = null;
        if (os.contains("win")) {
            file = new File("src" + File.separator + "resources" + File.separator + "lib" + File.separator + "chromedriver_win.exe");
        } else if (os.contains("mac")) {
            try {
            	Runtime.getRuntime().exec(
                        "chmod 777 chromedriver_mac",
                        null,
                        new File("src" + File.separator + "resources" + File.separator + "lib" ));
            } catch (IOException e) {
                e.printStackTrace();
            }
            file = new File("src" + File.separator + "resources" + File.separator + "lib" + File.separator + "chromedriver_mac");
        }
       return file;
    }
    
    /**
     * Checks if is capture screen shot on failure.
     * 
     * @return true, if is capture screen shot on failure
     */
    protected final boolean isCaptureScreenShotOnFailure() {
        return captureScreenShotOnFailure;
    }

    /**
     * Sets the capture screen shot on failure.
     * 
     * @param captureScreetShotOnFailure
     *            the new capture screen shot on failure
     */
    protected final void setCaptureScreenShotOnFailure(
            final boolean captureScreetShotOnFailure) {
        this.captureScreenShotOnFailure = captureScreetShotOnFailure;
    }

    /**
     * Get operating system.
     * @return operating system
     */

    protected final String getOperatingSystem() {

        return System.getProperty("os.name").toLowerCase(Locale.getDefault());
    }

    /**
     * Checks if is x64bit.
     * @return true, if x64bit
     */
    protected final boolean isx64bit() {
        String architecture = System.getProperty("os.arch");
        return architecture.contains("64");
    }

    /**
     * Sets the browser string.
     * @param browser the new browser string
     */
    public static synchronized void setBrowserString(final String browser) {
        browserString = browser;
    }

    /**
     * Checks if is process running.
     * @param serviceName - the service name
     * @return true, if is process running
     * @throws Exception the exception
     */
    public final boolean isProcessRunning(final String serviceName)
            throws Exception {
        String tasklist = "tasklist";
        Process p = Runtime.getRuntime().exec(tasklist);
        BufferedReader reader = null;
        try {
            reader =
                    new BufferedReader( new InputStreamReader(p.getInputStream()));
            String line;

            while ((line = reader.readLine()) != null) {
                if (line.contains(serviceName)) {
                    return true;
                }
            }
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return false;
    }

    /**
     * Kill process.
     * @param serviceName - the service name
     * @throws Exception - the exception
     */
    public final void killProcess(final String serviceName) throws Exception {

        String os = getOperatingSystem();
        Runtime runtime = Runtime.getRuntime();
        if (os.contains("win")) {
            runtime.exec("taskkill /F /IM " + serviceName);
        } else if (os.contains("mac") || os.contains("nux")) {
            runtime.exec("killall -9 " + serviceName);
        }
    }
    
    /**
     * Sleeps for the provided number of milliseconds.
     * @param milisec
     */
    public final void sleep(final int milisec) {
        try {
            Thread.sleep(milisec);
        } catch (InterruptedException exp) {
            exp.printStackTrace();
        }
    }
    
    /**
     * Asserts that there were no verification errors during the current test,
     * failing immediately if any are found.
     */
    public final void checkForVerificationErrors() {
        String verificationErrorString = verificationErrors.toString();
        clearVerificationErrors();
        if (!"".equals(verificationErrorString)) {
            failure(verificationErrorString);
        }
    }

    /** Clears out the list of verification errors. */
    public final void clearVerificationErrors() {
        verificationErrors = new StringBuffer();
    }
    
    /**
     * checks for verification errors and stops the browser.
     * @throws Exception - the exception
     */
    public final void tearDown() throws Exception {
        try {
            checkForVerificationErrors();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
	
}
