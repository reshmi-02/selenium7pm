package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalCommands {
 public static void main(String[] args) {
	
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.google.co.in/");
	 
	 
	 WebElement text = driver.findElement(By.cssSelector("textarea[name='q']"));
//	 System.out.println(text .isDisplayed());
//	 System.out.println(text.isEnabled());
	 
//	 System.out.println(driver.getTitle());
//    System.out.println(driver.getCurrentUrl());
//    System.out.println(driver.getPageSource());
}
}
