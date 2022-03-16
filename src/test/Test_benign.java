package test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import com.opencsv.exceptions.CsvValidationException;

public class Test_benign {
	
	public Test_benign() {
	}
	
	public double read(String originFileName, String columnName) {
		
		double sumDevStd = 0;
  	  	int columnDevStd = 0, total_lines = 0;
        try (CSVReader reader = new CSVReader(new FileReader(originFileName))) { 
        	String[] line;
	
		    boolean first = true;

		    while ((line = reader.readNext()) != null) {
		    	if (first) {
		    		for (int i=0; i<line.length; i++) {
		    			if (line[columnDevStd].equals(columnName)) break;
		      			columnDevStd++;
		      	    }
		        	first = false;
					continue;
		        }

		    	total_lines++;
		        sumDevStd+=Double.parseDouble(line[columnDevStd]);
			} 
	    } catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (CsvValidationException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		
		double mediaDevStd = sumDevStd/total_lines;
		
		return mediaDevStd;
	}

}