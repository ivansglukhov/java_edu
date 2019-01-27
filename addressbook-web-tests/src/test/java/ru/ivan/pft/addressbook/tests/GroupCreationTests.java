package ru.ivan.pft.addressbook.tests;


import org.testng.Assert;
import org.testng.annotations.Test;
import ru.ivan.pft.addressbook.model.GroupData;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;


public class GroupCreationTests extends TestBase{


  @Test
  public void testGroupCreation() throws Exception {

    app.getNavigationHelper().gotoGroupPage();
    List<GroupData> before = app.getGroupHelper().getGroupList();
    app.getGroupHelper().initGroupCreation();
    GroupData group = new GroupData("new_group", null, null);
    app.getGroupHelper().fillGroupForm(group);
    app.getGroupHelper().submitGroup();
    app.getGroupHelper().gotoGroupPage();
    List<GroupData> after = app.getGroupHelper().getGroupList();
    Assert.assertEquals(after.size(), before.size()+1);

    //group.setGroupId(after.stream().max((o1, o2) -> Integer.compare(o1.getGroupId(),o2.getGroupId())).get().getGroupId());
    before.add(group);
    Comparator<? super GroupData> byGroupId =(g1,g2)->Integer.compare(g1.getGroupId(),g2.getGroupId());
    before.sort(byGroupId);
    after.sort(byGroupId);
    System.out.println(before);
    System.out.println(after);
    Assert.assertEquals(before,after);
  }


}
