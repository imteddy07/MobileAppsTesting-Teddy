package com.example.app.pages;

import com.example.app.base.BasePageObject;
import com.example.app.drivers.AndroidDriverInit;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

public class CalculatorPage extends BasePageObject {

    public void userInputAngka1(String angka1) {
        By locator = MobileBy.id("et_1");
        AndroidElement txtFieldAngka1 = AndroidDriverInit.driver.findElement(locator);
        txtFieldAngka1.clear();
        txtFieldAngka1.sendKeys(angka1);
    }

    public void userClickSpinner() {
        By locator = MobileBy.id("spinner_1");
        AndroidElement spinner = AndroidDriverInit.driver.findElement(locator);
        spinner.click();
    }

    public void userChooseOperationAdd() {
        By locator = MobileBy.xpath("//android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[1]");
        AndroidElement btnAdd = AndroidDriverInit.driver.findElement(locator);
        btnAdd.click();

    }

    public void userChooseOperationSub() {
        By locator = MobileBy.xpath("//android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]");
        AndroidElement btnSub = AndroidDriverInit.driver.findElement(locator);
        btnSub.click();

    }

    public void userChooseOperationDivide() {
        By locator = MobileBy.xpath("//android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[3]");
        AndroidElement btnSub = AndroidDriverInit.driver.findElement(locator);
        btnSub.click();

    }
    public void userChooseOperationMultiple() {
        By locator = MobileBy.xpath("//android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[4]");
        AndroidElement btnMultiple = AndroidDriverInit.driver.findElement(locator);
        btnMultiple.click();

    }

    public void userInputAngka2(String angka2) {
        By locator = MobileBy.id("et_2");
        AndroidElement txtFieldAngka1 = AndroidDriverInit.driver.findElement(locator);
        txtFieldAngka1.clear();
        txtFieldAngka1.sendKeys(angka2);
    }

    public void clickButtonEqual() {
        By locator = MobileBy.id("acb_calculate");
        AndroidElement btnequal = AndroidDriverInit.driver.findElement(locator);
        btnequal.click();
    }

    public String getHasil() {
        By locator = MobileBy.id("tv_result");
        AndroidElement labelHasil = AndroidDriverInit.driver.findElement(locator);
        return labelHasil.getText();
    }
}
