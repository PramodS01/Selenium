import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CLEARTEXT {
 public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://facebook.com/");
	Thread.sleep(2000);
	driver.findElement(By.linkText("Forgotten pasword?")).click();
	WebDriverWait ww =new WebDriverWait(driver,10);
	ww.until(new ExpectedCondition<Boolean>() {
		public Boolean apply (WebDriver driver){
			return driver.findElement(By.name("did_submit")).isEnabled();
			
		}
	});
	driver.findElement(By.id("identify_email")).sendKeys("999999999999");
}

}
