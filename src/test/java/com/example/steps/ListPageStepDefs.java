package com.example.steps;

import com.example.app.pages.ListPage;
import io.cucumber.java.en.When;

public class ListPageStepDefs {
    ListPage listPage = new ListPage();
    @When("user do swipe up on list data")
    public void userDoSwipeUpOnListData() {
        listPage.swipeUp();
    }
    @When("user do Long Press on list data")
    public void userDoLongPressOnListData() {
        listPage.LongPress();
    }
    @When("user do multiple times on list data")
    public void userDoMultipleTimesOnListData() {
        listPage.MulipleTimes();
    }
}
