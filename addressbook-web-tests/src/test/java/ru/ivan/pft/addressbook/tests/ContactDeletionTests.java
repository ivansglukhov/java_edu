package ru.ivan.pft.addressbook.tests;

import org.testng.annotations.Test;

public class ContactDeletionTests extends TestBase {

    @Test
    public void testContactDeletion(){
        app.getNavigationHelper().gotoContactPage();
        app.getContactHelper().selectFirstContact();
        app.getContactHelper().deleteSelectedContact();
        app.getContactHelper().closeDialogWindow();
    }
}
