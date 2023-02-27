package assignmentServicenow;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreatNewCaller {
	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://dev140572.service-now.com\r\n");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.switchTo().frame(0);
		WebElement val=driver.findElement(By.id("user_name"));
		val.sendKeys("admin");
		WebElement pd=driver.findElement(By.id("user_password"));
		pd.sendKeys("P-qQ7@umSYz8");
		WebElement ar=driver.findElement(By.id("sysverb_login"));
		ar.click();
		driver.switchTo().defaultContent();
		
 
		WebElement nex=driver.findElement(By.id("filter"));
		nex.sendKeys("All",Keys.ENTER);
		WebElement caller=driver.findElement(By.xpath("//div[text()='Callers']"));
		caller.click();
		driver.switchTo().defaultContent();

		
		driver.switchTo().frame(0);

		WebElement name=driver.findElement(By.xpath("//button[text()='New']"));
		name.click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		WebElement name1=driver.findElement(By.id("sys_user.first_name"));
		name1.sendKeys("Raju");
		WebElement name2=driver.findElement(By.id("sys_user.last_name"));
		name2.sendKeys("Daggupati");
		WebElement mailId=driver.findElement(By.id("sys_user.email"));
		
		mailId.sendKeys("daggupatiraju2001@gmail.com");
		WebElement mobile=driver.findElement(By.id("sys_user.phone"));
		mobile.sendKeys("iPhone");
		WebElement mobile2=driver.findElement(By.id("sys_user.mobile_phone"));
		mobile2.sendKeys("Vivo");
		WebElement send=driver.findElement(By.id("lookup.sys_user.title"));
		send.click();
		
		Set<String> windowHandle = driver.getWindowHandles();
		List<String> windowHandle1=new ArrayList<String>(windowHandle);
		driver.switchTo().window(windowHandle1.get(1));
		
		WebElement Ra=driver.findElement(By.linkText("Vice President"));
		Ra.click();
		
		Set<String> windowHandle2 = driver.getWindowHandles();
		List<String> windowHandle3=new ArrayList<String>(windowHandle2);
		driver.switchTo().window(windowHandle3.get(0));
		
		driver.switchTo().frame(0);
		WebElement Ra1=driver.findElement(By.id("sysverb_insert_bottom"));
		Ra1.click();
		
		WebElement sucessfull=driver.findElement(By.xpath("//div[@class='outputmsg_text']"));
		System.out.println(sucessfull.getText());

	}



	}


