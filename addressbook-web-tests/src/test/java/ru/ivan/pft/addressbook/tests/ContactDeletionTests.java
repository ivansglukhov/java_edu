package ru.ivan.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.ivan.pft.addressbook.model.ContactData;

public class ContactDeletionTests extends TestBase {

    @Test
    public void testContactDeletion(){
        app.getNavigationHelper().gotoContactPage();
        if (!app.getContactHelper().isThereAnyone()){
            app.getContactHelper().createContact(new ContactData("Peter", "The", "Great", "GTG", "+0000", "some.random.email@gmail.com","name"));
        }
        app.getContactHelper().selectFirstContact();
        app.getContactHelper().deleteSelectedContact();
        app.getContactHelper().closeDialogWindow();
    }
}
