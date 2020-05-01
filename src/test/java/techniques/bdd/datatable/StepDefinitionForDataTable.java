package techniques.bdd.datatable;

import java.io.File;

import cucumber.annotation.After;
import cucumber.annotation.Before;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;

import java.util.List;

import cucumber.table.DataTable;

public class StepDefinitionForDataTable {

	@Before
	public void setUp() {
		System.out.println("Executed before test run");
	}

	@When("^I enter invalid data on the page$")
	public void enterData(DataTable table) {
		// Initialize data table
		List<List<String>> data = table.raw();
		System.out.println(data.get(1).get(1));
		System.out.println(data.get(2).get(1));
		System.out.println(data.get(3).get(1));
		System.out.println(data.get(4).get(1));
		System.out.println(data.get(4).get(1));

	}

	@Then("^the user registration should be unsuccessful$")
	public void User_registration_should_be_unsuccessful() {
		System.out.println("Not the right info");
	}

	@After
	public void cleanUp() {
		System.out.println("Executed after Test");
	}
}