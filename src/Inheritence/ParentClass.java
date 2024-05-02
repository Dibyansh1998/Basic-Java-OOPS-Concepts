package Inheritence;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ParentClass {
	
	//Methods, variables declare in this class
	public void dothis()
	{
		System.out.println("I am here");
	}
	
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("Run me first");
	}

	@AfterMethod
	public void aftermethod()
	{
		System.out.println("Run me last");
	}
}
