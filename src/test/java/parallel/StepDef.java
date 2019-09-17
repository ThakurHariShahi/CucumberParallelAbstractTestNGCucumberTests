package parallel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

//TODO:-  USE cucumber.core DEPENDENCY
//import cucumber.api.DataTable;
import cucumber.api.PendingException;
import io.cucumber.datatable.DataTable;
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef {

	
	WebDriver d;
	WebElement we;
	
	String config = "src/test/resources/YamlFiles/Config.yml", title, data;
	String locators = "src/test/resources/YamlFiles/Locators.yml";
	String urls = "src/test/resources/YamlFiles/Urls.yaml";
	int i;
	
	@Given("^I set up the driver and open chrome$")
    public void i_set_up_the_driver_and_open_chrome() throws Throwable {
		data = Getter.getConfig("Chrome" , config);
		//System.setProperty(data.split(":")[0],data.split(":")[1]);
		System.setProperty("webdriver.chrome.driver","config/browser/chromedriver.exe");
		d = new ChromeDriver();
    }
	
/************************************************************************************************************/
	 @Given("^I launch the gmail$")
	    public void i_launch_the_gmail() throws Throwable {
		data = Getter.getUrls("Gmail", urls);
//		BaseUrl = "http://www.gmail.com";
		System.out.println("Currently opening :- "+data);
		d.get(data);
	}

	@When("^I  enter the (.+) and (.+)$")
    public void i_enter_the_and(String username, String password) throws Throwable {
//		we = d.findElement(By.cssSelector("div input.whsOnd[autocomplete=\"username\"][id=\"identifierId\"]"));
		we = Getter.getLocator(d,  "username" , locators);
		we.sendKeys(username);
		we = Getter.getLocator(d,  "nextButton" , locators);
//		we = d.findElement(By.cssSelector("span.CwaK9>span.RveJvd"));
		we.click();
		Thread.sleep(1000);
		we = Getter.getLocator(d,  "password" , locators);
//		we = d.findElement(By.cssSelector("div>input.whsOnd[type=\"password\"][autocomplete=\"current-password\"]"));
		we.sendKeys(password);
	}

	@When("^I click on the login button$")
    public void i_click_on_the_login_button() throws Throwable {
		we = Getter.getLocator(d,  "loginButton" , locators);
//		we = d.findElement(By.cssSelector("div.qhFLie span>span.RveJvd"));
		we.click();
	}
	
	@Then("^I validate gmail inbox page for (.+)$")
    public void i_validate_gmail_inbox_page_for(String username) throws Throwable {
        Thread.sleep(5000);
		title = d.getTitle();
        Assert.assertEquals(title.contains(username.concat("@gmail.com")),true,"My error Msg :- I am not in Gmail Inbox");
    }
	
	@When("^I check the number of mail in the inbox$")
    public void i_check_the_number_of_mail_in_the_inbox() throws Throwable {
//        we = d.findElement(By.xpath("(//span//a[@title=\"Inbox\"  and text()=\"Inbox\"]/following::div[@class=\"bsU\"])[1]"));
		try
		{
			we = Getter.getLocator(d,  "index" , locators);
	        i = Integer.parseInt(we.getText());
	        System.out.println("Total unread Messages are :- "+ i);
		}
		catch(org.openqa.selenium.NoSuchElementException abc)
		{
			System.out.println("There Are 0 unread Messages in your inbox");
		}
        
    }

    @Then("^I click on the first mail$")
    public void i_click_on_the_first_mail() throws Throwable {
//        we = d.findElement(By.cssSelector("tr.zA[id=\":2u\"]"));
    	we = Getter.getLocator(d,  "firstMail" , locators);
        we.click();
    }

   /***********************************************************************************************************************/
    
    
    @Given("^I launch the hris$")
    public void i_launch_the_hris() throws Throwable {
    	data = Getter.getUrls("Hris", urls);
    	d.get(data);
    	we = Getter.getLocator(d,  "loginPanel" , locators);
//    	BaseUrl = "https://hris.qainfotech.com/login.php";
//    	d.get(BaseUrl);
//    	we = d.findElement(By.cssSelector("a.active>span"));
    	we.click();
        
    }

    @When("^I  enter credentials to login$")
    public void i_enter_credentials_to_login(DataTable credentials) throws Throwable {
    	List<List<String>> data = credentials.asLists();
    	we = Getter.getLocator(d,  "HrisuserName" , locators);
//    	we = d.findElement(By.cssSelector("input#txtUserName"));
    	we.sendKeys(data.get(0).get(0));
    	we = Getter.getLocator(d,  "Hrispassword" , locators);
//    	we = d.findElement(By.cssSelector("input#txtPassword"));
    	we.sendKeys(data.get(0).get(1));
    	we = Getter.getLocator(d,  "signInButton" , locators);
//    	we = d.findElement(By.cssSelector("input.btn"));
    	we.click();
    	
    }
    
    

}
