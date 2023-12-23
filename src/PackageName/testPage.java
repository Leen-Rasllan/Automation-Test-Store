package PackageName;




import java.util.List;
import java.util.Random;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testPage extends parameterPage{
	WebDriver driver = new ChromeDriver();
	

	@BeforeTest
	public void setup() {
		driver.manage().window().maximize();
	}
	@Test(priority= 1 )
	public void  creatAcount () throws InterruptedException  {
		driver.get(creatUrl);
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(3));
		WebElement Firstname = driver.findElement(By.id (firstnameId));         
		WebElement lastname = driver.findElement(By.id(lastnameId));         
		WebElement email = driver.findElement(By.id(emailId));             
		WebElement address = driver.findElement(By.id(addressId));          
		WebElement city = driver.findElement(By.id (cityId));          
		WebElement zone = driver.findElement(By.id(zoneId));
		WebElement code = driver.findElement(By.id(codeId));
		WebElement country = driver.findElement(By.id(countryId));          
		WebElement loginname = driver.findElement(By.id(loginnameId));          
		WebElement password = driver.findElement(By.id(passwordId));          
		WebElement confirm = driver.findElement(By.id(confirmId));
		WebElement selectElement = driver.findElement(By.id(statId));
		
	Firstname  .sendKeys(randomFirstName);
	lastname   .sendKeys(randomLastName);
	email    .sendKeys(email_address);
	address  .sendKeys("USA-Kal56/89");
	city     .sendKeys("Dallas, Texas");
	zone     .sendKeys("Dallas");
	code     .sendKeys("Dallas56489");
	country  .sendKeys("United States");
	loginname.sendKeys(logInName);
	password .sendKeys(paswordnum);
	confirm  .sendKeys(paswordnum);
	 Select select = new Select(selectElement);
	
	   List<WebElement> options = select.getOptions();
	   int randomIndex = new Random().nextInt(options.size());
	   select.selectByIndex(randomIndex);
	 
	WebElement agreecheack = driver.findElement(By.id("AccountFrm_newsletter1"));
	agreecheack.click();
	WebElement bouttun = driver.findElement(By.id("AccountFrm_agree"));
	bouttun.click();
	WebElement donebouttun = driver.findElement(By.xpath("//button[normalize-space()='Continue']"));
	donebouttun.click();
	
	Thread.sleep(5000);
	
	WebElement successMessagelogIn = driver.findElement(By.className("heading1"));
	 String actualSuccessMessagelogIn = successMessagelogIn.getText();
	Check.assertEquals(actualSuccessMessagelogIn, expectedSuccessMessagelogIn, "Account creation is successful.");
	
	  Check.assertAll();
		
	}   
	
	
	@Test(priority=2 )
	public void  Logout () throws InterruptedException  {
	
		driver.get(logOutUrl);
	
		WebElement logOut = driver.findElement(By.cssSelector(logOutid));
		logOut.click();
	
		Thread.sleep(5000);
		
		WebElement successMessagelogout = driver.findElement(By.className("heading1"));
		 String actualSuccessMessagelogout = successMessagelogout.getText();
		Check.assertEquals(actualSuccessMessagelogout, expectedSuccessMessagelogout, "The account logout process was successful");
		
		  Check.assertAll();
	
	
	
	}
	
	
	@Test(priority=3)
	public void  Login () throws InterruptedException  {
	
		driver.get(logInUrl);
		Thread.sleep(5000);
		WebElement loginname = driver.findElement(By.id(nameId)); 
		WebElement password = driver.findElement(By.id(passId));
		
		loginname.sendKeys(logInName);
		password .sendKeys(paswordnum);
		WebElement logInbouttun = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
		logInbouttun.click();
		
	}
	
	
	
	
	
	
	
	 @Test(priority= 5 )
		public void  footer () throws InterruptedException  {
		 
		 driver.get(sitemap);
		 
		 WebElement sitmaocontain = driver.findElement(By.className("contentpanel"));
		 sitmaocontain.click();
		 List<WebElement> sitemapItems = driver.findElements(By.className("list-group-item"));
		 for (WebElement item : sitemapItems) {
	            System.out.println(item.getText().toUpperCase());
	        }
		 
		 
		 WebElement contactNumberElement = driver.findElement(By.cssSelector(".contact"));
	       String actualContactNumber = contactNumberElement.getText();
	       
	       Check .assertTrue(actualContactNumber.contains(expectedContactNumber),
	                "Contact number in the footer does not contain the expected substring: " + expectedContactNumber);
	       
	       
	       Check.assertAll();
	        
	 }
	
 
	 
	 
	 
	 @Test(priority= 4  )
		public void  allIteams () throws InterruptedException  {
	
	   

	      

	        for (int i = 0; i < 4 ;i++) {
	        	 driver.get(iteamUrl);
	            Thread.sleep(2000);
	            WebElement container = driver.findElement(By.cssSelector(".thumbnails.grid.row.list-inline"));
	            List<WebElement>elementsContainer = container.findElements(By.className("thumbnail"));
	            elementsContainer.get(i).click();
	            Thread.sleep(2000);
	            WebElement cartBtn = driver.findElement(By.cssSelector(".cart"));
	            cartBtn.click();
	        }

	        WebElement cartIteam = driver.findElement(By.xpath("(//span[normalize-space()='4'])[1]")); 
	        cartIteam.getText();
	        int actualItemCount = Integer.parseInt(cartIteam.getText());
	        Check.assertEquals(actualItemCount, expectedItemCount,  "The number of items in the cart is not as expected");

	      Check.assertAll();
		        
		     }
	 
	 
//	 @Test(priority=4)
//		public void  WomanIteams () throws InterruptedException  {
//		 
//		 driver.get(womanUrl); 
//		 
//		 WebElement elemntcont  = driver.findElement(By.cssSelector(".contentpanel"));
//		 elemntcont.click();
//		 List<WebElement> elements = driver.findElements(By.cssSelector(".col-md-3.col-sm-6.col-xs-12"));
//		 System.out.println(elements.size());
//		 
//		 
//		
//	            int randomIndex = random.nextInt(elements.size());
//	            WebElement randomElement = elements.get(randomIndex);
//
//	            randomElement.click();
//	            Thread.sleep(5000);
//
//	            WebElement cartBtn = driver.findElement(By.cssSelector(".cart"));
//	            cartBtn.click();
//
//	            Thread.sleep(5000);
//
//	            driver.navigate().back();
//	            driver.navigate().back();
//	            Thread.sleep(5000);
//	   		
//	      
//	    
//		 
//		 
//	 }
//		
	
 
	        
	
	                           
	
	@AfterTest
	public void posttest() {
	}

}
