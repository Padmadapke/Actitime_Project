package com.actitime.testscript;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;

@Listeners(com.actitime.generic.ListenerImplementation.class)
public class CustomerModule extends BaseClass{
	@Test
	public void testCreateCustomer() throws InterruptedException, EncryptedDocumentException, IOException {
		Reporter.log("Sheet1",true);
		FileLib f=new FileLib();
	String expectedCustomer = f.getExcelData("Sheet1", 1, 3);
	String customerDescription = f.getExcelData("Sheet1", 1, 4);
	HomePage h=new HomePage(driver);
	h.setTasksTab();
	TaskListPage t=new TaskListPage(driver);
	t.getAddNewBtn().click();Thread.sleep(2000);
	t.getNewCustomerOption().click();Thread.sleep(2000);
	t.getEnterCustomerNameTbx().sendKeys(expectedCustomer);Thread.sleep(2000);
	t.getCustomerDescriptionTbx().sendKeys(customerDescription);Thread.sleep(2000);
	t.getSelectCustomerDD().click();Thread.sleep(2000);
	t.getOurCompanyTx().click();Thread.sleep(2000);
	t.getCreateCustomerBtn().click();Thread.sleep(2000);
	Thread.sleep(3000);
	String actualCustomer = t.getActualCustomerLoc().getText();
	Assert.assertEquals(actualCustomer, expectedCustomer);
	}	
}

		
	
	


