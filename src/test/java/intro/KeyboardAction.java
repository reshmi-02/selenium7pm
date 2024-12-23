package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardAction {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
	
	Actions act = new Actions(driver);
	act.sendKeys(email,"oranium").perform();
	
//	select the text (ctrl+a)
	
	act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
	
//	ctrl+c
	
	act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
	
	
//	tab
	act.sendKeys(Keys.TAB).perform();
	
//	ctrl+v
	
	act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
	
//	tab
	act.sendKeys(Keys.TAB).perform();
//	tab
	act.sendKeys(Keys.TAB).perform();
	//enter 
	act.sendKeys(Keys.ENTER).perform();
	
	}
}
