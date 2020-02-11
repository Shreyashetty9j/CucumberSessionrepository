$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("cucumber_demo/Demo2.Feature");
formatter.feature({
  "line": 1,
  "name": "Testing demo registration page",
  "description": "",
  "id": "testing-demo-registration-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "User enters mandatory details",
  "description": "",
  "id": "testing-demo-registration-page;user-enters-mandatory-details",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "the registration page is opened",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enters Shreya as Fisrt name",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enters Shetty as Last name",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user enters shreyashetty9j@gmail.com as Email",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user enters shreya123* as Password",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user enters shreya123* as Confirm Password",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user clicks on Register button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "registration should be successful",
  "keyword": "Then "
});
formatter.match({
  "location": "RegistrationStepDef.the_registration_page_is_opened()"
});
formatter.result({
  "duration": 16998789600,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStepDef.user_enters_Shreya_as_Fisrt_name()"
});
formatter.result({
  "duration": 189140700,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStepDef.user_enters_Shetty_as_Last_name()"
});
formatter.result({
  "duration": 114435400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "9",
      "offset": 24
    }
  ],
  "location": "RegistrationStepDef.user_enters_shreyashetty_j_gmail_com_as_Email(int)"
});
formatter.result({
  "duration": 247702200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123",
      "offset": 18
    }
  ],
  "location": "RegistrationStepDef.user_enters_shreya_as_Password(int)"
});
formatter.result({
  "duration": 142889900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123",
      "offset": 18
    }
  ],
  "location": "RegistrationStepDef.user_enters_shreya_as_Confirm_Password(int)"
});
formatter.result({
  "duration": 134120900,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStepDef.user_clicks_on_Register_button()"
});
formatter.result({
  "duration": 1181951400,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStepDef.registration_should_be_successful()"
});
formatter.result({
  "duration": 20300,
  "status": "passed"
});
});