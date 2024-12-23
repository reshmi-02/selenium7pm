package intro;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
 public static void main(String[] args) {
	
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	 
driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
    Alert alert = driver.switchTo().alert();
    alert.accept();
    
    driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
    Alert alert2 = driver.switchTo().alert();
    alert2.dismiss();
    
    driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
    Alert alert3 = driver.switchTo().alert();
    alert3.sendKeys("hello");
    alert3.accept();
    
}
}
