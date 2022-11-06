package screenshot;
import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
public class CaptureScreenshot
{

	public static void main(String[] args) throws IOException{
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\akhil\\AutomationRequirements\\WebDrivers\\ChromeDriver.exe");
		ChromeDriver driver = new ChromeDriver();
		Date currentdate = new Date();
		System.out.println(currentdate);
		String screenshotfilename = "Screenshot-"+currentdate.toString().replace(" ","-").replace(":","-");
		System.out.println(screenshotfilename);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile,new File(".//screenshot//"+screenshotfilename+".png"));
		driver.close();
	}

}
