package OtherTasks;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();

		chromeOptions.addArguments("--remote-allow-origins=*", "ignore-certificate-errors");
		WebDriver driver = new ChromeDriver(chromeOptions);

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10));

		// Alert window with ok button
		driver.findElement(By.xpath("//div/ul/li[1]/button")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();

		// Alert window with ok and cancel button
		driver.findElement(By.xpath("//div/ul/li[2]/button")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
		
		//Alert window with input box, capture text from alert
		driver.findElement(By.xpath("//div/ul/li[3]/button")).click();
		Thread.sleep(2000);
		
		Alert alertWindow =driver.switchTo().alert();
		System.out.println(alertWindow.getText());
		
		alertWindow.sendKeys("Welcome prince");
		alertWindow.accept();
		
	}

}
