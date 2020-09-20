package testcases.operationtestcases;

//----------------------------------------
// Кейс 7
// тесты для операции сложения
//----------------------------------------

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobject.MainPage;
import utils.MyAndroidDriver;

import java.net.MalformedURLException;


public class AdditionOperationTestCase {

    private MyAndroidDriver myAndroidDriver;
    private MainPage mainPage;

    private String inputOne;
    private String inputTwo;
    private String result;

    private final String OPERATION = "+";

    @BeforeMethod
    public void setup () throws MalformedURLException {
        myAndroidDriver = new MyAndroidDriver();
        mainPage = new MainPage(myAndroidDriver.initDriver());
        mainPage.clearAll();
    }

    //Ввод только первого слагаемого
    @Test
    public void addOneTermLeft(){
        //ввод 2 в левое поле и нажатие на +
        result = "Please, fill the input fields correctly";
        inputOne = "2";
        inputTwo = "";
        //ожидаемый результат
        String expectedResultText = result;
        //сложение
        mainPage.add(inputOne, inputTwo);
        //реальный результат
        String realResultText = mainPage.getRealResultText();

        Assert.assertTrue(expectedResultText.equals(realResultText));
    }

    //Ввод только второго слагаемого
    @Test
    public void addOneTermRight(){
        //ввод 2 в правое поле и нажатие на +
        result = "Please, fill the input fields correctly";
        inputOne = "";
        inputTwo = "2";
        //ожидаемый результат
        String expectedResultText = result;
        //сложение
        mainPage.add(inputOne, inputTwo);
        //реальный результат
        String realResultText = mainPage.getRealResultText();

        Assert.assertTrue(expectedResultText.equals(realResultText));
    }

    //Сложение простых чисел без запятой
    @Test
    public void addSimpleTest (){
        // 1 + 2 = 3
         inputOne = "1";
         inputTwo = "2";
         result = "3";
        //ожидаемый результат
        String expectedResultText = mainPage.getExpectedResultText(inputOne,inputTwo,OPERATION, result);
        //сложение
        mainPage.add(inputOne, inputTwo);
        //реальный результат
        String realResultText = mainPage.getRealResultText();

        Assert.assertTrue(expectedResultText.equals(realResultText));
    }

    //сложение целого и дробного
    @Test
    public void addIntAndFractionalTest(){
        //1 + 12.4444444 = "13.4444444
        inputOne = "1";
        inputTwo = "12.4444444";
        result = "13.4444444";
        //ожидаемый результат
        String expectedResultText = mainPage.getExpectedResultText(inputOne,inputTwo,OPERATION, result);
        //сложение
        mainPage.add(inputOne, inputTwo);
        //реальный результат
        String realResultText = mainPage.getRealResultText();

        Assert.assertTrue(expectedResultText.equals(realResultText));
    }

    //сложение дробного и дробного
    @Test
    public void addFractionalAndFractionalTest(){
        //1.1 + 12.4444444 = "13.5444444
        inputOne = "1.1";
        inputTwo = "12.4444444";
        result = "13.5444444";
        //ожидаемый результат
        String expectedResultText = mainPage.getExpectedResultText(inputOne,inputTwo,OPERATION, result);
        //сложение
        mainPage.add(inputOne, inputTwo);
        //реальный результат
        String realResultText = mainPage.getRealResultText();

        Assert.assertTrue(expectedResultText.equals(realResultText));
    }

    //сложение больших дробных чисел
    @Test
    public void addLongFractionalAndFractionalTest(){
        //1.4444446 + 12.4444444 = "13,888889
        inputOne = "1.4444446";
        inputTwo = "12.4444444";
        result = "13.888889";
        //ожидаемый результат
        String expectedResultText = mainPage.getExpectedResultText(inputOne,inputTwo,OPERATION, result);
        //сложение
        mainPage.add(inputOne, inputTwo);
        //реальный результат
        String realResultText = mainPage.getRealResultText();

        Assert.assertTrue(expectedResultText.equals(realResultText));
    }

    //сложение отрицательного целого числа и положительного
    @Test
    public void addNegativeIntegerIntegerTest(){
        //-111 + 111 = 0
        inputOne = "-111";
        inputTwo = "111";
        result = "0";
        //ожидаемый результат
        String expectedResultText = mainPage.getExpectedResultText(inputOne,inputTwo,OPERATION, result);
        //сложение
        mainPage.add(inputOne, inputTwo);
        //реальный результат
        String realResultText = result;

        Assert.assertTrue(expectedResultText.equals(realResultText));
    }

    @AfterMethod
    public void teardown(){
        mainPage.quitDriver();
    }
}
