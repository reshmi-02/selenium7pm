package intro;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
//		implicitly wait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='singleframe']"));

		
		//		driver.switchTo().frame("singleframe");
//		driver.switchTo().frame(0);
		//5s
		driver.switchTo().frame(frame1 );
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("selenium");
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
		
		Thread.sleep(2000);
		driver.switchTo().frame(1);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("selenium");
		driver.switchTo().parentFrame();
		
		String text = driver.findElement(By.xpath("//h5[text()='Nested iFrames']")).getText();
		System.out.println(text);
	}
}
