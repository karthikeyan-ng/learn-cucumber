Feature: Application Login
  Scenario: Home Page Default Login
    Given User is on NetBanking landing page
    When User login into application with username "pascal" and password "1234"
    Then Home page is populated
    And Cards are displayed

  Scenario: Home Page Default Login
    Given User is on NetBanking landing page
    When User login into application with username "thomas" and password "5678"
    Then Home page is populated
    And Cards are not displayed