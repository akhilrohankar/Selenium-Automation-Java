package printalllimks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllLinks
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\akhil\\AutomationRequirements\\WebDrivers\\ChromeDriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		List<WebElement>alltags = driver.findElements(By.tagName("a"));
		System.out.println("Total links = "+alltags.size());
		for(int i=0;i<alltags.size();i++) {
			//System.out.println(alltags);
			//System.out.println("Links on page - "+alltags.get(i).getAttribute("href"));
			//System.out.println("Text of the Links on this page - "+alltags.get(i).getText());
		}
	}

}
