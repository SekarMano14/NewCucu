$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/login.feature");
formatter.feature({
  "name": "To validatde the Fb login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "To validate the login with the credeintials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "The user enter the \"\u003cuserName\u003e\" and \"\u003cpassWord\u003e\" datas",
  "keyword": "When "
});
formatter.step({
  "name": "The user click the login button",
  "keyword": "And "
});
formatter.step({
  "name": "The user  navigate to next page",
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
        "passWord"
      ]
    },
    {
      "cells": [
        "mano",
        "965"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The user in FB page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.the_user_in_FB_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate the login with the credeintials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "The user enter the \"mano\" and \"965\" datas",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.the_user_enter_the_and_datas(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.the_user_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user  navigate to next page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.the_user_navigate_to_next_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "To validate the Registration functionality",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Sanity"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "The user enter the \"\u003cfristName\u003e\" and \"\u003clastName\u003e\" details",
  "keyword": "When "
});
formatter.step({
  "name": "the user Registered successfully",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "fristName",
        "lastName"
      ]
    },
    {
      "cells": [
        "Manoj",
        "Kumar"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The user in FB page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.the_user_in_FB_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate the Registration functionality",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Sanity"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "The user enter the \"Manoj\" and \"Kumar\" details",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.the_user_enter_the_and_details(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user Registered successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.the_user_Registered_successfully()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});