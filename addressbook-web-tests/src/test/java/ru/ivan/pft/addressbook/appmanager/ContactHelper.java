package ru.ivan.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.ivan.pft.addressbook.model.ContactData;



public class ContactHelper extends HelperBase {

    public ContactHelper(WebDriver wd) {
        super(wd);
    }

    public void selectFirstContact() {
        click(By.name("selected[]"));
    }

    public void deleteSelectedContact() {
        click(By.xpath("//input[@value='Delete']"));
    }
    public void editSelectedContact() {
        click(By.xpath("//img[@alt='Edit']"));
    }
    public void updateEditedContact(){
        click(By.xpath("//input[@name='update']"));
    }

    public void closeDialogWindow(){
        wd.switchTo().alert().accept();
    }

    public void fillContactForm(ContactData contactData) {
        type(By.name("firstname"), contactData.getName());
        type(By.name("middlename"), contactData.getMidName());
        type(By.name("lastname"), contactData.getLastName());
        type(By.name("nickname"), contactData.getNickName());
        type(By.name("home"), contactData.getPhone());
        type(By.name("email"), contactData.getEmail());
    }
}
