package demoTest;

import org.testng.annotations.Test;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.MouseButton;

public class MouseActions extends BaseClass{
	@Test(priority = 2)
  public void mouseActionClickCoordinate() throws Exception {
		  page.navigate("https://www.zomato.com/ncr");
	        // Move mouse to a specific coordinate and click
	        page.mouse().move(260, 320);
	        page.mouse().down();
	        page.mouse().up();
	        Thread.sleep(8000);
  }
	@Test(priority = 2)
	public void mouseActionHover() {
		page.navigate("https://demoqa.com/buttons");
		page.hover("#doubleClickBtn");
		page.mouse().down();
		page.mouse().up();
	}
	@Test
	public void mouseActionDoubleClick() {
		page.navigate("https://demoqa.com/buttons");
		page.dblclick("#doubleClickBtn");
	}
	@Test
	public void mouseActionRightClick() {
		page.navigate("https://www.google.com/");
		page.click("text=About", new Page.ClickOptions().setButton(MouseButton.RIGHT));
	}
	@Test
	public void mouseActionDragAndDrop() {
		page.navigate("https://demoqa.com/droppable");
		page.dragAndDrop("#draggable", "#droppable");
	}
	
}
