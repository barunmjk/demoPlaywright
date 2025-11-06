package demoTest;

 

import org.testng.annotations.Test;

import com.microsoft.playwright.Page;
 

 

public class HandleTab extends BaseClass {
    @Test  
	public void tab() throws Exception {
    	   page.navigate("https://www.globalsqa.com/demo-site/frames-and-windows/");
    	   Page newTab = page.waitForPopup(() -> {
           page.click("text=Click Here"); 
           });
    	   newTab.waitForLoadState();
    	   newTab.locator( "id=iFrame").click();
    	   System.out.println("=======success======");
    	   newTab.close();
    	   page.click("text=Click Here");
    	   Thread.sleep(3000);
       }
}
