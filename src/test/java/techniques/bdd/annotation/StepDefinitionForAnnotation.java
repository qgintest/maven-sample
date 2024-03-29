package techniques.bdd.annotation;

import java.io.File;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.annotation.en.Given; 
import cucumber.annotation.en.Then; 
import cucumber.annotation.en.When; 

public class StepDefinitionForAnnotation { 
   WebDriver driver = null; 
   @Given("^I am on Facebook login page$") 
	
   public void goToFacebook() { 
	   
	   final String InitDriver = "webdriver.chrome.driver";
	   final String startDriver = "lib" + File.separator + "chromedriver_win32.exe";

	  System.setProperty(InitDriver, startDriver);
      driver = new ChromeDriver(); 
      driver.navigate().to("https://www.facebook.com/"); 
   }
	
   @When("^I enter username as \"(.*)\"$") 
   public void enterUsername(String arg1) {   
      driver.findElement(By.id("email")).sendKeys(arg1); 
   }
	
   @When ("^I enter password as \"(.*)\"$") 
   public void enterPassword(String arg1) {
      driver.findElement(By.id("pass")).sendKeys(arg1);
      driver.findElement(By.id("u_0_v")).click(); 
   } 
	
   @Then("^Login should fail$") 
   public void checkFail() {  
      if(driver.getCurrentUrl().equalsIgnoreCase(
         "https://www.facebook.com/login.php?login_attempt=1&lwv=110")){ 
            System.out.println("Test1 Pass"); 
      } else { 
         System.out.println("Test1 Failed"); 
      } 
      driver.close(); 
   }
	
   @Then("^Relogin option should be available$") 
   public void checkRelogin() { 
      if(driver.getCurrentUrl().equalsIgnoreCase(
         "https://www.facebook.com/login.php?login_attempt=1&lwv=110")){ 
            System.out.println("Test2 Pass"); 
      } else { 
         System.out.println("Test2 Failed"); 
      } 
      driver.close(); 
   }
} 
