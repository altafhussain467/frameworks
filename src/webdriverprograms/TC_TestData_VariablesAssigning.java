package webdriverprograms;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
public class TC_TestData_VariablesAssigning{
	static String url="http://183.82.103.245/nareshit/login.php";
	static String username="nareshit";
	static String password="nareshit";
	static String title1="OrangeHRM - New Level of HR Management";
	static String title2="OrangeHRM";
public static void main(String args[]) throws Exception{
	WebDriver driver = new ChromeDriver();
	driver.navigate().to(url);
	Thread.sleep(3000);
	System.out.println("Application opened");
	if(driver.getTitle().equals(title1)) {
		System.out.println("title is matched");
	}
	else {
		System.out.println("title is not matched");
	System.out.println(driver.getTitle());
	}
	driver.findElement(By.name("txtUserName")).sendKeys(username);
	Thread.sleep(3000);
	driver.findElement(By.name("txtPassword")).sendKeys(password);
	Thread.sleep(3000);
	driver.findElement(By.name("Submit")).click();
	Thread.sleep(3000);
	if(driver.getTitle().equals(title2)) {
		System.out.println("title is matched");
	}
	else {
		System.out.println("title is not matched");
		System.out.println(driver.getTitle());
	}
	driver.findElement(By.xpath("/html/body/div[4]/ul/li[9]/a/span")).click();
	Thread.sleep(3000);
	driver.findElement(By.className("formpage")).sendKeys("altafh467@gmail.com");
	Thread.sleep(3000);
	driver.findElement(By.id("txtDescription")).sendKeys("Automation Testing by using selenium");


	driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/form/select[1]")).click();
}
}
