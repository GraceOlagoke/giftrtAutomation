package stepdefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class WishlistSteps {
    WebDriver driver=new FirefoxDriver();

    @Given("^I Login$")
    public void iLogin() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\grace\\IdeaProjects\\GiftrtAutomation\\src\\test\\resources\\geckodriver.exe");
       // driver=new FirefoxDriver();
        driver.get("https://www.dev.giftrt.com");
        driver.findElement(By.xpath("/html/body/div[2]/nav[1]/div/div/div[2]/ul/li[4]/a")).click();
        driver.findElement(By.name("email")).sendKeys("buzzymine4real@yahoo.co.uk");
        driver.findElement(By.id("password")).sendKeys("ola123");
        driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[4]/button")).click();

    }

    @When("^I click on create wish list$")
    public void iClickOnCreateWishList() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath("//*[@id=\"category-grid\"]/div/div[2]/section/div[1]/div[2]/nav/div/ul/li[1]/a")).click();

    }

    @And("^I select wish list for myself$")
    public void iSelectWishListForMyself() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath("//*[@id=\"edit-wish-form\"]/div[1]/div/div/div[1]/label[1]/input")).click();

    }



    @And("^I enter the occasion$")
    public void iEnterTheOccasion() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.name("event")).sendKeys("Birthday party");

    }

    @And("^I  enter the event date$")
    public void iEnterTheEventDate() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //driver.findElement(By.id("date")).click();
        //driver.findElement(By.id("date")).sendKeys("Aug 26,2018");
        // driver.findElement(By.xpath("/html/body/div[7]/div[1]/table/thead/tr[2]/th[1]")).click();
        // WebElement dateBox = driver.findElement(By.name("date"));
        // dateBox.click();
          //dateBox.sendKeys("Aug 26, 2018");
        driver.findElement(By.xpath("//*[@id=\"date\"]")).click();
        driver.findElement(By.xpath("/html/body/div[7]/div[1]/table/tbody/tr[5]/td[6]")).click();
    }

    @And("^I select the product type$")
    public void iSelectTheProductType() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.name("amazon_category")).click();
       Select WishType = new Select(driver.findElement(By.name("amazon_category")));
       WishType.selectByVisibleText("Books");

    }

    @And("^I enter the description$")
    public void iEnterTheDescription() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        driver.findElement(By.xpath("//*[@id=\"mceu_37\"]")).sendKeys("This is my wishlist");
    }

    @And("^I select private policy make it public$")
    public void iSelectPrivatePolicyMakeItPublic() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        //Assert.assertTrue(driver.findElement(By.xpath("/html/body/div[2]/section/div/div[2]/section/form/div[2]/div/div[6]/div/div/label[2]"))).isDisplayed();
driver.findElement(By.xpath("//*[@id=\"edit-wish-form\"]/div[2]/div/div[6]/div/div/label[2]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }

    @And("^I click on submit$")
    public void iClickOnSubmit() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath("//*[@id=\"edit-wish-form\"]/div[3]/div/button")).click();

    }

    @Then("^my wish list is created$")
    public void myWishListIsCreated() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I close the webpage$")
    public void iCloseTheWebpage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I click on create wishlist$")
    public void iClickOnCreateWishlist() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I select wish list for for a friend$")
    public void iSelectWishListForForAFriend() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I select private policy make it private$")
    public void iSelectPrivatePolicyMakeItPrivate() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I  enter the event date as \"([^\"]*)\"$")
    public void iEnterTheEventDateAs(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^my wish list is not created$")
    public void myWishListIsNotCreated() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I click on wishlist$")
    public void iClickOnWishlist() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath("/html/body/div[2]/nav[1]/div/div/div[1]/ul/li[4]/a")).click();
    }

    @And("^I enter name of the occasion$")
    public void iEnterNameOfTheOccasion() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.name("name")).sendKeys("Birthday");

    }
}
