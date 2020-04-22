package testframeworks.keywordriven.config;

import java.io.File;

public class Constants {

	// System Variables
	public static final String URL = "http://www.store.demoqa.com";
	public static final String Path_TestData = System.getProperty("user.dir") + File.separator + "src"  + File.separator  + "test" + File.separator + "java"  
			+ File.separator + "testframeworks" + File.separator + "keywordriven" + File.separator + "dataengine" + File.separator + "DataEngine.xlsx";

	
	public static final String Path_OR = System.getProperty("user.dir") + File.separator + "src"  + File.separator  + "test" + File.separator + "java"  
			+ File.separator + "testframeworks" + File.separator + "keywordriven" + File.separator + "config" + File.separator + "OR";
	
	public static final String File_TestData = "DataEngine.xlsx";
	public static final String KEYWORD_FAIL = "FAIL";
	public static final String KEYWORD_PASS = "PASS";

	// Data Sheet Column Numbers
	public static final int Col_TestCaseID = 0;
	public static final int Col_TestScenarioID = 1;
	public static final int Col_PageObject = 4;
	public static final int Col_ActionKeyword = 5;
	public static final int Col_RunMode = 2;
	public static final int Col_Result = 3;
	public static final int Col_DataSet = 6;
	public static final int Col_TestStepResult = 7;

	// Data Engine Excel sheets
	public static final String Sheet_TestSteps = "Test Steps";
	public static final String Sheet_TestCases = "Test Cases";

}