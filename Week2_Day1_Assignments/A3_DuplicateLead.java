package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A3_DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
ChromeDriver driver = new ChromeDriver();

		//enter url
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//maximize the browser window
		
		driver.manage().window().maximize();
		
		// locate username field and enter username
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
		//locate password field and enter password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//locate login button and click on login button
		driver.findElement(By.className("decorativeSubmit")).click();
		
		Thread.sleep(2000);
		
		//locate CRM/SFA link and click
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		Thread.sleep(2000);
		
		//locate Leads button and click
		driver.findElement(By.linkText("Leads")).click();
		
		Thread.sleep(2000);
		
		//locate CreateLead button and click
		driver.findElement(By.linkText("Create Lead")).click();
		
		Thread.sleep(2000);
		
		//Locate CompanyName field and enter value for companyName
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("company5");
		
		//Locate FirstName field and enter value for firstName
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Learnings");
		
		//Locate secondName field and enter value for secondName
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Selenium");
		
		//Locate FirstName(Local) field and enter value for FirstName(Local)
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("HydIdc");
		
		//Locate departmentName field and enter value for departmentName
		driver.findElement(By.name("departmentName")).sendKeys("QualityAssurance");
		
		//Locate description field and enter value for description
		driver.findElement(By.id("createLeadForm_description")).sendKeys("this is for learning purpose");
		
		//Locate emailID field and enter value for emailID
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("ckrkanth413@gmail.com");
		
		//Locate State/Province dropdown and assign it to a webElement
		WebElement StateProvinceDD = driver.findElement(By.name("generalStateProvinceGeoId"));
		
		//Create an Obect for Select Class
		Select SPDD = new Select(StateProvinceDD);
		
		//select the dropdown value by using selectByVisibleText method
		SPDD.selectByVisibleText("New York");
		
		//click on createLead button
		driver.findElement(By.className("smallSubmit")).click();
		
		Thread.sleep(2000);
		
		//Click on DuplicateLead button
		driver.findElement(By.linkText("Duplicate Lead")).click();
		Thread.sleep(2000);
		
		//Locate companyName and clear the existing value
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		
		//Locate companyName and enter value by using sendKeys 
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("company1");
		
		//Locate firstName and clear the existing value
		driver.findElement(By.id("createLeadForm_firstName")).clear();
	
		//Locate firstName and enter the value by using sendKeys
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Learn");
		
		//Locate and click on CreateLead button
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
