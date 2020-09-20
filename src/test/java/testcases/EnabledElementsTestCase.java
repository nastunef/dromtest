package testcases;

//----------------------------------------
// Кейс 2
// Проверка доступности элементов для использования
//------------------------------------

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobject.MainPage;
import utils.MyAndroidDriver;

import java.net.MalformedURLException;

public class EnabledElementsTestCase {
    private MyAndroidDriver myAndroidDriver;
    private MainPage mainPage;

    @BeforeMethod
    public void setup () throws MalformedURLException {
        myAndroidDriver = new MyAndroidDriver();
        mainPage = new MainPage(myAndroidDriver.initDriver());
        mainPage.clearAll();
    }

    //Доступность первого(левого поля)
    @Test
    public void inputFiledLeftEnabled(){
        Assert.assertTrue(mainPage.inputFiledLeftEnabled());
    }

    //доступность второго(правого) поля
    @Test
    public void inputFiledRightEnabled(){
        Assert.assertTrue(mainPage.inputFiledRightEnabled());
    }

    //доступность кнопки +
    @Test
    public void additionButtonEnabled(){ Assert.assertTrue(mainPage.addButtonEnabled()); }

    //доступность кнопки -
    @Test
    public void subtractButtonEnabled(){ Assert.assertTrue(mainPage.subtractButtonEnabled()); }

    //доступность кнопки *
    @Test
    public void multiplicationButtonEnabled(){ Assert.assertTrue(mainPage.multiplicationButtonEnabled()); }

    //доспность кнопки /
    @Test
    public void divisionButtonEnabled(){ Assert.assertTrue(mainPage.divisionButtonEnabled()); }

    //доступность кнопки reset(сброс)
    @Test
    public void resetButtonEnabled(){ Assert.assertTrue(mainPage.resetButtonEnabled()); }

    @AfterMethod
    public void teardown(){
        mainPage.quitDriver();
    }

}
