package ua.stqa.pft.adressbook.tests;

import org.testng.annotations.Test;
import ua.stqa.pft.adressbook.model.ContactData;

public class ContactModification extends TestBase {

    @Test
    public void testContactModification(){
        app.getContactHelper().editContact();
        app.getContactHelper().fillContactForm(new ContactData("alex", "Koval", "Lenina", "0805456314","teper9999@gmail.com",  null),false);
        app.getContactHelper().updateContact();
    }
}
