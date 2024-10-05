package scenarios;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class HiddenDisplayedElement {
	WebDriver driver;
	@Test
	public void hiddenElement() {
		driver = new EdgeDriver();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("hide-textbox")).click();
		WebElement textBox = driver.findElement(By.id("displayed-text"));
		
		assertEquals(textBox.isDisplayed(), false);
		
		driver.quit();
	}
	
	@Test
	public void showElement() {
		driver = new EdgeDriver();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("show-textbox")).click();
		WebElement textBox = driver.findElement(By.id("displayed-text"));
		
		assertEquals(textBox.isDisplayed(), true);
		
		String inputTerm = "Selenium";
		
		textBox.click();
		textBox.sendKeys(inputTerm);
		
		String result = textBox.getAttribute("value");
		
		assertEquals(result, inputTerm);
		
		driver.quit();
	}
}
