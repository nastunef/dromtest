package testcases;

//----------------------------------------------
// Кейс 1
// Тесты для проверки отображения элементов
//----------------------------------------------

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobject.MainPage;
import utils.MyAndroidDriver;

import java.net.MalformedURLException;

public class DisplayingElementsTestCase {


    private MyAndroidDriver myAndroidDriver;
    private MainPage mainPage;

    @BeforeMethod
    public void setup () throws MalformedURLException {
        myAndroidDriver = new MyAndroidDriver();
        mainPage = new MainPage(myAndroidDriver.initDriver());
        mainPage.clearAll();
    }

    //отображение первого(левого) поля для ввода числа
    @Test
    public void inputFiledLeftDisplayed(){
        Assert.assertTrue(mainPage.inputFiledLeftDisplayed());
    }

    //отображение второго(правого) поля для ввода числа
    @Test
    public void inputFiledRightDisplayed(){
        Assert.assertTrue(mainPage.inputFiledRightDisplayed());
    }

    //отображение поля для результатов
    @Test
    public void resultTextViewDisplayed(){ Assert.assertTrue(mainPage.resultTextViewDisplayed()); }

    //отображение кнопки сложения
    @Test
    public void additionButtonDisplayed(){
        Assert.assertTrue(mainPage.additionButtonDisplayed());
    }

    //отображение кнопки вычесть
    @Test
    public void subtractButtonDisplayed(){
        Assert.assertTrue(mainPage.subtractButtonDisplayed());
    }

    //отображение кнопки умножить
    @Test
    public void multiplicationButtonDisplayed(){
        Assert.assertTrue(mainPage.multiplicationButtonDisplayed());
    }

    //оображение кнопки деления
    @Test
    public void divisionButtonDisplayed(){
        Assert.assertTrue(mainPage.divisionButtonDisplayed());
    }

    //отображение кнопки сброса данных
    @Test
    public void resetButtonDisplayed(){
        Assert.assertTrue(mainPage.resetButtonDisplayed());
    }

    @AfterMethod
    public void teardown(){
        mainPage.quitDriver();
    }

}
