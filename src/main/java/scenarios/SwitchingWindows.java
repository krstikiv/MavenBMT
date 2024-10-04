package scenarios;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SwitchingWindows {

	WebDriver driver;
	@Test
	
	public void switchWin() {
		driver = new EdgeDriver();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("openwindow")).click();
		
		Object[]  windowHandles = driver.getWindowHandles().toArray();
		driver.switchTo().window((String) windowHandles[1]);
		
		driver.quit();
		
	}
}
