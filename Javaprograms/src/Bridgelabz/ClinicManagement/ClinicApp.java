package Bridgelabz.ClinicManagement;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

public interface ClinicApp {
	void addDetails() throws FileNotFoundException;
	void searchDetails() throws FileNotFoundException;
	void displyDetails() throws FileNotFoundException;
	void appointment() throws ParseException, JsonGenerationException, JsonMappingException, IOException;
	void getFamousDocter() throws FileNotFoundException;
}
