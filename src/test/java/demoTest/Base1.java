package demoTest;

 
import java.util.List;

import org.testng.annotations.Test;

import com.microsoft.playwright.Frame;
import com.microsoft.playwright.FrameLocator;

public class Base1 extends BaseClass {
	@Test
	   public void checkFrame() throws  Exception {
 
       	page.navigate("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_submit_get"); 
 
          List<Frame> frames = page.frames();
          System.out.println("total frames is: "+frames.size());
         FrameLocator fl= page.frameLocator("#iframeResult");
         fl.locator("button[onclick='myFunction()']").click();
       }
}
