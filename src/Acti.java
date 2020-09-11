import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Acti {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe\\");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	driver.findElement(By.partialLinkText("actiTIME")).click();
	Set<String>tabs=driver.getWindowHandles();
	for (String tab:tabs){
		driver.switchTo().window(tab);
		
	}
	System.out.println(driver.getTitle());
}
}
