package ua.stqa.pft.adressbook.tests;

import org.testng.annotations.Test;
import ua.stqa.pft.adressbook.model.GroupData;

public class GroupDeletionTests extends TestBase{

  @Test
  public void testGroupDelitions() throws Exception {
    app.getNavigationHelper().gotoGroupTest();
    if (! app.getGroupHelper().isThereAGroup()){
      app.getGroupHelper().createGrouup(new GroupData("test1", null, null));
    }
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().deleteSelectedGroups();
    app.getGroupHelper().returnToGroupPage();
  }

}
