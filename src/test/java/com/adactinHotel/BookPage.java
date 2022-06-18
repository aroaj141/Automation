package com.adactinHotel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class BookPage extends BaseClass {
	public BookPage() {
PageFactory.initElements(driver, this);
}
@FindBy (id="first_name")
private WebElement txtFirstName;

@FindBy (id="last_name")
private WebElement txtLastName;

@FindBy (id="address")
private WebElement txtAddress;

@FindBy(id="cc_type")
private WebElement crdType;



@FindBy (id="cc_num")
private WebElement txtCcNum;

@FindBy (id="cc_exp_month")
private WebElement seCcExp;
	
@FindBy (id="cc_exp_year")
private WebElement seCcExpYear;
	
@FindBy (id="cc_cvv")
private WebElement txtCcvv;

@FindBy (id="book_now")
private WebElement btnBook;
@FindBy(xpath="//td[text()='Book A Hotel ']")
private WebElement bookHotelText;

public WebElement getBookHotelText() {
	return bookHotelText;
}

public WebElement getTxtFirstName() {
	return txtFirstName;
}

public WebElement getTxtLastName() {
	return txtLastName;
}

public WebElement getTxtAddress() {
	return txtAddress;
}

public WebElement getTxtCcNum() {
	return txtCcNum;
}
public WebElement getCrdType() {
	return crdType;}

public WebElement getSeCcExp() {
	return seCcExp;
}

public WebElement getSeCcExpYear() {
	return seCcExpYear;
}

public WebElement getTxtCcvv() {
	return txtCcvv;
}

public WebElement getBtnBook() {
	return btnBook;
}

public void bookHotel(String firstName,String lastName,String Address,
		String CcNum, String crdType,String CcExp,String CcYear,String Cvv) throws InterruptedException {
getText(getBookHotelText());
drdnSelectOptionByText(getTxtFirstName(), firstName);
drdnSelectOptionByText(getTxtLastName(), lastName);
drdnSelectOptionByText(getTxtAddress(), Address);
drdnSelectOptionByText(getTxtCcNum(), CcNum);
drdnSelectOptionByText(getCrdType(), crdType);
drdnSelectOptionByText(getSeCcExp(), CcExp);
drdnSelectOptionByText(getSeCcExpYear(), CcYear);
drdnSelectOptionByText(getTxtCcvv(), Cvv);
	click(getBtnBook());

	
}


}
