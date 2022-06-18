package com.build.qa.build.selenium.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SinkFaucetPage extends BasePage {
    @FindBy(xpath = "//p[.='(2508)']")
    public WebElement chromeFaucets;

    @FindBy (xpath = "//div[@data-total-record='2508']")
    public WebElement resultForChromeFaucets;

    @FindBy (xpath = "//p[.='(216)']")
    public WebElement deltaFaucets;

    @FindBy (xpath = "//div[@data-total-record='216']")
    public WebElement resultForDeltaFaucets;
}
