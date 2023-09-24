package webdriverprograms;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import java.awt.Robot;
import java.awt.event.KeyEvent;
public class Tc_KeyBoardActions {
	public static void main(String args[]) throws Exception{
WebDriver driver=new ChromeDriver();
driver.navigate().to("https://vectorstudents.appspot.com/login.jsp");
driver.findElement(By.name("j_username")).sendKeys("v21oe4p4");
Thread.sleep(3000);
driver.findElement(By.name("j_password")).sendKeys("Altaf@6804");
Thread.sleep(3000);
Robot r=new Robot();
r.keyPress(KeyEvent.VK_TAB);
Thread.sleep(4000);
r.keyRelease(KeyEvent.VK_TAB);
System.out.println("tab action performed");
r.keyPress(KeyEvent.VK_ENTER);
Thread.sleep(4000);
r.keyRelease(KeyEvent.VK_ENTER);
Thread.sleep(3000);
System.out.println("Login completed");
driver.findElement(By.linkText("logout")).click();
Thread.sleep(3000);
driver.close();
}
}