package com.example.steps;

import com.example.app.pages.CalculatorPage;
import com.example.app.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class OperationStepDefs {
    CalculatorPage calculatorPage = new CalculatorPage();
    LoginPage loginPage = new LoginPage();

    @When("user input angka1 {string}")
    public void userInputAngka1(String angka1) {
        calculatorPage.userInputAngka1(angka1);

    }

    @When("user click spinner")
    public void userClickSpinner() {
        calculatorPage.userClickSpinner();
    }

    @When("user choose operation list add")
    public void userChooseOperationList() {
        calculatorPage.userChooseOperationAdd();
    }

    @When("user input angka2 {string}")
    public void userInputAngka2(String angka2) {
        calculatorPage.userInputAngka2(angka2);

    }

    @When("user click button equal")
    public void userClickButtonEqual() {
        calculatorPage.clickButtonEqual();

    }

    @Then("user get Hasil {string}")
    public void userGetHasil(String jumlah) {
        String Hasil = calculatorPage.getHasil();
        Assertions.assertEquals("Hasil : " + jumlah, Hasil);
    }

    @When("user choose operation list subtraction")
    public void userChooseOperationListSubtraction() {
        calculatorPage.userChooseOperationSub();
    }

    @When("user choose operation list multiple")
    public void userChooseOperationListMultiple() {
        calculatorPage.userChooseOperationMultiple();
    }

    @When("user choose operation list divide")
    public void userChooseOperationListDivide() {
        calculatorPage.userChooseOperationDivide();

    }
    @Given("user login using valid email {string} and password {string}")
    public void userLoginUsingValidEmailAndPassword(String username, String password) {
        loginPage.inputUsername(username);
        loginPage.inputPassword(password);
        loginPage.clickLoginButton();

    }
}
