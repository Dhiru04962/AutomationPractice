package QA.testcases.ExtendReport;

import QA.testcases.LoginPageTest;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExtendReport {
LoginPageTest loginPageTest;
        ExtentSparkReporter  sparkReporter;
        ExtentReports extentReports;
        ExtentTest test;

        @BeforeTest
        public void startReporter() {

            sparkReporter = new ExtentSparkReporter("C:\\Users\\admin\\IdeaProjects\\AutomationProject\\ExtendReport");
            extentReports = new ExtentReports();
            extentReports.attachReporter(sparkReporter);
        }
         @Test
        public void createTest() {
            test = extentReports.createTest("Sample Test");
            test.info("Test has started");
            test.pass("Test passed successfully!");
        }

        @Test
        public void saveReport() {
            extentReports.flush();
        }
        @AfterTest
        public static void main(String[] args) {
            ExtendReport report = new ExtendReport();

            report.startReporter();
            report.createTest();
            report.saveReport();

            System.out.println("Report generated successfully: ExtendReport.html");
        }
    }


