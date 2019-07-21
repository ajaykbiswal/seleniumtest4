Feature: Test facebook Smoke Scenario
  
  @tag1
  Scenario: Test login with valid credentials
    Given Open Chrome and start application
    When Enter valid username and valid password
    Then user should be able to login into application sucessfully

    
