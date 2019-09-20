$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/com/qa/features/login.feature");
formatter.feature({
  "name": "Title of your feature",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature"
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
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I want to write a step with precondition",
  "keyword": "Given "
});
formatter.match({
  "location": "sdef_common.i_want_to_write_a_step_with_precondition()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I complete action",
  "keyword": "When "
});
formatter.match({
  "location": "sdef_common.i_complete_action()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "yet another action",
  "keyword": "And "
});
formatter.match({
  "location": "sdef_common.yet_another_action()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I validate the outcomes",
  "keyword": "Then "
});
formatter.match({
  "location": "sdef_common.i_validate_the_outcomes()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});