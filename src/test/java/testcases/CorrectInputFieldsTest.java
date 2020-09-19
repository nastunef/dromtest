//------------------------
// тесты на ввод значений в поля InputFileLeft и InputFileRight
//------------------------


package testcases;

import io.appium.java_client.android.nativekey.AndroidKey;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobject.MainPage;
import utils.MyAndroidDriver;

import java.net.MalformedURLException;

public class CorrectInputFieldsTest {

    private MyAndroidDriver myAndroidDriver;
    private MainPage mainPage;

    String symbol;

    @BeforeMethod
    public void setup () throws MalformedURLException {
        myAndroidDriver = new MyAndroidDriver();
        mainPage = new MainPage(myAndroidDriver.initDriver());
        mainPage.clearAll();
    }

    //------------------------
    //Тесты для InputFileLeft
    //------------------------

    //ввод 0
    @Test
    public void inputFieldLeftNum0(){

        mainPage.inputFiledLeftClick();
        mainPage.pressKey(AndroidKey.NUMPAD_0);

        String expectedFieldLeftValue = "0";
        String realFieldLeftValue = mainPage.getInputFieldLeftValue();

        Assert.assertTrue(expectedFieldLeftValue.equals(realFieldLeftValue));
    }

    //ввод 1
    @Test
    public void inputFieldLeftNum1(){
        mainPage.inputFiledLeftClick();
        mainPage.pressKey(AndroidKey.NUMPAD_1);

        String expectedFieldLeftValue = "1";
        String realFieldLeftValue = mainPage.getInputFieldLeftValue();

        Assert.assertTrue(expectedFieldLeftValue.equals(realFieldLeftValue));
    }

    //ввод 2
    @Test
    public void inputFieldLeftNum2(){

        mainPage.inputFiledLeftClick();
        mainPage.pressKey(AndroidKey.NUMPAD_2);

        String expectedFieldLeftValue = "2";
        String realFieldLeftValue = mainPage.getInputFieldLeftValue();

        Assert.assertTrue(expectedFieldLeftValue.equals(realFieldLeftValue));
    }

    //ввод 3
    @Test
    public void inputFieldLeftNum3(){

        mainPage.inputFiledLeftClick();
        mainPage.pressKey(AndroidKey.NUMPAD_3);

        String expectedFieldLeftValue = "3";
        String realFieldLeftValue = mainPage.getInputFieldLeftValue();

        Assert.assertTrue(expectedFieldLeftValue.equals(realFieldLeftValue));
    }

    //ввод 4
    @Test
    public void inputFieldLeftNum4(){

        mainPage.inputFiledLeftClick();
        mainPage.pressKey(AndroidKey.NUMPAD_4);

        String expectedFieldLeftValue = "4";
        String realFieldLeftValue = mainPage.getInputFieldLeftValue();

        Assert.assertTrue(expectedFieldLeftValue.equals(realFieldLeftValue));
    }

    //ввод 5
    @Test
    public void inputFieldLeftNum5(){

        mainPage.inputFiledLeftClick();
        mainPage.pressKey(AndroidKey.NUMPAD_5);

        String expectedFieldLeftValue = "5";
        String realFieldLeftValue = mainPage.getInputFieldLeftValue();

        Assert.assertTrue(expectedFieldLeftValue.equals(realFieldLeftValue));
    }

    //ввод 6
    @Test
    public void inputFieldLeftNum6(){
        mainPage.inputFiledLeftClick();
        mainPage.pressKey(AndroidKey.NUMPAD_6);

        String expectedFieldLeftValue = "6";
        String realFieldLeftValue = mainPage.getInputFieldLeftValue();

        Assert.assertTrue(expectedFieldLeftValue.equals(realFieldLeftValue));
    }

    //ввод 7
    @Test
    public void inputFieldLeftNum7(){

        mainPage.inputFiledLeftClick();
        mainPage.pressKey(AndroidKey.NUMPAD_7);

        String expectedFieldLeftValue = "7";
        String realFieldLeftValue = mainPage.getInputFieldLeftValue();

        Assert.assertTrue(expectedFieldLeftValue.equals(realFieldLeftValue));
    }

    //ввод 8
    @Test
    public void inputFieldLeftNum8(){

        mainPage.inputFiledLeftClick();
        mainPage.pressKey(AndroidKey.NUMPAD_8);

        String expectedFieldLeftValue = "8";
        String realFieldLeftValue = mainPage.getInputFieldLeftValue();

        Assert.assertTrue(expectedFieldLeftValue.equals(realFieldLeftValue));
    }

    //ввод 9
    @Test
    public void inputFieldLeftNum9(){

        mainPage.inputFiledLeftClick();
        mainPage.pressKey(AndroidKey.NUMPAD_9);

        String expectedFieldLeftValue = "9";
        String realFieldLeftValue = mainPage.getInputFieldLeftValue();

        Assert.assertTrue(expectedFieldLeftValue.equals(realFieldLeftValue));
    }

    //ввод 2-значного числа 66
    @Test
    public void inputFieldLeftTwoNum6(){
        mainPage.inputFiledLeftClick();
        pressINumber(AndroidKey.NUMPAD_6, 2);

        String expectedFieldLeftValue = "66";
        String realFieldLeftValue = mainPage.getInputFieldLeftValue();

        Assert.assertTrue(expectedFieldLeftValue.equals(realFieldLeftValue));
    }

    //ввод трехначного числа 666
    @Test
    public void inputFieldLeftThreeNum6(){
        mainPage.inputFiledLeftClick();
        pressINumber(AndroidKey.NUMPAD_6, 3);

        String expectedFieldLeftValue = "666";
        String realFieldLeftValue = mainPage.getInputFieldLeftValue();

        Assert.assertTrue(expectedFieldLeftValue.equals(realFieldLeftValue));
    }

    //ввод четырехзначного числа 6666
    @Test
    public void inputFieldLeftFourNum6(){

        mainPage.inputFiledLeftClick();
        pressINumber(AndroidKey.NUMPAD_6, 4);

        String expectedFieldLeftValue = "6666";
        String realFieldLeftValue = mainPage.getInputFieldLeftValue();

        Assert.assertTrue(expectedFieldLeftValue.equals(realFieldLeftValue));
    }

    //ввод пятизначного числа 66666
    @Test
    public void inputFieldLeftFiveNum6(){

        mainPage.inputFiledLeftClick();
        pressINumber(AndroidKey.NUMPAD_6, 5);

        String expectedFieldLeftValue = "66666";
        String realFieldLeftValue = mainPage.getInputFieldLeftValue();

        Assert.assertTrue(expectedFieldLeftValue.equals(realFieldLeftValue));
    }

    //ввод шестизначного числа 666666
    @Test
    public void inputFieldLeftSixNum6(){

        mainPage.inputFiledLeftClick();
        pressINumber(AndroidKey.NUMPAD_6, 6);

        String expectedFieldLeftValue = "666666";
        String realFieldLeftValue = mainPage.getInputFieldLeftValue();

        Assert.assertTrue(expectedFieldLeftValue.equals(realFieldLeftValue));
    }

    //ввод семизначного числа 6666666
    @Test
    public void inputFieldLeftSevenNum6(){

        mainPage.inputFiledLeftClick();
        pressINumber(AndroidKey.NUMPAD_6, 7);

        String expectedFieldLeftValue = "6666666";
        String realFieldLeftValue = mainPage.getInputFieldLeftValue();

        Assert.assertTrue(expectedFieldLeftValue.equals(realFieldLeftValue));
    }

    //ввод восьмизначного числа 66666666
    @Test
    public void inputFieldLeftEightNum6(){

        mainPage.inputFiledLeftClick();
        pressINumber(AndroidKey.NUMPAD_6, 8);

        String expectedFieldLeftValue = "66666666";
        String realFieldLeftValue = mainPage.getInputFieldLeftValue();

        Assert.assertTrue(expectedFieldLeftValue.equals(realFieldLeftValue));
    }

    //ввод девятизначного числа 666666666
    @Test
    public void inputFieldLeftNineNum6(){

        mainPage.inputFiledLeftClick();
        pressINumber(AndroidKey.NUMPAD_6, 9);

        String expectedFieldLeftValue = "666666666";
        String realFieldLeftValue = mainPage.getInputFieldLeftValue();

        Assert.assertTrue(expectedFieldLeftValue.equals(realFieldLeftValue));
    }
    //ввод девятизначного числа 6666666666
    @Test
    public void inputFieldLeftTenNum6(){

        mainPage.inputFiledLeftClick();
        pressINumber(AndroidKey.NUMPAD_6, 10);

        String expectedFieldLeftValue = "6666666666";
        String realFieldLeftValue = mainPage.getInputFieldLeftValue();

        Assert.assertTrue(expectedFieldLeftValue.equals(realFieldLeftValue));
    }

    //ввод .
    @Test
    public void inputFieldLeftInputDot(){

        mainPage.inputFiledLeftClick();
        mainPage.pressKey(AndroidKey.NUMPAD_DOT);

        String expectedFieldLeftValue = ".";
        String realFieldLeftValue = mainPage.getInputFieldLeftValue();
        Assert.assertTrue(expectedFieldLeftValue.equals(realFieldLeftValue));
    }

    //ввод .11
    @Test
    public void inputFieldLeftDotInBeginAndNumbers(){

        mainPage.inputFiledLeftClick();
        mainPage.pressKey(AndroidKey.NUMPAD_DOT);
       pressINumber(AndroidKey.NUMPAD_1, 2);

        String expectedFieldLeftValue = ".11";
        String realFieldLeftValue = mainPage.getInputFieldLeftValue();
        Assert.assertTrue(expectedFieldLeftValue.equals(realFieldLeftValue));
    }

    //ввод двух точек подряд
    @Test
    public void inputFieldLeftDoubleDot(){
        mainPage.inputFiledLeftClick();
        pressINumber(AndroidKey.NUMPAD_DOT, 2);
        String expectedFieldLeftValue = ".";
        String realFieldLeftValue = mainPage.getInputFieldLeftValue();
        Assert.assertTrue(expectedFieldLeftValue.equals(realFieldLeftValue));
    }

    //ввод точки после цифр
    @Test
    public void inputFieldLeftDotAfterNumbers(){

        mainPage.inputFiledLeftClick();
        mainPage.pressKey(AndroidKey.NUMPAD_9);
        mainPage.pressKey(AndroidKey.NUMPAD_1);
        mainPage.pressKey(AndroidKey.NUMPAD_DOT);

        String expectedFieldLeftValue = "91.";
        String realFieldLeftValue = mainPage.getInputFieldLeftValue();
        Assert.assertTrue(expectedFieldLeftValue.equals(realFieldLeftValue));
    }

    //ввод цифр после точки
    @Test
    public void inputFieldLeftNumberDotNumber(){

        mainPage.inputFiledLeftClick();
        mainPage.pressKey(AndroidKey.NUMPAD_9);
        mainPage.pressKey(AndroidKey.NUMPAD_DOT);
        mainPage.pressKey(AndroidKey.NUMPAD_1);

        String expectedFieldLeftValue = "9.1";
        String realFieldLeftValue = mainPage.getInputFieldLeftValue();
        Assert.assertTrue(expectedFieldLeftValue.equals(realFieldLeftValue));
    }

    //ввод точки в двух местах 2.1.
    @Test
    public void inputFieldLeftTwoDotInCenter(){

        mainPage.inputFiledLeftClick();
        mainPage.pressKey(AndroidKey.NUMPAD_2);
        mainPage.pressKey(AndroidKey.NUMPAD_DOT);
        mainPage.pressKey(AndroidKey.NUMPAD_1);
        mainPage.pressKey(AndroidKey.NUMPAD_DOT);

        String expectedFieldLeftValue = "2.1";
        String realFieldLeftValue = mainPage.getInputFieldLeftValue();
        Assert.assertTrue(expectedFieldLeftValue.equals(realFieldLeftValue));
    }

    //проверка нажатие по * на андроид клавиатуре при акивном поле
    @Test
    public void inputFieldLeftNumpadMultiply(){

        mainPage.inputFiledLeftClick();
        mainPage.pressKey(AndroidKey.NUMPAD_MULTIPLY);

        String expectedFieldLeftValue = "";
        String realFieldLeftValue = mainPage.getInputFieldLeftValue();
        Assert.assertTrue(expectedFieldLeftValue.equals(realFieldLeftValue));
    }

    //проверка нажатие по / на андроид клавиатуре при акивном поле
    @Test
    public void inputFieldLeftNumpadDivide(){

        mainPage.inputFiledLeftClick();
        mainPage.pressKey(AndroidKey.NUMPAD_DIVIDE);

        String expectedFieldLeftValue = "";
        String realFieldLeftValue = mainPage.getInputFieldLeftValue();
        Assert.assertTrue(expectedFieldLeftValue.equals(realFieldLeftValue));
    }

    //проверка нажатие по + на андроид клавиатуре при акивном поле
    @Test
    public void inputFieldLeftNumpadAdd(){

        mainPage.inputFiledLeftClick();
        mainPage.pressKey(AndroidKey.NUMPAD_ADD);

        String expectedFieldLeftValue = "";
        String realFieldLeftValue = mainPage.getInputFieldLeftValue();
        Assert.assertTrue(expectedFieldLeftValue.equals(realFieldLeftValue));
    }

    //проверка нажатие по - на андроид клавиатуре при акивном поле
    @Test
    public void inputFieldLeftNumpadSubtract(){

        mainPage.inputFiledLeftClick();
        mainPage.pressKey(AndroidKey.NUMPAD_SUBTRACT);

        String expectedFieldLeftValue = "";
        String realFieldLeftValue = mainPage.getInputFieldLeftValue();
        Assert.assertTrue(expectedFieldLeftValue.equals(realFieldLeftValue));
    }

    //проверка нажатие по = на андроид клавиатуре при акивном поле
    @Test
    public void inputFieldLeftNumpadEquals(){

        mainPage.inputFiledLeftClick();
        mainPage.pressKey(AndroidKey.NUMPAD_EQUALS);

        String expectedFieldLeftValue = "";
        String realFieldLeftValue = mainPage.getInputFieldLeftValue();
        Assert.assertTrue(expectedFieldLeftValue.equals(realFieldLeftValue));
    }

    //проверка работы backspace
    @Test
    public void inputFieldLeftBackSpaceNum(){

        mainPage.inputFiledLeftClick();
        mainPage.pressKey(AndroidKey.NUMPAD_2);
        mainPage.pressKey(AndroidKey.NUMPAD_2);
        mainPage.pressKey(AndroidKey.DEL);

        String expectedFieldLeftValue = "2";
        String realFieldLeftValue = mainPage.getInputFieldLeftValue();
        Assert.assertTrue(expectedFieldLeftValue.equals(realFieldLeftValue));
    }

    //проверка ввода в поле левой скобки
    @Test
    public void inputFieldLeftLeftParen(){

        mainPage.inputFiledLeftClick();
        mainPage.pressKey(AndroidKey.NUMPAD_LEFT_PAREN);

        String expectedFieldLeftValue = "";
        String realFieldLeftValue = mainPage.getInputFieldLeftValue();
        Assert.assertTrue(expectedFieldLeftValue.equals(realFieldLeftValue));
    }

    //проверка ввода в поле правой скобки
    @Test
    public void inputFieldLeftRightParen(){

        mainPage.inputFiledLeftClick();
        mainPage.pressKey(AndroidKey.NUMPAD_RIGHT_PAREN);

        String expectedFieldLeftValue = "";
        String realFieldLeftValue = mainPage.getInputFieldLeftValue();
        Assert.assertTrue(expectedFieldLeftValue.equals(realFieldLeftValue));
    }

    //проверка нажатия на запятую
    @Test
    public void inputFieldLeftComma(){

        mainPage.inputFiledLeftClick();
        mainPage.pressKey(AndroidKey.NUMPAD_COMMA);

        String expectedFieldLeftValue = "";
        String realFieldLeftValue = mainPage.getInputFieldLeftValue();
        Assert.assertTrue(expectedFieldLeftValue.equals(realFieldLeftValue));
    }

    //------------------------
    //Тесты для InputFileRight
    //------------------------

    //ввод 0
    @Test
    public void inputFieldRightNum0(){

        mainPage.inputFiledRightClick();
        mainPage.pressKey(AndroidKey.NUMPAD_0);

        String expectedFieldRightValue = "0";
        String realFieldRightValue = mainPage.getInputFieldRightValue();

        Assert.assertTrue(expectedFieldRightValue.equals(realFieldRightValue));
    }

    //ввод 1
    @Test
    public void inputFieldRightNum1(){
        mainPage.inputFiledRightClick();
        mainPage.pressKey(AndroidKey.NUMPAD_1);

        String expectedFieldRightValue = "1";
        String realFieldRightValue = mainPage.getInputFieldRightValue();

        Assert.assertTrue(expectedFieldRightValue.equals(realFieldRightValue));
    }

    //ввод 2
    @Test
    public void inputFieldRightNum2(){

        mainPage.inputFiledRightClick();
        mainPage.pressKey(AndroidKey.NUMPAD_2);

        String expectedFieldRightValue = "2";
        String realFieldRightValue = mainPage.getInputFieldRightValue();

        Assert.assertTrue(expectedFieldRightValue.equals(realFieldRightValue));
    }

    //ввод 3
    @Test
    public void inputFieldRightNum3(){

        mainPage.inputFiledRightClick();
        mainPage.pressKey(AndroidKey.NUMPAD_3);

        String expectedFieldRightValue = "3";
        String realFieldRightValue = mainPage.getInputFieldRightValue();

        Assert.assertTrue(expectedFieldRightValue.equals(realFieldRightValue));
    }

    //ввод 4
    @Test
    public void inputFieldRightNum4(){

        mainPage.inputFiledRightClick();
        mainPage.pressKey(AndroidKey.NUMPAD_4);

        String expectedFieldRightValue = "4";
        String realFieldRightValue = mainPage.getInputFieldRightValue();

        Assert.assertTrue(expectedFieldRightValue.equals(realFieldRightValue));
    }

    //ввод 5
    @Test
    public void inputFieldRightNum5(){

        mainPage.inputFiledRightClick();
        mainPage.pressKey(AndroidKey.NUMPAD_5);

        String expectedFieldRightValue = "5";
        String realFieldRightValue = mainPage.getInputFieldRightValue();

        Assert.assertTrue(expectedFieldRightValue.equals(realFieldRightValue));
    }

    //ввод 6
    @Test
    public void inputFieldRightNum6(){
        mainPage.inputFiledRightClick();
        mainPage.pressKey(AndroidKey.NUMPAD_6);

        String expectedFieldRightValue = "6";
        String realFieldRightValue = mainPage.getInputFieldRightValue();

        Assert.assertTrue(expectedFieldRightValue.equals(realFieldRightValue));
    }

    //ввод 7
    @Test
    public void inputFieldRightNum7(){

        mainPage.inputFiledRightClick();
        mainPage.pressKey(AndroidKey.NUMPAD_7);

        String expectedFieldRightValue = "7";
        String realFieldRightValue = mainPage.getInputFieldRightValue();

        Assert.assertTrue(expectedFieldRightValue.equals(realFieldRightValue));
    }

    //ввод 8
    @Test
    public void inputFieldRightNum8(){

        mainPage.inputFiledRightClick();
        mainPage.pressKey(AndroidKey.NUMPAD_8);

        String expectedFieldRightValue = "8";
        String realFieldRightValue = mainPage.getInputFieldRightValue();

        Assert.assertTrue(expectedFieldRightValue.equals(realFieldRightValue));
    }

    //ввод 9
    @Test
    public void inputFieldRightNum9(){

        mainPage.inputFiledRightClick();
        mainPage.pressKey(AndroidKey.NUMPAD_9);

        String expectedFieldRightValue = "9";
        String realFieldRightValue = mainPage.getInputFieldRightValue();

        Assert.assertTrue(expectedFieldRightValue.equals(realFieldRightValue));
    }

    //ввод 2-значного числа 66
    @Test
    public void inputFieldRightTwoNum6(){
        mainPage.inputFiledRightClick();
        pressINumber(AndroidKey.NUMPAD_6, 2);

        String expectedFieldRightValue = "66";
        String realFieldRightValue = mainPage.getInputFieldRightValue();

        Assert.assertTrue(expectedFieldRightValue.equals(realFieldRightValue));
    }

    //ввод трехначного числа 666
    @Test
    public void inputFieldRightThreeNum6(){
        mainPage.inputFiledRightClick();
        pressINumber(AndroidKey.NUMPAD_6, 3);

        String expectedFieldRightValue = "666";
        String realFieldRightValue = mainPage.getInputFieldRightValue();

        Assert.assertTrue(expectedFieldRightValue.equals(realFieldRightValue));
    }

    //ввод четырехзначного числа 6666
    @Test
    public void inputFieldRightFourNum6(){

        mainPage.inputFiledRightClick();
        pressINumber(AndroidKey.NUMPAD_6, 4);

        String expectedFieldRightValue = "6666";
        String realFieldRightValue = mainPage.getInputFieldRightValue();

        Assert.assertTrue(expectedFieldRightValue.equals(realFieldRightValue));
    }

    //ввод пятизначного числа 66666
    @Test
    public void inputFieldRightFiveNum6(){

        mainPage.inputFiledRightClick();
        pressINumber(AndroidKey.NUMPAD_6, 5);

        String expectedFieldRightValue = "66666";
        String realFieldRightValue = mainPage.getInputFieldRightValue();

        Assert.assertTrue(expectedFieldRightValue.equals(realFieldRightValue));
    }

    //ввод шестизначного числа 666666
    @Test
    public void inputFieldRightSixNum6(){

        mainPage.inputFiledRightClick();
        pressINumber(AndroidKey.NUMPAD_6, 6);

        String expectedFieldRightValue = "666666";
        String realFieldRightValue = mainPage.getInputFieldRightValue();

        Assert.assertTrue(expectedFieldRightValue.equals(realFieldRightValue));
    }

    //ввод семизначного числа 6666666
    @Test
    public void inputFieldRightSevenNum6(){

        mainPage.inputFiledRightClick();
        pressINumber(AndroidKey.NUMPAD_6, 7);

        String expectedFieldRightValue = "6666666";
        String realFieldRightValue = mainPage.getInputFieldRightValue();

        Assert.assertTrue(expectedFieldRightValue.equals(realFieldRightValue));
    }

    //ввод восьмизначного числа 66666666
    @Test
    public void inputFieldRightEightNum6(){

        mainPage.inputFiledRightClick();
        pressINumber(AndroidKey.NUMPAD_6, 8);

        String expectedFieldRightValue = "66666666";
        String realFieldRightValue = mainPage.getInputFieldRightValue();

        Assert.assertTrue(expectedFieldRightValue.equals(realFieldRightValue));
    }

    //ввод девятизначного числа 666666666
    @Test
    public void inputFieldRightNineNum6(){

        mainPage.inputFiledRightClick();
        pressINumber(AndroidKey.NUMPAD_6, 9);

        String expectedFieldRightValue = "666666666";
        String realFieldRightValue = mainPage.getInputFieldRightValue();

        Assert.assertTrue(expectedFieldRightValue.equals(realFieldRightValue));
    }
    //ввод девятизначного числа 6666666666
    @Test
    public void inputFieldRightTenNum6(){

        mainPage.inputFiledRightClick();
        pressINumber(AndroidKey.NUMPAD_6, 10);

        String expectedFieldRightValue = "6666666666";
        String realFieldRightValue = mainPage.getInputFieldRightValue();

        Assert.assertTrue(expectedFieldRightValue.equals(realFieldRightValue));
    }

    //ввод .
    @Test
    public void inputFieldRightInputDot(){

        mainPage.inputFiledRightClick();
        mainPage.pressKey(AndroidKey.NUMPAD_DOT);

        String expectedFieldRightValue = ".";
        String realFieldRightValue = mainPage.getInputFieldRightValue();
        Assert.assertTrue(expectedFieldRightValue.equals(realFieldRightValue));
    }

    //ввод .11
    @Test
    public void inputFieldRightDotInBeginAndNumbers(){

        mainPage.inputFiledRightClick();
        mainPage.pressKey(AndroidKey.NUMPAD_DOT);
        pressINumber(AndroidKey.NUMPAD_1, 2);

        String expectedFieldRightValue = ".11";
        String realFieldRightValue = mainPage.getInputFieldRightValue();
        Assert.assertTrue(expectedFieldRightValue.equals(realFieldRightValue));
    }

    //ввод двух точек подряд
    @Test
    public void inputFieldRightDoubleDot(){
        mainPage.inputFiledRightClick();
        pressINumber(AndroidKey.NUMPAD_DOT, 2);
        String expectedFieldRightValue = ".";
        String realFieldRightValue = mainPage.getInputFieldRightValue();
        Assert.assertTrue(expectedFieldRightValue.equals(realFieldRightValue));
    }

    //ввод точки после цифр
    @Test
    public void inputFieldRightDotAfterNumbers(){

        mainPage.inputFiledRightClick();
        mainPage.pressKey(AndroidKey.NUMPAD_9);
        mainPage.pressKey(AndroidKey.NUMPAD_1);
        mainPage.pressKey(AndroidKey.NUMPAD_DOT);

        String expectedFieldRightValue = "91.";
        String realFieldRightValue = mainPage.getInputFieldRightValue();
        Assert.assertTrue(expectedFieldRightValue.equals(realFieldRightValue));
    }

    //ввод цифр после точки
    @Test
    public void inputFieldRightNumberDotNumber(){

        mainPage.inputFiledRightClick();
        mainPage.pressKey(AndroidKey.NUMPAD_9);
        mainPage.pressKey(AndroidKey.NUMPAD_DOT);
        mainPage.pressKey(AndroidKey.NUMPAD_1);

        String expectedFieldRightValue = "9.1";
        String realFieldRightValue = mainPage.getInputFieldRightValue();
        Assert.assertTrue(expectedFieldRightValue.equals(realFieldRightValue));
    }

    //ввод точки в двух местах 2.1.
    @Test
    public void inputFieldRightTwoDotInCenter(){

        mainPage.inputFiledRightClick();
        mainPage.pressKey(AndroidKey.NUMPAD_2);
        mainPage.pressKey(AndroidKey.NUMPAD_DOT);
        mainPage.pressKey(AndroidKey.NUMPAD_1);
        mainPage.pressKey(AndroidKey.NUMPAD_DOT);

        String expectedFieldRightValue = "2.1";
        String realFieldRightValue = mainPage.getInputFieldRightValue();
        Assert.assertTrue(expectedFieldRightValue.equals(realFieldRightValue));
    }

    //проверка нажатие по * на андроид клавиатуре при акивном поле
    @Test
    public void inputFieldRightNumpadMultiply(){

        mainPage.inputFiledRightClick();
        mainPage.pressKey(AndroidKey.NUMPAD_MULTIPLY);

        String expectedFieldRightValue = "";
        String realFieldRightValue = mainPage.getInputFieldRightValue();
        Assert.assertTrue(expectedFieldRightValue.equals(realFieldRightValue));
    }

    //проверка нажатие по / на андроид клавиатуре при акивном поле
    @Test
    public void inputFieldRightNumpadDivide(){

        mainPage.inputFiledRightClick();
        mainPage.pressKey(AndroidKey.NUMPAD_DIVIDE);

        String expectedFieldRightValue = "";
        String realFieldRightValue = mainPage.getInputFieldRightValue();
        Assert.assertTrue(expectedFieldRightValue.equals(realFieldRightValue));
    }

    //проверка нажатие по + на андроид клавиатуре при акивном поле
    @Test
    public void inputFieldRightNumpadAdd(){

        mainPage.inputFiledRightClick();
        mainPage.pressKey(AndroidKey.NUMPAD_ADD);

        String expectedFieldRightValue = "";
        String realFieldRightValue = mainPage.getInputFieldRightValue();
        Assert.assertTrue(expectedFieldRightValue.equals(realFieldRightValue));
    }

    //проверка нажатие по - на андроид клавиатуре при акивном поле
    @Test
    public void inputFieldRightNumpadSubtract(){

        mainPage.inputFiledRightClick();
        mainPage.pressKey(AndroidKey.NUMPAD_SUBTRACT);

        String expectedFieldRightValue = "";
        String realFieldRightValue = mainPage.getInputFieldRightValue();
        Assert.assertTrue(expectedFieldRightValue.equals(realFieldRightValue));
    }

    //проверка нажатие по = на андроид клавиатуре при акивном поле
    @Test
    public void inputFieldRightNumpadEquals(){

        mainPage.inputFiledRightClick();
        mainPage.pressKey(AndroidKey.NUMPAD_EQUALS);

        String expectedFieldRightValue = "";
        String realFieldRightValue = mainPage.getInputFieldRightValue();
        Assert.assertTrue(expectedFieldRightValue.equals(realFieldRightValue));
    }

    //проверка работы backspace
    @Test
    public void inputFieldRightBackSpaceNum(){

        mainPage.inputFiledRightClick();
        mainPage.pressKey(AndroidKey.NUMPAD_2);
        mainPage.pressKey(AndroidKey.NUMPAD_2);
        mainPage.pressKey(AndroidKey.DEL);

        String expectedFieldRightValue = "2";
        String realFieldRightValue = mainPage.getInputFieldRightValue();
        Assert.assertTrue(expectedFieldRightValue.equals(realFieldRightValue));
    }

    //проверка ввода в поле левой скобки
    @Test
    public void inputFieldRightLeftParen(){

        mainPage.inputFiledRightClick();
        mainPage.pressKey(AndroidKey.NUMPAD_LEFT_PAREN);

        String expectedFieldRightValue = "";
        String realFieldRightValue = mainPage.getInputFieldRightValue();
        Assert.assertTrue(expectedFieldRightValue.equals(realFieldRightValue));
    }

    //проверка ввода в поле правой скобки
    @Test
    public void inputFieldRightRightParen(){

        mainPage.inputFiledRightClick();
        mainPage.pressKey(AndroidKey.NUMPAD_RIGHT_PAREN);

        String expectedFieldRightValue = "";
        String realFieldRightValue = mainPage.getInputFieldRightValue();
        Assert.assertTrue(expectedFieldRightValue.equals(realFieldRightValue));
    }

    //проверка нажатия на запятую
    @Test
    public void inputFieldRightComma(){

        mainPage.inputFiledRightClick();
        mainPage.pressKey(AndroidKey.NUMPAD_COMMA);

        String expectedFieldRightValue = "";
        String realFieldRightValue = mainPage.getInputFieldRightValue();
        Assert.assertTrue(expectedFieldRightValue.equals(realFieldRightValue));
    }


    //ввод key i раз
    private void pressINumber(AndroidKey key, int i){
        for (int j = 0; j < i; j++){
            mainPage.pressKey(key);
        }
    }

    @AfterMethod
    public void teardown(){
        mainPage.quitDriver();
    }
}
