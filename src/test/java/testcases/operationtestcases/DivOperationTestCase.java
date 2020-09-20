package testcases.operationtestcases;

//----------------------------------------
// Кейс 8
// тесты для операции деления
//----------------------------------------

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobject.MainPage;
import utils.MyAndroidDriver;

import java.net.MalformedURLException;

public class DivOperationTestCase {

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

    //Ввод только делимого
    @Test
    public void divOneTermLeftTest(){
        //ввод 2 в левое поле и нажатие на /
        result = "Please, fill the input fields correctly";
        inputOne = "2";
        inputTwo = "";
        //ожидаемый результат
        String expectedResultText = result;
        //деление
        mainPage.div(inputOne, inputTwo);
        //реальный результат
        String realResultText = mainPage.getRealResultText();

        Assert.assertTrue(expectedResultText.equals(realResultText));
    }

    //Ввод только делителя
    @Test
    public void divOneTermRightTest(){
        //ввод 2 в правое поле и нажатие на /
        result = "Please, fill the input fields correctly";
        inputOne = "";
        inputTwo = "2";
        //ожидаемый результат
        String expectedResultText = result;
        //деление
        mainPage.div(inputOne, inputTwo);
        //реальный результат
        String realResultText = mainPage.getRealResultText();

        Assert.assertTrue(expectedResultText.equals(realResultText));
    }

    //Деление простых чисел без запятой
    @Test
    public void divSimpleTest (){
        // 10 / 2 = 5
        inputOne = "10";
        inputTwo = "2";
        result = "5";
        //ожидаемый результат
        String expectedResultText = mainPage.getExpectedResultText(inputOne,inputTwo,OPERATION, result);
        //деление
        mainPage.div(inputOne, inputTwo);
        //реальный результат
        String realResultText = mainPage.getRealResultText();

        Assert.assertTrue(expectedResultText.equals(realResultText));
    }

    //Деление дробного числа на дробное
    @Test
    public void divFractionalFractionalTest (){
        // 10.222 / 2.1 = 4.86761905
        inputOne = "10.222";
        inputTwo = "2.1";
        result = "4.86761905";
        //ожидаемый результат
        String expectedResultText = mainPage.getExpectedResultText(inputOne,inputTwo,OPERATION, result);
        //деление
        mainPage.div(inputOne, inputTwo);
        //реальный результат
        String realResultText = mainPage.getRealResultText();

        Assert.assertTrue(expectedResultText.equals(realResultText));
    }

    //Деление дробного на целое
    @Test
    public void divFractionalIntegerTest (){
        // 10.666 / 2 = 5.333
        inputOne = "10.666";
        inputTwo = "2";
        result = "5.333";
        //ожидаемый результат
        String expectedResultText = mainPage.getExpectedResultText(inputOne,inputTwo,OPERATION, result);
        //деление
        mainPage.div(inputOne, inputTwo);
        //реальный результат
        String realResultText = mainPage.getRealResultText();

        Assert.assertTrue(expectedResultText.equals(realResultText));
    }

    //Деление дробного на 0
    @Test
    public void divNullTest (){
        // 10.666 / 0
        inputOne = "10.666";
        inputTwo = "0";
        result = "Infinity";
        //ожидаемый результат
        String expectedResultText = mainPage.getExpectedResultText(inputOne, inputTwo, OPERATION, result);
        //деление
        mainPage.div(inputOne, inputTwo);
        //реальный результат
        String realResultText = mainPage.getRealResultText();

        Assert.assertTrue(expectedResultText.equals(realResultText));
    }

    //Деление дробного на целое отрицательное
    @Test
    public void divIntegerNegativeIntegerTest (){
        // 10 / -2 = -5
        inputOne = "10";
        inputTwo = "-2";
        result = "5";
        //ожидаемый результат
        String expectedResultText = mainPage.getExpectedResultText(inputOne,inputTwo,OPERATION, result);
        //деление
        mainPage.div(inputOne, inputTwo);
        //реальный результат
        String realResultText = mainPage.getRealResultText();

        Assert.assertTrue(expectedResultText.equals(realResultText));
    }

    @AfterMethod
    public void teardown(){
        mainPage.quitDriver();
    }
}
