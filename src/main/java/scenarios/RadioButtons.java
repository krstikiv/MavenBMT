package scenarios;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class RadioButtons {
	
	WebDriver driver;
	@Test
	
	public void selectRdButtons() {
		
		driver = new EdgeDriver();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		
		WebElement bmw = driver.findElement(By.id("bmwradio"));
		bmw.click();
		
		boolean bmwcheck = bmw.isSelected();
		
		assertEquals(bmwcheck, true);
		
		driver.quit();
		
	}

}
