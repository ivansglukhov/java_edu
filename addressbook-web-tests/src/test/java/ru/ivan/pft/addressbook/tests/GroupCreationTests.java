package ru.ivan.pft.addressbook.tests;


import org.testng.annotations.Test;
import ru.ivan.pft.addressbook.model.GroupData;


public class GroupCreationTests extends TestBase{


  @Test
  public void testGroupCreation() throws Exception {
    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().initGroupCreation();
    app.getGroupHelper().fillGroupForm(new GroupData("name", null, null));
    app.getGroupHelper().submitGroup();
    app.getGroupHelper().gotoGroupPage();
  }


}
