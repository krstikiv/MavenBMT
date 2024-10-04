package scenarios;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AutoSuggestSearch {
	WebDriver driver;
	WebDriverWait wait;
	@Test
	public void autoSuggestSearch() throws InterruptedException {
		
		
		driver = new EdgeDriver();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		
		String expectedSearchTerm = "Selenium";
		WebElement autoSuggestionInput = driver.findElement(By.id("autosuggest"));
		
		autoSuggestionInput.clear();
		autoSuggestionInput.sendKeys(expectedSearchTerm);
		
		Thread.sleep(1000);

		autoSuggestionInput.sendKeys(Keys.ARROW_DOWN);
		autoSuggestionInput.sendKeys(Keys.ENTER);
		
		
		String autoSuggetionSelection = autoSuggestionInput.getAttribute("value");
		System.out.println("Selected value is: " + autoSuggetionSelection);
		
		
		AssertJUnit.assertEquals(autoSuggetionSelection, "Selenium WebDriver Java");
		
		
		driver.quit();
		
	}
}
