package org.example.pages;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class ItemPage extends AbstractPage {

    @FindBy(xpath = "//div[@class='catalog-masthead']/h1")
    private ExtendedWebElement itemTitle;

    public ItemPage(WebDriver driver) {
        super(driver);
    }

    public String getItemTitle() {
        return itemTitle.getText();
    }
}
