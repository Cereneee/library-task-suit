@login
Feature: As user I want to be able to login under different roles

  Background: common steps
    Given user on the login page

#feature class
  @librarian
  Scenario: Login as a librarian
    When user logs in as a "librarian"
    Then Dashboard should be displayed

  @Student
  Scenario: Login as a student
    When user log in as a "student"
    Then Books should be displayed


