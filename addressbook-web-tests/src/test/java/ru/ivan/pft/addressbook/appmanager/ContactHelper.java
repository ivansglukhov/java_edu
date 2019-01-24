package ru.ivan.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import ru.ivan.pft.addressbook.model.ContactData;



public class ContactHelper extends HelperBase {



    public ContactHelper(WebDriver wd) {
        super(wd);
    }

    public void selectFirstContact() {click(By.name("selected[]")); }
    public void addNewContact() { click(By.linkText("add new")); }
    public void deleteSelectedContact() {
        click(By.xpath("//input[@value='Delete']"));
    }
    public void editSelectedContact() {
        click(By.xpath("//img[@alt='Edit']"));
    }
    public void updateEditedContact(){
        click(By.xpath("//input[@name='update']"));
    }
    public void SubmitContactContact() {click(By.name("submit")); }
    public void closeDialogWindow(){
        wd.switchTo().alert().accept();
    }

    public void fillContactForm(ContactData contactData, boolean creation) {

        type(By.name("firstname"), contactData.getName());
        type(By.name("middlename"), contactData.getMidName());
        type(By.name("lastname"), contactData.getLastName());
        type(By.name("nickname"), contactData.getNickName());
        type(By.name("home"), contactData.getPhone());
        type(By.name("email"), contactData.getEmail());

        if (creation){

            new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
        } else {
            Assert.assertFalse(isElementPresent (By.name("new_group")));
        }


    }


}
