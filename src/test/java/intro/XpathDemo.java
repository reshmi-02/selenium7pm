package intro;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class XpathDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/waits");
		
	
//		WebElement element = driver.findElement(By.xpath("//input[@type='text']"));
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//		WebElement text = wait.until(ExpectedConditions.elementToBeClickable(element));
//		text.sendKeys("priya");
		
//		List<WebElement> elements = driver.findElements(By.xpath("//input[@type='tex']"));
//		System.out.println(elements.size());
//		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
//		pass.sendKeys("res");
//		
//		driver.findElement(By.xpath("//button[@name='login']")).click();
	}
}
