package web;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto {
	public void demo(){
		 Properties objprop = new Properties();
			try {
				objprop.load(new FileInputStream("C://Users//admin//workspace//web2//src//data1.properties"));
			} catch (FileNotFoundException e1) {
				
				e1.printStackTrace();
			} catch (IOException e2) {
				
				e2.printStackTrace();
			}
			System.out.println("login name"+ objprop.getProperty("login2"));
			System.out.println("password"+ objprop.getProperty("pwd2"));

			System.setProperty("webdriver.chrome.driver","C://Users//admin//Documents//selenium//chromedriver.exe");
			WebDriver objDriver = new ChromeDriver();
			objDriver.get("http://demo.automationtesting.in/SignIn.html");
			WebElement obj3=objDriver.findElement(By.xpath("/html/body/div/div/div[2]/input"));
			obj3.sendKeys(objprop.getProperty("login2"));
			WebElement obj4=objDriver.findElement(By.xpath("/html/body/div/div/div[3]/input"));
			obj4.sendKeys(objprop.getProperty("pwd2"));
			WebElement obj5=objDriver.findElement(By.xpath("/html/body/div/div/div[4]/a/img"));
			obj5.click();
	}

}
