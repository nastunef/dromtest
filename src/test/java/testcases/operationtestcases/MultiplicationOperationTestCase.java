package testcases.operationtestcases;

//----------------------------------------
// Кейс 9
// тесты для операции умножения
//----------------------------------------

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobject.MainPage;
import utils.MyAndroidDriver;

import java.net.MalformedURLException;

public class MultiplicationOperationTestCase {

    private MyAndroidDriver myAndroidDriver;
    private MainPage mainPage;

    private String inputOne;
    private String inputTwo;
    private String result;

    private final String OPERATION = "*";

    @BeforeMethod
    public void setup () throws MalformedURLException {
        myAndroidDriver = new MyAndroidDriver();
        mainPage = new MainPage(myAndroidDriver.initDriver());
        mainPage.clearAll();
    }

    //Ввод первого множителя
    @Test
    public void multiplicationOneTermLeftTest(){
        //ввод 2 в левое поле и нажатие на *
        result = "Please, fill the input fields correctly";
        inputOne = "2";
        inputTwo = "";
        //ожидаемый результат
        String expectedResultText = result;
        //умножение
        mainPage.multiplication(inputOne, inputTwo);
        //реальный результат
        String realResultText = mainPage.getRealResultText();

        Assert.assertTrue(expectedResultText.equals(realResultText));
    }

    //Ввод второго множителя
    @Test
    public void multiplicationOneTermRightTest(){
        //ввод 2 в правое поле и нажатие на *
        result = "Please, fill the input fields correctly";
        inputOne = "";
        inputTwo = "2";
        //ожидаемый результат
        String expectedResultText = result;
        //умножение
        mainPage.multiplication(inputOne, inputTwo);
        //реальный результат
        String realResultText = mainPage.getRealResultText();

        Assert.assertTrue(expectedResultText.equals(realResultText));
    }

    // Умножение простых чисел без запятой
    @Test
    public void multiplicationSimpleTest (){
        // 10 * 2 = 20
        inputOne = "10";
        inputTwo = "2";
        result = "20";
        mainPage.multiplication(inputOne, inputTwo);
        //реальный результат
        String realResultText = mainPage.getRealResultText();
        //ожидаемый результат
        String expectedResultText = mainPage.getExpectedResultText(inputOne,inputTwo,OPERATION, result);
        Assert.assertTrue(expectedResultText.equals(realResultText));
    }

    //Умножение дробного числа на дробное
    @Test
    public void multiplicationFractionalFractionalTest (){
        // 10.222 * 2.1 = 21.4662
        inputOne = "10.222";
        inputTwo = "2.1";
        result = "21.4662";
        mainPage.multiplication(inputOne, inputTwo);
        //реальный результат
        String realResultText = mainPage.getRealResultText();
        //ожидаемый результат
        String expectedResultText = mainPage.getExpectedResultText(inputOne,inputTwo,OPERATION, result);
        Assert.assertTrue(expectedResultText.equals(realResultText));
    }

    //Умножение дробного на целое
    @Test
    public void multiplicationFractionalIntegerTest (){
        // 10.222 * 2 = 20.444
        inputOne = "10.222";
        inputTwo = "2";
        result = "20.444";
        mainPage.multiplication(inputOne, inputTwo);
        //реальный результат
        String realResultText = mainPage.getRealResultText();
        //ожидаемый результат
        String expectedResultText = mainPage.getExpectedResultText(inputOne,inputTwo,OPERATION, result);
        Assert.assertTrue(expectedResultText.equals(realResultText));
    }

    //Умножение дробного на 0
    @Test
    public void multiplicationNullTest (){
        // 10.666 * 0 = 0
        inputOne = "10.666";
        inputTwo = "0";
        result = "0";
        mainPage.multiplication(inputOne, inputTwo);
        //реальный результат
        String realResultText = mainPage.getRealResultText();
        //ожидаемый результат
        String expectedResultText = result;
        Assert.assertTrue(expectedResultText.equals(realResultText));
    }

    //Умножение на отрицательное число
    @Test
    public void multiplicationIntegerNegativeIntegerTest (){
        // 10 * (-2) = -20
        inputOne = "10";
        inputTwo = "-2";
        result = "-20";
        mainPage.multiplication(inputOne, inputTwo);
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
