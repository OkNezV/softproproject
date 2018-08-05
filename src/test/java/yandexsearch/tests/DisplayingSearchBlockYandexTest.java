package yandexsearch.tests;

import org.junit.Test;
import yandexsearch.pages.MainPage;

import static org.junit.Assert.assertTrue;

/**
 * Проверка отображения и содержимого поля поиска
 *
 * @author Oksana Nezlobina <nez_oksana@mail.ru>
 */
public class DisplayingSearchBlockYandexTest extends BaseTestClass{

    @Test
    public void displaying_search_block_yandex_test() {

        MainPage mainPage = new MainPage(driver);

        // открывается главная страница яндекса
        mainPage.openPage();

        // проверка, что страница открылась
        assertTrue("Страница yandex.ru не открылась", mainPage.isMainPagePresent());

        // проверка поля ввода и его содержимого
        assertTrue("Поле поиска отсутвует", mainPage.isFormSearchPresent());
        assertTrue("Иконка микрофона в поле поиска отсутствует", mainPage.isVoiceSearchIconPresent());
        assertTrue("Иконка клавиатуры в поле поиска отсутствует", mainPage.isKeyboardIconPresent());
        assertTrue("Кнопка <Найти> отсутствует", mainPage.isSearchButtonPresent());

        // проверка наличия ссылок для переходы в разделы
        assertTrue("Ссылка <Видео> отсутствует", mainPage.isVideoTabPresent());
        assertTrue("Ссылка <Картинка> отсутствует", mainPage.isImagesTabPresent());
        assertTrue("Ссылка <Новости> отсутствует", mainPage.isNewsTabPresent());
        assertTrue("Ссылка <Карты> отсутствует", mainPage.isMapsTabPresent());
        assertTrue("Ссылка <Маркет> отсутствует", mainPage.isMarketTabPresent());
        assertTrue("Ссылка <Переводчик> отсутствует", mainPage.isTranslateTabPresent());
        assertTrue("Ссылка <Музыка> отсутствует", mainPage.isMusicTabPresent());
        assertTrue("Ссылка <Еще> отсутствует", mainPage.isMoreLinkPresent());
    }
}