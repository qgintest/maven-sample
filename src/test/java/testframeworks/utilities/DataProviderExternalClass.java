package testframeworks.utilities;

import org.testng.annotations.DataProvider;

public class DataProviderExternalClass {
	
	@DataProvider(name="FlightInfo")
    public static Object[][] getDataFromDataprovider(){
    return new Object[][] 
    	{
            { "Acapulco", "New York" },
            { "Frankfurt", "Seattle" },
            { "London", "Paris" }
        };

    }

}
