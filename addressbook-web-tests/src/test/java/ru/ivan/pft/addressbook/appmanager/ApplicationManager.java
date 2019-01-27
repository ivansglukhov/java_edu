package ru.ivan.pft.addressbook.appmanager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    WebDriver webDrv;
    private SessionHelper sessionHelper;
    private  NavigationHelper navigationHelper;
    private  GroupHelper groupHelper;
    private  ContactHelper contactHelper;
    private String browser;

    public ApplicationManager(String browser) {
        this.browser = browser;
    }

    public void init() {
        //int browser = BrowserType.INTERNET_EXPLORER;
        //int browser = BrowserType.MOZILLA;
        System.out.println(browser);
        if (browser.equals("firefox")){
            webDrv = new FirefoxDriver();
        } else if (browser.equals("internet explorer")){ //как же он, зараза, медленно работает!!!
            webDrv = new InternetExplorerDriver();
        }
        else if (browser.equals("chrome")){
        webDrv = new ChromeDriver();
    }

        webDrv.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        webDrv.get("http://localhost/addressbook/");
        groupHelper = new GroupHelper(webDrv);
        navigationHelper = new NavigationHelper(webDrv);
        sessionHelper= new SessionHelper(webDrv);
        contactHelper = new ContactHelper(webDrv);
        sessionHelper.login("admin", "secret");
    }



    public void logout() {
      webDrv.findElement(By.linkText("Logout")).click();
    }

    public void stop() {
        webDrv.quit();
    }



    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }
    public ContactHelper getContactHelper() {
        return contactHelper;
    }
}
