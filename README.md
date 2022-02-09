selenium-testng-framework
---

---
A sample framework based on Page Object Model, Selenium, TestNG using Java.

This framework is based in **Page Object Model (POM).**

The framework uses:

1. Java
2. Selenium
3. TestNG
4. ExtentReport
5. Log4j
6. SimpleJavaMail

The project is built in such a way that you just need to execute the testng.xml file and all the test cases would be executed .
A single browser instance has been used across the test cases .
The requirement has been considered strictly due to which each point mentioned in the challenge has been taken as a testcase .
Also a complimentary mail fucntionality has been added to facilitate emailaible reports . 

Reporting
---
The framework gives report in three ways,

1. Log - In file `logfile.log`.
2. A html report - Which is generated using extent reports, under the folder `ExtentReports`.
3. A mail report - For which the toggle `mail.sendmail` in `test.properties` should be set `true`. And all the properties such as `smtp host, port, proxy details, etc.,` should be provided correctly.

---

Key Points:
---

1. The class `WebDriverContext` is responsible for maintaining the same WebDriver instance throughout the test. So whenever you require a webdriver instance which has been using for current test (In current thread) always call `WebDriverContext.getDriver()`.
2. Always use `PageinstancesFactory.getInstance(type)` to get the instance of particular Page Object. (Of course you can use `new` but it's better use a single approach across the framework.

---

