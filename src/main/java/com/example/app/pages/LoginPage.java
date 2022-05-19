package com.example.app.pages;

import com.example.app.base.BasePageObject;
import com.example.app.drivers.AndroidDriverInit;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

public class LoginPage extends BasePageObject {

    public void inputUsername(String username) {
//        By locator = MobileBy.id("username");
//        AndroidElement txtFieldUsername = AndroidDriverInit.driver.findElement(locator);
//        txtFieldUsername.clear();
//        txtFieldUsername.sendKeys(username);
        type(MobileBy.id("username"), username);
    }

    public void inputPassword(String password) {
//        By locator = MobileBy.id("password");
//        AndroidElement txtFieldPassword = AndroidDriverInit.driver.findElement(locator);
//        txtFieldPassword.clear();
//        txtFieldPassword.sendKeys(password);
        type(MobileBy.id("password"), password);
    }

    public void clickLoginButton() {
//        By locator = MobileBy.id("login");
//        AndroidElement btnlogin = AndroidDriverInit.driver.findElement(locator);
//        btnlogin.click();
        click(MobileBy.id("login"));
    }
}
