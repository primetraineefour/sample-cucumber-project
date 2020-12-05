Feature: Login
  As a user I want to login into nope commerce website


  Scenario: User should navigate to login page successfully
    Given I am on home page
    When I click on login link
    Then I should navigate to login page successfully

    Scenario: User should login successfully with valid credentials
      Given I am on home page
      When I click on login link
      And I enter email "xyz@yahoo.com"
      And I enter password "abc123"
      And I click on login button
      Then I should login successfully

  @Smoke
  Scenario Outline: Verify the error message with invalid credentials
    Given I am on home page
    When I click on login link
    And I enter email "<username>"
    And I enter password "<password>"
    And I click on login button
    Then I should see the error message "<errorMessage>"
    Examples:
      | username                | password   | errorMessage                                                                               |
      | abcd123@gmail.com       | xyz123     | Login was unsuccessful. Please correct the errors and try again. No customer account found |
      | djjfgjjfg123@gmail.com  | xyadfas123 | Login was unsuccessful. Please correct the errors and try again. No customer account found |
      | ritmjhsdfg123@gmail.com | adfsadf123 | Login was unsuccessful. Please correct the errors and try again. No customer account found |

