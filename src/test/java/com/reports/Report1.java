package com.reports;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Report1 {
	public  static void generateJVMReport(String jsonFile) {
File file = new File("C:\\Users\\DELL\\eclipse-workspace\\Cucumber\\target");
Configuration configuration = new Configuration(file, "AdactionHotel Automation");
configuration.addClassifications("os", "wiindows 11");
configuration.addClassifications("BrowserName", "Chrome");
configuration.addClassifications("version", "101.1.1242");


List<String> jsonFiles= new ArrayList<String>();

jsonFiles.add(jsonFile);

ReportBuilder builder= new ReportBuilder(jsonFiles, configuration);
builder.generateReports();
		
		
		
			
	}

}
