package Org.Apache.maven.archetypes.Maven.Archetype.Quickstart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Base_class {
	public static WebDriver sasi;
	public static WebDriver Browser(String type) {
		if (type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir")+"\\sasi\\chromedriver.exe");
			 sasi =new ChromeDriver();
		}

		else if (type.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir")+"\\sasi\\gecko.exe");
			 sasi  =new FirefoxDriver();	 
		}
		sasi.manage().window().maximize();
		return sasi;	
	}
	public static void get(String url) {
		sasi.get(url);		
	}
	public static void clickOnElement(WebElement element) {
		element.click();
	}
	public static void inputValues(WebElement element,String value) {
		element.sendKeys(value);
	}
	public static void Actions(String S,WebElement element) {
	Actions sp=new Actions(sasi);
	if (S.equalsIgnoreCase("Move")) {
		sp.moveToElement(element).build().perform();
	}
	else if (S.equalsIgnoreCase("click")) {
		sp.click(element).build().perform();
	}
	}
}
	


    
	
	
	
	
	
	
	


