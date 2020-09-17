//----------------------------------------
// тесты для вычитания
//----------------------------------------

package testcases.operationtest;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobject.MainPage;
import utils.MyAndroidDriver;

import java.net.MalformedURLException;

public class SubtractTest {
    private MyAndroidDriver myAndroidDriver;
    private MainPage mainPage;

    private String inputOne;
    private String inputTwo;
    private String result;

    private final String OPERATION = "-";

    @BeforeMethod
    public void setup () throws MalformedURLException {
        myAndroidDriver = new MyAndroidDriver();
        mainPage = new MainPage(myAndroidDriver.initDriver());
        mainPage.clearAll();
    }

    //разность простых чисел без запятой
    @Test
    public void subtractSimpleTest (){
        // 1 - 2 = -1
        inputOne = "1";
        inputTwo = "2";
        result = "-1";
        mainPage.subtract(inputOne, inputTwo);
        //реальный результат
        String realResultText = mainPage.getRealResultText();
        //ожидаемый результат
        String expectedResultText = mainPage.getExpectedResultText(inputOne,inputTwo,OPERATION, result);
        Assert.assertTrue(expectedResultText.equals(realResultText));
    }

    //разность целого и дробного чисел
    @Test
    public void subtractIntegerAndFractionalTest(){
        //1 - 12.4444444 = -11.4444444
        inputOne = "1";
        inputTwo = "12.4444444";
        result = "-11.4444444";
        mainPage.subtract(inputOne, inputTwo);
        //реальный результат
        String realResultText = mainPage.getRealResultText();
        //ожидаемый результат
        String expectedResultText = mainPage.getExpectedResultText(inputOne,inputTwo,OPERATION, result);
        Assert.assertTrue(expectedResultText.equals(realResultText));
    }

    //разность дробного и дробного чисел
    @Test
    public void subtractFractionalAndFractionalTest(){
        //1.1 - 12.4444444 = -11.3444444
        inputOne = "1.1";
        inputTwo = "12.4444444";
        result = "-11.3444444";
        mainPage.subtract(inputOne, inputTwo);
        //реальный результат
        String realResultText = mainPage.getRealResultText();
        //ожидаемый результат
        String expectedResultText = mainPage.getExpectedResultText(inputOne,inputTwo,OPERATION, result);
        Assert.assertTrue(expectedResultText.equals(realResultText));
    }

    //разность двух целых чисел
    @Test
    public void subtractIntegerIntegerTest(){
        //111 - 111 = 0
        inputOne = "111";
        inputTwo = "111";
        result = "0";
        mainPage.subtract(inputOne, inputTwo);
        //реальный результат
        String realResultText = result;
        //ожидаемый результат
        String expectedResultText = mainPage.getExpectedResultText(inputOne,inputTwo,OPERATION, result);
        Assert.assertTrue(expectedResultText.equals(realResultText));
    }

    @AfterMethod
    public void teardown(){
        mainPage.quitDriver();
    }
}
