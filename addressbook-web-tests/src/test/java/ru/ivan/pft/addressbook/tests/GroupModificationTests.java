package ru.ivan.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.ivan.pft.addressbook.model.GroupData;

public class GroupModificationTests extends TestBase {

    @Test
    public void testGroupModification(){
        app.getNavigationHelper().gotoGroupPage();
        if (!app.getGroupHelper().isThereAGroup()){
            app.getGroupHelper().createGroup(new GroupData("name", null, null));
        }
        app.getGroupHelper().selectFirstGroup();
        app.getGroupHelper().initGroupModification();
        app.getGroupHelper().fillGroupForm(new GroupData("name", "hdr", "ftr"));
        app.getGroupHelper().submitGroupModification();
        app.getGroupHelper().gotoGroupPage();

    }
}
