package testframeworks.utilities.beans;

import com.opencsv.bean.CsvBindByName;

public class DataFileBean {

	@CsvBindByName(column = "First Name", required = true)
	private String firstName;

	@CsvBindByName(column = "Last Name", required = true)
	private String lastName;
	
	@CsvBindByName(column = "Occupation", required = false)
	private String occupation;
	
	@CsvBindByName(column = "Social", required = true)
	private String social;
	
	@CsvBindByName(column = "Payment Method", required = true)
	private String paymentMethod;

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getOccupation() {
		return occupation;
	}

	public String getSocial() {
		return social;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}
}
