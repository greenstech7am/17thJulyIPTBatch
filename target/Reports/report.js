$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/FeatureFiles/Forgotten.feature");
formatter.feature({
  "name": "Validate the forgotten password functionality",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Sanity"
    }
  ]
});
formatter.scenario({
  "name": "Validate the forgotten functionality by giving invalid mobile number",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User should click the forgotten password link",
  "keyword": "When "
});
formatter.match({
  "location": "ForgottenStepDefinition.userShouldClickTheForgottenPasswordLink()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should enter invalid mobile number",
  "keyword": "And "
});
formatter.match({
  "location": "ForgottenStepDefinition.userShouldEnterInvalidMobileNumber()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click the search button",
  "keyword": "And "
});
formatter.match({
  "location": "ForgottenStepDefinition.userShouldClickTheSearchButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should navigate to password reset page",
  "keyword": "Then "
});
formatter.match({
  "location": "ForgottenStepDefinition.userShouldNavigateToPasswordResetPage()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});