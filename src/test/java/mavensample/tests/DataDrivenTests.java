package mavensample.tests;

import java.io.File;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import testframeworks.utilities.JsonUtil;

public class DataDrivenTests {
 
	JsonUtil jsonUtil = null;
	final String credentialsFile = System.getProperty("user.dir") + File.separator + "src"  + File.separator  + "test" + File.separator + "java"  + File.separator + "credentials.json";
	
	@BeforeTest
	public void setup() {
		jsonUtil = new JsonUtil(credentialsFile);
	}
	
	/**
	 * Reading data from a JSON file
	 * Purpose: Useful for static data that does not change often such as credentials, connection info, URL, etc.
	 * 
	 */
	@Test(enabled = false)
	public void dataDrivenTestFromJson() {
		System.out.println("Username: " + jsonUtil.getUserName());
		System.out.println("Password: " + jsonUtil.getPassword());
	}
	
	/**
	 * Reading data from the TestNG DataProvider annotation.
	 * Useful when you want to run a test using multiple sets of data
	 * @param username
	 * @param password
	 */
	@Test(enabled = true, dataProvider="Credentials")
	public void dataDrivenTestUsingDataProvider(String username, String password) {
		System.out.println("Username: " + username);
		System.out.println("Password: " + password);
	}
	
	@DataProvider(name="Credentials")
    public Object[][] getDataFromDataprovider(){
    return new Object[][] 
    	{
            { "aeendale", "Postal12Postal12" },
            { "aeendale1", "Postal12Postal13" },
            { "aeendale2", "Postal12Postal14" }
        };

    }
	
}
