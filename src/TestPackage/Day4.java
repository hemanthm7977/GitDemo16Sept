package TestPackage;

import org.testng.annotations.Test;

public class Day4 {

	@Test
	public void webLoginHomeLoan() {
		System.out.println("webLoginHomeLoan");
	}

	@Test
	public void MobileLoginHomeLoan() {
		System.out.println("MobileLoginHomeLoan");
	}

	@Test
	public void LoginAPIHomeLoan() {
		System.out.println("LoginAPIHomeLoan");

	}
	
	@Test(groups="Smoke")
	public void Day4Smoke() {
		System.out.println("Smoke Test - Day 4");
	}
}
