package objectRepo;

import com.microsoft.playwright.Page;

public class PomVtigerContact {
         Page page;
//         all locators
         private String usernamelocator="input[name='user_name']";
         private String passwordlocator="input[name='user_password']";
         private String loginbtnlocator="input[id='submitButton']";
         private String hoveringLocator="img[src='themes/softed/images/user.PNG']";
         private String SignOut="text=Sign Out";
         private String contactModule="text=Contacts";
         private String plusBtn="img[title='Create Contact...']";
         private String  salutationType="select[name='salutationtype']";
         private String fName="input[name='firstname']";
         private String lName="input[name='lastname']";
         private String Orgplus="img[src='themes/softed/images/select.gif']";
         private String newWindowOrgName="text=Telegram_125";
         public  PomVtigerContact(Page page) {
        	 this.page=page;
         }
         public void getUrl(String url) {
        	 page.navigate(url);
         }
         public void enterloginuserName(String user) {
        	 page.locator(usernamelocator).fill(user);
         }
     public void enterloginPassword(String pass) {
        	 page.locator(passwordlocator).fill(pass);
         }
     public void clickLoginbtn() {
    	 page.locator(loginbtnlocator).click();
     }
     public void hoverSignOut( ) {
    	 page.hover(hoveringLocator);
     }
    public void ClickSignOut() {
    	page.locator(SignOut).click();
    }
    public void ContactsModule() {
    	page.locator(contactModule).click();
    }
    public void plusBtnCreateContacts() {
    	page.locator(plusBtn).click();
    }
    public void getSolutationtype(String soluName) {
    	page.selectOption(salutationType, soluName);
    }
    public void getFName(String firstName) {
    	page.locator(fName).fill(firstName);
    }
    public void getLName(String lastName) {
    	page.locator(lName).fill(lastName);
    }
    public void clickOrgPlus() {
    Page newWindow=	page.waitForPopup(()->{
    	page.locator(Orgplus).nth(0).click();
    	});
    newWindow.waitForLoadState();
    newWindow.locator(newWindowOrgName).click();
    }
}
