package com.example.demo.sampletesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task4 {

	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
    	WebDriver driver = new EdgeDriver();
		driver.get ("https://www.amazon.in/");
		driver.manage().window().maximize() ;
		String currentTitle=driver.getTitle();
		System.out.println(currentTitle);
		String expectedTitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		if(currentTitle.equals(expectedTitle)) {
			System.out.println("Matched");
		}
		else {
			System.out.println("Not Matched");
		}
		driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]")).click();
		WebElement txtBoxl=driver.findElement(By.xpath("//*[@id=\"ap_email\"]"));
		txtBoxl.sendKeys("8667230378");
		driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
		WebElement txtBox2=driver.findElement(By.xpath("//*[@id=\"ap_password\"]"));
		txtBox2.sendKeys("rajamalar.11");
		driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[2]/div/div[2]/div[1]/a/div/div")).click();
		driver.findElement(By.xpath("//*[@id=\"a-autoid-2-announce\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"ordersInPackage-container\"]/div/div/a[1]")).click();
	}
}
