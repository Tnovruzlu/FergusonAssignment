package com.build.qa.build.selenium.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SinkPage extends BasePage{
    @FindBy(xpath = "//div[@id='sku1861700']//a[contains(@title,\"Rockaway 20 x 17 in\")]")
    public WebElement bathRoomSink;


    @FindBy (xpath = "//p[@data-productid=',1861700']")
    public WebElement addToCartOnThePage;

    @FindBy (xpath = "//button[@data-productid='1861700']")
    public WebElement addToCartOnThePopup;

    public void addingToCartOnThePage(){
        addToCartOnThePage.click();
    }

    public void addingToCartOnThePopup(){
        addToCartOnThePopup.click();
    }
}
