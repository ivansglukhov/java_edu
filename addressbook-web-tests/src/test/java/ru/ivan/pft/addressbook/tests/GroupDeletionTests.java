package ru.ivan.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.ivan.pft.addressbook.model.GroupData;


public class GroupDeletionTests extends TestBase {

  @Test
  public void testGroupDeletionTests() throws Exception {
    app.getNavigationHelper().gotoGroupPage();
    if (!app.getGroupHelper().isThereAGroup()){
      app.getGroupHelper().createGroup(new GroupData("name", null, null));
    }
    app.getGroupHelper().selectFirstGroup();
    app.getGroupHelper().deleteSelectedGroups();
    app.getGroupHelper().gotoGroupPage();
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
