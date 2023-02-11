package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A2_EditLead {

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
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("company1");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Learning");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("SeleniumAutomation");
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("HydIdc");
		
		driver.findElement(By.name("departmentName")).sendKeys("QualityAssurance");
		
		driver.findElement(By.id("createLeadForm_description")).sendKeys("this is for learning purpose");
		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("ckrkanth413@gmail.com");
		
		WebElement StateProvinceDD = driver.findElement(By.name("generalStateProvinceGeoId"));
		
		Select SPDD = new Select(StateProvinceDD);

		SPDD.selectByVisibleText("New York");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Edit")).click();
		
		Thread.sleep(1500);
		
		driver.findElement(By.id("updateLeadForm_description")).clear();
		
		driver.findElement(By.name("importantNote")).sendKeys("editing the created Lead");
		
		driver.findElement(By.xpath("//*[@class='smallSubmit']")).click();
		
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
