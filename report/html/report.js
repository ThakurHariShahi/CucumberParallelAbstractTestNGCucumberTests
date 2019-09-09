$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/parallel/hris.feature");
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