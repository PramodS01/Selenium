package org.qsp.TestPom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.qsp.Pom.SeleniumHome;

public class TestActiDemo {
	public class TestSeleniumHome {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("demo.actitime.com/login.do/");
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
			SeleniumHome sh=new SeleniumHome(driver);
			sh.sendText("java");
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			sh.sendText("testng");

}
