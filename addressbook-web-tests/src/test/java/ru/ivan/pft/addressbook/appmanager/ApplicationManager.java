package ru.ivan.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.ivan.pft.addressbook.model.GroupData;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    WebDriver wd;

    public void init() {
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        wd.get("http://localhost/addressbook/group.php");
        login("admin", "secret");
    }

    public void login(String username, String pass) {
      wd.findElement(By.name("user")).click();
      wd.findElement(By.name("user")).clear();
      wd.findElement(By.name("user")).sendKeys(username);
      wd.findElement(By.id("LoginForm")).click();
      wd.findElement(By.name("pass")).click();
      wd.findElement(By.name("pass")).clear();
      wd.findElement(By.name("pass")).sendKeys(pass);
      wd.findElement(By.xpath("//input[@value='Login']")).click();
    }

    public void logout() {
      wd.findElement(By.linkText("Logout")).click();
    }

    public void submitGroup() {
      wd.findElement(By.name("submit")).click();
    }

    public void initGroupCreation() {
      wd.findElement(By.name("new")).click();
    }

    public void gotoGroupPage() {
      wd.findElement(By.linkText("groups")).click();
    }

    public void fillGroupForm(GroupData groupData) {
      wd.findElement(By.name("group_name")).click();
      wd.findElement(By.name("group_name")).clear();
      wd.findElement(By.name("group_name")).sendKeys(groupData.getGroupName());
      wd.findElement(By.name("group_header")).click();
      wd.findElement(By.name("group_header")).clear();
      wd.findElement(By.name("group_header")).sendKeys(groupData.getGroupHeader());
      wd.findElement(By.name("group_footer")).click();
      wd.findElement(By.name("group_footer")).clear();
      wd.findElement(By.name("group_footer")).sendKeys(groupData.getGroupFooter());
    }

    public void stop() {
        wd.quit();
    }

    public boolean isAlertPresent() {
      try {
        wd.switchTo().alert();
        return true;
      } catch (NoAlertPresentException e) {
        return false;
      }
    }

    public void deleteSelectedGroups() {
      wd.findElement(By.name("delete")).click();
    }

    public void selectFirstGroup() {
      wd.findElement(By.name("selected[]")).click();
    }
}
