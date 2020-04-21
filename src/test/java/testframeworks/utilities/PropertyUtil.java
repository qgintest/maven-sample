package testframeworks.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyUtil {
	
	static Properties prop = null;
	
	public static void loadPropertyFile(String file){
		
		 try (InputStream input = new FileInputStream(file)) {

	            prop = new Properties();

	            // load a properties file
	            prop.load(input);

	        } catch (IOException ex) {
	            ex.printStackTrace();
	        }
	}
	
	public static String getValueFromPropertyFile(String value) {
		return prop.getProperty(value);
	}

}
