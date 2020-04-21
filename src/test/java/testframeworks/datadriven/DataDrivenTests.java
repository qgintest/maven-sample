package testframeworks.datadriven;

import java.io.File;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import testframeworks.utilities.DataFileUtil;
import testframeworks.utilities.DataProviderExternalClass;
import testframeworks.utilities.JsonUtil;
import testframeworks.utilities.XmlUtil;

public class DataDrivenTests {
 
	JsonUtil jsonUtil = null;
	final String credentialsFile = System.getProperty("user.dir") + File.separator + "src"  + File.separator  + "test" + File.separator + "java"  + File.separator + "credentials.json";
	final String profilesTxtFile = System.getProperty("user.dir") + File.separator + "src"  + File.separator  + "test" + File.separator + "java"  + File.separator + "profiles.txt";
	final String profilesCsvFile = System.getProperty("user.dir") + File.separator + "src"  + File.separator  + "test" + File.separator + "java"  + File.separator + "profiles.csv";
	final String xmlFile = System.getProperty("user.dir") + File.separator + "src"  + File.separator  + "test" + File.separator + "java"  + File.separator + "users.xml";

	
	@BeforeTest
	public void setup() {
		jsonUtil = new JsonUtil(credentialsFile);
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
	
	
	/**
	 * Reading data from the TestNG DataProvider annotation.
	 * Useful when you want to run a test using multiple sets of data
	 * @param username
	 * @param password
	 */
	@Test(enabled = false, dataProvider="Credentials")
	public void dataDrivenTestUsingDataProvider(String username, String password) {
		System.out.println("Username: " + username);
		System.out.println("Password: " + password);
	}

	/**
	 * Reading data from the TestNG DataProvider annotation.
	 * Useful when you want to run a test using multiple sets of data
	 * @param username
	 * @param password
	 */
	@Test(enabled = false, dataProvider="Credentials")
	public void dataDrivenTestUsingDataProviderTest(String username, String password) {
		System.out.println("Username: " + username);
		System.out.println("Password: " + password);
	}
	
	
	/**
	 * Reading data from the TestNG DataProvider annotation from an external class
	 * Useful when you want to run a test using multiple sets of data
	 * @param username
	 * @param password
	 */
	@Test(enabled = false, dataProvider="FlightInfo",dataProviderClass=DataProviderExternalClass.class)
	public void dataDrivenTestUsingDataProviderFromExternalClassTest(String departingFrom, String arrivingIn) {
		System.out.println("Departing From: " + departingFrom);
		System.out.println("Arriving To: " + arrivingIn);
	}
	
	/*
	 * For more examples on how to use DataProvider, refer to this reference page, https://www.guru99.com/parameterization-using-xml-and-dataproviders-selenium.html
	 */
	
	

	
	/**
	 * Reading data from a JSON file
	 * Purpose: Useful for static data that does not change often such as credentials, connection info, URL, etc.
	 * 
	 */
	@Test(enabled = false)
	public void dataDrivenTestFromJsonTest() {
		System.out.println("Username: " + jsonUtil.getUserName());
		System.out.println("Password: " + jsonUtil.getPassword());
	}
	
	@Test(enabled = false)
	public void dataDrivenTestFromTextFile() {
		
		DataFileUtil dataFileUtilTxt = new DataFileUtil('|', profilesTxtFile, 1);
		//DataFileUtil dataFileUtilCsv = new DataFileUtil('|', profilesTxtFile, 1);
		
		System.out.println("Last Name: " + dataFileUtilTxt.getLastName());
		System.out.println("Occupation: " + dataFileUtilTxt.getOccupation());
		
	}
	
	@Test(enabled = true)
	public void dataDrivenTestFromXmlFile() {
		XmlUtil xmlUtil = new XmlUtil(xmlFile);
		
		System.out.println("username is: " + xmlUtil.getInfoFromXml("user", 0, "username"));
		System.out.println("password is: " + xmlUtil.getInfoFromXml("user", 0, "password"));
		System.out.println("username is: " + xmlUtil.getInfoFromXml("user", 1, "username"));
		System.out.println("password is: " + xmlUtil.getInfoFromXml("user", 1, "password"));
	}
	

	
}
