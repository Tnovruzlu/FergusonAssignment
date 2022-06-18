package com.build.qa.build.selenium.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends BasePage{
    @FindBy(xpath = "//a[@title=\"PROFLO® Rockaway 20 x 17 in. Drop-in Bathroom Sink with 4 in. Centerset Faucet Holes in White\"]")
    public WebElement addedProduct;
}
