package com.adactinHotel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class LoginPagec extends BaseClass {
	
	public LoginPagec() {
		PageFactory.initElements(driver, this);
			}
	@FindBy(id="username")
	 private WebElement txtUserNme	;
	@FindBy(id="password")
	private WebElement txtPasswrd;
	@FindBy(id="login")
	private WebElement btnLogin;	
	public WebElement getTxtUserNme() {
		return txtUserNme;
	}
	public WebElement getTxtPasswrd() {
		return txtPasswrd;
	}
	public WebElement getBtnLogin() {
		return btnLogin;
	}
	public void logIn(String userName,String password) {
		SendKey(getTxtUserNme(), userName);
		SendKey(getTxtPasswrd(), password);
		click(getBtnLogin() );

	}
}
