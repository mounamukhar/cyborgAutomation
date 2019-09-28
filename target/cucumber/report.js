$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/com/qa/features/amazonSearch.feature");
formatter.feature({
  "name": "Amazon website test",
  "description": "  I want to test multiple search on amazon.com",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@web"
    }
  ]
});
formatter.scenarioOutline({
  "name": "",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@web"
    }
  ]
});
formatter.step({
  "name": "I want to make sure amazon home page open",
  "keyword": "Given "
});
formatter.step({
  "name": "I search for \"\u003cname\u003e\" as a product",
  "keyword": "When "
});
formatter.step({
  "name": "I verify result displayed \"\u003cstatus\u003e\" in step",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "name",
        "status"
      ]
    },
    {
      "cells": [
        "B07TWFWJDZ",
        "Success"
      ]
    },
    {
      "cells": [
        "B07TWFW",
        "Fail"
      ]
    },
    {
      "cells": [
        "B07TWF",
        "Fail"
      ]
    }
  ]
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@web"
    },
    {
      "name": "@web"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I want to make sure amazon home page open",
  "keyword": "Given "
});
formatter.match({
  "location": "sdef_amazonSearch.i_want_to_make_sure_amazon_home_page_open()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I search for \"B07TWFWJDZ\" as a product",
  "keyword": "When "
});
formatter.match({
  "location": "sdef_amazonSearch.i_search_for_as_a_product(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify result displayed \"Success\" in step",
  "keyword": "Then "
});
formatter.match({
  "location": "sdef_amazonSearch.i_verify_result_displayed_in_step(String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//span[contains(@class,\u0027a-size-medium\u0027)]\"}\n  (Session info: chrome\u003d77.0.3865.90)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027MounamukharsMBP.fios-router.home\u0027, ip: \u0027fe80:0:0:0:10c2:2656:4a58:3b46%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.14.6\u0027, java.version: \u002712.0.1\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 77.0.3865.90, chrome: {chromedriverVersion: 76.0.3809.126 (d80a294506b4..., userDataDir: /var/folders/z8/xff0jmgn6js...}, goog:chromeOptions: {debuggerAddress: localhost:64537}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 7d3ed80dcc4ad0bfe271289f0e854c8e\n*** Element info: {Using\u003dxpath, value\u003d//span[contains(@class,\u0027a-size-medium\u0027)]}\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\n\tat com.qa.pageObjects.pg_Amzn_Home.txt_ProdTitle(pg_Amzn_Home.java:15)\n\tat com.qa.stepdefinitions.sdef_amazonSearch.i_verify_result_displayed_in_step(sdef_amazonSearch.java:36)\n\tat ✽.I verify result displayed \"Success\" in step(file:src/test/java/com/qa/features/amazonSearch.feature:28)\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@web"
    },
    {
      "name": "@web"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I want to make sure amazon home page open",
  "keyword": "Given "
});
formatter.match({
  "location": "sdef_amazonSearch.i_want_to_make_sure_amazon_home_page_open()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I search for \"B07TWFW\" as a product",
  "keyword": "When "
});
formatter.match({
  "location": "sdef_amazonSearch.i_search_for_as_a_product(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify result displayed \"Fail\" in step",
  "keyword": "Then "
});
formatter.match({
  "location": "sdef_amazonSearch.i_verify_result_displayed_in_step(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@web"
    },
    {
      "name": "@web"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I want to make sure amazon home page open",
  "keyword": "Given "
});
formatter.match({
  "location": "sdef_amazonSearch.i_want_to_make_sure_amazon_home_page_open()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I search for \"B07TWF\" as a product",
  "keyword": "When "
});
formatter.match({
  "location": "sdef_amazonSearch.i_search_for_as_a_product(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify result displayed \"Fail\" in step",
  "keyword": "Then "
});
formatter.match({
  "location": "sdef_amazonSearch.i_verify_result_displayed_in_step(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/java/com/qa/features/login.feature");
formatter.feature({
  "name": "Title of your feature",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature"
});
formatter.background({
  "name": "List of steps run before each of the scenarios",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "facebook home page loaded",
  "keyword": "When "
});
formatter.match({
  "location": "sdef_common.facebook_home_page_loaded()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Facebook log in test",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@web"
    }
  ]
});
formatter.step({
  "name": "I want to log into Facebook",
  "keyword": "Given "
});
formatter.match({
  "location": "sdef_common.i_want_to_log_into_Facebook()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter username as \"cyborg\"",
  "keyword": "When "
});
formatter.match({
  "location": "sdef_common.i_enter_username_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter password as \"Automation\"",
  "keyword": "And "
});
formatter.match({
  "location": "sdef_common.i_enter_password_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I validate if I can login",
  "keyword": "Then "
});
formatter.match({
  "location": "sdef_common.i_validate_if_I_can_login()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "List of steps run before each of the scenarios",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "facebook home page loaded",
  "keyword": "When "
});
formatter.match({
  "location": "sdef_common.facebook_home_page_loaded()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Title of your scenario",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@web"
    }
  ]
});
formatter.step({
  "name": "FB home page is open",
  "keyword": "Given "
});
formatter.match({
  "location": "sdef_common.fb_home_page_is_open()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on Sign Up without any data",
  "keyword": "When "
});
formatter.match({
  "location": "sdef_common.user_click_on_Sign_Up_without_any_data()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Error message displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "sdef_common.error_message_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});