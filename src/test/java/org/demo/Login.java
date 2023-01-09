package org.demo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	
	@Parameters({"userName","password"})
	@Test
	public void loginData(String s1,String s2) {
		
		WebDriverManager.chromedriver().setup();
		
		
		WebDriver  driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement txtUser = driver.findElement(By.id("email"));
		txtUser.sendKeys(s1);
		WebElement txtPassword = driver.findElement(By.id("pass"));
		txtPassword.sendKeys(s2);
		WebElement btnLogin = driver.findElement(By.name("login"));
		btnLogin.click();
		
		driver.quit();
	
	}

}
