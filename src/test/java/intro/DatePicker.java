package intro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {
 public static void main(String[] args) {
	
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://jqueryui.com/datepicker/");
	 
	 driver.switchTo().frame(0);
	 WebElement inp = driver.findElement(By.xpath("//input[@id='datepicker']"));
	 inp.click();
//	 inp.sendKeys("10/10/2023");
	 
	 String month="May",date="29",year="2023";
	 
	  while(true) {
		  
		 String mon = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		 String yr = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
	 
		  if(mon.equals(month) &&  yr.equals(year)) {
			  break;
		  }
		  else {
			  driver.findElement(By.xpath("//span[text()='Prev']")).click();
		  }
		  
	  
	  }
	  
	  
	  List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a"));
	 
	  for(WebElement e :dates) {
		  String text = e.getText();
		  
		  if(text.equals(date)) {
			  e.click();
		  }
	  }
	  
 }
}
