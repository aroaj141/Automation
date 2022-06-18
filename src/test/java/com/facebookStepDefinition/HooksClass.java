package com.facebookStepDefinition;

import com.base.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksClass extends BaseClass{
	@Before
	public void chrome() {
getDriver();
loadUrl("https://www.facebook.com/");
	}
	
	
	
//	@After
//	public void quit() {
//closeAllWindows();
//	}

}
