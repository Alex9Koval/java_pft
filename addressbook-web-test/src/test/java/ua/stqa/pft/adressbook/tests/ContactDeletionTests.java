package ua.stqa.pft.adressbook.tests;

import org.testng.annotations.Test;
import ua.stqa.pft.adressbook.model.ContactData;

public class ContactDeletionTests extends TestBase {

    @Test
    public void testContactDeletion(){
        if (! app.getContactHelper().isThereAContact()){
            app.getContactHelper().createContact(new ContactData("Alex", "Kovalchuk", "Lenina str", "0805456314","teper9999@gmail.com", "test1"),true);
        }
      app.getContactHelper().selectContact();
      app.getContactHelper().deleteContact();
      app.getContactHelper().closeAlert();
    }
}
