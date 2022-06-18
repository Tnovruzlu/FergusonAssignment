package com.build.qa.build.selenium.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QuoizelPage extends BasePage{
    @FindBy(xpath = "//title[contains(text(),\"Quoizel\")]")
    public WebElement pageTitle;
}
