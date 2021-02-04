package com.hrms.TestScripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class Tc002 {
	@Test
	public void method()throws Exception
	{
		//DOMConfigurator.configure("log4j.xml");
			 General gen =new  General();
			gen. openApplication();
			gen.login();
			gen.addemp();
			gen.admin();
			gen.delmp();
			 gen.closebrowser();
			 gen.logout();
			 
	}

}
