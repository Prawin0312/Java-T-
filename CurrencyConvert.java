import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CurrencyConvert {

	public static void main(String[] args) {		
		System.setProperty("webdriver.chrome.driver","C://Users//admin//Documents//selenium//chromedriver.exe");
		WebDriver ObjDriver = new ChromeDriver();
		ObjDriver.get("https://demo.opencart.com/");
		WebElement obj1 =  ObjDriver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div/div[3]/button[1]"));
		obj1.click();
		WebElement obj2 =  ObjDriver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[4]/a/i"));
		obj2.click();
		WebElement obj3 =  ObjDriver.findElement(By.xpath("/html/body/div[2]/div[2]/div/form/div/table/tbody/tr/td[5]"));
	    System.out.println(obj3.getText());
	    String str = obj3.getText();
	    str = str.substring(1);
	    Double Amt = Double.parseDouble(str);
	    System.out.println(Amt*70+" rupees");
	    WebElement obj4 =  ObjDriver.findElement(By.xpath("/html/body/nav/div/div[1]/form/div/button"));
	    obj4.click();
	    WebElement obj5 =  ObjDriver.findElement(By.xpath("/html/body/nav/div/div[1]/form/div/ul/li[1]/button"));
	    obj5.click();
	    WebElement obj6 =  ObjDriver.findElement(By.xpath("/html/body/div[2]/div[2]/div/form/div/table/tbody/tr/td[5]"));
	    System.out.println(obj6.getText());
	    
	    
	}

}
