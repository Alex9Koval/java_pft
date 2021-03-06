package ua.stqa.pft.adressbook.tests;

import org.testng.annotations.Test;
import ua.stqa.pft.adressbook.model.GroupData;

public class GroupModificationTests extends TestBase {

    @Test
    public void testGroupModification(){
        app.getNavigationHelper().gotoGroupTest();
        if (! app.getGroupHelper().isThereAGroup()){
            app.getGroupHelper().createGrouup(new GroupData("test1", null, null));
        }
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().initGroupModification();
        app.getGroupHelper().fillGroupForm(new GroupData("test1", "test2", "test3"));
        app.getGroupHelper().submitGroupModification();
        app.getGroupHelper().returnToGroupPage();
    }
}

