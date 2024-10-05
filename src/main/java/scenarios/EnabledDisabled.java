package scenarios;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class EnabledDisabled {
	
	WebDriver driver;
	@Test
	public void checkDisabled() {
		driver = new EdgeDriver();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		
		
		WebElement disabledButton = driver.findElement(By.id("disabled-button"));
		disabledButton.click();
		
		WebElement checkDisabledInput = driver.findElement(By.id("enabled-example-input"));
		
		assertEquals(checkDisabledInput.isEnabled(), false);
		
		driver.quit();
	}
	
	@Test
	public void checkEnabled() throws InterruptedException {
		driver = new EdgeDriver();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		
		
		WebElement enabledButton = driver.findElement(By.id("enabled-button"));
		enabledButton.click();
		
		WebElement checkEnabledInput = driver.findElement(By.id("enabled-example-input"));
		
		assertEquals(checkEnabledInput.isEnabled(), true);
		

		
		String inputTerm = "Selenium";
		
		checkEnabledInput.click();
		checkEnabledInput.sendKeys(inputTerm);
		
		String result = checkEnabledInput.getAttribute("value");
		
		assertEquals(result, inputTerm);
		
		//Thread.sleep(3000);
		
		driver.quit();
	}

}
