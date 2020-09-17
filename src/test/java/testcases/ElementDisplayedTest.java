//----------------------------------------
// тесты на видимость элементов приложения
//----------------------------------------

package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobject.MainPage;
import utils.MyAndroidDriver;

import java.net.MalformedURLException;

public class ElementDisplayedTest {
    private MyAndroidDriver myAndroidDriver;
    private MainPage mainPage;



    @BeforeMethod
    public void setup () throws MalformedURLException {
        myAndroidDriver = new MyAndroidDriver();
        mainPage = new MainPage(myAndroidDriver.initDriver());
        mainPage.clearAll();
    }

    //----------------------------------------
    //Отображаются ли все элементы при запуске
    //----------------------------------------

    @Test
    public void inputFiledLeftDisplayed(){
        Assert.assertTrue(mainPage.inputFiledLeftDisplayed());
    }

    @Test
    public void inputFiledRightDisplayed(){
        Assert.assertTrue(mainPage.inputFiledRightDisplayed());
    }

    @Test
    public void additionButtonDisplayed(){
        Assert.assertTrue(mainPage.additionButtonDisplayed());
    }

    @Test
    public void subtractButtonDisplayed(){
        Assert.assertTrue(mainPage.subtractButtonDisplayed());
    }

    @Test
    public void multiplicationButtonDisplayed(){
        Assert.assertTrue(mainPage.multiplicationButtonDisplayed());
    }

    @Test
    public void divisionButtonDisplayed(){
        Assert.assertTrue(mainPage.divisionButtonDisplayed());
    }

    @Test
    public void resetButtonDisplayed(){
        Assert.assertTrue(mainPage.resetButtonDisplayed());
    }

    @Test
    public void resultTextViewDisplayed(){
        Assert.assertTrue(mainPage.resultTextViewDisplayed());
    }

    //----------------------------------------
    //Видимость кнопок после клика на них
    //------------------------------------

    @Test
    public void additionButtonDisplayedAfterClick(){
        mainPage.additionButtonClick();
        Assert.assertTrue(mainPage.additionButtonDisplayed());
    }

    @Test
    public void subtractButtonDisplayedAfterClick(){
        mainPage.subtractButtonClick();
        Assert.assertTrue(mainPage.subtractButtonDisplayed());
    }

    @Test
    public void multiplicationButtonDisplayedAfterClick(){
        mainPage.multiplicationButtonClick();
        Assert.assertTrue(mainPage.multiplicationButtonDisplayed());
    }

    @Test
    public void divisionButtonDisplayedAfterClick(){
        mainPage.divisionButtonClick();
        Assert.assertTrue(mainPage.divisionButtonDisplayed());
    }

    @Test
    public void resetButtonDisplayedAfterClick(){
        mainPage.resetButtonClick();
        Assert.assertTrue(mainPage.resetButtonDisplayed());
    }

    //----------------------------------------
    //отображаются ли результаты после..
    //--------------------------------------------------

    //сложения
    @Test
    public void resultTextViewDisplayedAfterAdd(){
        mainPage.add("4","3");
        Assert.assertFalse("".equals(mainPage.getRealResultText()));
    }

    //деления
    @Test
    public void resultTextViewDisplayedAfterDiv(){
        mainPage.div("4","3");
        Assert.assertFalse("".equals(mainPage.getRealResultText()));
    }

    //умножения
    @Test
    public void resultTextViewDisplayedAfterMultiplication(){
        mainPage.multiplication("4","3");
        Assert.assertFalse("".equals(mainPage.getRealResultText()));
    }

    //разности
    @Test
    public void resultTextViewDisplayedAfterSubtract(){
        mainPage.subtract("4","3");
        Assert.assertFalse("".equals(mainPage.getRealResultText()));
    }

    //сброса результатов
    @Test
    public void resultTextViewDisplayedAfterReset(){
        mainPage.reset();
        System.out.println(mainPage.getRealResultText());
        Assert.assertTrue("".equals(mainPage.getRealResultText()));
    }

    @AfterMethod
    public void teardown(){
        mainPage.quitDriver();
    }
}
