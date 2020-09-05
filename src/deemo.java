import org.openqa.selenium.chrome.ChromeDriver;

public class deemo {
	public static void main(String[] args) throws InterruptedException  {
		
	System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.navigate().to("https://www.google.com/");
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
	driver.navigate().forward();
	driver.close();
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	driver.navigate().refresh();
	driver.close();
}

}
