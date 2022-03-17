package test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import com.opencsv.exceptions.CsvValidationException;

public class Test_total {
	ArrayList<String> columnName;
	ArrayList<String>[] values;
	
	public Test_total() {
		columnName = null;
		values = null;
	}
	
	public void read(String originFileName) {
		
  	  	int total_lines = 0;
        try (CSVReader reader = new CSVReader(new FileReader(originFileName))) { 
        	String[] line;
	
		    boolean first = true;

		    while ((line = reader.readNext()) != null) {
		    	if (first) {
		    		for (String name : line) {
		    			columnName.add(name);
		    		}
		    		first = false;
		    		continue;
		    	}
		    	
		    	for (String value : line) {
		    		values[total_lines].add(value);
		    	}
		    	
		        total_lines++; 
			}
	    } catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (CsvValidationException e) {
			e.printStackTrace();
		}
        
        double[] media = null;
        for (int i=0; i<values.length; i++) {
        	media[i] = 0.0;
        }
        
        for (int i=0; i<values.length; i++) {
        	for (int j=0; j<total_lines; j++) {
            	media[i] += Double.parseDouble(values[i].get(j));
            }
        	media[i] /= total_lines;
        	System.out.println(columnName.get(i) + media[i]);
        }
	}

}