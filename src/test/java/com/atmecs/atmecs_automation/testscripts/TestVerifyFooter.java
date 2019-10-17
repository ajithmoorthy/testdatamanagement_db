package com.atmecs.atmecs_automation.testscripts;

import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import com.atmecs.atmecs_automation.constants.FileConstants;
import com.atmecs.atmecs_automation.helper.SeleniumHelper;
import com.atmecs.atmecs_automation.logreports.LogReporter;
import com.atmecs.atmecs_automation.testbase.TestBase;
import com.atmecs.atmecs_automation.utils.PropertiesReader;

public class TestVerifyFooter extends TestBase {
	LogReporter log=new LogReporter();
	SeleniumHelper help=new SeleniumHelper();
	PropertiesReader propread=new PropertiesReader();
	@Test
	public void veifyFooterData() throws IOException {
		Properties prop=propread.KeyValueLoader(FileConstants.LOCATOR);
		logger=extentObject.startTest("verify footer");
		log.logReportMessage("Step 2:loop Start> go to the footer");
		help.scrollPage(driver);
		log.logReportMessage("Step 3: validate footer ");
		log.logReportMessage("Step 4: loopEnd move to next page");
		log.logReportMessage("Step 5: Step 2");
		log.logReportMessage("Step 6: until menu end Step 2");
		log.logReportMessage("Step 7: mouse over the services menu");
		log.logReportMessage("Step 8: move to digital sub menu");
		log.logReportMessage("Step 9: validate the submenu of digital");
		log.logReportMessage("Step 10: move to the infrastructure  sub menu");
		log.logReportMessage("Step 11: validate the sub menu of infrastructure");
	}

}
