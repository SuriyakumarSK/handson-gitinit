package Hackathontesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BaseClass { 
	public static WebDriver driver;
	public static WebElement element;
		public BaseClass(WebDriver driver,WebElement element) {
			BaseClass.driver=driver;
			BaseClass.element= element; 
			
		}

}
