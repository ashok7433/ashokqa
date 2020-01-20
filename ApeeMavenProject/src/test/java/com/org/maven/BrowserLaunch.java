package com.org.maven;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import EmployeLoginRepo.Elogin;
import EmployeLoginRepo.EmpLoginElements;

public class BrowserLaunch {

	private static WebDriver driver = null;

	public static void main(String[] args) {
		EmployerLogin();

	}

	public static void EmployerLogin() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

		EmpLoginElements Employer = new EmpLoginElements(driver);
		driver.get("https://www.apemploymentexchange.com/employer/login");
		Employer.EmailField("gantauma1010@gmail.com");
		Employer.PwdField("1111111111");
		Employer.ClickBtn();

		// Elogin.Elogin_Locator(driver).sendKeys("gantauma1010@gmail.com");
		// Elogin.Elogin_Pwd(driver).sendKeys("1111111111");
		// Elogin.Elogin_LoginBtn(driver).sendKeys(Keys.ENTER);

		/*
		 * String ExceptedResult =
		 * "Local Jobs in Andhra Pradesh | Latest Jobs in Andhra Pradesh";
		 * 
		 * if (ExceptedResult.equals(driver.getTitle())) {
		 * System.out.println("Title:"+driver.getTitle());
		 * System.out.println("TEST PASS");
		 * 
		 * }else { System.out.println("TESTFAIL"); }
		 * 
		 * driver.close();
		 */
	}
}
