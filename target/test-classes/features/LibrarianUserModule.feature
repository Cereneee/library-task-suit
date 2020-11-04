@libraryUserStory1
Feature: User Story1 – As a Librarian, I should be able to manage Users:

  Background: user is on login page
    Given user on the login page
    And user logs in as a "librarian"
    Given librarian user click on User button on the header

  @userStory1Ac1
  Scenario: User should be able to see the grid with Actions, Used ID, Full Name, Email, Group, Status header

    Then librarian user click on User button on the header
    And User should be able to see the grid with elements below
      | Actions   |
      | User ID   |
      | Full Name |
      | Email     |
      | Group     |
      | Status    |

  @userStory1Ac2
  Scenario: User should be able to click on Add User button and add user

    And librarian user clicks on add user button
    Then librarian will add a new user and save it
  @userStory1Ac3
  Scenario: User should be able to see all users by selecting ALL or filter by Librarian or Student category in User Group box

    And user select librarian from User Group dropdown
    And user select students from User Group dropdown
    And user select all from User Group dropdown
  @userStory1Ac4
  Scenario: User should be able to filter users by ACTIVE and INACTIVE status in Status box

    And user filtering users by Inactive status in Status box
    And user filtering users by Active status in Status box