Feature: To validatde the Fb login

  Background: 
    Given The user in FB page

  @Smoke @Regression
  Scenario Outline: To validate the login with the credeintials
    When The user enter the "<userName>" and "<passWord>" datas
    And The user click the login button
    Then The user  navigate to next page

    Examples: 
      | userName | passWord |
      | mano     |      965 |

  @Sanity @Regression
  Scenario Outline: To validate the Registration functionality
    When The user enter the "<fristName>" and "<lastName>" details
    Then the user Registered successfully

    Examples: 
      | fristName | lastName |
      | Manoj     | Kumar    |
