package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinSearchHotel extends BaseClass {
	public AdactinSearchHotel() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="location")
	private WebElement location;
	@FindBy(id="hotels")
	private WebElement hotels;
	@FindBy(id="room_type")
	private WebElement room;
	@FindBy(name="room_nos")
	private WebElement roomNo;
	@FindBy(name="datepick_in")
	private WebElement inDate;
	@FindBy(name="datepick_out")
	private WebElement outDate;
	@FindBy(name="adult_room")
	private WebElement adults;
	@FindBy(id="Submit")
	private WebElement submit;
	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotels() {
		return hotels;
	}
	public WebElement getRoom() {
		return room;
	}
	public WebElement getRoomNo() {
		return roomNo;
	}
	public WebElement getInDate() {
		return inDate;
	}
	public WebElement getOutDate() {
		return outDate;
	}
	public WebElement getAdults() {
		return adults;
	}
	public WebElement getSubmit() {
		return submit;
	}

}
