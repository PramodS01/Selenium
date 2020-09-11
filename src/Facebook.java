import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe\\");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com/");
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("alia");
		WebElement pass=driver.findElement(By.name("pass"));
		pass.sendKeys("Bhat",Keys.ENTER);
	}

}
