package yandexsearch.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Главная страница поиска yandex
 *
 * @author Oksana Nezlobina <nez_oksana@mail.ru>
 */
public class MainPage extends BasePage {

    public MainPage(WebDriver driver) {
        super(driver);
    }

    String mainPageSelector = ".main.widgets";
    String formSearchSelector = "form .input__box";
    String searchButtonSelector = "button.button_theme_websearch";
    String keyboardIconSelector = ".input__box .keyboard-loader";
    String voiceSearchIconSelector = ".input__box .input__voice-search";
    String homeLogoYandexSelector = ".home-logo .home-logo__default";
    String videoTabSelector = "[data-id='video']";
    String imagesTabSelector = "[data-id='images']";
    String newsTabSelector = "[data-id='news']";
    String mapsTabSelector = "[data-id='maps']";
    String marketTabSelector = "[data-id='market']";
    String translateTabSelector = "[data-id='translate']";
    String musicTabSelector = "[data-id='music']";
    String moreLinkSelector = ".home-tabs .home-tabs__more-switcher";
    String screenKeyboardSelector = ".b-keyboard-popup:not(.b-keyboard-popup_hidden_yes) .b-keyboard";
    String keyboardCloseButtonSelector = ".b-keyboard-popup .b-keyboard-popup__close";
    String searchResultsPageSelector = ".main .main__center";
    String resultTextSelector = ".organic.typo_text_m";

    @FindBy(css = ".input__box .input__control")
    public WebElement formSearchInput;
    @FindBy(css = ".keyboard-loader .keyboard-loader__icon")
    public WebElement keyboardIcon;
    @FindBy(css = ".b-keyboard-popup .b-keyboard-popup__close")
    public WebElement keyboardCloseButton;
    @FindBy(css = "button.button_theme_websearch")
    public WebElement searchButton;
    @FindBy (css = ".organic.typo_text_m")
    public WebElement resultText;


    /**
     * Открывается главная страница яндекс
     */
    public void openPage(){
        driver.get("https://yandex.ru");
    }

    /**
     * Проверяется, что страница yandex.ru открылась
     * @return boolean
     */
    public boolean isMainPagePresent() {
        return waitForElementPresent(By.cssSelector(mainPageSelector));
    }

    /**
     * Проверяется, что на странице присутвует форма ввода поиска
     * @return boolean
     */
    public boolean isFormSearchPresent() {
        return waitForElementPresent(By.cssSelector(formSearchSelector));
    }

    /**
     * Проверяется, что присутвует кнопка <Найти> в строке поиска
     * @return boolean
     */
    public boolean isSearchButtonPresent() {
        return waitForElementPresent(By.cssSelector(searchButtonSelector));
    }

    /**
     * Проверяется, что присутвует иконка клавиатуры в строке поиска
     * @return boolean
     */
    public boolean isKeyboardIconPresent() {
        return waitForElementPresent(By.cssSelector(keyboardIconSelector));
    }

    /**
     * Проверяется, что присутвует иконка микрофона в строке поиска
     * @return boolean
     */
    public boolean isVoiceSearchIconPresent() {
        return waitForElementPresent(By.cssSelector(voiceSearchIconSelector));
    }

    /**
     * Проверяется, что слева от поля поиска есть лого <Яндекс>
     * @return boolean
     */
    public boolean isDefaultLogoPresent() {
        return waitForElementPresent(By.cssSelector(homeLogoYandexSelector));
    }

    /**
     * Проверяется, что присутвует ссылка на вкладку <Видео>
     * @return boolean
     */
    public boolean isVideoTabPresent() {
        return waitForElementPresent(By.cssSelector(videoTabSelector));
    }

    /**
     * Проверяется, что присутвует ссылка на вкладку <Картинки>
     * @return boolean
     */
    public boolean isImagesTabPresent() {
        return waitForElementPresent(By.cssSelector(imagesTabSelector));
    }

    /**
     * Проверяется, что присутвует ссылка на вкладку <Новости>
     * @return boolean
     */
    public boolean isNewsTabPresent() {
        return waitForElementPresent(By.cssSelector(newsTabSelector));
    }

    /**
     * Проверяется, что присутвует ссылка на вкладку <Карты>
     * @return boolean
     */
    public boolean isMapsTabPresent() {
        return waitForElementPresent(By.cssSelector(mapsTabSelector));
    }

    /**
     * Проверяется, что присутвует ссылка на вкладку <Маркет>
     * @return boolean
     */
    public boolean isMarketTabPresent() {
        return waitForElementPresent(By.cssSelector(marketTabSelector));
    }

    /**
     * Проверяется, что присутвует ссылка на вкладку <Переводчик>
     * @return boolean
     */
    public boolean isTranslateTabPresent() {
        return waitForElementPresent(By.cssSelector(translateTabSelector));
    }

    /**
     * Проверяется, что присутвует ссылка на вкладку <Музыка>
     * @return boolean
     */
    public boolean isMusicTabPresent() {
        return waitForElementPresent(By.cssSelector(musicTabSelector));
    }

    /**
     * Проверяется, что присутвует ссылка <Еще>
     * @return boolean
     */
    public boolean isMoreLinkPresent() {
        return waitForElementPresent(By.cssSelector(moreLinkSelector));
    }

    /**
     * Клик на иконку клвиатуры
     */
    public void clickOnKeyboardIcon(){
        keyboardIcon.click();
    }

    /**
     * Проверяется, что экранная клавиатура отображается
     * @return boolean
     */
    public boolean isScreenKeyboardPresent() {
        return waitForElementPresent(By.cssSelector(screenKeyboardSelector));
    }

    /**
     * Проверяется, что крестик закрытия экранной клавиатуры присутствует
     * @return boolean
     */
    public boolean isKeyboardCloseButtonPresent() {
        return waitForElementPresent(By.cssSelector(keyboardCloseButtonSelector));
    }

    /**
     * Клик на иконку клвиатуры
     */
    public void clickOnKeyboardCloseButton(){
        keyboardCloseButton.click();
    }

    /**
     * Очищается поле ввода и заполняется данными
     */
    public void clearAndSetSearchInput(String text){
        formSearchInput.clear();
        formSearchInput.sendKeys(text);
    }

    /**
     * Нажимается кнопка <Найти>
     */
    public void clickOnSearchButton() {
        searchButton.click();
    }

    /**
     * Проверяется, что страница с результатами поиска отображается
     * @return true/false
     */
    public boolean isSearchResultPagePresent(){
        return waitForElementPresent(By.cssSelector(searchResultsPageSelector));
    }

    /**
     * Проверяется, что в результатах поиска есть искомое значение
     * @param text
     * @return true/false
     */
    public boolean searchTextSameAs(String text){
        int size = driver.findElements(By.cssSelector(resultTextSelector)).size();
        for(int result = 1; result <= size; result++){
            if(driver.findElements(By.cssSelector(resultTextSelector)).get(result - 1).getText().contains(text)){
                return true;
            }
        }
        return false;
    }
}
