package POM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Hackathontesting.BaseClass;



public class zigWheelsTools extends BaseClass {

	public zigWheelsTools(WebDriver driver, WebElement element) {
		super(driver, element);
	}
	static By close          = By.id("alternate-login-close");
	static By bikes          = By.xpath("//*[@id='headerNewNavWrap']/div[2]/ul/li[3]/a");
	static By upcomming      = By.xpath("//*[@id='headerNewNavWrap']/div[2]/ul/li[3]/ul/li[4]/a");
	static By model          = By.id("makeId");
	static By total			 = By.xpath("//span[@class='fnt-12 i-b mt-10 ml-5']");
	static By viewmore       = By.xpath("//span[@class='zw-cmn-loadMore']");
	static By used		     = By.xpath("//header/div[1]/div[2]/div[1]/div[2]/ul[1]/li[5]/a[1]");
	static By city		     = By.xpath("//a[contains(text(),'Chennai')]");
	static By login          = By.id("forum_login_title_lg");
	static By sign           = By.xpath("//div[@class='lgn-sc c-p txt-l pl-30 pr-30' and @id='googleSignIn']");
	static By mail           = By.id("identifierId");
	static By look           = By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/button[1]/div[2]");
	static By mistake        = By.xpath("//div[@class='DRS7Fe bxPAYd k6Zj8d' and @role='presentation']");
	static By bikeNames      = By.xpath("//a[@data-track-label='model-name']");
	static By bikeLaunchDate = By.xpath("//div[@class='clr-try fnt-14']");
    static By bikePrices     = By.xpath("//div[@class='b fnt-15']");
    static By carNames       = By.xpath("//input[@name='bycarid' and @type='checkbox']");
   
    public static List<WebElement> carNames(){
    	List<WebElement> web = driver.findElements(carNames);
    	return web;
    }
    public static List<WebElement> bikeNames(){
	   List<WebElement> x = driver.findElements(bikeNames);
	   return x;
   } 
   public static List<WebElement> bikeLaunchDate(){
	   List<WebElement> y = driver.findElements(bikeLaunchDate);
	   return y;
   } 
   public static List<WebElement> bikePrices(){
	   List<WebElement> z = driver.findElements(bikePrices);
	   return z;
   } 
    
    
    public static WebElement Close() {
        element=driver.findElement(close);
        return element;
    }

	public static WebElement Bikes() {
        element=driver.findElement(bikes);
        return element;
    }

	public static WebElement Upcomming() {
        element=driver.findElement(upcomming);
        return element;
    }

	public static WebElement Model() {
        element=driver.findElement(model);
        return element;
    }
	public static WebElement Total() {
        element=driver.findElement(total);
        return element;
    }

	public static WebElement viewMore() {
        element=driver.findElement(viewmore);
        return element;
    }
	
	public static WebElement Used() {
        element=driver.findElement(used);
        return element;
    }
	public static WebElement City() {
        element=driver.findElement(city);
        return element;
    }
	public static WebElement Login() {
        element=driver.findElement(login);
        return element;
    }
	public static WebElement Sign() {
        element=driver.findElement(sign);
        return element;
    }
	public static WebElement Mail() {
        element=driver.findElement(mail);
        return element;
    }
	public static WebElement Look() {
        element=driver.findElement(look);
        return element;
    }
	public static WebElement Mistake() {
        element=driver.findElement(mistake);
        return element;
    }
	
	
}
