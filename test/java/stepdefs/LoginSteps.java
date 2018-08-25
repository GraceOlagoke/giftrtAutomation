package stepdefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginSteps {
    WebDriver driver= new FirefoxDriver();

    @Given("^I navigate to the website$")
    public void iNavigateToTheWebsite() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\grace\\IdeaProjects\\GiftrtAutomation\\src\\test\\resources\\geckodriver.exe");
        driver.get("https://www.dev.giftrt.com");

    }

    @When("^I click on login$")
    public void iClickOnLogin() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath("/html/body/div[2]/nav[1]/div/div/div[2]/ul/li[4]/a")).click();
    }

    @When("^I enter lgin email as \"([^\"]*)\"$")
    public void iEnterLginEmailAs(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.name("email")).sendKeys(arg0);

    }

    @And("^I enter login password as \"([^\"]*)\"$")
    public void iEnterLoginPasswordAs(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.id("password")).sendKeys(arg0);

    }

    @And("^I click on Secure Sign in$")
    public void iClickOnSecureSignIn() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[4]/button")).click();
    }

    @Then("^I am signed in$")
    public void iAmSignedIn() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/div[2]/nav[1]/div/div/div[2]/ul/li[4]/a")).isDisplayed());

    }

    @And("^I close the website$")
    public void iCloseTheWebsite() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       driver.close();

    }

    @When("^I enter my email as \"([^\"]*)\"$")
    public void iEnterMyEmailAs(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       driver.findElement(By.name("email")).sendKeys(arg0);

    }

    @And("^I enter my password as \"([^\"]*)\"$")
    public void iEnterMyPasswordAs(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.id("password")).sendKeys(arg0);

    }

    @Then("^I am not logged in$")
    public void iAmNotLoggedIn() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[1]")).isDisplayed());

    }
}
