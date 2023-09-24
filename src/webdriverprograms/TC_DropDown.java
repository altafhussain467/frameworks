package webdriverprograms;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
public class TC_DropDown {
public static void main(String args[])throws Exception {
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://vectorstudents.appspot.com/login.jsp");
	driver.findElement(By.name("j_username")).sendKeys("v21oe4p4");
	Thread.sleep(3000);
	driver.findElement(By.name("j_password")).sendKeys("Altaf@6804");
	driver.findElement(By.xpath("/html/body/center/div/form/table/tbody/tr[4]/td/input[1]")).click();
	driver.findElement(By.linkText("View Attendance")).click();
	Thread.sleep(1000);
	Select st2=new Select(driver.findElement(By.id("module")));
	st2.selectByVisibleText("C");
	Thread.sleep(4000);
	st2.selectByVisibleText("Communication");
	Thread.sleep(4000);
	st2.selectByVisibleText("Aptitude");
	Thread.sleep(4000);
	driver.findElement(By.linkText("logout")).click();
	Thread.sleep(2000);
	driver.close();

}
}
