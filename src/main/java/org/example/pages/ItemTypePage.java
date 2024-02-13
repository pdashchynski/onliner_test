package org.example.pages;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.example.domain.Types;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class ItemTypePage extends AbstractPage {

    @FindBy(xpath = "//h1[@class='catalog-form__title catalog-form__title_big-alter']")
    private ExtendedWebElement pageTitle;

    @FindBy(xpath = "//div[@class='catalog-form__offers-list']/div[%d]//a[contains(text(), '%s')]")
    private ExtendedWebElement elementByIndex;

    public ItemTypePage(WebDriver driver) {
        super(driver);
    }

    public boolean isPageTitlePresent() {
        return pageTitle.isElementPresent();
    }

    public String getPageTitle() {
        return pageTitle.getText();
    }

    public ItemPage getElementByIndexAndType(int index, Types types) {
        elementByIndex.format(index, types.getTitleSingle()).click();

        return new ItemPage(getDriver());
    }
}
