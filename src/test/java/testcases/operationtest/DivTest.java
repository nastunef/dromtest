//----------------------------------------
// тесты для деления
//----------------------------------------

package testcases.operationtest;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobject.MainPage;
import utils.MyAndroidDriver;

import java.net.MalformedURLException;

public class DivTest {

    private MyAndroidDriver myAndroidDriver;
    private MainPage mainPage;

    private String inputOne;
    private String inputTwo;
    private String result;

    private final String OPERATION = "/";

    @BeforeMethod
    public void setup () throws MalformedURLException {
        myAndroidDriver = new MyAndroidDriver();
        mainPage = new MainPage(myAndroidDriver.initDriver());
        mainPage.clearAll();
    }

    //Деление простых чисел без запятой
    @Test
    public void divSimpleTest (){
        // 10 / 2 = 5
        inputOne = "10";
        inputTwo = "2";
        result = "5";
        mainPage.div(inputOne, inputTwo);
        //реальный результат
        String realResultText = mainPage.getRealResultText();
        //ожидаемый результат
        String expectedResultText = mainPage.getExpectedResultText(inputOne,inputTwo,OPERATION, result);
        Assert.assertTrue(expectedResultText.equals(realResultText));
    }

    //Деление дробного числа на дробное
    @Test
    public void divFractionalFractionalTest (){
        // 10.222 / 2.1 = 4.86761905
        inputOne = "10.222";
        inputTwo = "2.1";
        result = "4.86761905";
        mainPage.div(inputOne, inputTwo);
        //реальный результат
        String realResultText = mainPage.getRealResultText();
        //ожидаемый результат
        String expectedResultText = mainPage.getExpectedResultText(inputOne,inputTwo,OPERATION, result);
        Assert.assertTrue(expectedResultText.equals(realResultText));
    }

    //Деление дробного на целое
    @Test
    public void divFractionalIntegerTest (){
        // 10.666 / 2 = 5.333
        inputOne = "10.666";
        inputTwo = "2";
        result = "5.333";
        mainPage.div(inputOne, inputTwo);
        //реальный результат
        String realResultText = mainPage.getRealResultText();
        //ожидаемый результат
        String expectedResultText = mainPage.getExpectedResultText(inputOne,inputTwo,OPERATION, result);
        Assert.assertTrue(expectedResultText.equals(realResultText));
    }

    //Деление дробного на 0
    @Test
    public void divNullTest (){
        // 10.666 / 0
        // Сообщить об ошибке
        inputOne = "10.666";
        inputTwo = "0";
        result = "Ошибка";
        mainPage.div(inputOne, inputTwo);
        //реальный результат
        String realResultText = mainPage.getRealResultText();
        //ожидаемый результат
        String expectedResultText = result;
        Assert.assertTrue(expectedResultText.equals(realResultText));
    }

    //Деление дробного на целое отрицательное
    @Test
    public void divIntegerNegativeIntegerTest (){
        // 10 / -2 = -5
        inputOne = "10";
        inputTwo = "-2";
        result = "5";
        mainPage.div(inputOne, inputTwo);
        //реальный результат
        String realResultText = mainPage.getRealResultText();
        //ожидаемый результат
        String expectedResultText = mainPage.getExpectedResultText(inputOne,inputTwo,OPERATION, result);
        Assert.assertTrue(expectedResultText.equals(realResultText));
    }

    @AfterMethod
    public void teardown(){
        mainPage.quitDriver();
    }
}
