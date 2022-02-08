package jan30week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
ChromeDriver driver=new ChromeDriver();
driver.get("https://en-gb.facebook.com/");
driver.manage().window().maximize();
driver.findElement(By.linkText("Create New Account")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("brindha");
driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("devi");
driver.findElement(By.xpath("(//input)[11]")).sendKeys("brindha@gmail.com");
driver.findElement(By.xpath("(//input)[13]")).sendKeys("1234567");
driver.findElement(By.xpath("(//input)[12]")).sendKeys("brindha@gmail.com");

WebElement day = driver.findElement(By.id("day"));
Select dd=new Select(day);
dd.selectByVisibleText("23");

WebElement month = driver.findElement(By.id("month"));
Select dd1=new Select(month);
dd1.selectByValue("8");

WebElement year = driver.findElement(By.id("year"));
Select dd2=new Select(year);
dd2.selectByVisibleText("1991");
driver.findElement(By.xpath("(//input)[16]")).click();
driver.findElement(By.xpath("//button[@name='websubmit']")).click();
driver.close(); 

/*
 * WebElement sex = driver.findElement(By.name("sex")); Select dd3=new
 * Select(sex); dd3.selectByValue("1");
 */




}
}
