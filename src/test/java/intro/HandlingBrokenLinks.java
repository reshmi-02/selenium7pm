package intro;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingBrokenLinks {
	
	public static void brokenLinkChecker(String link) throws URISyntaxException, IOException {
		
		URL url = new URL(link);
		
		HttpURLConnection httpurl=(HttpURLConnection)url.openConnection();
		httpurl.connect();
		
		int responseCode = httpurl.getResponseCode();
		
		if(responseCode<400) {
			System.out.println("valid link : "+link);
		}
		else {
			System.out.println("broken link : "+link);
		}
	}
	
public static void main(String[] args) throws URISyntaxException, IOException {
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.softwaretestingmaterial.com/");
	
	List<WebElement> tags = driver.findElements(By.tagName("a"));
	
	for(WebElement e:tags) {
		
		String link = e.getAttribute("href");
		
		HandlingBrokenLinks.brokenLinkChecker(link);
	}
	
	
}
}
