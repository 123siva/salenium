package com.hrms.TestScripts;

import com.hrms.lib.General;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;
public class TC001 {
	@Test
	public void demo() throws Exception
	{
		//DOMConfigurator.configure("log4j.xml");
		 General gen =new  General();
		gen. openApplication();
		gen.login();
		gen.addemp();
		gen.delmp();
		 gen.closebrowser();
		 gen.logout();
		 
	}

}
