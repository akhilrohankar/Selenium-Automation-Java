package mousehoverradiobutton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\akhil\\AutomationRequirements\\WebDrivers\\ChromeDriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		WebElement elementElectronics = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a"));
		WebElement elementSearchBox = driver.findElement(By.xpath("//*[@id=\"gh-ac\"]"));
		Actions actions = new Actions(driver);
		actions.moveToElement(elementElectronics).perform();
		actions.contextClick(elementSearchBox).perform();
	}

}
