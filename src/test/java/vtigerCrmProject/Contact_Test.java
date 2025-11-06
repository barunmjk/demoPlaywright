package vtigerCrmProject;

import org.testng.annotations.Test;

import objectRepo.PomVtigerContact;

public class Contact_Test extends BaseClass{
	@Test
	  public void contact_Test() throws Exception {
		PomVtigerContact pvc=new PomVtigerContact(page);
		pvc.ContactsModule();
		pvc.plusBtnCreateContacts();
		pvc.getSolutationtype("Mr.");
		pvc.getFName("Vimal");
		pvc.getLName("kumar");
		pvc.clickOrgPlus();
			 System.out.println("success");
			 Thread.sleep(8000);
		   }
}
