package starter.story;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginSuccess {
    @Given("I am on the Sign in page")
    public void i_am_on_the_Login_page() {
        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
    }

    @When("I enter my username and Password correctly")
    public void i_enter_my_username_and_Password_correctly() {
        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
    }

    @When("I click {string} buttom")
    public void i_click_buttom(String string) {
        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
    }
    @Then("I am taken to the dashboard")
    public void i_am_taken_to_the_dashboard() {
        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
    }
}