package ru.ivan.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import ru.ivan.pft.addressbook.model.ContactData;

import java.util.ArrayList;
import java.util.List;


public class ContactHelper extends HelperBase {



    public ContactHelper(WebDriver wd) {
        super(wd);
    }

    public void selectFirstContact() {
        click(By.name("selected[]")); }

    public void selectContact(int index){
        wd.findElements(By.name("selected[]")).get(index).click();
    }


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


    public void createContact(ContactData contactData) {
        //ContactData newData = new ContactData("Peter", "The", "Great", "GTG", "+0000", "some.random.email@gmail.com","name");
        ContactData newData = new ContactData(0,"Peter", null, "Great", null, null, null,null);
       addNewContact();
       fillContactForm(newData,true );
       SubmitContactContact();
    }

    public boolean isThereAnyone() {
        return isElementPresent(By.name("selected[]"));
    }

    public List<ContactData> getContactList() {

        List<ContactData> contacts = new ArrayList<ContactData>();
        List<WebElement> elements = wd.findElements(By.name("entry"));

       //List<WebElement> elements = wd.findElements(By.cssSelector("tr[name=entry]"));
        for (WebElement element: elements) {
            int id = Integer.parseInt(element.findElement(By.cssSelector("td")).findElement(By.tagName("input")).getAttribute("value"));
            List<WebElement> cells = element.findElements(By.cssSelector("td"));
            String lastName =cells.get(1).getText();
            String name =cells.get(2).getText();
            ContactData contact = new ContactData(id,name,lastName);
            contacts.add(contact);

           // String id = element.findElement(By.cssSelector("td")).findElement(By.tagName("input")).getAttribute("value");
           // System.out.println(element.findElement(By.cssSelector("input[value= '" + id + "']")).getText());
           // List<WebElement> cells = element.findElements(By.cssSelector("td"));
            //System.out.println(cells.get(0).getText());
            //System.out.println(element.cells.get(0));
            //String id = element.findElement(By.cssSelector("td")).findElement(By.tagName("input")).getAttribute("value");
//            List<WebElement> cells = element.findElements(By.cssSelector("td"));
//            System.out.println(cells.get(0) +  " " + cells.get(1));



        }

//        List<GroupData> groups = new ArrayList<GroupData>();
//        List<WebElement> elements = wd.findElements(By.cssSelector("span.group"));
//        for (WebElement element: elements){
//            String name = element.getText();
//            int id = Integer.parseInt(element.findElement(By.tagName("input")).getAttribute("value"));
//            GroupData group = new GroupData(id, name,null, null);
//            groups.add(group);
//        }
//        return groups;
        return contacts;
    }
}
