package ua.stqa.pft.adressbook;

import org.testng.annotations.Test;

public class GroupDeletionTests extends TestBase{

  @Test
  public void testGroupDelitions() throws Exception {
    gotoGroupTest();
    selectGroup();
    deleteSelectedGroups();
    returnToGroupPage();
  }

}
