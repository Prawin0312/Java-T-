package web;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Openc {	
	public void Cart() {
		Properties objprop = new Properties();
		try {
			objprop.load(new FileInputStream("C://Users//admin//workspace//web2//src//data1.properties"));
		} catch (FileNotFoundException e1) {

			e1.printStackTrace();
		} catch (IOException e2) {

			e2.printStackTrace();
		}
		System.out.println("login name"+ objprop.getProperty("login1"));
		System.out.println("password"+ objprop.getProperty("pwd1"));

		System.setProperty("webdriver.chrome.driver","C://Users//admin//Documents//selenium//chromedriver.exe");
		WebDriver objDriver = new ChromeDriver();
		objDriver.get("https://demo.opencart.com/");
		System.out.println("Open opencart page loaded");
		String var1 = objDriver.getTitle();
		System.out.println("Title of the page"+var1);
		WebElement obj1=objDriver.findElement(By.xpath("//html/body/footer/div/div/div[4]/ul/li[1]/a"));
		obj1.click();
		WebElement obj3=objDriver.findElement(By.xpath("//*[@id=\"input-email\"]"));
		obj3.sendKeys(objprop.getProperty("login1"));
		WebElement obj4=objDriver.findElement(By.xpath("//*[@id=\"input-password\"]"));
		obj4.sendKeys(objprop.getProperty("pwd1"));
		WebElement obj5=objDriver.findElement(By.xpath("//html/body/div[2]/div/div/div/div[2]/div/form/input"));
		obj5.click();
		//WebElement obj6=objDriver.findElement(By.xpath("//html/body/div[2]/div/div/div/div[2]/div/form/div[2]/a"));
		//obj6.click();
		if(objDriver.findElement(By.xpath("//html/body/div[2]/div[1]")).isDisplayed()){
			WebElement obj7=objDriver.findElement(By.xpath("//html/body/div[2]/div[1]"));
			System.out.println(obj7.getText());
		}
		try {
			Thread.sleep(5000);
		}
		catch(InterruptedException e1)
		{
			e1.printStackTrace();
		}
		objDriver.quit();
	}



}
