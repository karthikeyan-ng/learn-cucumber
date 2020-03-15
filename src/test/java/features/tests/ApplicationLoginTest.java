package features.tests;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
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

    @When("^User login into application with username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void when_UserLoginWithGivenUsernameAndPassword(String username, String password) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Username = " + username + " Password = " + password);
    };

    @Then("^Home page is populated$")
    public void verify_HomePageLoaded() {
        // Write a logic to verify Home Page Loaded or not

        System.out.println("The Then Condition: Verify User has successfully logged in.");
    }

    @And("^Cards are displayed \"([^\"]*)\"$")
    public void verify_CardInformation(String cardsEnabled) {
        if(Boolean.valueOf(cardsEnabled)) {
            System.out.println("For the Given user Card Information has been enabled");
        } else {
            System.out.println("For the Given user Card Information has not been enabled.");
        }
    }
}
