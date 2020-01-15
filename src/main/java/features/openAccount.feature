Feature: Open Account

  Background:
    Given I open website as http://www.way2automation.com/angularjs-protractor/banking/#/manager/openAccount

  Scenario Outline:  Open Account sucessfully
    When I choose account as <fullname> and currency as <currency>
    And I click open account
    Then I verify that user is already open
    Examples:
      | fullname     | currency |
      | Harry Potter | Pound    |


#  Scenario Outline:  Open Account unsucessfully
#    When I choose account as <fullname> and currency as <currency>
#    And I click open account
#    Then I verify that user is already open
#    Examples:
#      | fullname     | currency |
#      | Harry Potter | Pound    |