package ua.stqa.pft.adressbook.tests;

import org.testng.annotations.*;
import ua.stqa.pft.adressbook.model.ContactData;

public class ContactCreationTests extends TestBase {


  @Test
  public void testContactCreation() throws Exception {
    app.getContactHelper().addNewContactForm();
    app.getContactHelper().fillContactForm(new ContactData("alex", "Koval", "Lenina", "0805456314","teper9999@gmail.com"));
    app.getContactHelper().submitContactCreation();
  }


}
