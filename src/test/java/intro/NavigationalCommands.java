package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommands {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
	
		driver.manage().window().maximize();
		driver.navigate().to("https://www.w3schools.com/java/");
		
	 driver.findElement(By.xpath("//a[text()='JAVASCRIPT']")).click();
	 
	 driver.navigate().back();
	 driver.navigate().back();
	 driver.navigate().refresh();
	 driver.navigate().forward();
	 
	 
	 driver.close();
	 
	}
}
