package com.cybertek.library.step_definitions;

import com.cybertek.library.pages.LibrarianPage;
import com.cybertek.library.pages.LibrarianUserPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Map;

public class LibrarianUserModuleDefinitions {


    LibrarianUserPage librarianUserPage = new LibrarianUserPage();

    @Then("librarian user click on User button on the header")
    public void librarianUserClickOnUserButtonOnTheHeader() {
        librarianUserPage.usersPageLink();
    }

    @And("User should be able to see the grid with elements below")
    public void userShouldBeAbleToSeeTheGridWithElementsBelow(List<String> expected) {

        System.out.println(expected.toString());
        librarianUserPage.headerElementsVerification(expected);

    }

    @And("librarian user clicks on add user button")
    public void librarianUserClicksOnAddUserButton() {
        librarianUserPage.addUserBtn();

    }



//        librarianUserPage.fullNameInput("Agit A");
//        librarianUserPage.passwordInput("asdasd");
//        librarianUserPage.emailInput("asd@gmail.com");
//        librarianUserPage.saveChages();

    @Then("librarian will add a new user and save it")
    public void librarianWillAddANewUserAndSaveIt(Map <String, String> info) {

    }

    @And("user select librarian from User Group dropdown")
    public void userSelectLibrarianFromUserGroupDropdown() {

    }

    @And("user select students from User Group dropdown")
    public void userSelectStudentsFromUserGroupDropdown() {

    }

    @And("user select all from User Group dropdown")
    public void userSelectAllFromUserGroupDropdown() {

    }

    @And("user filtering users by Inactive status in Status box")
    public void userFilteringUsersByInactiveStatusInStatusBox() {

    }

    @And("user filtering users by Active status in Status box")
    public void userFilteringUsersByActiveStatusInStatusBox() {

    }
}
