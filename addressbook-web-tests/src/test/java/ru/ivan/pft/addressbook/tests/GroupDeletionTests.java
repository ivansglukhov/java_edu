package ru.ivan.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.ivan.pft.addressbook.model.GroupData;

import java.util.List;


public class GroupDeletionTests extends TestBase {

  @Test
  public void testGroupDeletionTests() throws Exception {
    app.getNavigationHelper().gotoGroupPage();

    if (!app.getGroupHelper().isThereAGroup()){
      app.getGroupHelper().createGroup(new GroupData("name", null, null));
    }
    List<GroupData> before = app.getGroupHelper().getGroupList();
    //app.getGroupHelper().selectFirstGroup();
    app.getGroupHelper().selectGroup(before.size() -1)  ;
    app.getGroupHelper().deleteSelectedGroups();
    app.getGroupHelper().gotoGroupPage();
    List<GroupData> after = app.getGroupHelper().getGroupList();
    Assert.assertEquals(after.size(),before.size()-1);

    before.remove(before.size() -1);
    Assert.assertEquals(after, before);


  }


//  private boolean isElementPresent(By by) {
//    try {
//      driver.findElement(by);
//      return true;
//    } catch (NoSuchElementException e) {
//      return false;
//    }
//  }



}
