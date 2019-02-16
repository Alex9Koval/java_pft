package ua.stqa.pft.adressbook.tests;

import org.testng.annotations.*;
import ua.stqa.pft.adressbook.model.GroupData;

public class GroupCreationTests extends TestBase {


  @Test
  public void testGroupCreation() throws Exception {
    app.gotoGroupTest();
    app.initGroupGreation();
    app.fillGroupForm(new GroupData("test1", "test2", "test3"));
    app.submitGroupCreation();
    app.returnToGroupPage();
  }

}
