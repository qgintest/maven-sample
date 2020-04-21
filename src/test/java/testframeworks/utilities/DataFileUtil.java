package testframeworks.utilities;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import testframeworks.utilities.beans.DataFileBean;

public class DataFileUtil {

	CsvToBean<DataFileBean> dataFileToBean = null;
	DataFileBean DFUser = null;

	public DataFileUtil(char separator, String dataFile, int row) {

		try (Reader reader = Files.newBufferedReader(Paths.get(dataFile));) {
			dataFileToBean = new CsvToBeanBuilder<DataFileBean>(reader).withType(DataFileBean.class)
					.withIgnoreLeadingWhiteSpace(true).withSeparator(separator).build();

			Iterator<DataFileBean> dataFileUserIterator = dataFileToBean.iterator();

			int next = 0;

			while (next <= row) {
				DFUser = dataFileUserIterator.next();
				next++;
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String getFirstName() {
		return DFUser.getFirstName();
	}
	
	public String getLastName() {
		return DFUser.getLastName();
	}
	
	public String getOccupation() {
		return DFUser.getOccupation();
	}
	
	public String getSocial() {
		return DFUser.getSocial();
	}
	
	public String getPaymentMethod() {
		return DFUser.getPaymentMethod();
	}

}
