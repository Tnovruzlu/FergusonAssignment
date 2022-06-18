package com.build.qa.build.selenium.pageobjects;

import org.openqa.selenium.support.PageFactory;
import com.build.qa.build.selenium.Framework.Driver;



public abstract class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
