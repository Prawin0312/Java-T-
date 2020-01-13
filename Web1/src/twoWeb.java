import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class twoWeb {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String username = sc.next();
		String password = sc.next();
		System.setProperty("webdriver.chrome.driver","C://Users//admin//Documents//selenium//chromedriver.exe");
		WebDriver ObjDriver =new ChromeDriver();
		ObjDriver.get("https://demo.opencart.com");
		System.out.println("page loaded");
		String var1 = ObjDriver.getTitle();
		System.out.println("Title of the page"+var1);
		WebElement obj1 =  ObjDriver.findElement(By.xpath("//html/body/footer/div/div/div[4]/ul/li[1]/a"));
		obj1.click();
		WebElement obj2 =  ObjDriver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/form/div[1]/input"));
		obj2.click();
		WebElement obj3 = ObjDriver.findElement(By.xpath("//*[@id=\"input-email\"]"));
		obj3.sendKeys(username);
		WebElement obj4 = ObjDriver.findElement(By.xpath("//*[@id=\"input-password\"]"));
		obj4.sendKeys(password);
		WebElement obj5 = ObjDriver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/form/input"));
		obj5.click();
		
		
		
		
		
		
		/*String var2 = ObjDriver.getTitle();
		System.out.println("Title of the page"  +var2);
		String var3="Deloitte US | Audit, Consulting, Advisory, and Tax Services";
		if(var2.equals(var3))
			System.out.println("equal");
		else
			System.out.println("errr");*/
		

	}

}
