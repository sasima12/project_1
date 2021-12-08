package Com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page {
	public WebDriver sasi;

	@FindBy(xpath="//a[@class='login']")
	private WebElement signin_bt;
 public Home_page (WebDriver driver2) {
	this.sasi= driver2;
	PageFactory.initElements(sasi, this);
 }
	public WebElement getSignin_bt() {
		return signin_bt;
		
	}
	
}
