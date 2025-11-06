package demoTest;

 
import org.testng.annotations.Test;

import com.microsoft.playwright.Page;

public class HandleWindow  extends BaseClass{
	@Test
     public void demoHandle() {
     page.navigate("https://www.globalsqa.com/demo-site/frames-and-windows/");
     page.locator( "id=Open New Window").click();
 
     Page newWindow = page.waitForPopup(() -> {
         page.click("text=Click Here");
         });
     newWindow.waitForLoadState();
     System.out.println("===================success==============");
      
     }
}
