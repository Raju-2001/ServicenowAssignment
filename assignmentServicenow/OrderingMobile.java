package assignmentServicenow;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OrderingMobile {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://dev140572.service-now.com\r\n");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.switchTo().frame(0);
		
		
		WebElement UserName =driver.findElement(By.id("user_name"));
		UserName.sendKeys("admin");
		
		WebElement Password=driver.findElement(By.id("user_password"));
		Password.sendKeys("P-qQ7@umSYz8");
		
		WebElement Login = driver.findElement(By.id("sysverb_login"));
		Login.click();
		
		driver.switchTo().defaultContent();
		
		WebElement filter = driver.findElement(By.id("filter"));
		filter.sendKeys("Service Catalog");
		
		Thread.sleep(3000);
		WebElement serachbox = driver.findElement(By.xpath("//div[text()='Service Catalog']"));
		serachbox.click();
		
		WebElement frame = driver.findElement(By.id("gsft_main"));
		driver.switchTo().frame(frame);
		
		WebElement mobile = driver.findElement(By.xpath("//h2[contains(text(),'Mobiles')]"));
		mobile.click();
		
		WebElement phone = driver.findElement(By.tagName("strong"));
		phone.click();
		
		WebElement color = driver.findElement(By.xpath("//select[@class='form-control cat_item_option ']"));
		Select down = new Select(color);
		down.selectByVisibleText("Gold");

		WebElement rom = driver.findElement(By.xpath("(//select[@class='form-control cat_item_option '])[2]"));
		Select drop = new Select(rom);
		drop.selectByVisibleText("128");
		
		WebElement order = driver.findElement(By.id("oi_order_now_button"));
		order.click();
		
		WebElement message = driver.findElement(By.xpath("(//div[@class='notification notification-success'])//span"));
		String text3 = message.getText();
		System.err.println(text3);
		
		WebElement verify = driver.findElement(By.xpath("(//dl[@class='dl-horizontal sc-dl-horizontal'])//dd"));
		String text = verify.getText();
		System.out.println("The Order is placed :"+text);
		
		WebElement requestnum = driver.findElement(By.id("requesturl"));
		String text2 = requestnum.getText();
		System.out.println("The reqest Number is :"+text2);
		
		
	}

}
