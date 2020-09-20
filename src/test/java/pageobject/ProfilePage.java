package pageobject;

import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import java.time.Duration;


public class ProfilePage {

    private AndroidDriver driver;

    public ProfilePage(AndroidDriver driver) {
        this.driver = driver;
        //this.driver.launchApp();
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(15)), this);
    }

    public void quitDriver(){   this.driver.quit();}

    @AndroidFindBy(id = "com.vbanthia.androidsampleapp:id/inputFieldLeft")
    private AndroidElement inputFieldLeft;

    @AndroidFindBy(id = "com.vbanthia.androidsampleapp:id/inputFieldRight")
    private AndroidElement inputFieldRight;

    @AndroidFindBy(id = "com.vbanthia.androidsampleapp:id/additionButton")
    private AndroidElement additionButton;

    @AndroidFindBy(id = "com.vbanthia.androidsampleapp:id/subtractButton")
    private AndroidElement subtractButton;

    @AndroidFindBy(id = "com.vbanthia.androidsampleapp:id/multiplicationButton")
    private AndroidElement multiplicationButton;

    @AndroidFindBy(id = "com.vbanthia.androidsampleapp:id/divisionButton")
    private AndroidElement divisionButton;

    @AndroidFindBy(id = "com.vbanthia.androidsampleapp:id/resetButton")
    private AndroidElement resetButton;

    @AndroidFindBy(id = "com.vbanthia.androidsampleapp:id/resultTextView")
    private AndroidElement resultTextView;


    //--------------------------------
    //клики по кнопкам
    //--------------------------------

    //клик +
    public void add(){
        additionButton.click();
    }

    //клик минус
    public void subtract(){
        subtractButton.click();
    }

    //клик умножить
    public void multiplication(){
        multiplicationButton.click();
    }

    //клик разделить
    public void div(){
        divisionButton.click();
    }

    //клик сброс
    public void reset(){
        resetButton.click();
    }

    //клик inputFiledLeft
    public void inputFiledLeft(){ inputFieldLeft.click(); }

    //клик InputFieldRight
    public void setInputFieldRight(){ inputFieldRight.click();}

    //---------------------
    //задать значение полей
    //--------------------------------

    //очистить поля
    public void clearAll(){
        inputFieldLeft.clear();
        inputFieldRight.clear();
    }

    //задать двум полям
    public void enterFields(String filedLeft, String fieldRight){
        inputFieldLeft. sendKeys(filedLeft);
        inputFieldRight.sendKeys(fieldRight);
    }


    //задать значение левому полю
    public void setFieldLeft(String fieldLeft) {
        inputFieldLeft.sendKeys(fieldLeft);
    }

    //задать значение правому полю
    public void setFieldRight(String fieldRight) {
        inputFieldRight.setValue(fieldRight);
    }

    //------------------------
    //получение значения элементов
    //--------------------------------

    //получить значение правого поля
    public String getInputFieldLeftValue() {
        return inputFieldLeft.getText();
    }

    //получить значение правого поля
    public String getInputFieldRightValue() {
        return inputFieldRight.getText();
    }

    //получить вывод результата
    public String getResultText() {
        return resultTextView.getText();
    }

    //--------------------------------
    //отображение элементов приложения
    //--------------------------------

    //отображается ли левое поле
    public boolean inputFiledLeftDisplayed() {
        return inputFieldLeft.isDisplayed();
    }

    //отображается ли правое поле
    public boolean inputFiledRightDisplayed() {
        return inputFieldRight.isDisplayed();
    }

    //отображается ли кнопка reset
    public boolean resetButtonDisplayed() {
        return resetButton.isDisplayed();
    }

    //отображается ли кнопка  /
    public boolean divisionButtonDisplayed() {
        return divisionButton.isDisplayed();
    }

    //отображается ли кнопка *
    public boolean multiplicationButtonDisplayed() {
        return multiplicationButton.isDisplayed();
    }

    //отображается ли кнопка -
    public boolean subtractButtonDisplayed() {
        return subtractButton.isDisplayed();
    }

    //отображается ли кнопка +
    public boolean additionButtonDisplayed() {
        return additionButton.isDisplayed();
    }

    //отображается ли textView для результата
    public boolean resultTextViewDisplayed(){
        return resultTextView.isDisplayed();
    }


    public void pressKey(KeyEvent key) {
        driver.pressKey(key);
    }

    public boolean resetButtonEnabled() { return  resetButton.isEnabled(); }

    public boolean divisionButtonEnabled() { return divisionButton.isEnabled(); }

    public boolean multiplicationButtonEnabled() { return multiplicationButton.isEnabled(); }

    public boolean additionButtonEnabled() { return additionButton.isEnabled(); }

    public boolean subtractButtonEnabled() { return subtractButton.isEnabled(); }

    public boolean inputFiledRightEnabled() { return inputFieldRight.isEnabled(); }

    public boolean inputFiledLeftEnabled() { return  inputFieldLeft.isEnabled(); }
}
