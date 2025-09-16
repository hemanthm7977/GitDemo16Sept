package TestPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3 {

	@Test
	public void webLoginCarLoan() {
		System.out.println("webLoginCarLoan");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite - day 3");
	}

	@Test
	public void MobileLoginCarLoan() {
		System.out.println("MobileLoginCarLoan");
	}

	@Test
	public void MobileLoginCarLoan1() {
		System.out.println("MobileLoginCarLoan11");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite - day 3");
	}

	@Test
	public void MobileLoginCarLoan123() {
		System.out.println("MobileLoginCarLoan123");
	}

	@Test(groups = "Smoke")
	public void Day3Smoke() {
		System.out.println("Smoke Test - Day 3");
	}

	@Parameters({ "URL" })
	@Test
	public void LoginAPICarLoan(String urlName) {
		System.out.println("LoginAPICarLoan");
		System.out.println(urlName);
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method - Day 3");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method - Day 3");
	}

	@BeforeTest
	public void prerequisite() {
		System.out.println("Before test operation - day 3");
	}

	@Test
	public void notDepends() {
		System.out.println("Not Depends - Day 3");
	}

	@Test(dependsOnMethods = { "notDepends" })
	public void dependsOn() {
		System.out.println("Depends ONNN - Day 3");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class - Day 3");
	}

	@AfterClass
	public void AfterClass() {
		System.out.println("After Class - Day 3");
	}
	
	@Test(dataProvider="getData")
	public void getDataProvider(String userName, String password) {
		System.out.println(userName);
		System.out.println(password);

	}

	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[3][2];

		data[0][0] = "firstSetUserName";
		data[0][1] = "firstPassword";

		data[1][0] = "secondSetUserName";
		data[1][1] = "secondPassword";

		data[2][0] = "thirdSetUserName";
		data[2][1] = "thirdPassword";
		
		return data;
	}

}
