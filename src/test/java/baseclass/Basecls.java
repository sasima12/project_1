package baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Basecls {
	public static WebDriver sasi;
	public static  WebDriver Browser(String type) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir")+"\\sasi\\chromedriver.exe");
			  sasi =new ChromeDriver();
			  return sasi;
		}
	public static void url(String url) {
		sasi.get(url);		
	}
	public static void clickOnElement(WebElement element) {
		element.click();
	}
	public static void inputValues(WebElement element,String value) {
		element.sendKeys(value);
	}
	
	public static void selectbyint(WebElement element,int no) {
		Select s1=new Select(element);
			s1.selectByIndex(no);
	}
	public static void selectbyvalue(WebElement element,String value) {
		Select s=new Select(element);
			s.selectByValue(value);
	}
	public static void selectbytext(WebElement element,String text) {
		Select s2=new Select(element);
		s2.selectByVisibleText(text);
		
		}
		
	}

