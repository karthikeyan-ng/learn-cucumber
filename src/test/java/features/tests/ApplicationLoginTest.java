package features.tests;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class ApplicationLoginTest {

    @Given("^User is on NetBanking landing page$")
    public void given_UserIsOnNetBankingLandingPage() {
        // Write a logic
        //1.To Open a Browser
        //2.Open a URL
        //3.Navigate to NetBanking landing page

        // The logic can be written in Selenium (Web) or Appium (Mobile Automation)

        System.out.println("The Given Scenario: User is on NetBanking landing page has been executed.");
    }

    @When("^User login into application with username and password$")
    public void when_UserLoginWithTheirInformation() {
        // Write a logic
        // 1. To populate Username and password
        // 2. Submit the login form

        System.out.println("The When Condition: User login into application with username and password");
    }


}
