package week3.day2.assign;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver(); 
		driver.get("https://www.ajio.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	//	driver.findElementByClassName("ic-close-quickview").click();
		driver.findElementByName("searchVal").sendKeys("Bags",Keys.ENTER);
		driver.findElementByTagName("label").click();
		Thread.sleep(5000);
		driver.findElementByXPath("//label[@class='facet-linkname facet-linkname-l1l3nestedcategory facet-linkname-Men - Fashion Bags'] ").click();
		System.out.println(driver.findElementByClassName("length").getText()); 
		List<WebElement> bagBrandList = driver.findElementsByXPath("//div[@class='brand']");
		for (WebElement webElement : bagBrandList) {
			System.out.println("Brand Names of the Bags : " +webElement.getText());
		}
		List<WebElement> bagnameList = driver.findElementsByXPath("//div[@class='name']");
			
			for (WebElement webElement2 : bagnameList) {
				System.out.println(" Names of the Bags : " + webElement2.getText());
					
			}
			
		driver.close();
	}
	}
	

