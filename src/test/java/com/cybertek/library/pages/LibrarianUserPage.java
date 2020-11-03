package com.cybertek.library.pages;

import com.cybertek.library.utilities.BrowserUtils;
import com.cybertek.library.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;


public class LibrarianUserPage extends BasePage{

    public LibrarianUserPage()  {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (css = "[class='btn btn-lg btn-outline btn-primary btn-sm']")
    private WebElement  addUserBtn;

    @FindBy(xpath = "//th[@data-name]")
    private List<WebElement> headerElements;

    @FindBy(css = "[name=\"full_name\"]")
    private WebElement fullNameInput;

    @FindBy( css = "[type='password']")
    private WebElement passwordInput;

    @FindBy( xpath = "//input[@name='email']")
    private WebElement emailInput;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement saveChanges;



    public void headerElementsVerification(List<String> dataTable) {

        List<String> headerElementsString = new ArrayList<>();
        for (WebElement each : headerElements) {
            headerElementsString.add(each.getText().trim());
        }

        Assert.assertEquals("Header verification failed", dataTable, headerElementsString);

    }

    public void addUserBtn(){
        BrowserUtils.clickOnElement(addUserBtn);
    }

    public void fullNameInput(String fullName) {
        BrowserUtils.enterText(fullNameInput, fullName);
    }

    public void passwordInput(String password) {
        BrowserUtils.enterText(passwordInput, password );
    }

    public void emailInput(String email) {
        BrowserUtils.enterText(emailInput, email );
    }

    public void saveChages(){
        BrowserUtils.clickOnElement(saveChanges);
    }





}
