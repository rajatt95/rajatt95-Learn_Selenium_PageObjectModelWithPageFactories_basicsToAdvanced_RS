package com.learning.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.learning.pages.RediffHomePage;
import com.learning.pages.RediffLoginPage;
import com.learning.utilities.Custom_Utilties;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RediffTest {

	@Test
	public void Login() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		System.out.println(driver.getTitle());
		RediffLoginPage loginPage = new RediffLoginPage(driver);

		loginPage.emailTextBox().sendKeys("Full Stack Automation Test Engineer");
		loginPage.passwordTextBox().sendKeys("Custom Password");
		loginPage.signInButton().click();
		loginPage.rediffLink().click();

		Custom_Utilties.holdScript(3);
		System.out.println(driver.getTitle());

		RediffHomePage homePage = new RediffHomePage(driver);

		homePage.searchTextBox().sendKeys("Hi Shera");
		Custom_Utilties.holdScript(3);
		System.out.println("Success");

		driver.quit();

	}

}
