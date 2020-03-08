package Hippo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.*;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HippoVideo extends Base {

	public static void main(String[] args) throws AWTException, Throwable {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		Robot r = new Robot();
		browserLaunch();
		url("http://www.hippovideo.io/");
		implicitWait();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		if (findElement("//img[@alt='close']").isDisplayed())

		{
			findElement("//img[@alt='close']").click();
		}

		findElement("//input[@type='email']").sendKeys("naveenaasrikanth@gmail.com");

		findElement("//input[@type='password']").sendKeys("navsri@18");

		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		findElement("//a[@aria-label='login']").click();

		findElement("//input[@id='user_email']").sendKeys("naveenaasrikanth@gmail.com");
		findElement("//input[@id='user_password']").sendKeys("navsri@18");

		findElement("//input[@name='commit']").click();

		 findElement("//div[@id='Business-4']").click();
		 WebElement ele = findElement("//span[@class='plan-button-text']");
		 js.executeScript("arguments[0].click()", ele);
		 findElement("//a[@id='Business-next-btn']").click();

		 findElement("//input[@id='firstNameTxt']").sendKeys("Naveenaa");
		 findElement("//input[@id='companyNameTxt']").sendKeys("HCL");
		 findElement("//input[@id='phoneTxt']").sendKeys("9360048279");

		 driver.findElement(By.id("saveCompanyName")).click();

		implicitWait();

		String url = driver.getCurrentUrl();
		Assert.assertTrue(url.contains("https://www.hippovideo.io/contacts/home"));

		driver.findElement(By.id("ly_20000000004")).click();

		findElement("//section[@data-name='Create video _+']").click();

		Thread.sleep(3000);

		WebElement el = driver.findElement(By.id("startRecording"));
		Actions acc = new Actions(driver);
		acc.moveToElement(el).click(el).build().perform();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("chrome-modalYesBtn")).click();
		
		Set<String> win = driver.getWindowHandles();
		
		List <String> li = new ArrayList<String>();
		
		li.addAll(win);
		driver.switchTo().window(li.get(1));
		
		findElement("//div[@role='button']").click();
		
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
			
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(2000);
		
		Set<String> win1 = driver.getWindowHandles();
		
		List <String> lis = new ArrayList<String>();
		
		lis.addAll(win1);
		driver.switchTo().window(lis.get(2));
		
		Alert a = driver.switchTo().alert();
		
		a.accept();
		
		findElement("//button[@class='wiz-primary-btn goi-it-btn']").click();
		
		driver.switchTo().window(lis.get(0));
		
		Alert a1 = driver.switchTo().alert();
		
		a1.dismiss();
	
		acc.moveToElement(el).click(el).build().perform();
		
		Set<String> win2 = driver.getWindowHandles();
		
		List <String> list = new ArrayList<String>();
		
		list.addAll(win2);
		driver.switchTo().window(lis.get(1));
		
		for(int i=0;i<4;i++)
		{
			r.keyPress(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_TAB);
		}
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		Thread.sleep(10000);
		
		WebElement stop = driver.findElement(By.id("stopRecording"));
		
		acc.moveToElement(stop).click(stop).build().perform();
		
		Thread.sleep(10000);
		
		
		driver.findElement(By.id("personlizationTab-heading")).click();
		driver.findElement(By.id("videoPersonalization")).click();
		
		driver.findElement(By.id("personalizeButton")).click();
		
		driver.findElement(By.id("saveSimpleEdit")).click();
		
		
		Thread.sleep(10000);
	}

}
