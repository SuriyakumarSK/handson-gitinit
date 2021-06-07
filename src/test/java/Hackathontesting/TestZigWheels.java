package Hackathontesting;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import POM.zigWheelsTools;


public class TestZigWheels extends BaseClass {

	public TestZigWheels(WebDriver driver, WebElement element) {
		super(driver, element);
	} 
	public static void details() throws InterruptedException, IOException{
		
		zigWheelsTools.Close().click();
		WebElement newBikes=zigWheelsTools.Bikes();
		Actions act = new Actions(driver);
		act.moveToElement(newBikes).build().perform();
		Thread.sleep(2000);
		zigWheelsTools.Upcomming().click();
		WebElement bikeModel =zigWheelsTools.Model();
		Select s = new Select(bikeModel);
		s.selectByVisibleText("Honda");
		String text = zigWheelsTools.Total().getText();
		((JavascriptExecutor)driver).executeScript("scroll(0,1500)");
		Thread.sleep(2000);
		zigWheelsTools.viewMore().click();
		int countOfBikes = Integer.parseInt(text.substring(1,3));
		System.out.println("TOTAL NO.OF BIKES UPCOMMING IN INDIA AT (HONDA) BRAND: "+countOfBikes);
		printingBikeDetails();
			WebElement usedCars = zigWheelsTools.Used();
			Actions action = new Actions(driver);
			action.moveToElement(usedCars).build().perform();
			Thread.sleep(2000);
			zigWheelsTools.City().click();
			int counts=0;
			System.out.println("\n-----POPULAR CAR MODELS IN THE LIST OF USED CAR AT CHENNAI----\n");
			for(WebElement link:zigWheelsTools.carNames()){
				System.out.println(link.getAttribute("car_name"));
				counts++;
			}
			System.out.println("TOTAL NUMBER OF car details: "+counts);
			navigation();
			Thread.sleep(2000);
			windowHandling();
}
	public static void navigation() throws IOException{
		driver.navigate().to(DriverSetUp.propertyFile("baseUrl"));
	}
	public static void printingBikeDetails(){
		System.out.println("\n-----LIST OF BIKES PRICE LESS THAN RS. 4.00 LAKHS AT (HONDA) BRAND ----\n");
		String[] bikeName= new String[15];
		String[] bikePrice= new String[15];
		String[] bikeLaunch = new String[15];
		int[] price = new int[15];
		int i=0,j=0,k=0;
		for(WebElement link: zigWheelsTools.bikeNames()){
			bikeName[i]=link.getAttribute("title");
			i++;
		}
		for(WebElement link1:zigWheelsTools.bikeLaunchDate()){
			bikeLaunch[k]=link1.getText();
			k++;
		}
		for(WebElement link2:zigWheelsTools.bikePrices()){
			bikePrice[j]=(link2.getText());
            String subString=bikePrice[j].substring(4,8);
 			price[j]=(int)Float.parseFloat(subString);
			j++;
		}
		int count1=0,count=0;
		for(count1=0;count1<(bikeName.length)-1;count1++){
	     	 
	     	   if(price[count1]<4){
	     	   	System.out.println("MODEL NAME: "+bikeName[count1]+"\nPRICE: "+bikePrice[count1]+"\n"+bikeLaunch[count1]+"\n");
	        		System.out.println("\n");
	        		count++;
	     	   }
	     	  
	        }
	 		
	 		System.out.println("TOTAL NUMBER OF BIKE UPCOMMING(INDIA) AT PRICE LESS THAN 4.00 LAKHS : "+count);
	 		
	}
	public static void windowHandling() throws InterruptedException, IOException{
		zigWheelsTools.Login().click();
		Thread.sleep(2000);
		zigWheelsTools.Sign().click();
		Thread.sleep(2000);
	    Set<String> windows=driver.getWindowHandles();
	    Iterator<String> it=windows.iterator();
	    String win1=it.next();
	    String win2=it.next();
	    driver.switchTo().window(win2);
	    Thread.sleep(2000);
	    zigWheelsTools.Mail().sendKeys(DriverSetUp.propertyFile("email"));
	    Thread.sleep(2000);
	    zigWheelsTools.Look().click();
	    Thread.sleep(2000);
	    String error = zigWheelsTools.Mistake().getText();
	    System.out.println("\n------CAPTURE ERROR MESSAGE---------\n");
	    System.out.println(error);
	    Thread.sleep(2000);
	    driver.close();
        driver.switchTo().window(win1);
        Thread.sleep(2000);

	}
	
	

}
