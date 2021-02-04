package com.hrms.lib;
import org.openqa.selenium.WebDriver;
public class Global {
	//variables
	WebDriver driver;
	public String url="http://127.0.0.1/orangehrm-2.6/login.php";
	public String username="admin";
	public String password="admin";
	//objects
	public String txt_user="txtUserName";
	public String txt_password="txtPassword";
	public String login="Submit";
	public String logout="Logout";
	public String checkbox="allCheck";

}
