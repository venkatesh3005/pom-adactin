package org.pom;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomAdactin extends BaseClass{
	
	public PomAdactin() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="username")
	private WebElement typeUser;
	@FindBy(id="password")
	private WebElement typePass;
	@FindBy(id="login")
	private List<WebElement> login;
	
	public WebElement getTypeUser() {
		return typeUser;
	}
	public WebElement getTypePass() {
		return typePass;
	}
	public List<WebElement> getLogin() {
		return login;
	}
	
	
	

}
