package intro;


import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import javax.imageio.ImageIO;
import javax.swing.plaf.FileChooserUI;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScreenShots {
	
	public static void captureScreenShot(WebDriver driver) {
		
		TakesScreenshot tks = (TakesScreenshot)driver;
		
		File temp= tks.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("./screenshot/facebook.png");
		
	
//		FileUtils.copyfile(temp,dest);
	}
	
	public static void captureCompleteScreenshot() throws AWTException, IOException {
		
		Robot r = new Robot();
		
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		
		Rectangle rect = new Rectangle(d);
		
		BufferedImage b = r.createScreenCapture(rect);
		
		File dest = new File("./screenshot/facebook"+System.currentTimeMillis()+".png");
		ImageIO.write(b, "png", dest);
	}
	
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
	
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("priya@gmali.com");
//		ScreenShots.captureScreenShot(driver);
		captureCompleteScreenshot();
		
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("priya123");
//		ScreenShots.captureScreenShot(driver);
		captureCompleteScreenshot();
		
		driver.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(20000);
//		ScreenShots.captureScreenShot(driver);
		captureCompleteScreenshot();
	
	}
}
