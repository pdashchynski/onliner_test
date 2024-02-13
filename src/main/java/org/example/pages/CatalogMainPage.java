package org.example.pages;

import com.zebrunner.carina.utils.config.Configuration;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.decorator.PageOpeningStrategy;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.example.domain.Types;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class CatalogMainPage extends AbstractPage {

    @FindBy(xpath = "//div[@class='catalog-navigation__title']")
    private ExtendedWebElement pageTitle;

    @FindBy(xpath = "//div[@class='tiles tiles_grid_4']//div[@class='b-tile-header line-clamp-2' and contains(text(), '%s')]")
    private ExtendedWebElement elementTitle;

    @FindBy(xpath = "//p[@class='b-tile-excerpt line-clamp-2' and contains(text(), '%s')]/preceding-sibling::div[contains(text(), '%s')]")
    private ExtendedWebElement elementTitleAlt;

    public CatalogMainPage(WebDriver driver) {
        super(driver);
        setPageOpeningStrategy(PageOpeningStrategy.BY_URL);
    }

    @Override
    public void open() {
        super.openURL(Configuration.getRequired("web_url"));
    }

    public ItemTypePage clickElementTitle(Types types) {
        elementTitle.format(types.getTitle()).click();

        return new ItemTypePage(getDriver());
    }

    public ItemTypePage clickElementTitleAlt(Types types) {
        elementTitleAlt.format(types.getSubTitle(), types.getTitle()).click();

        return new ItemTypePage(getDriver());
    }

    public boolean isElementTitlePresent(Types types) {
        return elementTitle.format(types.getTitle()).isElementPresent();
    }
}
