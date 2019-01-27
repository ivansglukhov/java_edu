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
    GroupData group = new GroupData("name_qq", null, null);
    app.getGroupHelper().fillGroupForm(group);
    app.getGroupHelper().submitGroup();
    app.getGroupHelper().gotoGroupPage();
    List<GroupData> after = app.getGroupHelper().getGroupList();
    Assert.assertEquals(after.size(), before.size()+1);

//  before.add(group);
//  int max=0;
//  for (GroupData g : after){
//    if (g.getGroupId()>max){
//      max=g.getGroupId();
//    }
//  }
   // Comparator<? super GroupData> byGroupId = (Comparator<GroupData>) (o1, o2) -> Integer.compare(o1.getGroupId(),o2.getGroupId());

    //int max1 = after.stream().max((o1, o2) -> Integer.compare(o1.getGroupId(),o2.getGroupId())).get().getGroupId();
    group.setGroupId(after.stream().max((o1, o2) -> Integer.compare(o1.getGroupId(),o2.getGroupId())).get().getGroupId());
    before.add(group);
    Assert.assertEquals(new HashSet<Object>(before),new HashSet<Object>(after));
  }


}
