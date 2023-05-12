package ICC_Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ICC_Base {
	public static WebDriver driver;
	public static Properties prop;

	
	public void initialization() throws IOException {
		FileInputStream fs;
		try {
			fs = new FileInputStream("D:\\WorkSpace\\QA_Practices_Projects\\src\\test\\java\\ICC_Base\\url.properties");
			prop = new Properties();
			prop.load(fs);
			
			// setup the webBrowser driver
			WebDriverManager.chromedriver().setup();

			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("--remote-allow-origins=*", "ignore-certificate-errors");
			driver = new ChromeDriver(chromeOptions);
			driver.manage().window().maximize();
			driver.get(prop.getProperty("url"));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		}catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public void terminate() {
		driver.quit();
		
	}

}
