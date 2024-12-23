package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOperations {
 public static void main(String[] args) {
WebDriver driver = new ChromeDriver();

//mouse hover
//driver.get("https://www.amazon.in/ref=nav_logo");
// 
//WebElement account = driver.findElement(By.xpath("//span[text()='Account & Lists']"));
//WebElement orders = driver.findElement(By.xpath("//span[text()='Your Orders']"));

	Actions act=new Actions(driver);
	
//	act.moveToElement(account).perform();
//	
//	act.moveToElement(orders).click().perform();
//	
////	context click
//	driver.get("https://www.google.co.in/");
//	WebElement gmail = driver.findElement(By.xpath("//a[text()='Gmail']"));
//	act.contextClick(gmail).perform();
 
	
//	double click
//	driver.get("https://testautomationpractice.blogspot.com/");
//	WebElement field1 = driver.findElement(By.xpath("//input[@id='field1']"));
//	field1.clear();
//	field1.sendKeys("oranium");
//	
//	WebElement but = driver.findElement(By.xpath("//button[text()='Copy Text']"));
//	act.doubleClick(but).perform();
	
	
//	
//	driver.get("http://www.dhtmlgoodies.com/packages/dhtml-suite-for-applications/demos/demo-drag-drop-3.html");
//	
//	WebElement capital1 = driver.findElement(By.xpath("//div[@id='dropContent']/div[@id='box4']"));
//	WebElement country1 = driver.findElement(By.xpath("//div[@id='countries']/div[@id='box104']"));
//
//	act.dragAndDrop(capital1, country1).perform();
	
	
	
	driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
	WebElement min = driver.findElement(By.xpath("//div[@id='slider-range']/span[1]"));
	WebElement max = driver.findElement(By.xpath("//div[@id='slider-range']/span[2]"));
	Point minlocation = min.getLocation();
	System.out.println(minlocation);
Point maxlocation = max.getLocation();	
System.out.println(maxlocation);

act.dragAndDropBy(min, 10, 289).perform();
act.dragAndDropBy(max, -10, 289).perform();
	
 }
}
