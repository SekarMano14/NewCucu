package org.functinoalLibrary;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {
	
	public static void generateJVMReport(String json) {
		File f= new File("E:\\Mano\\My WorkSpace\\Cucumber\\src\\test\\resources\\Reports\\JVM Reports");
		Configuration con=new Configuration(f, "Air Canada");
		
		con.addClassifications("PlatformName", "Windows");
		con.addClassifications("PlatformVersion", "10");
		con.addClassifications("BrowserName", "Chrome");
		con.addClassifications("Sprint", "24");
		
		List<String> jsonFiles= new LinkedList<String>();
		jsonFiles.add(json);
		
		ReportBuilder r=new ReportBuilder(jsonFiles, con);
		r.generateReports();

	}

}
