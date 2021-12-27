package com.joform.form.pages;

import com.joform.form.utility.Utility;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class JotFormPage extends Utility {

    @CacheLookup
    @FindBy (xpath = "//button[@id='jfCard-welcome-start']")
    WebElement welcomePageNextButton;

    @CacheLookup
    @FindBy (xpath = "//input[@id='first_3']")
    WebElement firstNameText;

    @CacheLookup
    @FindBy (css = "#last_3")
    WebElement lastNameText;

    @CacheLookup
    @FindBy (xpath = "//div[@data-type='control_fullname']//button[@aria-label='Next'][normalize-space()='Next']")
    WebElement nameNextButton;

    @CacheLookup
    @FindBy (xpath = "//div[@data-type='control_fileupload']//button[@aria-label='Next'][normalize-space()='Next']")
    WebElement fileUploadNextButton;

    @CacheLookup
    @FindBy (xpath = "//div[@data-type='control_signature']//button[@aria-label='Next'][normalize-space()='Next']")
    WebElement signNextButton;

    @CacheLookup
    @FindBy (xpath = "//span[@aria-label='Calendar icon']//*[name()='svg']")
    WebElement calendarTab;

    @CacheLookup
    @FindBy (xpath = "//tr[@class='days']/td")
    List<WebElement> datesText;

    @CacheLookup
    @FindBy (xpath = "//div[@data-type='control_datetime']//button[@aria-label='Next'][normalize-space()='Next']")
    WebElement dateNextButton;

    @CacheLookup
    @FindBy (xpath = "//input[@id='input_11_field_2']")
    WebElement answerText;

    @CacheLookup
    @FindBy (xpath = "(//select[@id='input_11_field_1'])[1]")
    WebElement securityQuestionText;

    @CacheLookup
    @FindBy (xpath = "//div[@data-type='control_mixed']//button[@aria-label='Next'][normalize-space()='Next']")
    WebElement securityNextButton;

    @CacheLookup
    @FindBy (xpath = "//button[@class='jfInput-button forSubmit form-submit-button u-right']")
    WebElement submitButton;

    @CacheLookup
    @FindBy (xpath = "//h1[normalize-space()='Thank You!']")
    WebElement thankYouMessage;

    public void goToNextPageFromHomePage(){
        pmClickOnElement(welcomePageNextButton);
    }

    public void enterFirstName(String firstName){
        pmSendTextToElement (firstNameText,firstName);
    }

    public void enterLastName(String lastName){
        pmSendTextToElement(lastNameText,lastName);
    }

    public void goToNextPageFromNamePage(){
        pmClickOnElement(nameNextButton);
    }

    public void goToNextPageFromFileUpload(){
        pmClickOnElement(fileUploadNextButton);
    }

    public void goToNextPageFromSignaturePage(){
        pmClickOnElement(signNextButton);
    }

    public void selectDateFromCalender(String date) {
        pmClickOnElement(calendarTab);

        for (WebElement date1 : datesText) {
            if (date1.getText().equalsIgnoreCase(date)) {
                pmClickOnElement(date1);
                break;
            }
        }
    }
        public void goToNextPageFromDatePage(){
            pmClickOnElement(dateNextButton);
        }


        public void selectSecurityQuestion(String securityQuestion){
            pmSelectByContainsTextFromDropDown(securityQuestionText,securityQuestion);
        }

        public void enterAnswerInTextBox(String answer){
            pmSendTextToElement(answerText,answer);
        }

        public void clickOnSubmitButton(){
            pmClickOnElement(submitButton);
        }

        public void verifyThankYouMessage(){

            String actual = thankYouMessage.getText();
            Assert.assertTrue(actual.contains("Thank You"));

        }









}
