package ru.ivan.pft.addressbook.tests;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.ivan.pft.addressbook.model.ContactData;

public class ContactCreation extends TestBase {

  @Test
  public void testContactModification(){
    ContactData newData = new ContactData("Peter", "The", "Great", "GTG", "+0000", "some.random.email@gmail.com","name");
    app.getNavigationHelper().gotoContactPage();
    app.getContactHelper().addNewContact();
    app.getContactHelper().fillContactForm(newData,true );
    app.getContactHelper().SubmitContactContact();
    //app.getContactHelper().updateEditedContact();

  }
}


//public class ContactCreation {
//  private WebDriver wd;
//
//  @BeforeMethod(alwaysRun = true)
//  public void setUp() throws Exception {
//    wd = new FirefoxDriver();
//    wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//    wd.get("http://localhost/addressbook/group.php");
//    login("admin", "secret");
//  }
//
//  @Test
//  public void testContactCreation() throws Exception {
//    ContactData cd1 = new ContactData("Ivan", "S", "Glukhov", "GIS", "+7777777", "ivan.s.glukhov@gmail.com");
//    ContactData cd2 = new ContactData("Peter", "The", "Great", "GTG", "+noSuchThing", "some.random.email@gmail.com");
//    initContactCreation();
//    fillContactData(cd1);
//    submitContactData();
//    initContactCreation();
//    //fillContactData(new ContactData("Ivan", "S", "Glukhov", "GIS", "+7777777", "ivan.s.glukhov@gmail.com"));
//    fillContactData(cd2);
//    submitContactData();
//  }
//
//  private void submitContactData() {
//    wd.findElement(By.xpath("//div[@id='content']/form/input[21]")).click();
//  }
//
//  private void fillContactData(ContactData contactData) {
//    wd.findElement(By.name("firstname")).click();
//    wd.findElement(By.name("firstname")).clear();
//    wd.findElement(By.name("firstname")).sendKeys(contactData.getName());
//    wd.findElement(By.name("middlename")).clear();
//    wd.findElement(By.name("middlename")).sendKeys(contactData.getMidName());
//    wd.findElement(By.name("lastname")).clear();
//    wd.findElement(By.name("lastname")).sendKeys(contactData.getLastName());
//    wd.findElement(By.name("nickname")).clear();
//    wd.findElement(By.name("nickname")).sendKeys(contactData.getNickName());
//    wd.findElement(By.name("home")).clear();
//    wd.findElement(By.name("home")).sendKeys(contactData.getPhone());
//    wd.findElement(By.name("email")).clear();
//    wd.findElement(By.name("email")).sendKeys(contactData.getEmail());
//  }
//
//  private void initContactCreation() {
//    wd.findElement(By.linkText("add new")).click();
//  }
//
//  private void login(String username, String pass) {
//    wd.findElement(By.name("user")).click();
//    wd.findElement(By.name("user")).clear();
//    wd.findElement(By.name("user")).sendKeys(username);
//    wd.findElement(By.id("LoginForm")).click();
//    wd.findElement(By.name("pass")).click();
//    wd.findElement(By.name("pass")).clear();
//    wd.findElement(By.name("pass")).sendKeys(pass);
//    wd.findElement(By.xpath("//input[@value='Login']")).click();
//  }
//  @AfterMethod(alwaysRun = true)
//  public void tearDown() throws Exception {
//    wd.quit();
//
//  }
//
//  private boolean isElementPresent(By by) {
//    try {
//      wd.findElement(by);
//      return true;
//    } catch (NoSuchElementException e) {
//      return false;
//    }
//  }
//
//  private boolean isAlertPresent() {
//    try {
//      wd.switchTo().alert();
//      return true;
//    } catch (NoAlertPresentException e) {
//      return false;
//    }
//  }
//
//
//}
