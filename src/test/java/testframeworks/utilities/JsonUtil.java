package testframeworks.utilities;

import java.io.FileReader;
import java.util.Map;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


public class JsonUtil {
	
	JSONObject root = null;
	JSONParser parser = new JSONParser();
	
	
	public JsonUtil(String filename) {
		
		Object obj = null;
        try {
            obj = parser.parse(new FileReader(filename));
        } catch (Exception e) {
            e.printStackTrace();
        }
		
        root  = new JSONObject((Map<?, ?>) obj);
	}
	
	public String getUserName() {
		Object userObj =  root.get("username");
		return userObj.toString();
	}
	
	public String getPassword() {
		Object userObj = root.get("password");
		return userObj.toString();
	}
	
	public String getInvalidUserName() {
		Object userObj = root.get("invalidUsername");
		return userObj.toString();
	}
}
