package ua.stqa.pft.adressbook.tests;

import org.testng.annotations.Test;
import ua.stqa.pft.adressbook.model.ContactData;

public class ContactModification extends TestBase {

    @Test
    public void testContactModification(){
        if (! app.getContactHelper().isThereAContact()){
            app.getContactHelper().createContact(new ContactData("Alex", "Kovalchuk", "Lenina str", "0805456314","teper9999@gmail.com", "test1"),true);
        }
        app.getContactHelper().editContact();
        app.getContactHelper().fillContactForm(new ContactData("Alex", "Kovalchuk", "Lenina str", "0805456314","teper9999@gmail.com",  null),false);
        app.getContactHelper().updateContact();
    }
}
