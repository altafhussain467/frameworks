package webdriverprograms;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
public class TC_Frames {
public static void main(String args[]) throws Exception {
	WebDriver driver=new ChromeDriver();
	Thread.sleep(2000);
	driver.navigate().to("http://183.82.103.245/nareshit/index.php");
	Thread.sleep(3000);
	driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	Thread.sleep(3000);
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	Thread.sleep(3000);
	driver.findElement(By.name("Submit")).click();
	System.out.println("Login Successful");
	Thread.sleep(3000);
	Actions ac = new Actions(driver);
	ac.moveToElement(driver.findElement(By.xpath("//*[@id=\"bug\"]/a/span"))).perform();
	driver.findElement(By.xpath("//*[@id=\"bug\"]/a/span")).click();
	System.out.println("Bug Tracker Module is Opened");
	Thread.sleep(3000);
	driver.switchTo().frame("rightMenu");
	driver.findElement(By.name("category_id")).sendKeys("Interface");
	Thread.sleep(3000);
	driver.findElement(By.name("cmbModule")).sendKeys("PIM");
	Thread.sleep(3000);
	driver.findElement(By.id("priority")).sendKeys("4");
	Thread.sleep(3000);
	driver.findElement(By.id("summary")).sendKeys("Bug Reporting");
	Thread.sleep(3000);
	driver.findElement(By.name("txtEmail")).sendKeys("altafh467@gmail.com");
	Thread.sleep(3000);
	driver.findElement(By.name("txtDescription")).sendKeys("Bug Reporting is Done");
	Thread.sleep(3000);
     System.out.println("Bug Reporting is Completed ");
	driver.switchTo().defaultContent();
	driver.findElement(By.linkText("Logout")).click();
	System.out.println("Logout is Successful");
	Thread.sleep(3000);
	driver.close();
	
	
}
}
