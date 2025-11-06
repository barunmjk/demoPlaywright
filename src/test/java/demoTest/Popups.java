package demoTest;

import org.testng.annotations.Test;

import com.microsoft.playwright.Locator;

public class Popups extends BaseClass {
     @Test
	public void getPopups() throws Exception {
	   page.navigate("https://demoqa.com/alerts");
//	   page.locator("button[id='alertButton']").click();
//	   page.onceDialog(dialog->dialog.accept());
//	 
//	   System.out.println("==================================POpup handle succesfully==============================");
	   
	   
	Locator l=  page.locator("button[id='confirmButton']");
	
	  l.click();
	  page.onDialog(n->n.dismiss());
	  System.out.println("================================== Another POpup handle succesfully==============================");
	  }
}
