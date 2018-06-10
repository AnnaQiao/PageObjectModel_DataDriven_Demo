# PageObjectModel_DataDriven_Demo
This Demo demostrates how to set up page object model(POM) in selenium, it show how to use test data from excel file as well.
## Introduction 
Page object model Framework has become very popular test automation framework in the dustry and many companies are using it, because of 
it is easy to maintain and reduce the duplication of coding.
The main advantage of POM is that if the UI change for any page, it do not require us to change any tests. we just need to change only the
code within page objects (only at one place)
## Page object model of this demo

![](https://github.com/AnnaQiao/PageObjectModel_DataDriven_Demo/blob/master/SeleniumeTestNGPOMTrademe/src/example/trademeSellAndBuy/pictures/pom.JPG)
 
 POM is writting all the functionalities/reusable componment of a page that we want to automate in a separate class. 
 In this test case demo(user login trademe), I creat three classes, they are BasePage.java, HomePage.java and LoginPage.java.
 Here in Basepage which will have some basic option, like navigating the webside and create webdriver object. the other class can extend this 
 BasePage class.
 ## Example: let me show a simple login example
 - HomePage of POM
![](https://github.com/AnnaQiao/PageObjectModel_DataDriven_Demo/blob/master/SeleniumeTestNGPOMTrademe/src/example/trademeSellAndBuy/pictures/HomePage.JPG) 
 - LoginPage of POM
![](https://github.com/AnnaQiao/PageObjectModel_DataDriven_Demo/blob/master/SeleniumeTestNGPOMTrademe/src/example/trademeSellAndBuy/pictures/LoginPage1.JPG) 
![](https://github.com/AnnaQiao/PageObjectModel_DataDriven_Demo/blob/master/SeleniumeTestNGPOMTrademe/src/example/trademeSellAndBuy/pictures/LoginPage2.JPG) 
 - login action of test cases
![](https://github.com/AnnaQiao/PageObjectModel_DataDriven_Demo/blob/master/SeleniumeTestNGPOMTrademe/src/example/trademeSellAndBuy/pictures/LoginPage1.JPG) 
![](https://github.com/AnnaQiao/PageObjectModel_DataDriven_Demo/blob/master/SeleniumeTestNGPOMTrademe/src/example/trademeSellAndBuy/pictures/LoginPage2) 

- In above test, we separate the test code and test locators, in this case, in future if the UI changes, we only will modify the methods which we defined in mutiple pages.

