package test;

public class Test {

	public static void main(String[] args) {
		
		Test_benign Benign = new Test_benign();
		/*double benign_devStd = Benign.read("C:\\Users\\tomma\\Downloads\\GeneratedLabelledFlows\\TrafficLabelling\\Monday-WorkingHours.pcap_ISCX.csv", " Packet Length Std");
		double LDAP_devStd = Benign.read("C:\\Users\\tomma\\Downloads\\CSV-03-11\\03-11\\LDAP.csv", " Packet Length Std");
		double MSSQL_devStd = Benign.read("C:\\Users\\tomma\\Downloads\\CSV-03-11\\03-11\\MSSQL.csv", " Packet Length Std");
		double NetBIOS_devStd = Benign.read("C:\\Users\\tomma\\Downloads\\CSV-03-11\\03-11\\NetBIOS.csv", " Packet Length Std");
		double Portmap_devStd = Benign.read("C:\\Users\\tomma\\Downloads\\CSV-03-11\\03-11\\Portmap.csv", " Packet Length Std");
		double Syn_devStd = Benign.read("C:\\Users\\tomma\\Downloads\\CSV-03-11\\03-11\\Syn.csv", " Packet Length Std");
		double UDP_devStd = Benign.read("C:\\Users\\tomma\\Downloads\\CSV-03-11\\03-11\\UDP.csv", " Packet Length Std");
		double UDPLag_devStd = Benign.read("C:\\Users\\tomma\\Downloads\\CSV-03-11\\03-11\\UDPLag.csv", " Packet Length Std");
				
		System.out.println("Comparazione dei valori medi di 'Packet Length Std' nelle varie condizioni di rete:");
		System.out.println("Traffico normale: "+benign_devStd);;
		System.out.println("LDAP: "+LDAP_devStd);
		System.out.println("MSSQL: "+MSSQL_devStd);
		System.out.println("NetBIOS: "+NetBIOS_devStd);
		System.out.println("Portmap: "+Portmap_devStd);
		System.out.println("Syn: "+Syn_devStd);
		System.out.println("UDP: "+UDP_devStd);
		System.out.println("UDPLag: "+UDPLag_devStd);*/
		
		double benign_devStd = Benign.read("C:\\Users\\tomma\\Downloads\\GeneratedLabelledFlows\\TrafficLabelling\\Monday-WorkingHours.pcap_ISCX.csv", " ACK Flag Count");
		double LDAP_devStd = Benign.read("C:\\Users\\tomma\\Downloads\\CSV-03-11\\03-11\\LDAP.csv", " ACK Flag Count");
		double MSSQL_devStd = Benign.read("C:\\Users\\tomma\\Downloads\\CSV-03-11\\03-11\\MSSQL.csv", " ACK Flag Count");
		double NetBIOS_devStd = Benign.read("C:\\Users\\tomma\\Downloads\\CSV-03-11\\03-11\\NetBIOS.csv", " ACK Flag Count");
		double Portmap_devStd = Benign.read("C:\\Users\\tomma\\Downloads\\CSV-03-11\\03-11\\Portmap.csv", " ACK Flag Count");
		double Syn_devStd = Benign.read("C:\\Users\\tomma\\Downloads\\CSV-03-11\\03-11\\Syn.csv", " ACK Flag Count");
		double UDP_devStd = Benign.read("C:\\Users\\tomma\\Downloads\\CSV-03-11\\03-11\\UDP.csv", " ACK Flag Count");
		double UDPLag_devStd = Benign.read("C:\\Users\\tomma\\Downloads\\CSV-03-11\\03-11\\UDPLag.csv", " ACK Flag Count");
				
		System.out.println("Comparazione dei valori medi di 'Packet Length Std' nelle varie condizioni di rete:");
		System.out.println("Traffico normale: "+benign_devStd);;
		System.out.println("LDAP: "+LDAP_devStd);
		System.out.println("MSSQL: "+MSSQL_devStd);
		System.out.println("NetBIOS: "+NetBIOS_devStd);
		System.out.println("Portmap: "+Portmap_devStd);
		System.out.println("Syn: "+Syn_devStd);
		System.out.println("UDP: "+UDP_devStd);
		System.out.println("UDPLag: "+UDPLag_devStd);
		


	}

}
