import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDemo {

	public static void main(String[] args)throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:/amazon.in/");
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,4000)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(-500,0)");
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		js.executeScript("window.scrollTo(document.body.scrollWidth,0)");
	}
	
	
}
