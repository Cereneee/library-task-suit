package com.cybertek.library.pages;

import com.cybertek.library.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class LibrarianPage extends BasePage{

    public LibrarianPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//th[@data-name]")
    private List<WebElement> headerElements;

    public void headerElementsVerification(List<String> dataTable) {

        List<String> headerElementsString = new ArrayList<>();
        for (WebElement each : headerElements) {
            headerElementsString.add(each.getText().trim());
        }

        Assert.assertEquals("Header verification failed", dataTable, headerElementsString);

    }
}
