package mousehoverradiobutton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\akhil\\AutomationRequirements\\WebDrivers\\ChromeDriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.singaporeair.com/en_UK/in/home#/book/bookflight");
		driver.manage().window().maximize();
		WebElement rbBookFlights = driver.findElement(By.xpath("//*[@id=\"bookFlights\"]"));
		WebElement rbRedeemFlights = driver.findElement(By.xpath("//*[@id=\"redeemFlights\"]"));
		rbRedeemFlights.click();
		System.out.println(rbBookFlights.isSelected());
		System.out.println(rbRedeemFlights.isSelected());
	}

}
