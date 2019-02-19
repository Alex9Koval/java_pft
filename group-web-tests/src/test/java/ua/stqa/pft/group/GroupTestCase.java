package ua.stqa.pft.group;

import org.testng.annotations.*;


public class GroupTestCase extends TestBase{

  @Test
  public void testGroupCreation() throws Exception {
    gotoGroupPage();
    initGroupCreation();
    fillGroupForm(new GroupData("Qatest", "testQ", "testA"));
    submitGroupCreation();
    returnGroupPage();
  }

}
