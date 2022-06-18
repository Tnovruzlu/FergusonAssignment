package com.build.qa.build.selenium.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    @FindBy(xpath = "//div[@class='header-container container ']//input[@placeholder='Search for products']")
    public WebElement searchField;

    @FindBy(xpath = "//div[@class='header-container container ']//a[@class='fg-icon-search']")
    public WebElement searchButton;

    @FindBy(linkText = "All Products")
    public WebElement allProducts;

}
