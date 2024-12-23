package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextMethod {
 public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.co.in/");
	
	WebElement gmail = driver.findElement(By.xpath("//a[text()='Gmail']"));
	System.out.println(gmail.getText());
	
	System.out.println(gmail.getAttribute("class"));
}
}
