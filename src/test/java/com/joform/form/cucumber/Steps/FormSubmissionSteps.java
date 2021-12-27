package com.joform.form.cucumber.Steps;

import com.joform.form.pages.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FormSubmissionSteps {
    @When("^User clicks on next button from homepage$")
    public void userClicksOnNextButtonFromHomepage() {
        //new HomePage().goToNextPageFromHomePage();
    }

    @And("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
    public void userEntersAnd(String firstName, String lastName) {
        new NamePage().enterFirstName(firstName);
        new NamePage().enterLastName(lastName);
    }

    @And("^User clicks on next button from name page$")
    public void userClicksOnNextButtonFromNamePage() {
        new NamePage().goToNextPageFromNamePage();
    }

    @And("^User upload file from \"([^\"]*)\" in local machine$")
    public void userUploadFileFromInLocalMachine(String fileLocation){
        new FileUploadPage().uploadTestFile("C:\\Users\\jimil\\uploadTest.txt");
    }

    @And("^User clicks on next button from file upload page$")
    public void userClicksOnNextButtonFromFileUploadPage() {
        new FileUploadPage().goToNextPageFromFileUpload();
    }

    @And("^User enters signature$")
    public void userEntersSignature() {
        new SignaturePage().enterSignature();
    }

    @And("^User clicks on next button from signature page$")
    public void userClicksOnNextButtonFromSignaturePage() {
        new SignaturePage().goToNextPageFromSignaturePage();
    }

    @And("^User selects date from calender$")
    public void userSelectsDateFromCalender() {
        new CalendarPage().selectDateFromCalender("12-16-2021");
    }

    @And("^User clicks on next button from calender page$")
    public void userClicksOnNextButtonFromCalenderPage() {
        new CalendarPage().goToNextPageFromDatePage();
    }

    @And("^User selects security question from dropdown$")
    public void userSelectsSecurityQuestionFromDropdown() {
        new SecurityQuestionPage().selectSecurityQuestion(" Favourite school name ".trim());
    }

    @And("^User enters security answer$")
    public void userEntersSecurityAnswer() {
        new SecurityQuestionPage().enterAnswerInTextBox("SSB");
    }

    @And("^User clicks on submit button$")
    public void userClicksOnSubmitButton() {
        new SecurityQuestionPage().clickOnSubmitButton();
    }

    @Then("^User can submit form successfully and can see 'Thank You' message$")
    public void userCanSubmitFormSuccessfullyAndCanSeeThankYouMessage() {
        new ThankYouPage().verifyThankYouMessage();
    }



}
