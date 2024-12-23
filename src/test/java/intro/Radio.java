package intro;

import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		
		
		List<WebElement> days = driver.findElements(By.xpath("//input[contains(@id,'day')]"));
		System.out.println(days.size());
		
		for(WebElement e :days) {
			
			@Nullable
			String attribute = e.getAttribute("id");
			if(attribute.equals("monday")  || attribute.equals("tuesday")) {
				e.click();
			}
			
		}
		
//		for(int i=0;i<days.size();i++) {
//			 days .get(i).click();
//		}
		
//		for(WebElement e :days) {
//			
//			e.click();
//		}
		
		
//		
//		WebElement male = driver.findElement(By.xpath("//input[@id='male']"));
//		System.out.println(male.isSelected());
//		
//		male.click();
//		System.out.println(male.isSelected());
//		
//		
//		driver.findElement(By.xpath("//input[@id='female']")).click();
		
	}
}
