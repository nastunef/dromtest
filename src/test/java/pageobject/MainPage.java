package pageobject;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class MainPage {

    private ProfilePage profilePage;

    //шаблон для результата
    private String patternResultText = "%s %s %s = %s";

    public MainPage(AndroidDriver driver) {
        profilePage = new ProfilePage(driver);
    }

    public void quitDriver(){
        profilePage.quitDriver();
    }

    //-----------------------------------------------------------------------------
    //получить значение:
    //-----------------------------------------------------------------------------

    //получить значение левого поля
    public String getInputFieldLeftValue() {
        return profilePage.getInputFieldLeftValue();
    }

    //получить значение правого поля
    public String getInputFieldRightValue() {
        return profilePage.getInputFieldRightValue();
    }

    //получить текст реального результата
    public String getRealResultText(){
        return profilePage.getResultText();
    }

    //получить текст ожидаемого результата
    public String getExpectedResultText( String fieldLeft, String fieldRight, String sign, String result ){
        return String.format(patternResultText, fieldLeft, sign , fieldRight, result);
    }

    //-----------------------------------------------------------------------------
    //сброс значений полей
    //-----------------------------------------------------------------------------

    //сброс результатов
    public void reset(){
        profilePage.reset();
    }

    //очищение полей
    public void clearAll(){
        profilePage.clearAll();
    }

    //-----------------------------------------------------------------------------
    //выполение операций + - / *
    //-----------------------------------------------------------------------------

    //сложение
    public void add(String fieldLeft, String fieldRight){
        profilePage.enterFields(fieldLeft, fieldRight);
        profilePage.add();
    }

    //вычитание
    public void subtract(String fieldLeft, String fieldRight){
        profilePage.enterFields(fieldLeft, fieldRight);
        profilePage.subtract();
    }

    //умножение
    public void multiplication(String fieldLeft, String fieldRight){
        profilePage.enterFields(fieldLeft, fieldRight);
        profilePage.multiplication();
    }

    //деление
    public void div(String fieldLeft, String fieldRight){
        profilePage.enterFields(fieldLeft, fieldRight);
        profilePage.div();
    }

    //--------------------------------------------------------------------
    //отображаются ли поля (true/false)
    //--------------------------------------------------------------------

    //отображается ли левое поле
    public boolean inputFiledLeftDisplayed() {
        return profilePage.inputFiledLeftDisplayed();
    }

    //отображается ли правое поле
    public boolean inputFiledRightDisplayed() {
        return profilePage.inputFiledRightDisplayed();
    }

    //отображается ли кнопка reset
    public boolean resetButtonDisplayed() {
        return profilePage.resetButtonDisplayed();
    }

    //отображается ли кнопка /
    public boolean divisionButtonDisplayed() {
        return profilePage.divisionButtonDisplayed();
    }

    //отображается ли кнопка *
    public boolean multiplicationButtonDisplayed() {
        return profilePage.multiplicationButtonDisplayed();
    }

    //отображается ли кнопка -
    public boolean subtractButtonDisplayed() {
        return profilePage.subtractButtonDisplayed();
    }

    //отображается ли кнопка +
    public boolean additionButtonDisplayed() {
        return profilePage.additionButtonDisplayed();
    }

    //отображается ли результтрующее поле
    public boolean resultTextViewDisplayed(){
        return profilePage.resultTextViewDisplayed();
    }

    //----------------------------------------------------------------------------
    //клики по элементам приложения
    //----------------------------------------------------------------------------

    //клик по +
    public void additionButtonClick() {
        profilePage.add();
    }

    //клик по /
    public void divisionButtonClick() {
        profilePage.div();
    }

    //клик по *
    public void multiplicationButtonClick() {
        profilePage.multiplication();
    }

    //клик по -
    public void subtractButtonClick() {
        profilePage.subtract();
    }

    //клик по reset
    public void resetButtonClick() {
        profilePage.reset();
    }

    //клик по левому полю
    public void inputFiledLeftClick(){ profilePage.inputFiledLeft();}

    //клик по правому полю
    public void inputFiledRightClick(){ profilePage.setInputFieldRight();}

    //--------------------------------------------------------------------------
    //возвращает значение true если елемент включен(доступен) для пользователя
    //--------------------------------------------------------------------------

    //кнопка reset
    public boolean resetButtonEnabled() { return profilePage.resetButtonEnabled(); }

    //кнопка /
    public boolean divisionButtonEnabled() { return profilePage.divisionButtonEnabled(); }

    //кнопка +
    public boolean addButtonEnabled() { return profilePage.additionButtonEnabled(); }

    //кнопка -
    public boolean subtractButtonEnabled() { return profilePage.subtractButtonEnabled(); }

    //кнопка *
    public boolean multiplicationButtonEnabled() { return profilePage.multiplicationButtonEnabled(); }

    //левое(первое) поле для ввода
    public boolean inputFiledLeftEnabled() { return  profilePage.inputFiledLeftEnabled(); }

    //второе(правое) поле для ввода
    public boolean inputFiledRightEnabled() { return profilePage.inputFiledRightEnabled(); }

    //-----------------------------------------------------------------------------
    //функции для имитации ввода с Android клавиатуры
    //-----------------------------------------------------------------------------

    //работа с Android клавиатурой
    public void pressKey(AndroidKey key){ profilePage.pressKey(new KeyEvent(key));}

    //ввод key i раз
    public void pressINumber(AndroidKey key, int i){
        for (int j = 0; j < i; j++){
            pressKey(key);
        }
    }

}
