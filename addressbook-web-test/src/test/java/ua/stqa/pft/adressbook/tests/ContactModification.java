package ua.stqa.pft.adressbook.tests;

import org.testng.annotations.Test;

public class ContactModification extends TestBase {

    @Test
    public void testContactModification(){
        app.getContactHelper().editContact();
        app.getContactHelper().updateContact();
    }
}
