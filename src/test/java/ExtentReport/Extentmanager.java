package ExtentReport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extentmanager {
	
	public static final ExtentReports extentReport = new ExtentReports();
	
	public synchronized static ExtentReports createExtentReports()
	{
		ExtentSparkReporter reporter = new ExtentSparkReporter("./extent-reports/extent-report.html");
		
		reporter.config().setReportName("LMD Extent Report");
		extentReport.attachReporter(reporter);
		extentReport.setSystemInfo("Blog Name", "Netsol QA Team");
		extentReport.setSystemInfo("QA Tester", "Jeet Gajera");
		
		return extentReport;
		
		
	}

}
