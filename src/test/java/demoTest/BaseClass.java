package demoTest;

import org.testng.annotations.AfterClass;
 
import org.testng.annotations.BeforeClass;
 

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class BaseClass {
	
 protected	Playwright play;
 protected	Browser bro;
protected Page page;
   @BeforeClass
   public void setUp() {
	   play=Playwright.create();
	   bro= play.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(1000));
	   page= bro.newPage();
   }
   @AfterClass
   public void tearDown() {
	   bro.close();
	   play.close();
   }
}
