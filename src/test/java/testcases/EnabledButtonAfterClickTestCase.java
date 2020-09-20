package testcases;

//----------------------------------------
// Кейс 3
// Доступность кнопки после клика на нее
//----------------------------------------

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobject.MainPage;
import utils.MyAndroidDriver;

import java.net.MalformedURLException;

public class EnabledButtonAfterClickTestCase {

    private MyAndroidDriver myAndroidDriver;
    private MainPage mainPage;

    @BeforeMethod
    public void setup () throws MalformedURLException {
        myAndroidDriver = new MyAndroidDriver();
        mainPage = new MainPage(myAndroidDriver.initDriver());
        mainPage.clearAll();
    }

    //клик на плюс
    @Test
    public void additionButtonEnabledAfterClick(){
        mainPage.additionButtonClick();
        Assert.assertTrue(mainPage.addButtonEnabled());
    }

    //клик на минус
    @Test
    public void subtractButtonEnabledAfterClick(){
        mainPage.subtractButtonClick();
        Assert.assertTrue(mainPage.subtractButtonEnabled());
    }

    //клик на умножить
    @Test
    public void multiplicationButtonEnabledAfterClick(){
        mainPage.multiplicationButtonClick();
        Assert.assertTrue(mainPage.multiplicationButtonEnabled());
    }

    //клик на деление
    @Test
    public void divisionButtonEnabledAfterClick(){
        mainPage.divisionButtonClick();
        Assert.assertTrue(mainPage.divisionButtonEnabled());
    }

    //клик на сброс
    @Test
    public void resetButtonEnabledAfterClick(){
        mainPage.resetButtonClick();
        Assert.assertTrue(mainPage.resetButtonEnabled());
    }

    @AfterMethod
    public void teardown(){
        mainPage.quitDriver();
    }
}
