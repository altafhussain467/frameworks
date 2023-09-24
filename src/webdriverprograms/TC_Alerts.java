package webdriverprograms;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
public class TC_Alerts {
public static void main(String args[]) throws Exception {
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://vectorstudents.appspot.com");
	driver.findElement(By.name("j_username")).sendKeys("v21oe4p4");
	driver.findElement(By.xpath("/html/body/center/div/form/table/tbody/tr[4]/td/input[1]")).click();
	Thread.sleep(4000);
	Alert a=driver.switchTo().alert();
	System.out.println(a.getText());
	a.accept();
	Thread.sleep(4000);
	driver.findElement(By.name("j_password")).sendKeys("Altaf@6804");
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/center/div/form/table/tbody/tr[4]/td/input[1]")).click();
    Thread.sleep(3000);
    System.out.println("Login completed");
	driver.findElement(By.linkText("logout")).click();
	System.out.println("Logout completed");
	driver.close();
}
}
