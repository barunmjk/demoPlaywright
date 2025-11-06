package demo;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class PlaywrightProgram {
	      
      public static void main(String[] args) throws Exception {
    	  Playwright pw=Playwright.create();
    Browser bro=pw.chromium().launch(new BrowserType.LaunchOptions().setHandleSIGHUP(false));
    Page page=bro.newPage();
    page.navigate("https://www.wikipedia.org/");
    System.out.println("page title is "+page.title());
    bro.close();
      }
}
