package yandexsearch.tests;

import org.junit.Test;
import yandexsearch.pages.MainPage;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class DisplayingScreenKeyboardTest extends BaseTestClass{

    @Test
    public void displaying_screen_keyboard_test() {

        MainPage mainPage = new MainPage(driver);

        // открывается главная страница яндекса
        mainPage.openPage();

        // проверка, что страница открылась
        assertTrue("Страница yandex.ru не открылась", mainPage.isMainPagePresent());

        // проверка, что появляется экранная клавиатура при нажатии на иконку клавиатуры
        assertTrue("Иконка клавиатуры в поле поиска отсутствует", mainPage.isKeyboardIconPresent());
        mainPage.clickOnKeyboardIcon();
        assertTrue("Страница яндекс не отображается", mainPage.isMainPagePresent());
        assertTrue("Экранная клавиатура отсутствует", mainPage.isScreenKeyboardPresent());

        // проверка закрытия экранной клавиатуры
        assertTrue("Крестик закрытия экранной клавиатуры отсутствует", mainPage.isKeyboardCloseButtonPresent());
        mainPage.clickOnKeyboardCloseButton();
        assertFalse("Экранная клавиатура отображается", mainPage.isScreenKeyboardPresent());
        assertTrue("Страница яндекс не отображается", mainPage.isMainPagePresent());
    }
}
