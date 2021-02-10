package com.learning.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffHomePage {

	WebDriver driver;

	By searchTextBox = By.id("srchquery_tbox");

	public RediffHomePage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement searchTextBox() {
		return driver.findElement(searchTextBox);
	}

}
