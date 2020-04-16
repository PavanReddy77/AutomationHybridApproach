package com.saal.challenge.TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.saal.challenge.BaseClass.TestBase;

public class HomePageTest extends TestBase
{
	WebDriver driver;
	
	public HomePageTest(WebDriver driver)
	{
		this.driver = driver;
	}
	
	@Test
	public void printHomePageUserName()
	{
		System.out.println("Home Page User Name is Pavan");
	}
}
