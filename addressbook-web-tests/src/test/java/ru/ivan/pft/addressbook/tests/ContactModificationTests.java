package ru.ivan.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.ivan.pft.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase {

    @Test
    public void testContactModification(){
        ContactData newData = new ContactData("ModifiedPeter", "ModifiedThe", "ModifiedGreat", "ModifiedGTG", "+0000", "some.Modifiedrandom.email@gmail.com");
        app.getNavigationHelper().gotoContactPage();
        app.getContactHelper().selectFirstContact();//Возможно лишнее, так как, кнопка edit своя у каждого контакта
        app.getContactHelper().editSelectedContact();
        app.getContactHelper().fillContactForm(newData);
        app.getContactHelper().updateEditedContact();

    }
}
