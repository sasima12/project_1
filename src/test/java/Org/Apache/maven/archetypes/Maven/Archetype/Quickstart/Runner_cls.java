package Org.Apache.maven.archetypes.Maven.Archetype.Quickstart;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Com.pom.Home_page;

public class Runner_cls extends Base_class {
	public static WebDriver sasi=Browser("chrome");
	public static Home_page hp=new Home_page(sasi);
	static public void main(String[] args) throws InterruptedException, IOException {
		sasi.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		
		get("http://automationpractice.com/");
		clickOnElement(hp.getSignin_bt());
		WebElement email = sasi.findElement(By.xpath("//input[@id='email']"));
		inputValues(email,"sweetysasi2100@gmail.com");
		WebElement pwsd = sasi.findElement(By.xpath("//input[@id='passwd']"));
		inputValues(pwsd,"sasi@123");
		WebElement sign = sasi.findElement(By.xpath("//i[@class='icon-lock left']"));
		clickOnElement(sign);
		WebElement Tshirts = sasi.findElement(By.xpath("(//a[@title='T-shirts'])[2]"));
		clickOnElement(Tshirts);
		JavascriptExecutor js =(JavascriptExecutor) sasi;
		js.executeScript("window.scrollBy(0,550);");
        WebElement sleev = sasi.findElement(By.xpath("//img[@title='Faded Short Sleeve T-shirts']"));
        clickOnElement(sleev);
		Thread.sleep(3000);
	    WebElement addtocart = sasi.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
	    sasi.switchTo().frame(addtocart);
	    Thread.sleep(3000);
	    WebElement cartclick = sasi.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button"));
		Actions("Move",cartclick);
		Actions("Click",cartclick);
        WebDriverWait wait=new WebDriverWait(sasi, 70);   
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")));
        WebElement proceedtocheck = sasi.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span"));
        Actions("Move",proceedtocheck);
        Actions("Click",proceedtocheck);
		js.executeScript("window.scrollBy(0,650);");
		 WebElement click = sasi.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span"));
		 clickOnElement(click); 
		js.executeScript("window.scrollBy(0,850);");
		WebElement click2 = sasi.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button/span"));
		clickOnElement(click2);
		WebElement click3 = sasi.findElement(By.xpath("//input[@name='cgv']"));
		clickOnElement(click3);
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,850);");
		WebElement click4 = sasi.findElement(By.xpath("//*[@id=\"form\"]/p/button/span"));
		clickOnElement(click4);
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,850);");
		WebElement click5 = sasi.findElement(By.xpath("//a[@class='cheque']"));
		clickOnElement(click5);
		js.executeScript("window.scrollBy(0,850);");
		WebElement click6= sasi.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button/span"));
		clickOnElement(click6);
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,350);");
		TakesScreenshot ts=(TakesScreenshot) sasi;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination= new File("C:\\Users\\NEW\\eclipse-workspace\\selenium_purple\\screenshort\\pic3.png");
		FileUtils.copyFile(source, destination);
		
		
		
		
		
		
	}
//	private static void Action(String string, WebElement cartclick) {
		// TODO Auto-generated method stub
	//private static void url(String string) {
		// TODO Auto-generated method stub
		
	}
		
	
//	private static void inputValueElement(WebElement email, String string) {
		// TODO Auto-generated method stub
		
	
//	private static void url(String string) {
		
	
	//private static void Action(String string, WebElement cartclick) {
	//private static WebDriver browserLanuch(String string) {
		// TODO Auto-generated method stub
	//	return null;
	
		
	
	// static void inputValueElement(WebElement email, String string) {
		// TODO Auto-generated method stub
		
	
	// static void url(String string) {
		// TODO Auto-generated method stub
		
	
	//private static WebDriver browserLanuch(String string) {
		// TODO Auto-generated method stub
	//	return null;
	

	
		

		
		
		
		
		
		
		
		
		
		
        
        
        
        
	   
	   
	    
	    
        
        
        
        
	    
	    
	    
	    
		
		
		
		
		
		
		
		
		

