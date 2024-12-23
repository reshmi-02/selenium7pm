package intro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowm {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html#");
		
		driver.findElement(By.xpath("//button[@id='menu1']")).click();
		
		
	List<WebElement> list = driver.findElements(By.xpath("//ul[@role='menu']/li/a"));
		
	for(WebElement e :list) {
		if(e.getText().equals("CSS")) {
			e.click();
		}
	}
		

	}
}
