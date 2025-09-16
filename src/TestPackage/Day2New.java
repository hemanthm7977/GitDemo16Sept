package TestPackage;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2New {

	@Test(dependsOnMethods = { "notDepends2" })
	public void dependsOn2() {
		System.out.println("Depends ONNN - Day 2");
	}
	
	
	@Test
	public void Day2() {
		System.out.println("Day 2 - Hi and Hello");
	}

	@BeforeTest
	public void prerequisite() {
		System.out.println("Before test operation");
	}

	@Test(groups = "Smoke")
	public void Day2Smoke() {
		System.out.println("Smoke Test - Day 2");
	}

	@Test
	public void notDepends2() {
		System.out.println("Not Depends - Day 2");
	}
	
	@Test(enabled=false)
	public void enabledTestNG() {
		System.out.println("Test Enabled - Day 2");
	}

	
	@Test(timeOut=000001)
	public void timeOutTestNG() {
		System.out.println("Time out - Day 2");
	}
}
