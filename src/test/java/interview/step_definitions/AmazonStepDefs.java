package interview.step_definitions;

import interview.pages.AmazonElectronicsPage;
import interview.pages.AmazonHomePage;
import interview.utilities.ConfigurationReader;
import interview.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonStepDefs {
WebDriver driver;
AmazonElectronicsPage amazonElectronicsPage = new AmazonElectronicsPage();

    @Given("User is on Amazon homepage")
    public void user_navigates_to() {
        Driver.getDriver().get(ConfigurationReader.getProperty("amazon.url"));

    }

    @When("User selects electronics from All dropdown")
    public void user_selects_from_dropdown() {
        AmazonHomePage amazonHomePage = new AmazonHomePage();
        amazonHomePage.searchElectronics();

    }
    @Then("Verify current title is equal {string}")
    public void verify_current_title_is_equal(String expectedTitle) throws InterruptedException {
       // Thread.sleep(5000);
        System.out.println(expectedTitle);
        Assert.assertEquals(expectedTitle, "Amazon.com: Electronics");
    }

    @Then("User finds and click on button {string}")
    public void user_finds_and_click_on_button(String bestSellers) {
       // amazonElectronicsPage.bestSellers.click();
        amazonElectronicsPage.setBestSellers(bestSellers);

    }

    @Then("User finds the first best seller\\(Fire TV stick) and click on it")
    public void user_finds_the_first_best_seller_fire_tv_stick_and_click_on_it() {
        amazonElectronicsPage.item.click();


    }
    @Then("Verify title is equal {string}")
    public void verify_title_is_equal(String expectedResult) {
       // Driver.getDriver().getTitle();
        Assert.assertEquals( expectedResult, Driver.getDriver().getTitle());
        System.out.println(Driver.getDriver().getTitle());

    }

}
