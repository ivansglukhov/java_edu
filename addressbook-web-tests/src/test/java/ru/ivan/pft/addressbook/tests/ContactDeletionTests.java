package ru.ivan.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.ivan.pft.addressbook.model.ContactData;

import java.util.List;

public class ContactDeletionTests extends TestBase {

    @Test
    public void testContactDeletion(){
        app.getNavigationHelper().gotoContactPage();
        if (!app.getContactHelper().isThereAnyone()){
            app.getContactHelper().createContact(new ContactData(0,"Peter", null, "Great", null,null,null,null));
        }
        List<ContactData> before = app.getContactHelper().getContactList();
        app.getContactHelper().selectFirstContact();
        app.getContactHelper().deleteSelectedContact();
        app.getContactHelper().closeDialogWindow();
        List<ContactData> after = app.getContactHelper().getContactList();
        before.remove(before.size() -1);
        Assert.assertEquals(after, before);
    }
}
