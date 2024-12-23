package intro;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {
 public static void main(String[] args) throws InterruptedException {
	
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://testautomationpractice.blogspot.com/");
	 
	 driver.manage().window().maximize();
	 
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	 WebElement search = driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']"));
	 search.sendKeys("selenium");
	 search.sendKeys(Keys.ENTER);
	 
	 
	 List<WebElement> alllinks = driver.findElements(By.xpath("//div[@id='Wikipedia1_wikipedia-search-results']/div/a"));
	 
	 for(WebElement e :alllinks) {
		 e.click();
	 }
 
	 
	 String currentWindow = driver.getWindowHandle();
	 System.out.println("current window id = "+currentWindow);
// 
//	 
//	String title = driver.getTitle();
//	 System.out.println(title);
	 
	 Set<String> allHandles = driver.getWindowHandles();
	 
	 for(String e : allHandles) {
		 
	    driver.switchTo().window(e);
		String title = driver.getTitle();
		if(title.equals("Selenium - Wikipedia")) {
//			driver.close();
			driver.findElement(By.xpath("//input[@name='search']")).sendKeys("India");
		
			break;
		}
		
		Thread.sleep(2000);
	 }
	 
 }
}
