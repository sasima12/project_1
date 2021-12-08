package Com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tshirt_img {
	public WebDriver sasi;

	@FindBy(xpath=("//a[@title='T-shirts'])[2]"))
	private WebElement Tshirt_img;
	
 public Tshirt_img (WebDriver driver2) {
	this.sasi= driver2;
	PageFactory.initElements(sasi, this);
}


public WebElement getTshirt_img() {
	return Tshirt_img;
	
	
}



}






