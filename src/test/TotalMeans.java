package test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import com.opencsv.exceptions.CsvValidationException;

public class TotalMeans {
	ArrayList<String> columnName;
	ArrayList<Double> sum;
	int totLines = 0;

	
	public TotalMeans() {
		columnName = new ArrayList<String>();
		sum = new ArrayList<Double>();
	}
	
	public void calculateMeans(String originFileName) {
		
        try (CSVReader reader = new CSVReader(new FileReader(originFileName))) { 
        	String[] line;
	
		    boolean first = true;

		    while ((line = reader.readNext()) != null) {
		    	if (first) {
		    		for (String name : line) {
		    			columnName.add(name);
		    			sum.add(0.0);
		    		}
		    		first = false;
		    		continue;
		    	}
		    	
		    	int currentValuePosition = 0;
		    	for (String value : line) {
		    		if (currentValuePosition != 1 && currentValuePosition != 2 && currentValuePosition != 4 && currentValuePosition != 7 && currentValuePosition != 85 && currentValuePosition != 87) {
			    		try {
			    			sum.set(currentValuePosition, (sum.get(currentValuePosition)+Double.parseDouble(value)));
						} catch (Exception e) {
				    		currentValuePosition++;
							continue;
						}
		    		}
		    		currentValuePosition++;
		    	}
		    	
		        totLines++; 
			}
	    } catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (CsvValidationException e) {
			e.printStackTrace();
		}
     }
	
	public void writeHeaders(FileWriter file) {
		String header = String.join(",", columnName);
        try {
        	file.append("Attack Type,");
			file.append(header);
			file.append("\n");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void writeMeans(FileWriter file, String attackType) {
		try {
			file.append(attackType+",");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		for (Double means: sum) {
			try {
				file.append(Double.toString(means/totLines));
				file.append(",");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	    try {
			file.append("\n");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	}

}