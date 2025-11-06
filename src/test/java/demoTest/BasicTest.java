package demoTest;

import java.nio.file.Paths;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.microsoft.playwright.Frame;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class BasicTest extends BaseClass {
	    @Test
        public void verifyingTitle() throws  Exception {
        	page.navigate("https://www.facebook.com/"); 
        	 
        	 page.locator("input[name='email']").fill("Abc");
        	  
        	 page.locator("#pass").fill("abc");
        	 
        	 page.locator("button[name='login']").click();
        	 page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("C:\\Users\\Fleek IT\\eclipse-workspace\\DemoPlaywright\\screenshot\\ss.png")));
             page.locator("input[name='email']").screenshot(new Locator.ScreenshotOptions().setPath(Paths.get("C:\\Users\\Fleek IT\\eclipse-workspace\\DemoPlaywright\\screenshot\\ss1.png")));
           List<Frame> frames = page.frames();
           System.out.println("total frames is: "+frames.size());
        }
}
