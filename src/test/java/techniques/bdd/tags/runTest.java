package techniques.bdd.tags;

import org.junit.runner.RunWith; 
import cucumber.junit.Cucumber; 

@RunWith(Cucumber.class) 
@Cucumber.Options(format = {"pretty", "html:target/cucumber"}, tags = {"@SmokeTest"}) 
//@Cucumber.Options(format = {"pretty", "html:target/cucumber"}, tags = {"@SmokeTest", "@RegressionTest"}) 
//@Cucumber.Options(format = {"pretty", "html:target/cucumber"}, tags = {"@RunMe"}) 


public class runTest {}
