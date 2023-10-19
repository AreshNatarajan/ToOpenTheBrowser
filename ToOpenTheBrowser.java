package org.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


public class ToOpenTheBrowser {

	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.bing.com/search?q=amazon&cvid=179dd036b9784b56b1fd7cb0d64102a9&gs_lcrp=EgZjaHJvbWUqBAgBEC4yBggAEEUYOTIECAEQLjIECAIQLjIECAMQADIECAQQLjIECAUQADIECAYQADIECAcQADIECAgQANIBCDI1NTBqMGoxqAIAsAIA&FORM=ANAB01&PC=U531");
        WebElement textUserInput = driver.findElement(By.id("sb_form_q"));
        textUserInput.sendKeys("Amaxon prime");
        
	}

}
