package webdriverprograms;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
public class TC_Verify {
public static void main(String args[]) throws Exception{
	WebDriver driver = new ChromeDriver();
	Thread.sleep(3000);
	driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	Thread.sleep(3000);
	System.out.println("Application opened");
	if(driver.getTitle().equals("OrangeHRM - New Level of HR Management")) {
		System.out.println("title is matched");
		System.out.println(driver.getTitle());
	}
	else
		System.out.println("title is not matched");
	driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	Thread.sleep(3000);
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	Thread.sleep(3000);
	driver.findElement(By.name("Submit")).click();
	Thread.sleep(3000);
	System.out.println("Login Successful,Employee information page is displayed");
	if(driver.getTitle().equals("OrangeHRM")) {
		System.out.println("Title is matched");	
	}
	else {
		System.out.println("title is not matched");
		System.out.println(driver.getTitle());
	}
	Thread.sleep(3000);
	driver.findElement(By.linkText("Logout")).click();
	Thread.sleep(3000);
	driver.close();
}
}
