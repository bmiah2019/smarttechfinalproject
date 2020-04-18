package codes;

import java.util.ArrayList;
import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class finalproject {
	static WebDriver driver;
	static WebDriverWait wait;
	
	
public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		// Initalize browser
		driver = new ChromeDriver();
		wait= new WebDriverWait (driver,10);
		
		// Open AutomationPractice
		driver.get("http://Automationpractice.com/index.php");
		
		// Maximize Browser
		driver.manage().window().maximize();
		
		// go to sign in and click it
		WebElement login= driver.findElement(By.xpath("//*[@class='login']"));
		login.click();
		
		
		// put user name and password then click it
		WebElement email= driver.findElement(By.xpath("(//*[@name='email'])[1]"));
		email.sendKeys("zsean1300@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("//*[@type='password']"));
				password.sendKeys("newyork2020");
		
		WebElement submit=driver.findElement(By.xpath("(//*[@type='submit'])[3]"));
				submit.click();
		
		String title= driver.getTitle();
		System.out.println(title);
		
		String titleexpected= "My account - My Store";
		Assert.assertEquals(titleexpected, title);
		
		
		WebElement dress= driver.findElement(By.xpath("(//*[@title='Dresses'])[2]"));
		wait.until(ExpectedConditions.elementToBeClickable(dress));
		dress.click();
		
		WebElement price1= driver.findElement(By.xpath("(//*[@class='price product-price'])[2]"));
		WebElement price2= driver.findElement(By.xpath("(//*[@class='price product-price'])[4]"));
		WebElement price3= driver.findElement(By.xpath("(//*[@class='price product-price'])[6]"));
		WebElement price4= driver.findElement(By.xpath("(//*[@class='price product-price'])[8]"));
		WebElement price5= driver.findElement(By.xpath("(//*[@class='price product-price'])[10]"));
		
		ArrayList<String> price = new ArrayList<String>();
		price.add(price1.getText());
		price.add(price2.getText());
		price.add(price3.getText());
		price.add(price4.getText());
		price.add(price5.getText());
		
		for (String p: price) {
			System.out.println("Prices in unsorted order: " + p);
			
		}
		
		Collections.sort(price, Collections.reverseOrder());
		
		for(String p: price) {
			System.out.println("Desending order: " + p);
			
		}
		
		Actions builder =new Actions (driver);
		WebElement dress2=driver.findElement(By.xpath("(//*[@class='right-block'])[2]"));
		builder.moveToElement(dress2).perform();
		
		WebElement cart= driver.findElement(By.xpath("(//*[@class='button ajax_add_to_cart_button btn btn-default'])[2]"));
		cart.click();
		
		WebElement checkout= driver.findElement(By.xpath("(//*[@class='icon-chevron-right right'])[2]"));
		wait.until(ExpectedConditions.elementToBeClickable(checkout));
		checkout.click();
		
		WebElement totalprice= driver.findElement(By.xpath("//*[@id='total_price']"));
		
		String finalprice= totalprice.getText();
		System.out.println("Total price with shipping: "+ finalprice);
		String expectedfinalprice= "$52.99";
		Assert.assertEquals(expectedfinalprice, finalprice);
		
		WebElement logout= driver.findElement(By.xpath("//*[@class='logout']"));
		logout.click();
		
		driver.close();
		
		
		
}


}