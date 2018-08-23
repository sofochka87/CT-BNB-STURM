package com.bnb.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bnb.utilities.Driver;

public class HuntPage {

	public HuntPage(){
		PageFactory.initElements(Driver.getDriver(), this);
	}
	@FindBy(xpath = "//input[@id='date']")
	public WebElement date;
	
	@FindBy(id = "timelineStart")
	public WebElement timeLine;
	
	@FindBy(id = "timelineFinish")
	public WebElement timeLineFinish;
	
	@FindBy(xpath = "//span[@class='icon']")
	public WebElement submit;
	
	@FindBy(xpath = "//h1")
	public WebElement freeSpots;
	
	@FindBy(xpath = "//p[@class='title is-size-4']")
	public List<WebElement> rooms;
	
	@FindBy(xpath = "//*[@class='card-footer-item']")
	public List<WebElement> booksButtons;
	
	@FindBy(xpath = "//button[@class='button is-dark']")
	public WebElement submitReservation;
	
	@FindBy(xpath = "/html/body/div[2]")
	public WebElement message;
	
	@FindBy(xpath = "//table/tbody/tr[1]/td[7]")
	public WebElement scheduledConference;
	
	@FindBy(xpath = "//button[@class='button is-danger']")
	public WebElement cancelButton;
	

	
	
}
