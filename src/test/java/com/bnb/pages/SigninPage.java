package com.bnb.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bnb.utilities.Driver;

public class SigninPage {
	public SigninPage()throws Exception {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(name = "email")
	public WebElement email;

	@FindBy(name = "password")
	public WebElement password;

	@FindBy(xpath = "//button[.='sign in']")
	public WebElement signInButton;

	@FindBy(xpath= "//div[@class='cdk-live-announcer-element cdk-visually-hidden']")
	public WebElement announcerElement;
	
	@FindBy(xpath = "//div[@class='cdk-overlay-container']")
	public WebElement overlayContainer;
}
