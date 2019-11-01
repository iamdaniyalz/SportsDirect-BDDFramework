$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/TotalPriceVerification.feature");
formatter.feature({
  "name": "SportsDirect - Verify Total Price",
  "description": "  I want to verify the total price of the products added in the bag",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify the total price of products added in the bag",
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
  "error_message": "org.openqa.selenium.NoSuchElementException: Cannot locate an element using xpath\u003d//img[@title\u003d\u0027Karrimor - X Lite Run Headband Mens\u0027]\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027PC123\u0027, ip: \u0027192.168.101.94\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002712.0.1\u0027\nDriver info: driver.version: RemoteWebDriver\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:327)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy23.getWrappedElement(Unknown Source)\r\n\tat org.openqa.selenium.remote.internal.WebElementToJsonConverter.apply(WebElementToJsonConverter.java:50)\r\n\tat java.base/java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:195)\r\n\tat java.base/java.util.Spliterators$ArraySpliterator.forEachRemaining(Spliterators.java:948)\r\n\tat java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:484)\r\n\tat java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)\r\n\tat java.base/java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:913)\r\n\tat java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)\r\n\tat java.base/java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:578)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.executeScript(RemoteWebDriver.java:484)\r\n\tat pages.Product.addProductTwoToBag(Product.java:61)\r\n\tat step_definitions.PriceValidation.i_add_second_product_in_the_bag(PriceValidation.java:37)\r\n\tat ✽.I add second product in the bag(file:src/test/resources/features/TotalPriceVerification.feature:9)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "I go to the bag",
  "keyword": "Then "
});
formatter.match({
  "location": "PriceValidation.i_go_to_the_bag()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I add one more instance of first product",
  "keyword": "And "
});
formatter.match({
  "location": "PriceValidation.i_add_one_more_instance_of_first_product()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I ensure that the total price is calculated correctly",
  "keyword": "Then "
});
formatter.match({
  "location": "PriceValidation.i_ensure_that_the_total_price_is_calculated_correctly()"
});
formatter.result({
  "status": "skipped"
});
});