package org.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hotel extends BaseClass {
	
	public Hotel () {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="continue")
	private WebElement hotelconfirm;
	@FindBy(id="radiobutton_0")
	private WebElement radio;
	public WebElement getHotelconfirm() {
		return hotelconfirm;
	}
	public WebElement getRadio() {
		return radio;
	}
	

}
