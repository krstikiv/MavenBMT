package scenarios;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Checkboxes {
	WebDriver driver;
	@Test
	public void multipleCheckboxes() {
		
		
		driver = new EdgeDriver();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		
		WebElement bmwcheck = driver.findElement(By.id("bmwcheck"));
		bmwcheck.click();
		
		WebElement hondacheck = driver.findElement(By.id("hondacheck"));
		hondacheck.click();
		
		AssertJUnit.assertEquals(bmwcheck.isSelected(), true);
		
		AssertJUnit.assertEquals(hondacheck.isSelected(), true);
		
		driver.quit();
		
	}
}
