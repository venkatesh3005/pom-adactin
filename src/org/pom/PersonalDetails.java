package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PersonalDetails extends BaseClass {
	public PersonalDetails() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="first_name")
	private WebElement fname;
	@FindBy(id="last_name")
	private WebElement lname;
	@FindBy(id="address")
	private WebElement useraddress;
	@FindBy(id="cc_num")
	private WebElement cardno;
	@FindBy(id="cc_type")
	private WebElement type;
	@FindBy(id="cc_exp_month")
	private WebElement exmonth;
	public WebElement getFname() {
		return fname;
	}
	public WebElement getLname() {
		return lname;
	}
	public WebElement getUseraddress() {
		return useraddress;
	}
	public WebElement getCardno() {
		return cardno;
	}
	public WebElement getType() {
		return type;
	}
	public WebElement getExmonth() {
		return exmonth;
	}
	public WebElement getExyear() {
		return exyear;
	}
	public WebElement getCvvno() {
		return cvvno;
	}
	@FindBy(id="cc_exp_year")
	private WebElement exyear;
	@FindBy(id="cc_cvv")
	private WebElement cvvno;
	@FindBy(id="book_now")
	private WebElement bookno;
	public WebElement getBookno() {
		return bookno;
	}
	
	
}
