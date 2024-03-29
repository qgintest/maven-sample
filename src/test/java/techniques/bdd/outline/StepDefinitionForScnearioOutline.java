package techniques.bdd.outline;

import java.io.File;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.annotation.en.Given; 
import cucumber.annotation.en.Then; 
import cucumber.annotation.en.When; 

public class StepDefinitionForScnearioOutline {
	
	
	
	 WebDriver driver = null; 
		
	   @Given("^user navigates to Facebook$") 
	   public void goToFacebook() { 
		   final String InitDriver = "webdriver.chrome.driver";
		   final String startDriver = "lib" + File.separator + "chromedriver_win32.exe";

		  System.setProperty(InitDriver, startDriver);
	      driver = new ChromeDriver();  
	      driver.navigate().to("https://www.facebook.com/"); 
	   } 
		
	   @When("^I enter Username as \"([^\"]*)\" and Password as \"([^\"]*)\"$") 
	   public void I_enter_Username_as_and_Password_as(String arg1, String arg2) {
	      driver.findElement(By.id("email")).sendKeys(arg1);
	      driver.findElement(By.id("pass")).sendKeys(arg2);
	      driver.findElement(By.id("u_0_v")).click(); 
	   } 
		
	   @Then("^login should be unsuccessful$") 
	   public void validateRelogin() { 
	      if(driver.getCurrentUrl().equalsIgnoreCase(
	      "https://www.facebook.com/login.php?login_attempt=1&lwv=110")){
	         System.out.println("Test Pass"); 
	      } else { 
	         System.out.println("Test Failed"); 
	      } 
	      driver.close(); 
	   }    

}
