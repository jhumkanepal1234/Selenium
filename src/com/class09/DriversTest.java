package com.class09;

import utils.CommonMethods;

public class DriversTest extends CommonMethods{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		setUpDriver("chrome", "https://www.google.com/");
		driver.quit();

	}

}
