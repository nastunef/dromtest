# dromtest
Для тестирования приложения Калькулятор использовались следующее:
  1. Appium Server 1.18.0-2
  2. Эмулятор Genymotion
  3. TestNG
  4. IntelliJ IDEA 2019.2.3 (Ultimate Edition)
  5. Java SDK 1.8
 
 Информация об эмуляторе(параметры) находится в классе MyAndroidDriver (папка test/java/utils)
 
 Запускать тесткейсы желательно следующим образом:
  1. DisplayingElementsTestCase
  2. EnabledElementsTestCase
  3. EnabledButtonAfterClickTestCase
  4. CorrectInputFieldsLeftTestCase
  5. CorrectInputFieldRightTestCase
  6. DisplayingResultAfterActionTestCase
  7. AdditionOperationTestCase
  8. DivOperationTestCase
  9. MultiplicationOperationTestCase
  10. SubtractOperationTestCase
 Последние 4 тесткейса располагабтся в папке testcases/operationtestcases 
  
 Найденные баги описаны в папке src/bugreport
 
