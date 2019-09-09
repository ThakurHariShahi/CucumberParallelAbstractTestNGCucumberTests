$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/parallel/gmail.feature");
formatter.feature({
  "name": "Verifying the functionality of the web sites",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Verifying the Gmail",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I launch the gmail",
  "keyword": "Given "
});
formatter.step({
  "name": "I  enter the \u003cusername\u003e and \u003cpassword\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "I click on the login button",
  "keyword": "And "
});
formatter.step({
  "name": "I validate gmail inbox page for \u003cusername\u003e",
  "keyword": "Then "
});
formatter.step({
  "name": "I check the number of mail in the inbox",
  "keyword": "When "
});
formatter.step({
  "name": "I click on the first mail",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "testuser275275",
        "TESTuser275275"
      ]
    },
    {
      "cells": [
        "275275testuser",
        "TESTuser275275"
      ]
    }
  ]
});
formatter.background({
  "name": "Setting up the driver",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I set up the driver and open chrome",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDef.i_set_up_the_driver_and_open_chrome()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verifying the Gmail",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I launch the gmail",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDef.i_launch_the_gmail()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I  enter the testuser275275 and TESTuser275275",
  "keyword": "When "
});
formatter.match({
  "location": "StepDef.i_enter_the_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDef.i_click_on_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I validate gmail inbox page for testuser275275",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.i_validate_gmail_inbox_page_for(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I check the number of mail in the inbox",
  "keyword": "When "
});
formatter.match({
  "location": "StepDef.i_check_the_number_of_mail_in_the_inbox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the first mail",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.i_click_on_the_first_mail()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "Setting up the driver",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I set up the driver and open chrome",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDef.i_set_up_the_driver_and_open_chrome()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verifying the Gmail",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I launch the gmail",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDef.i_launch_the_gmail()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I  enter the 275275testuser and TESTuser275275",
  "keyword": "When "
});
formatter.match({
  "location": "StepDef.i_enter_the_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDef.i_click_on_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I validate gmail inbox page for 275275testuser",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.i_validate_gmail_inbox_page_for(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I check the number of mail in the inbox",
  "keyword": "When "
});
formatter.match({
  "location": "StepDef.i_check_the_number_of_mail_in_the_inbox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the first mail",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.i_click_on_the_first_mail()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/resources/parallel/hris.feature");
formatter.feature({
  "name": "Title of your feature",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature"
});
formatter.background({
  "name": "Setting up the driver",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I set up the driver and open chrome",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDef.i_set_up_the_driver_and_open_chrome()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verifying the Hris",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I launch the hris",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDef.i_launch_the_hris()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I  enter credentials to login",
  "rows": [
    {
      "cells": [
        "harishahi",
        "Hari@101$#"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "StepDef.i_enter_credentials_to_login(DataTable)"
});
formatter.result({
  "status": "passed"
});
});