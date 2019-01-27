package ru.ivan.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.ivan.pft.addressbook.model.ContactData;

import java.util.Comparator;
import java.util.List;

public class ContactModificationTests extends TestBase {

    @Test
    public void testContactModification(){

        app.getNavigationHelper().gotoContactPage();
        List<ContactData> before = app.getContactHelper().getContactList();
        ContactData newData = new ContactData(before.get(before.size()-1).getId(),"ModifiedPeter", "ModifiedThe", "ModifiedGreat", "ModifiedGTG", "+0000", "some.Modifiedrandom.email@gmail.com",null);
        if (!app.getContactHelper().isThereAnyone()){
            app.getContactHelper().createContact(new ContactData(before.get(before.size()-1).getId(),"Peter", "The", "Great", "GTG", "+0000", "some.random.email@gmail.com","name"));
        }
        app.getContactHelper().selectContact(before.size() -1);
        app.getContactHelper().editSelectedContact();
        app.getContactHelper().fillContactForm(newData,false);
        app.getContactHelper().updateEditedContact();
        List<ContactData> after = app.getContactHelper().getContactList();
        Assert.assertEquals(after.size(),before.size());



        Comparator<? super ContactData> byContactId = (c1, c2) -> Integer.compare(c1.getId(),c2.getId());

        before.sort(byContactId);
        after.sort(byContactId);
        before.remove(before.size() -1);
        before.add(newData);
        System.out.println(before);
        System.out.println(after);
        Assert.assertEquals(before,after);

    }
}
