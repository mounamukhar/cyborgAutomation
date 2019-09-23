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