package PackageName;

import java.util.Random;

import org.testng.asserts.SoftAssert;

public class parameterPage {
	
	
	
	SoftAssert Check = new SoftAssert();
	static String creatUrl = "https://automationteststore.com/index.php?rt=account/create";
	static String firstnameId ="AccountFrm_firstname";
	static String lastnameId ="AccountFrm_lastname";
	
	static String emailId ="AccountFrm_email";
	static String addressId ="AccountFrm_address_1";
	static String cityId ="AccountFrm_city";
	static String zoneId ="AccountFrm_zone_id";
	static String codeId="AccountFrm_postcode";
	static String statId="AccountFrm_zone_id";
	static String countryId ="AccountFrm_country_id";
	static String loginnameId ="AccountFrm_loginname";
	static String passwordId ="AccountFrm_password";
	static String confirmId ="AccountFrm_confirm";

	
	
	
	static String[] fnames = { "kamil", "kaady","Saraa", "sadeen","saamy","sanaa","sleem"};                  
	static Random first = new Random();                                                                      
	                                                                                                         
	                                                                                                         
	 static int randomFirstIndex = first.nextInt(fnames.length);                                             
	 static String randomFirstName = fnames[randomFirstIndex];                                               
	                                                                                                         
	static String[] lnames = { "ahmed", "mohammed","badeea", "wadeea","jamil","Abosnaa","sleem"};            
	static Random last = new Random();                                                                       
	                                                                                                         
	static int randomLastIndex = last.nextInt(lnames.length);                                                
	static String randomLastName = lnames[randomLastIndex];                                                  
	                                                                                                         
	                                                                                                         
	                                                                                                         
	static Random random = new Random();                                                                     
	static int randomNumber = random.nextInt(30000); 
	                                                                                                         
	static String email_address = randomLastName + randomFirstName + randomNumber + "@gmail.com"; 
	static String logInName= randomLastName + randomFirstName + randomNumber;
	static String paswordnum =  "Asd@dsa123123"; 
	
	
	
//ACCOUNT LOGOUT

	static String expectedSuccessMessagelogIn = "YOUR ACCOUNT HAS BEEN CREATED!";
	
	static String logOutUrl = "https://automationteststore.com/index.php?rt=account/account";
	
	static String logOutid = "#maincontainer > div > div.column_right.col-md-3.col-xs-12.mt20 > div.sidewidt > div > ul > li:nth-child(10) > a";
	
	static String expectedSuccessMessagelogout ="ACCOUNT LOGOUT";
	
	static String logInUrl ="https://automationteststore.com/index.php?rt=account/login";
	static String nameId ="loginFrm_loginname";
	static String passId ="loginFrm_password";
	
	static String iteamUrl ="https://automationteststore.com/index.php?rt=product/category&path=58";
	
	static String expectedContactNumber = "+123 456 7890";
	
	static String sitemap ="https://automationteststore.com/index.php?rt=content/sitemap";
	static String womanUrl ="https://automationteststore.com/index.php?rt=product/category&path=49_50";
	static int expectedItemCount=4;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
