package Hackathontesting;

import java.util.Scanner;
import org.testng.annotations.Test;


public class TestCase {
	@Test
	public static void Initiation() throws Exception{ 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 to start with chrome WebDriver or 2 to start with firefox WebDriver");
		int choice = sc.nextInt();
		if(choice==1)
			DriverSetUp.Initiate(choice);
		else  
			DriverSetUp.Initiate(choice);
		TestZigWheels.details();
		DriverSetUp.CloseDriver();
		sc.close();
        
	}

}
