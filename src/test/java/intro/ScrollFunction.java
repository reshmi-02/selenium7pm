package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollFunction {
public static void main(String[] args) {
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://en.wikipedia.org/wiki/India");
	
	JavascriptExecutor jse = (JavascriptExecutor) driver;
//	jse.executeScript("window.scrollBy(0,3000)");
	
	WebElement modernIndia = driver.findElement(By.xpath("//h3[text()='Modern India']"));
	
	jse.executeScript("arguments[0].scrollIntoView(true);", modernIndia);
	
	
}
}
