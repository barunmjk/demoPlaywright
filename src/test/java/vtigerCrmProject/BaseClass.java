package vtigerCrmProject;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

import objectRepo.PomVtigerContact;
 

public class BaseClass {
	protected Playwright play;
	protected Browser bro;
	 public static  Page page;
	 
       @BeforeClass
       public void setup() {
         play =Playwright.create();
          bro=play.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(1000));
         page=bro.newPage();
         page.evaluate("document.documentElement.requestFullscreen()");
       }
      @BeforeMethod
      public void loginVtiger() {
    		PomVtigerContact pvc=new PomVtigerContact(page); 
   		 pvc.getUrl("http://49.249.28.218:8888/");
   	   pvc.enterloginuserName("admin");
   	   pvc.enterloginPassword("admin");
   	   pvc.clickLoginbtn();
      }
      @AfterMethod
      public void logoutVtiger() throws Exception {
    	  PomVtigerContact pvc=new PomVtigerContact(page);
    	  pvc.hoverSignOut();
  	    pvc.ClickSignOut();

  
      }
       @AfterClass
       public void tearDown() {
    	   
    	   bro.close();
    	   play.close();
       }
}
