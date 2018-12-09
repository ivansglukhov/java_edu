package ru.ivan.pft.addressbook.tests;

import org.testng.annotations.Test;


public class GroupDeletionTests extends TestBase {

  @Test
  public void testGroupDeletionTests() throws Exception {
    app.getNavigationHelper().gotoGroupPage();
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
