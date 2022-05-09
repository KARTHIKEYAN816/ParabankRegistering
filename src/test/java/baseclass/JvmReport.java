package baseclass;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {
	public static void Report(String json) {
		File file=new File(System.getProperty("user.dir")+ "\\src\\test\\resources\\Reports");
		Configuration con =new net.masterthought.cucumber.Configuration(file, "Parabank Web Automation");
		con.addClassifications("Platform", "Windows 10");
		con.addClassifications("sprint", "2.1");
		con.addClassifications("Build Number", "PBwa1245");
		List<String> l=new ArrayList<String>();
	l.add(json);
	ReportBuilder re=new ReportBuilder(l, con);
	re.generateReports();
	}

}
