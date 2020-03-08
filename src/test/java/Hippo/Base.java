package Hippo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	static WebDriver driver;
	
	public static void browserLaunch()
	{
	//	WebDriverManager.chromedriver().version("80").setup();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Naveenaa\\eclipse-workspace\\TaskHippoVideo\\ChromeDriver\\chromedriver.exe");
		ChromeOptions fo = new ChromeOptions();
		fo.addArguments("--disable-notifications");
		driver = new ChromeDriver(fo);
		
	}
	public static void url(String url)
	{
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	public static void implicitWait()
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public static WebElement findElement(String s)
	{
		return driver.findElement(By.xpath(s));
	}
}
