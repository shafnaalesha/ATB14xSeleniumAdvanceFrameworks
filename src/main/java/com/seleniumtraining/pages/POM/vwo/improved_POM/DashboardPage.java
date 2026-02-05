package com.seleniumtraining.pages.POM.vwo.improved_POM;

import com.seleniumtraining.utils.PropertiesReader;
import com.seleniumtraining.utils.WaitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
    WebDriver driver;

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    private By userNameOnDashboard = By.xpath("//span[@data-qa=\"lufexuloga\"]");


    public String loggedInUserName(){
        WaitHelpers.waitJVM(10000);
        driver.get(PropertiesReader.readKey("url_dashboard"));
        return driver.findElement(userNameOnDashboard).getText();
    }
}
