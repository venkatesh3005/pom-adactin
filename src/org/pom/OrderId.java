package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderId extends BaseClass{
	public OrderId () {
		PageFactory.initElements(driver, this);
	}
@FindBy(id="order_no")
private WebElement orderid;
public WebElement getOrderid() {
	return orderid;
}
}
