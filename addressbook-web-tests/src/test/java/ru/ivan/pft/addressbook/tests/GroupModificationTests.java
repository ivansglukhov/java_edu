package ru.ivan.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import ru.ivan.pft.addressbook.model.GroupData;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class GroupModificationTests extends TestBase {

    @Test
    public void testGroupModification(){
        app.getNavigationHelper().gotoGroupPage();
        if (!app.getGroupHelper().isThereAGroup()){
            app.getGroupHelper().createGroup(new GroupData("name", null, null));
        }
        List<GroupData> before = app.getGroupHelper().getGroupList();
        //app.getGroupHelper().selectFirstGroup();
        app.getGroupHelper().selectGroup(before.size() -1);
        app.getGroupHelper().initGroupModification();
        GroupData group = new GroupData(before.get(before.size()-1).getGroupId(),"Modname", "Modhdr", "Modftr");
        app.getGroupHelper().fillGroupForm(group);
        app.getGroupHelper().submitGroupModification();
        app.getGroupHelper().gotoGroupPage();
        List<GroupData> after = app.getGroupHelper().getGroupList();
        Assert.assertEquals(after.size(),before.size());

        before .remove(before.size() -1);
        before.add(group);
        Comparator<? super GroupData> byGroupId=(g1,g2)->Integer.compare(g1.getGroupId(),g2.getGroupId());
        before.sort(byGroupId);
        after.sort(byGroupId);

        Assert.assertEquals(before,after);
    }
}
