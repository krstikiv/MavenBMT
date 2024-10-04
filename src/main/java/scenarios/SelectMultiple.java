package scenarios;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SelectMultiple {
	WebDriver driver;
	@Test
	
	public void selectMultipleItems() {
		driver = new EdgeDriver();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		
		WebElement selectElement = driver.findElement(By.id("multiple-select-example"));
		Select select = new Select(selectElement);
		
		select.selectByIndex(2);
		select.selectByValue("apple");
        
		String option = select.getFirstSelectedOption().getText();
        
		AssertJUnit.assertEquals("Apple", option);
        
        driver.quit();
        }

	}
		
