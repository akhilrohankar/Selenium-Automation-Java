package kerboardevent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardEvent
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\akhil\\AutomationRequirements\\WebDrivers\\ChromeDriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://extendsclass.com/text-compare");
		driver.manage().window().maximize();
		
		WebElement sourceArea = driver.findElement(By.xpath("//div[@class='row-container editor-container']"));
		Actions action = new Actions(driver);
		action.keyDown(sourceArea, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
		Thread.sleep(4000);
		
		WebElement destinationArea = driver.findElement(By.xpath("//*[@id=\"dropZone2\"]/div[2]"));
		action.keyDown(destinationArea,Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();
		System.out.println("Done");
	}
}
