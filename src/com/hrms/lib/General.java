
package com.hrms.lib;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class General extends Global  {
	
	public void openApplication()throws Exception
	{
	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
	driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to(url);
	}
	public void closebrowser(){
		driver.quit();
		}
		public void login() throws Exception{
		driver.findElement(By.name(txt_user)).sendKeys(username);    
		driver.findElement(By.name(txt_password)).sendKeys(password);
		driver.findElement(By.name(login)).click();
		//Log.info("*******started execution***********");
		//Thread.sleep(3000);
		}
		public void logout(){
		  //   driver.findElement(By.linkText(logout)). click();
		System.out.println("logout completed");
		}
		public void addemp() throws InterruptedException{
		System.out.println("adding new emp");
	     driver.switchTo().frame("rightMenu");
	     driver.findElement(By.xpath("//input[@value='Add']")).click();
	   //  Thread.sleep(2000);
	     driver.findElement(By.name("txtEmpLastName")).sendKeys("prasad");
	     driver.findElement(By.name("txtEmpFirstName")).sendKeys("siva");
	     driver.findElement(By.id("btnEdit")).click();
	     System.out.println("the save button is selected");
	     driver.findElement(By.xpath("//input[@value='Back']")).click();
	     Reporter.log("system is back");
	    
		}
		public void admin()
		{
			
			System.out.println("custom field is selected");
			Reporter.log("customer is in selected the field");
			
		}
		public void delmp(){
		System.out.println("delete emp"); 
	}
}
	
