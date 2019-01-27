package ru.ivan.pft.addressbook.tests;


import org.testng.Assert;
import org.testng.annotations.Test;
import ru.ivan.pft.addressbook.model.GroupData;


public class GroupCreationTests extends TestBase{


  @Test
  public void testGroupCreation() throws Exception {

    app.getNavigationHelper().gotoGroupPage();
    int before = app.getGroupHelper().getGroupCount();
    app.getGroupHelper().initGroupCreation();
    app.getGroupHelper().fillGroupForm(new GroupData("name", null, null));
    app.getGroupHelper().submitGroup();
    app.getGroupHelper().gotoGroupPage();
    int after = app.getGroupHelper().getGroupCount();
    Assert.assertEquals(after, before+1);
  }


}
