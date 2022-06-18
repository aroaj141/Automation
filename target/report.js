$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Feature/cucumber.feature");
formatter.feature({
  "name": "verifying adactin hotel details",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "verifying adactinhotel login with invalid details",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I am on adactinHOtel Login page",
  "keyword": "Given "
});
formatter.step({
  "name": "I should enter \"\u003cuserName\u003e\"  ,\"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "I should click login button",
  "keyword": "And "
});
formatter.step({
  "name": "I should verify success login message",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "userName",
        "password"
      ]
    },
    {
      "cells": [
        "aroakash001",
        "123456789"
      ]
    }
  ]
});
formatter.scenario({
  "name": "verifying adactinhotel login with invalid details",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I am on adactinHOtel Login page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitionClass.a()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should enter \"aroakash001\"  ,\"123456789\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitionClass.i_should_enter(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should click login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitionClass.c()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should verify success login message",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionClass.i_should_verify_success_login_message()"
});
formatter.result({
  "status": "passed"
});
});