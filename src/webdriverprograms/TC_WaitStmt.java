package webdriverprograms;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class TC_WaitStmt {
	public static void main(String args[])throws Exception{
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://vectorstudents.appspot.com/login.jsp");
		driver.findElement(By.name("j_username")).sendKeys("v21oe4p4");
		driver.findElement(By.name("j_password")).sendKeys("Altaf@6804");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(4));
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("/html/body/center/div/form/table/tbody/tr[4]/td/input[1]"))));
		driver.findElement(By.xpath("/html/body/center/div/form/table/tbody/tr[4]/td/input[1]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		System.out.println("logon completed");
		Thread.sleep(3000);
		driver.close();
		
	}

}
