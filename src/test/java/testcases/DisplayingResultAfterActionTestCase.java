package testcases;

//----------------------------------------
// Кейс 6
// Проверка отображения результата после клика на кнопки
//------------------------------------

import io.appium.java_client.android.nativekey.AndroidKey;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobject.MainPage;
import utils.MyAndroidDriver;

import java.net.MalformedURLException;

public class DisplayingResultAfterActionTestCase {

    private MyAndroidDriver myAndroidDriver;
    private MainPage mainPage;

    @BeforeMethod
    public void setup () throws MalformedURLException {
        myAndroidDriver = new MyAndroidDriver();
        mainPage = new MainPage(myAndroidDriver.initDriver());
        mainPage.clearAll();

        mainPage.inputFiledLeftClick();
        mainPage.pressKey(AndroidKey.NUMPAD_6);
        mainPage.inputFiledRightClick();
        mainPage.pressKey(AndroidKey.NUMPAD_2);
    }

    //после выполнения сложения
    @Test
    public void resultTextViewDisplayedAfterAdd(){
        mainPage.inputFiledLeftClick();
        mainPage.pressKey(AndroidKey.NUMPAD_2);
        mainPage.inputFiledRightClick();
        mainPage.pressKey(AndroidKey.NUMPAD_6);
        mainPage.additionButtonClick();

        Assert.assertFalse("".equals(mainPage.getRealResultText()));
    }

    //после выполнения деления
    @Test
    public void resultTextViewDisplayedAfterDiv(){
        mainPage.divisionButtonClick();
        Assert.assertFalse("".equals(mainPage.getRealResultText()));
    }

    //после выполнения умножения
    @Test
    public void resultTextViewDisplayedAfterMultiplication(){
        mainPage.multiplicationButtonClick();
        Assert.assertFalse("".equals(mainPage.getRealResultText()));
    }

    //после выполнения вычитания
    @Test
    public void resultTextViewDisplayedAfterSubtract(){
        mainPage.subtractButtonClick();
        Assert.assertFalse("".equals(mainPage.getRealResultText()));
    }

    //после клика на reset текст с результатом предыдущего вычисления должен очиститься
    @Test
    public void resultTextViewDisplayedAfterReset(){
        //складываем числа и получаем результат
        mainPage.add();
        //сбрасываем данные
        mainPage.reset();
        Assert.assertTrue("".equals(mainPage.getRealResultText()));
    }

    @AfterMethod
    public void teardown(){
        mainPage.quitDriver();
    }

}
