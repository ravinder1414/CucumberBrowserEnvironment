$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/NewLeadCreation.feature");
formatter.feature({
  "id": "new-lead-creation-feature-file",
  "description": "",
  "name": "New Lead Creation feature file",
  "keyword": "Feature",
  "line": 2
});
formatter.before({
  "duration": 7355728310,
  "status": "passed"
});
formatter.before({
  "duration": 5701567920,
  "status": "passed"
});
formatter.before({
  "duration": 5618939700,
  "status": "passed"
});
formatter.scenario({
  "id": "new-lead-creation-feature-file;creating-new-lead-using-valid-details",
  "tags": [
    {
      "name": "@Smoke",
      "line": 3
    }
  ],
  "description": "",
  "name": "Creating New Lead using valid details",
  "keyword": "Scenario",
  "line": 4,
  "type": "scenario"
});
formatter.step({
  "name": "I am on Orion CLS Home page",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "I click on Admission Link",
  "keyword": "When ",
  "line": 6
});
formatter.step({
  "name": "I click on Admission Manager and Add New Lead/Referral Link",
  "keyword": "And ",
  "line": 7
});
formatter.step({
  "name": "I fill all the required details for New Referral",
  "keyword": "When ",
  "line": 8
});
formatter.step({
  "name": "I should be able to see the created new Lead",
  "keyword": "Then ",
  "line": 9
});
formatter.match({
  "location": "NewLeadCreationStepDefination.i_am_on_Orion_CLS_Home_page()"
});
formatter.result({
  "duration": 18143136797,
  "status": "passed"
});
formatter.match({
  "location": "NewLeadCreationStepDefination.i_click_on_Admission_Link()"
});
formatter.result({
  "duration": 2193897726,
  "status": "passed"
});
formatter.match({
  "location": "NewLeadCreationStepDefination.i_click_on_Admission_Manager_and_Add_New_Lead_Referral_Link()"
});
formatter.result({
  "duration": 18472180348,
  "status": "passed"
});
formatter.match({
  "location": "NewLeadCreationStepDefination.i_fill_all_the_required_details_for_New_Referral()"
});
formatter.result({
  "duration": 8086343525,
  "status": "passed"
});
formatter.match({
  "location": "NewLeadCreationStepDefination.i_should_be_able_to_see_the_created_new_Lead()"
});
formatter.result({
  "duration": 118695134821,
  "status": "passed"
});
formatter.after({
  "duration": 223925038,
  "status": "passed"
});
formatter.after({
  "duration": 259341731,
  "status": "passed"
});
formatter.after({
  "duration": 196757620,
  "status": "passed"
});
});