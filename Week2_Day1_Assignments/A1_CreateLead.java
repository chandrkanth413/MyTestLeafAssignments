package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A1_CreateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		Thread.sleep(2000);
	
		driver.findElement(By.linkText("Leads")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("company5");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Learnings");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Selenium");
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("HydIdc");
		
		driver.findElement(By.name("departmentName")).sendKeys("QualityAssurance");
		
		driver.findElement(By.id("createLeadForm_description")).sendKeys("this is for learning purpose");
		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("ckrkanth413@gmail.com");
		
		WebElement StateProvinceDD = driver.findElement(By.name("generalStateProvinceGeoId"));
		
		Select SPDD = new Select(StateProvinceDD);

		SPDD.selectByVisibleText("New York");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		Thread.sleep(2000);
		
		String pgTitle = driver.getTitle();
		
		System.out.println(pgTitle);
		
		if(pgTitle.contains("View Lead | opentaps CRM")) {
			
			System.out.println("page title validation is pass");
		}
		
		else {
			System.out.println("page title validation is fail");
		}
		
		
	}

}
