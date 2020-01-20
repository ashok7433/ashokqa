package EmployeLoginRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

     public class EmpLoginElements {
	
	 WebDriver driver = null;
	By Employer_Email = By.xpath("//input[@id='Employerlogin_username']");
	By Employer_Pwd = By.xpath("//input[@id='Employerlogin_password']");
	By Employe_Login_Btn = By.xpath("//input[@id='login']");
	
	public EmpLoginElements(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
    public void EmailField(String text)
	
	{
		driver.findElement(Employer_Email).sendKeys(text);
		
	}

    public void PwdField(String pwd)

{
	driver.findElement(Employer_Pwd).sendKeys(pwd);
	
}
    public void ClickBtn()

    {
    	driver.findElement(Employe_Login_Btn).sendKeys(Keys.RETURN);
    }

}
