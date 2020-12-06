package seleniumGridJunit.TestCases;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import seleniumGridJunit.Base;
import seleniumGridJunit.HomePage.HomePagePage;

public class LoginTest extends Base {
    HomePagePage homePagePage;
    public LoginTest(){
        super();
    }

    @Before
    public void setup(){
        initialization();
        homePagePage = new HomePagePage();
    }
    @Test
    public void titleTest() {
        String result = homePagePage.getPageTitle();
        Assert.assertEquals("page title is not correct", result, "Allegro - atrakcyjne ceny");
    }

    @Test
    public void elektronikaTest() {


        homePagePage.goToElektronikaTab();
        String Title = driver.getTitle();
        Assert.assertEquals("page title is incorrect", Title, "na potrzeby nauki blad");
    }
    @After
    public void tearDown(){
        driver.quit();
        System.out.println("udalo ci sie debilu zajebany");
    }
}
