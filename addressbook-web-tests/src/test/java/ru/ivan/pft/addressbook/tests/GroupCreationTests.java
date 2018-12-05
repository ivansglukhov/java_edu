package ru.ivan.pft.addressbook.tests;


import org.testng.annotations.Test;
import ru.ivan.pft.addressbook.model.GroupData;


public class GroupCreationTests extends TestBase{


  @Test
  public void testGroupCreation() throws Exception {
    app.gotoGroupPage();
    app.initGroupCreation();
    app.fillGroupForm(new GroupData("name", "hdr", "ftr"));
    app.submitGroup();
    app.gotoGroupPage();
  }


}
