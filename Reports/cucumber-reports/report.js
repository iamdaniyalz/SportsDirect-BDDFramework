$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/TotalPriceValidation.feature");
formatter.feature({
  "name": "SportsDirect - validate Total Price",
  "description": "  I want to validate the total price of the products added in the bag",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "validate the total price of products added in the bag",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I am on SportsDirect home page",
  "keyword": "Given "
});
formatter.match({
  "location": "PriceValidation.i_am_on_SportsDirect_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add first product in the bag",
  "keyword": "When "
});
formatter.match({
  "location": "PriceValidation.i_add_first_product_in_the_bag()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add second product in the bag",
  "keyword": "And "
});
formatter.match({
  "location": "PriceValidation.i_add_second_product_in_the_bag()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I go to the bag",
  "keyword": "Then "
});
formatter.match({
  "location": "PriceValidation.i_go_to_the_bag()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add one more instance of first product",
  "keyword": "And "
});
formatter.match({
  "location": "PriceValidation.i_add_one_more_instance_of_first_product()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I ensure that the total price is calculated correctly",
  "keyword": "Then "
});
formatter.match({
  "location": "PriceValidation.i_ensure_that_the_total_price_is_calculated_correctly()"
});
formatter.result({
  "status": "passed"
});
});