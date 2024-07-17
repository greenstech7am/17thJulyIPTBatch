package org.utilities;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {
	
	
	public static void generateJvmReport(String jsonFilePath) {
		
		//1.Mention the target folder location - File
		
		File loc = new File(System.getProperty("user.dir")+"\\target\\Reports\\Jvm");
		
		
		//2.Add details to the report using Configuration class
		Configuration con = new Configuration(loc, "Facebook Project");
		con.addClassifications("BrowerName", "Chrome");
		con.addClassifications("Browser Version", "81");
		con.addClassifications("Sprint", "13");
		con.addClassifications("OS", "Windows");
		
		
		//3.Add json file paths into List<String> (first complete 4th step then come back to 3rd step )		
		List<String> li = new ArrayList<String>();
		li.add(jsonFilePath);
		
		
		//4.Create object for ReportBuilder class and using the created object call generateReports() method.
		ReportBuilder r = new ReportBuilder(li, con);
		r.generateReports();
		
		
		
		 
		
		
	}
	

}
