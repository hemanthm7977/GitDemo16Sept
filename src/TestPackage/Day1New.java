package TestPackage;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Day1New {

	@Test
	public void FirstTest() {
		System.out.println("Day 1 - Hello");
	}

	@Test
	public void SecondTest() {
		System.out.println("Day 1 - Hi and Hello");
	}

	@AfterTest
	public void lastExectuion() {
		System.out.println("Last execution - Day1");
	}

	@Test
	public void thirdTest() {
		System.out.println("Day 1 - Hi and Hello and Bye");
	}

}
