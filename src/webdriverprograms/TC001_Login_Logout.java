package webdriverprograms;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
public class TC001_Login_Logout {
public static void main(String args[]) throws Exception {
	WebDriver driver= new ChromeDriver();
	Thread.sleep(3000);
	driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	Thread.sleep(3000);
	driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	Thread.sleep(3000);
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	Thread.sleep(3000);
	driver.findElement(By.name("Submit")).click();
	Thread.sleep(3000);
	System.out.println("Invalid password");
	driver.findElement(By.linkText("Logout")).click();
	Thread.sleep(3000);
	driver.close();
}
}

