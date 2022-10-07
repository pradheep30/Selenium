$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("adac.feature");
formatter.feature({
  "line": 1,
  "name": "Adactin Hotel Application",
  "description": "",
  "id": "adactin-hotel-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Login Functionality",
  "description": "",
  "id": "adactin-hotel-application;login-functionality",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@smoketest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user Launch The Adactin Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"\u003cusername\u003e\" username In The InputBox",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enter The \"\u003cpassword\u003e\" Password In The InputBox",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User Clicks On The LoginPage And It Navigates In To Search Page",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "adactin-hotel-application;login-functionality;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 11,
      "id": "adactin-hotel-application;login-functionality;;1"
    },
    {
      "cells": [
        "pradheep30",
        "123456"
      ],
      "line": 12,
      "id": "adactin-hotel-application;login-functionality;;2"
    },
    {
      "cells": [
        "pradh21546",
        "1234561144"
      ],
      "line": 13,
      "id": "adactin-hotel-application;login-functionality;;3"
    },
    {
      "cells": [
        "pradh21nbbb546",
        "1234ffnnf561144"
      ],
      "line": 14,
      "id": "adactin-hotel-application;login-functionality;;4"
    },
    {
      "cells": [
        "pragg3g4dh21546",
        "123456rr1144"
      ],
      "line": 15,
      "id": "adactin-hotel-application;login-functionality;;5"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": "Login Functionality",
  "description": "",
  "id": "adactin-hotel-application;login-functionality;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@smoketest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user Launch The Adactin Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"pradheep30\" username In The InputBox",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enter The \"123456\" Password In The InputBox",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User Clicks On The LoginPage And It Navigates In To Search Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Launch_The_Adactin_Application()"
});
formatter.result({
  "duration": 10201905700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "pradheep30",
      "offset": 16
    }
  ],
  "location": "StepDefinition.user_Enter_The_username_In_The_InputBox(String)"
});
formatter.result({
  "duration": 2171543700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123456",
      "offset": 16
    }
  ],
  "location": "StepDefinition.user_Enter_The_Password_In_The_InputBox(String)"
});
formatter.result({
  "duration": 346612000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Clicks_On_The_LoginPage_And_It_Navigates_In_To_Search_Page()"
});
formatter.result({
  "duration": 3734874900,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Login Functionality",
  "description": "",
  "id": "adactin-hotel-application;login-functionality;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@smoketest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user Launch The Adactin Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"pradh21546\" username In The InputBox",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enter The \"1234561144\" Password In The InputBox",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User Clicks On The LoginPage And It Navigates In To Search Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Launch_The_Adactin_Application()"
});
formatter.result({
  "duration": 401995300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "pradh21546",
      "offset": 16
    }
  ],
  "location": "StepDefinition.user_Enter_The_username_In_The_InputBox(String)"
});
formatter.result({
  "duration": 325319200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1234561144",
      "offset": 16
    }
  ],
  "location": "StepDefinition.user_Enter_The_Password_In_The_InputBox(String)"
});
formatter.result({
  "duration": 250907300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Clicks_On_The_LoginPage_And_It_Navigates_In_To_Search_Page()"
});
formatter.result({
  "duration": 699272400,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Login Functionality",
  "description": "",
  "id": "adactin-hotel-application;login-functionality;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@smoketest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user Launch The Adactin Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"pradh21nbbb546\" username In The InputBox",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enter The \"1234ffnnf561144\" Password In The InputBox",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User Clicks On The LoginPage And It Navigates In To Search Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Launch_The_Adactin_Application()"
});
formatter.result({
  "duration": 463548400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "pradh21nbbb546",
      "offset": 16
    }
  ],
  "location": "StepDefinition.user_Enter_The_username_In_The_InputBox(String)"
});
formatter.result({
  "duration": 291159900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1234ffnnf561144",
      "offset": 16
    }
  ],
  "location": "StepDefinition.user_Enter_The_Password_In_The_InputBox(String)"
});
formatter.result({
  "duration": 320467000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Clicks_On_The_LoginPage_And_It_Navigates_In_To_Search_Page()"
});
formatter.result({
  "duration": 692733300,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Login Functionality",
  "description": "",
  "id": "adactin-hotel-application;login-functionality;;5",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@smoketest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user Launch The Adactin Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"pragg3g4dh21546\" username In The InputBox",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enter The \"123456rr1144\" Password In The InputBox",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User Clicks On The LoginPage And It Navigates In To Search Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Launch_The_Adactin_Application()"
});
formatter.result({
  "duration": 466585700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "pragg3g4dh21546",
      "offset": 16
    }
  ],
  "location": "StepDefinition.user_Enter_The_username_In_The_InputBox(String)"
});
formatter.result({
  "duration": 279810300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123456rr1144",
      "offset": 16
    }
  ],
  "location": "StepDefinition.user_Enter_The_Password_In_The_InputBox(String)"
});
formatter.result({
  "duration": 256086800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Clicks_On_The_LoginPage_And_It_Navigates_In_To_Search_Page()"
});
formatter.result({
  "duration": 567854100,
  "status": "passed"
});
});