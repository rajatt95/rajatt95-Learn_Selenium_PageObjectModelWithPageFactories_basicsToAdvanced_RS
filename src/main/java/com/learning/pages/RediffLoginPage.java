package com.learning.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginPage {

	WebDriver driver;

	By emailTextBox = By.id("login1");
	By passwordTextBox = By.xpath("//input[@id='password']");
	By signInButton = By.name("proceed");

	By rediffLink = By.cssSelector("a[class='f12']");

	public RediffLoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement emailTextBox() {
		return driver.findElement(emailTextBox);
	}

	public WebElement passwordTextBox() {
		return driver.findElement(passwordTextBox);
	}

	public WebElement signInButton() {
		return driver.findElement(signInButton);
	}

	public WebElement rediffLink() {
		return driver.findElement(rediffLink);
	}

}
