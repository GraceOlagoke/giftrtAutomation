package stepdefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RegistrationSteps {
    WebDriver driver=new FirefoxDriver();

    @When("^I click on Register$")
    public void iClickOnRegister() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\grace\\IdeaProjects\\GiftrtAutomation\\src\\test\\resources\\geckodriver.exe");
        driver.get("https://www.dev.giftrt.com");
        driver.findElement(By.xpath("/html/body/div[2]/nav[1]/div/div/div[2]/ul/li[3]/a")).click();

    }

    @And("^I enter my first name$")
    public void iEnterMyFirstName() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.name("first_name")).sendKeys("Kevin");
    }

    @And("^I enter my last name$")
    public void iEnterMyLastName() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.name("last_name")).sendKeys("Rita");

    }

    @And("^I enter my email$")
    public void iEnterMyEmail() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.id("email")).sendKeys("kevinrita@hotmail.com");

    }

    @And("^I enter my password$")
    public void iEnterMyPassword() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.id("password")).sendKeys("tester123");

    }

    @And("^I confirmed my password$")
    public void iConfirmedMyPassword() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.name("confirm_password")).sendKeys("tester123");
    }

    @And("^I click on Sign up$")
    public void iClickOnSignUp() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       driver.findElement(By.xpath("//*[@id=\"signup-form\"]/div[9]/button")).click();

    }

    @Then("^I am registered$")
    public void iAmRegistered() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I enter my registration first name as \"([^\"]*)\"$")
    public void iEnterMyRegistrationFirstNameAs(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I enter my registration last name as \"([^\"]*)\"$")
    public void iEnterMyRegistrationLastNameAs(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I enter my registration email as \"([^\"]*)\"$")
    public void iEnterMyRegistrationEmailAs(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I enter registration password as \"([^\"]*)\"$")
    public void iEnterRegistrationPasswordAs(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I enter my registration confirm password as  \"([^\"]*)\"$")
    public void iEnterMyRegistrationConfirmPasswordAs(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I am not registered$")
    public void iAmNotRegistered() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I enter my Phone number$")
    public void iEnterMyPhoneNumber() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.name("mobile")).sendKeys("07530294889");

    }
}
