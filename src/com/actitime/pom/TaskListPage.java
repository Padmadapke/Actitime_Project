package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {
  @FindBy(xpath="//div[text()='Add New']")
  private WebElement addNewBtn;
  
  @FindBy(xpath ="//div[text()='+ New Customer']")
  private WebElement newCustOption;
  
  @FindBy(id="customerLightBox_nameField")
  private WebElement enterCustomerNameTbx;
  
  @FindBy(id="customerLightBox_descriptionField")
  private WebElement customerDiscriptionTbx;
  
  @FindBy(xpath="//button[contains(@id,'ext-gen')]")
  private WebElement selectCustomerDD;
  
  @FindBy(xpath="//a[text()='Our Company']")
  private WebElement ourCompanyTx;
  
  @FindBy(xpath="//span[text()='Create Customer']")
  private WebElement createCustomerBtn;
  
  @FindBy(xpath="//div[@class='navigationLinks']/../div[@class='title ellipsis']")
	private WebElement actualCustomerLoc;
	
  public TaskListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddNewBtn() {
		return addNewBtn;
		}
	public WebElement getNewCustomerOption() {
		return getNewCustomerOption();
	}
	public WebElement getEnterCustomerNameTbx() {
		return enterCustomerNameTbx;
	}
	public WebElement getCustomerDescriptionTbx() {
		return getCustomerDescriptionTbx();
	}
	public WebElement getSelectCustomerDD() {
		return selectCustomerDD;
	}
	public WebElement getOurCompanyTx() {
		return ourCompanyTx;
	}
	public WebElement getCreateCustomerBtn() {
		return createCustomerBtn;
	}

	public WebElement getActualCustomerLoc() {
		return actualCustomerLoc;
	}
	
	
  
  
}
