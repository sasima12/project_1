package Com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {
	
@FindBy(xpath="//input[@id='email']")
private WebElement email;

@FindBy(xpath="//input[@id='passwd']")
private WebElement password;


@FindBy(xpath= "//i[@class='icon-lock left']")
private WebElement login;
public Login_page (WebDriver driver2) {
	this.sasi= driver2;
	PageFactory.initElements(sasi, this);
}


public WebElement getEmail() {
	return email;
}


public WebElement getPassword() {
	return password;
}


public WebElement getLogin() {
	return login;
}

}
