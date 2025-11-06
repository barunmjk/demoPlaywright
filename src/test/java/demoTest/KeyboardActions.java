package demoTest;

import org.testng.annotations.Test;

public class KeyboardActions extends BaseClass {
//	@Test
    public void typeAction() throws Exception {
    	page.navigate("https://www.google.com/");
        page.click("#APjFqb");
    	page.keyboard().type("Hello");
    	Thread.sleep(8000);
    }
	@Test
	public void pressAnyKeyAction() throws Exception {
		page.navigate("https://www.google.com/");
		page.click("#APjFqb");
		page.keyboard().type("hello");
		page.keyboard().press("Space");
		page.keyboard().type("how are you?");
		page.keyboard().press("Enter");
		Thread.sleep(8000);
	}
	@Test
	public void keyDownAndKeyUp() {
		page.navigate("https://www.facebook.com/");
		page.locator("#email").fill("wertyui");
		page.locator("#pass").fill("1234567890");
		
		page.keyboard().down("Enter");
		page.keyboard().up("Enter");
	}
}
