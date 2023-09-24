package webdriverprograms;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import java.util.ArrayList;
public class TC_JSE {
public static void main(String args[])throws Exception {
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("C:\\Eclipse\\Selenium_Batch37\\src\\webdriverprograms");
	Thread.sleep(3000);
	driver.findElement(By.id("btn2")).click();
	driver.findElement(By.id("btn3")).click();
	ArrayList<String> windinfo = new ArrayList<>(driver.getWindowHandles());
	driver.switchTo().window(windinfo.get(0));
	driver.close();
}
}