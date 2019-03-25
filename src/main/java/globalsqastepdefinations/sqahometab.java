package globalsqastepdefinations;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class sqahometab {
	WebDriver driver;
	@Given("^User is on the web Page$")
	public void user_is_on_the_web_Page()  {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "D:\\softwares\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://www.globalsqa.com/");
		driver.manage().window().maximize(); 
	}

	@When("^verify the title of the globalsqa webpage$")
	public void verify_the_title_of_the_globalsqa_webpage()  {
	    //Write code here that turns the phrase above into concrete actions
	String title = driver.getTitle();
		  System.out.println("Title is "+ title);
			//assertEquals("Online Manual, Functional & Automation Testing – Globalsqas", title);
			
}


	@Then("^clcik on the home tab$")
	public void clcik_on_the_home_tab() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
		Thread.sleep(3000);
		/*JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,2000)");
		 Thread.sleep(4000);
		driver.findElement(By.xpath("//h3[contains(text(),'Manual Testing Training')]")).click();
	   */
	}
	
	@Then("^click on the contactus tab$")
	public void click_on_the_contactus_tab() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions

		driver.findElement(By.xpath("//div[@class='menu-custom-main-menu-container']//a[contains(text(),'Contact Us')]")).click();
		Thread.sleep(3000); 
	    	}
	
	
	  @And("^verify the functionality by click on sub menu our process$")
	    public void verify_the_functionality_by_click_on_sub_menu_our_process()  {
		  		
			Actions action = new Actions(driver);
			WebElement we = driver.findElement(By.xpath("//a[contains(text(),'About Us')]"));
			action.moveToElement(we).moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Our process')]"))).click().build().perform();

	  }
	  @Then("^verify the functionality by click on sub menu Reviews$")
	    public void verify_the_functionality_by_click_on_sub_menu_reviews()  {
		  Actions action = new Actions(driver);
			WebElement we = driver.findElement(By.xpath("//a[contains(text(),'About Us')]"));
			action.moveToElement(we).moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Reviews')]"))).click().build().perform();

	        
	    }

	    @Then("^verify the functionality by click on sub menu carrers$")
	    public void verify_the_functionality_by_click_on_sub_menu_carrers()  {
	    	Actions action = new Actions(driver);
			WebElement we = driver.findElement(By.xpath("//a[contains(text(),'About Us')]"));
			action.moveToElement(we).moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Careers')]"))).click().build().perform();

	       
	    }
	  
	  @Then("^verify the functionality by click on sub menu mission and values$")
	    public void verify_the_functionality_by_click_on_sub_menu_mission_and_values()  {
	            Actions action = new Actions(driver);
			WebElement we = driver.findElement(By.xpath("//a[contains(text(),'About Us')]"));
			action.moveToElement(we).moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Mission and values')]"))).click().build().perform();

	    }

	   	//driver.findElement(By.name("contact[contact_fields_attributes][1016375][value]")).sendKeys(arg1);
		
		
		/*driver.switchTo().frame("google_shimpl");
		WebElement login = driver.findElement(By.name("contact[contact_fields_attributes][1016375][value]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].sendKeys(arg1);", login);
		driver.findElement(By.xpath("//*[@id=\"custom_field_submit_1016376\"]")).click();*/
	
	  @And("^verify the functionality by click on tooltip option avilable under submenu demotesting$")
	    public void verify_the_functionality_by_click_on_tooltip_option_avilable_under_submenu_demotesting() throws InterruptedException  {
	        
			WebElement we = driver.findElement(By.xpath("//a[contains(text(),'Tester’s Hub')]"));
			new Actions(driver).moveToElement(we).perform();
			WebElement demotestingsite = new WebDriverWait(driver,5).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Demo Testing Site')]")));
			new Actions(driver).moveToElement(demotestingsite).perform();
			WebElement tootip = new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Tooltip')]")));
			Thread.sleep(3000); 
			tootip.click();
			
	  }
	  
	  
	  
	  /*@And("^verify the functionality by click on sub menu Demo testing site and submenu tooltip$")
	    public void verify_the_functionality_by_click_on_sub_menu_demo_testing_site_and_submenu_tooltip()  {
		  Actions action = new Actions(driver);
			WebElement we = driver.findElement(By.xpath("//a[contains(text(),'Tester’s Hub')]"));
			action.moveToElement(we).moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Demo Testing Site')]")));
			action.moveToElement(we).moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Tooltip')]"))).click().build().perform();
   
	    }


	    @Then("^ verify the functionality by click on sub menu  simple page test$")
	    public void verify_the_functionality_by_click_on_sub_menu_simple_page_test() throws Throwable {
	        throw new PendingException();
	    }

	    @Then("^ verify the functionality by click on sub menu Flash website$")
	    public void verify_the_functionality_by_click_on_sub_menu_flash_website() throws Throwable {
	        throw new PendingException();
	    }

	    @And("^verify the functionality by click on sub menu Demo testing site$")
	    public void verify_the_functionality_by_click_on_sub_menu_demo_testing_site() throws Throwable {
	        throw new PendingException();
	    }
*/

	  @And("^verify the functionality by click on AlertBox option avilable under submenu demotesting$")
	    public void verify_the_functionality_by_click_on_alertbox_option_avilable_under_submenu_demotesting()  {
	        
		  WebElement we = driver.findElement(By.xpath("//a[contains(text(),'Tester’s Hub')]"));
			new Actions(driver).moveToElement(we).perform();
			WebElement demotestingsite = new WebDriverWait(driver,5).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Demo Testing Site')]")));
			new Actions(driver).moveToElement(demotestingsite).perform();
			WebElement aletrbox = new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'AlertBox')]")));
			 
			aletrbox.click();
 
	    }

	  @And("^verify the functionality by click on DatePicker option avilable under submenu demotesting$")
	    public void verify_the_functionality_by_click_on_datepicker_option_avilable_under_submenu_demotesting()  { 
		  WebElement we = driver.findElement(By.xpath("//a[contains(text(),'Tester’s Hub')]"));
		new Actions(driver).moveToElement(we).perform();
		WebElement demotestingsite = new WebDriverWait(driver,5).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Demo Testing Site')]")));
		new Actions(driver).moveToElement(demotestingsite).perform();
		WebElement datepicker = new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'DatePicker')]")));
		 
		datepicker.click();
		  
	        
	    }

	  @And("^verify the functionality by click on dialogboxes option avilable under submenu demotesting$")
	    public void verify_the_functionality_by_click_on_dialogboxes_option_avilable_under_submenu_demotesting()  {
		  WebElement we = driver.findElement(By.xpath("//a[contains(text(),'Tester’s Hub')]"));
			new Actions(driver).moveToElement(we).perform();
			WebElement demotestingsite = new WebDriverWait(driver,5).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Demo Testing Site')]")));
			new Actions(driver).moveToElement(demotestingsite).perform();
			WebElement dialogbox = new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Dialog Boxes')]")));
			 
			dialogbox.click();	 
		  
	    }
	  
	  	  
	  @And("^verify the functionality by click on progressbar option avilable under submenu demotesting$")
	    public void verify_the_functionality_by_click_on_progressbar_option_avilable_under_submenu_demotesting()  {
		  WebElement we = driver.findElement(By.xpath("//a[contains(text(),'Tester’s Hub')]"));
			new Actions(driver).moveToElement(we).perform();
			WebElement demotestingsite = new WebDriverWait(driver,5).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Demo Testing Site')]")));
			new Actions(driver).moveToElement(demotestingsite).perform();
			WebElement progressbar = new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Progress Bar')]")));
			 progressbar.click();	 
	        
	  }
	  @And("^verify the functionality by click on DragandDrop option avilable under submenu demotesting$")
	    public void verify_the_functionality_by_click_on_draganddrop_option_avilable_under_submenu_demotesting()  {
		  WebElement we = driver.findElement(By.xpath("//a[contains(text(),'Tester’s Hub')]"));
			new Actions(driver).moveToElement(we).perform();
			WebElement demotestingsite = new WebDriverWait(driver,5).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Demo Testing Site')]")));
			new Actions(driver).moveToElement(demotestingsite).perform();
			WebElement Daraganddrop = new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Drag And Drop')]")));
			Daraganddrop.click();	
	    } 
	  @Then("^verify the functionality by click on DragableBoxes option avilable under submenu demotesting$")
	    public void verify_the_functionality_by_click_on_dragableboxes_option_avilable_under_submenu_demotesting()  {
		  WebElement we = driver.findElement(By.xpath("//a[contains(text(),'Tester’s Hub')]"));
			new Actions(driver).moveToElement(we).perform();
			WebElement demotestingsite = new WebDriverWait(driver,5).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Demo Testing Site')]")));
			new Actions(driver).moveToElement(demotestingsite).perform();
			WebElement DaragableBoxes = new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Draggable Boxes')]")));
			DaragableBoxes.click(); 
	    }
	  
	  @Then("^verify the functionality by click on sub menu demotesting$")
	    public void verify_the_functionality_by_click_on_sub_menu_demotesting()  {
		  Actions action = new Actions(driver);
			WebElement we = driver.findElement(By.xpath("//a[contains(text(),'Tester’s Hub')]"));
			action.moveToElement(we).moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Demo Testing Site')]"))).click().build().perform();
   
	    }

	    @Then("^verify the functionality by click on sub menu Flash website$")
	    public void verify_the_functionality_by_click_on_sub_menu_flash_website()  {
	    		  		  Actions action = new Actions(driver);
	  			WebElement we = driver.findElement(By.xpath("//a[contains(text(),'Tester’s Hub')]"));
	  			action.moveToElement(we).moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Flash Website')]"))).click().build().perform();
	    }

	    @And("^verify the functionality by click on sub menu AngularJS Protractor practise site$")
	    public void verify_the_functionality_by_click_on_sub_menu_angularjs_protractor_practise_site()  {
	    	Actions action = new Actions(driver);
  			WebElement we = driver.findElement(By.xpath("//a[contains(text(),'Tester’s Hub')]"));
  			action.moveToElement(we).moveToElement(driver.findElement(By.xpath("//span[contains(text(),'AngularJS Protractor Practice Site')]"))).click().build().perform();
	    }

	    @And("^verify the functionality by click on sub menu sample page test$")
	    public void verify_the_functionality_by_click_on_sub_menu_sample_page_test()  {
	    	Actions action = new Actions(driver);
  			WebElement we = driver.findElement(By.xpath("//a[contains(text(),'Tester’s Hub')]"));
  			action.moveToElement(we).moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Sample Page Test')]"))).click().build().perform();
	    
	    }
	    
	    @Then("^verify the functionality by click on BankingProject option avilable under AngularJS Protractor practise site$")
	    public void verify_the_functionality_by_click_on_bankingproject_option_avilable_under_angularjs_protractor_practise_site() throws InterruptedException  {
	    	WebElement we = driver.findElement(By.xpath("//a[contains(text(),'Tester’s Hub')]"));
			new Actions(driver).moveToElement(we).perform();
			WebElement demotestingsite = new WebDriverWait(driver,5).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'AngularJS Protractor Practice Site')]")));
			new Actions(driver).moveToElement(demotestingsite).perform();
			WebElement bankingproject = new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Banking Project')]")));
			bankingproject.click(); 
			Thread.sleep(1000);
			driver.navigate().back();
			Thread.sleep(1000);
	    }

	    @And("^verify the functionality by click on Filter option avilable under AngularJS Protractor practise site$")
	    public void verify_the_functionality_by_click_on_filter_option_avilable_under_angularjs_protractor_practise_site() throws Throwable {
	    	WebElement we = driver.findElement(By.xpath("//a[contains(text(),'Tester’s Hub')]"));
			new Actions(driver).moveToElement(we).perform();
			WebElement demotestingsite = new WebDriverWait(driver,5).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'AngularJS Protractor Practice Site')]")));
			new Actions(driver).moveToElement(demotestingsite).perform();
			WebElement filters = new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Filters')]")));
			filters.click(); 
			Thread.sleep(1000);
			driver.navigate().back();
			Thread.sleep(1000);
	    }

	    @And("^verify the functionality by click on Scrollable option avilable under AngularJS Protractor practise site$")
	    public void verify_the_functionality_by_click_on_scrollable_option_avilable_under_angularjs_protractor_practise_site() throws InterruptedException  {
	    	WebElement we = driver.findElement(By.xpath("//a[contains(text(),'Tester’s Hub')]"));
			new Actions(driver).moveToElement(we).perform();
			WebElement demotestingsite = new WebDriverWait(driver,5).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'AngularJS Protractor Practice Site')]")));
			new Actions(driver).moveToElement(demotestingsite).perform();
			WebElement scrollable = new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Scrollable')]")));
			scrollable.click(); 
			Thread.sleep(1000);
			driver.navigate().back();
			Thread.sleep(1000);
	    }

	    @And("^verify the functionality by click on MultiForm option avilable under AngularJS Protractor practise site$")
	    public void verify_the_functionality_by_click_on_multiform_option_avilable_under_angularjs_protractor_practise_site() throws InterruptedException  {
	    	WebElement we = driver.findElement(By.xpath("//a[contains(text(),'Tester’s Hub')]"));
			new Actions(driver).moveToElement(we).perform();
			WebElement demotestingsite = new WebDriverWait(driver,5).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'AngularJS Protractor Practice Site')]")));
			new Actions(driver).moveToElement(demotestingsite).perform();
			WebElement multiform = new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Multiform')]")));
			multiform.click(); 
			Thread.sleep(1000);
			driver.navigate().back();
			Thread.sleep(1000);
	    }

	    @And("^verify the functionality by click on Webtable option avilable under AngularJS Protractor practise site$")
	    public void verify_the_functionality_by_click_on_webtable_option_avilable_under_angularjs_protractor_practise_site() throws Throwable {
	    	WebElement we = driver.findElement(By.xpath("//a[contains(text(),'Tester’s Hub')]"));
			new Actions(driver).moveToElement(we).perform();
			WebElement demotestingsite = new WebDriverWait(driver,5).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'AngularJS Protractor Practice Site')]")));
			new Actions(driver).moveToElement(demotestingsite).perform();
			WebElement webtable = new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'WebTable')]")));
			webtable.click(); 
			Thread.sleep(1000);
			driver.navigate().back();
			Thread.sleep(1000);
	    }

	    @And("^verify the functionality by click on RegistrationForm option avilable under AngularJS Protractor practise site$")
	    public void verify_the_functionality_by_click_on_registrationform_option_avilable_under_angularjs_protractor_practise_site() throws Throwable {
	    	WebElement we = driver.findElement(By.xpath("//a[contains(text(),'Tester’s Hub')]"));
			new Actions(driver).moveToElement(we).perform();
			WebElement demotestingsite = new WebDriverWait(driver,5).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'AngularJS Protractor Practice Site')]")));
			new Actions(driver).moveToElement(demotestingsite).perform();
			WebElement registrationform = new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Registration Form')]")));
			registrationform.click(); 
			
			driver.findElement(By.xpath("//a[contains(text(),'GlobalSQA.com')]")).click();
			Thread.sleep(3000);
	    }

	    @And("^verify the functionality by click on simplecalculator option avilable under AngularJS Protractor practise site$")
	    public void verify_the_functionality_by_click_on_simplecalculator_option_avilable_under_angularjs_protractor_practise_site() throws Throwable {
	    	WebElement we = driver.findElement(By.xpath("//a[contains(text(),'Tester’s Hub')]"));
			new Actions(driver).moveToElement(we).perform();
			WebElement demotestingsite = new WebDriverWait(driver,5).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'AngularJS Protractor Practice Site')]")));
			new Actions(driver).moveToElement(demotestingsite).perform();
			WebElement samplecalculator = new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Simple Calculator')]")));
			samplecalculator.click(); 
			Thread.sleep(1000);
			driver.navigate().back();
			Thread.sleep(1000);
	    }
	  
	    @Then("^verify the functionality by click on corporatetraning option avilable under Traning tab$")
	    public void verify_the_functionality_by_click_on_corporatetraning_option_avilable_under_traning_tab()  {
	    	
	    	Actions action = new Actions(driver);
  			WebElement we = driver.findElement(By.xpath("//a[contains(text(),'Trainings')]"));
  			action.moveToElement(we).moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Corporate Trainings')]"))).click().build().perform();
	       
	    }

	    @And("^verify the functionality by click on onlinetraining option avilable under Traning tab$")
	    public void verify_the_functionality_by_click_on_onlinetraining_option_avilable_under_traning_tab()  {
	    	Actions action = new Actions(driver);
  			WebElement we = driver.findElement(By.xpath("//a[contains(text(),'Trainings')]"));
  			action.moveToElement(we).moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Online Trainings')]"))).click().build().perform();    
	    }
	    
	    @Then("^click on Choose file$")
	    public void click_on_choose_file() throws IOException, InterruptedException  {
	    	driver.findElement(By.name("file-553")).click();
	    	Thread.sleep(8000);
	    	Runtime.getRuntime().exec("D:\\Autoit\\FileUpload1.exe");
	    	Thread.sleep(3000);
	    }
	    @And("^Enter name email and website$")
	    public void enter_name_email_and_website(DataTable credentials)  {
	    	java.util.List<java.util.List<String>> data= credentials.raw();
			driver.findElement(By.name("g2599-name")).sendKeys(data.get(0).get(0));
			driver.findElement(By.name("g2599-email")).sendKeys(data.get(0).get(1));
			driver.findElement(By.name("g2599-website")).sendKeys(data.get(0).get(2));
	    }

	    @And("^verify the functionality by click on campustraning option avilable under Traning tab$")
	    public void verify_the_functionality_by_click_on_campustraning_option_avilable_under_traning_tab()  {
	    	Actions action = new Actions(driver);
  			WebElement we = driver.findElement(By.xpath("//a[contains(text(),'Trainings')]"));
  			action.moveToElement(we).moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Campus Trainings')]"))).click().build().perform();    
	    }
	    
	
	    @Then("^select the experience in dropdown list$")
	    public void select_the_experience_in_dropdown_list() {
	    	Select Noofyrs = new Select(driver.findElement(By.name("g2599-experienceinyears")));
	    	Noofyrs.selectByVisibleText("1-3");
	    	Noofyrs.selectByIndex(1);
	    }

	    @Then("^click on Expertise check box$")
	    public void click_on_expertise_check_box()  {
	        driver.findElement(By.name("g2599-expertise[]")).click();
	    }

	    @Then("^click on submit button$")
	    public void click_on_submit_button()  {
	       driver.findElement(By.xpath("//input[@value='Submit »']")).click();
	    }

	    @And("^click on Education check box$")
	    public void click_on_education_check_box()  {
	        driver.findElement(By.xpath("//input[@value='Submit »']")).click();
	        driver.findElement(By.xpath("//textarea[@name='g2599-comment']")).sendKeys("this is test comment bh");
	    }  


	    
@And("^close the browser$")
public void close_the_browser()  {
 driver.close();   
}
}



