package yandexsearch.tests;

import org.junit.Test;
import yandexsearch.pages.MainPage;

import static org.junit.Assert.assertTrue;

/**
 * Проверка работы поиска
 *
 * @author Oksana Nezlobina <nez_oksana@mail.ru>
 *
 */
public class GoToSearchResultsPageTest extends BaseTestClass {

    @Test
    public void go_to_search_results_page_test(){
        String search = "test";
        String test = "Тест";

        MainPage mainPage = new MainPage(driver);

        // открывается главная страница яндекса
        mainPage.openPage();

        // проверка, что страница открылась
        assertTrue("Страница yandex.ru не открылась", mainPage.isMainPagePresent());

        // проверка, что поле ввода присутствует
        assertTrue("Поле поиска отсутвует", mainPage.isFormSearchPresent());

        // заполнение поля ввода
        mainPage.clearAndSetSearchInput(search);

        // клик на кнопку <Найти>
        assertTrue("Кнопка <Найти> отсутствует", mainPage.isSearchButtonPresent());
        mainPage.clickOnSearchButton();

        // Проверка, что появилась страница с результатами поиска
        assertTrue("Страница с результатами поиска не отображается", mainPage.isSearchResultPagePresent());
        assertTrue("URL страницы отличается от ожидаемого", driver.getCurrentUrl().contains(search));

        // проверка, что в списке результатов есть искомое слово
        assertTrue("Поле поиска пусто или содержит слово, отличное от вводимого", mainPage.searchTextSameAs(test));
    }

}
