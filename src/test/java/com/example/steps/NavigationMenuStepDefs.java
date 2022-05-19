package com.example.steps;

import com.example.app.pages.NavigationMenu;
import io.cucumber.java.en.When;

public class NavigationMenuStepDefs {
    NavigationMenu navigationMenu = new NavigationMenu();
    @When("user go to List Menu")
    public void userGoToListMenu() {
        navigationMenu.clickHamburgerMenu();
        navigationMenu.clickListMenu();
    }
}