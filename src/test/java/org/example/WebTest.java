package org.example;

import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.utils.R;
import org.example.domain.Types;
import org.example.pages.CatalogMainPage;
import org.example.pages.ItemPage;
import org.example.pages.ItemTypePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class WebTest implements IAbstractTest {

    @Test
    public void verifyItemTypePage() {
        SoftAssert sa = new SoftAssert();
        CatalogMainPage catalogMainPage = getCatalogMainPage();

        sa.assertTrue(catalogMainPage.isPageOpened());
        sa.assertTrue(catalogMainPage.isElementTitlePresent(Types.LAPTOPS));

        ItemTypePage itemTypePage = catalogMainPage.clickElementTitle(Types.LAPTOPS);

        sa.assertEquals(itemTypePage.getPageTitle(), Types.LAPTOPS.getPageTitle());

        sa.assertAll();
    }

    @Test
    public void verifyItemTypePageAlt() {
        SoftAssert sa = new SoftAssert();
        CatalogMainPage catalogMainPage = getCatalogMainPage();

        sa.assertTrue(catalogMainPage.isPageOpened());
        sa.assertTrue(catalogMainPage.isElementTitlePresent(Types.BLOW_DRYERS));

        ItemTypePage itemTypePage = catalogMainPage.clickElementTitleAlt(Types.BLOW_DRYERS);

        sa.assertEquals(itemTypePage.getPageTitle(), Types.BLOW_DRYERS.getPageTitle());

        sa.assertAll();
    }

    @Test
    public void verifyItemPage() {
        SoftAssert sa = new SoftAssert();
        CatalogMainPage catalogMainPage = getCatalogMainPage();

        sa.assertTrue(catalogMainPage.isPageOpened());
        sa.assertTrue(catalogMainPage.isElementTitlePresent(Types.LAPTOPS));

        ItemTypePage itemTypePage = catalogMainPage.clickElementTitle(Types.LAPTOPS);

        sa.assertEquals(itemTypePage.getPageTitle(), Types.LAPTOPS.getPageTitle());

        ItemPage itemPage = itemTypePage.getElementByIndexAndType(1, Types.LAPTOPS);

        sa.assertTrue(itemPage.getItemTitle().contains(Types.LAPTOPS.getTitleSingle()));

        sa.assertAll();
    }

    private CatalogMainPage getCatalogMainPage() {
        CatalogMainPage catalogMainPage = new CatalogMainPage(getDriver());
        catalogMainPage.open();
        Assert.assertTrue(catalogMainPage.isPageOpened());
        return catalogMainPage;
    }
}
