package reusableComponents;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.aventstack.extentreports.ExtentReports;

import io.cucumber.core.logging.Logger;
import utility.ExtentRep;

public class Base {
	
	ExtentRep rep = new ExtentRep();
	public static WebDriver driver;
	public Properties prop;
	public FileInputStream fis;
	public Logger log;
	public ExtentReports extent;
	
	public WebDriver initialize() throws IOException {
		
		extent = rep.extentReport();
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notifications");
		driver = new ChromeDriver(op);
		prop = new Properties();
		fis = new FileInputStream("./src/test/java/reusableComponents/reuse.properties");
		prop.load(fis);
		driver.manage().window().maximize();
		
		return driver;
	}
}
