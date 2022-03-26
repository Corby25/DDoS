package test;

import java.io.FileWriter;
import java.io.IOException;

public class Test {

	private static double[] sums;

	public static void main(String[] args) {
		
		FileWriter file = null;
		try {
			file = new FileWriter("C:\\Users\\tomma\\Desktop\\Means.csv");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		TotalMeans Means = new TotalMeans();
		Means.calculateMeans("C:\\Users\\tomma\\Downloads\\CSV-01-12\\01-12\\DrDoS_DNS.csv");
		Means.writeHeaders(file);
		Means.writeMeans(file,"DNS");
		
		Means.calculateMeans("C:\\Users\\tomma\\Downloads\\CSV-01-12\\01-12\\DrDoS_LDAP.csv");
		Means.writeMeans(file,"LDAP");
		
		Means.calculateMeans("C:\\Users\\tomma\\Downloads\\CSV-01-12\\01-12\\DrDoS_MSSQL.csv");
		Means.writeMeans(file,"MSSQL");
		
		Means.calculateMeans("C:\\Users\\tomma\\Downloads\\CSV-01-12\\01-12\\DrDoS_NetBIOS.csv");
		Means.writeMeans(file,"NetBIOS");
		
		Means.calculateMeans("C:\\Users\\tomma\\Downloads\\CSV-01-12\\01-12\\DrDoS_NTP.csv");
		Means.writeMeans(file,"NTP");
		
		Means.calculateMeans("C:\\Users\\tomma\\Downloads\\CSV-01-12\\01-12\\DrDoS_SNMP.csv");
		Means.writeMeans(file,"SNMP");
		
		Means.calculateMeans("C:\\Users\\tomma\\Downloads\\CSV-01-12\\01-12\\DrDoS_SSDP.csv");
		Means.writeMeans(file,"SSDP");
		
		Means.calculateMeans("C:\\Users\\tomma\\Downloads\\CSV-01-12\\01-12\\DrDoS_UDP.csv");
		Means.writeMeans(file,"UDP");
		
		Means.calculateMeans("C:\\Users\\tomma\\Downloads\\CSV-01-12\\01-12\\Syn.csv");
		Means.writeMeans(file,"Syn");
		
		Means.calculateMeans("C:\\Users\\tomma\\Downloads\\CSV-01-12\\01-12\\TFTP.csv");
		Means.writeMeans(file,"TFTP");

		Means.calculateMeans("C:\\Users\\tomma\\Downloads\\CSV-01-12\\01-12\\UDPLag.csv");
		Means.writeMeans(file,"UDPLag");
		
		Means.calculateMeans("C:\\Users\\tomma\\Downloads\\CSV-01-12\\01-12\\Monday-WorkingHours.pcap_ISCX.csv");
		Means.writeMeans(file,"Benign");
	      
	    try {
			file.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
