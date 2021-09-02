package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Example {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver","C:\\Windows\\chromedriver.exe");
		 
		 
	  WebDriver d1;
	  
	  d1=new ChromeDriver();
	  
	  
	  d1.get("http://www.leafground.com/pages/Button.html");
	  
	  d1.findElement(By.id("home")).click();
	  
	  
	  
	  
	  
}
}
  

  
