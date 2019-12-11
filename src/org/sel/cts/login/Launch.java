package org.sel.cts.login;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Launch {
	
	
public static void main(String[] args) throws AWTException, InterruptedException, IOException  {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();

driver.get(" http://www.greenstechnologys.com/");
WebElement txt=driver.findElement(By.xpath("//a[text()='CONTACT US']"));
Actions acc=new Actions(driver);
acc.contextClick(txt).perform();
Robot r=new Robot();
r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);
r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);
r.keyPress(KeyEvent.VK_ENTER);
r.keyRelease(KeyEvent.VK_ENTER);
int count=0;
Set<String>si=driver.getWindowHandles();
for (String s : si) {
	if(count==1);
	{
		driver.switchTo().window(s);
		
	}
	count++;
}

WebElement txt1=driver.findElement(By.xpath("(//div[@class='address-block address-border'])[2]"));
String text=txt1.getText();
System.out.println(text);

}

}









