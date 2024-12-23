package intro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
	
		 List<WebElement> pages = driver.findElements(By.xpath("//ul[@id='pagination']/li/a"));
		
		 List<WebElement> checkbox = driver.findElements(By.xpath("//table[@id='productTable']/tbody/tr/td[4]/input"));
	System.out.println(checkbox.size());
	
//	for(int i=0;i<pages.size();i++) {
//		pages.get(i).click();
//		
//		
//	}
//	for(int j=0;j<checkbox.size();j++) {
//		checkbox.get(j).click();
//		Thread.sleep(2000);
//	}
//		 for(WebElement e:pages) {
//			 e.click();
//			
//	}
		 
//		 for(WebElement a :checkbox) {				 
//			 a.click();
//			 Thread.sleep(1000);		 
//		 }
//		 
		 
	}
}
