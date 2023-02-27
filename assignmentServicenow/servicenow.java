package assignmentServicenow;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class servicenow {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://dev140572.service-now.com");
		driver.switchTo().frame(0);
		WebElement name=driver.findElement(By.id("user_name"));
		name.sendKeys("admin");
		WebElement pd=driver.findElement(By.id("user_password"));
		pd.sendKeys("P-qQ7@umSYz8");
		WebElement ab=driver.findElement(By.id("sysverb_login"));
		ab.click();
		WebElement ab1=driver.findElement(By.id("filter"));
		ab1.sendKeys("proposal");
		WebElement dag=driver.findElement(By.xpath("//div[text()='My Proposals']"));
		dag.click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		WebElement num=driver.findElement(By.xpath("//button[text()='New']"));
		num.click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		WebElement value=driver.findElement(By.id("std_change_proposal.short_description"));
		value.sendKeys("Raju");
		WebElement sub=driver.findElement(By.xpath("(//button[text()='Submit'])[1]"));
		sub.click();
		
		WebElement create=driver.findElement(By.xpath("//td[contains(text(),'Raju')]"));
		String ra=create.getText();
	String name2 = "Raju";
		if(ra.contains(name2)) {
			System.out.println("successfully created");
			
			
		}
	
		
}
}
