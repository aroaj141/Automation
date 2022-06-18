package com.adactinHotel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class SelectHotel extends BaseClass {
	public SelectHotel() {

		PageFactory.initElements(driver , this);}
		@FindBy(id="radiobutton_0")
	private WebElement btnSelect;
		
		
		@FindBy(id="continue")
		private WebElement btncontinue;
		
		@FindBy(xpath="//td[contains(text(),'Select Hotel')]")
		private WebElement selectHotelText;

		

		public WebElement getBtnSelect() {
			return btnSelect;
		}

		public WebElement getBtncontinue() {
			return btncontinue;
		}
		public WebElement getSelectHotelText() {
			return selectHotelText;
		}
			
		public void selectHotel() {
			getText(getSelectHotelText());
	     
			click(getBtnSelect());
			click(getBtncontinue());	
			
		}
}
