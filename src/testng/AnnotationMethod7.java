package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationMethod7 extends BaseTest {
//PROGRAM OF METHOD OVERRIDING HERE ONLY SUBCLASS METHOD WILL EXECUTE
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Running Overridden beforeMethod of Sub Class");
	}
	
	@Test
	public void addGirlFriend() {
		System.out.println("Running addGirlFriend testCase");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("Running Overridden afterMethod of Sub Class");
	}
}
