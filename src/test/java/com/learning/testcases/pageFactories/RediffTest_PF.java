package com.learning.testcases.pageFactories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.learning.pages.pageFactories.RediffHomePage_PF;
import com.learning.pages.pageFactories.RediffLoginPage_PF;
import com.learning.utilities.Custom_Utilties;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RediffTest_PF {

	@Test
	public void Login() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		System.out.println(driver.getTitle());
		RediffLoginPage_PF loginPage = new RediffLoginPage_PF(driver);

		// Ways to access the WebElement
		// 1 - Calling method (to get some logs, if you want)
		loginPage.emailTextBox().sendKeys("Full Stack Automation Test Engineer");

		// 2 - Calling webelement directly
		loginPage.passwordTextBox.sendKeys("Custom Password");

		loginPage.signInButton.click();
		loginPage.rediffLink.click();

		Custom_Utilties.holdScript(3);
		System.out.println(driver.getTitle());

		RediffHomePage_PF homePage = new RediffHomePage_PF(driver);

		homePage.searchTextBox.sendKeys("Hi Shera");
		Custom_Utilties.holdScript(3);
		System.out.println("Success");

		driver.quit();

	}

}
