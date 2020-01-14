package web2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Blinktwo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://Users//admin//Documents//selenium//chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/");
		WebElement username= driver.findElement(By.name("search"));
		highLightElement(driver,username);
	}
	public static void highLightElement(WebDriver driver,WebElement element)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('style',"  + " 'background:yellow;border:2px solid red;');", element);
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e){
			System.out.println(e.getMessage());
		}
		js.executeScript("arguments[0].setAttribute('style',"  + " 'background:yellow;border:solid 2px white');",element);
	}

}

