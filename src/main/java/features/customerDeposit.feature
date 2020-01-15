Feature: Customer Deposit

  Scenario Outline: Customer Deposit
    When User login successfully as <userSelect>
    When I click Login button
    Then I verify Harry Potter is already selected in the YourName label

    When I click DepositTop button
    When I type Amount to be Deposited as <number>
    When I click DepositBottom button
    Then I verify Deposit Successful

    Examples:
      | userSelect   | number |
      | Harry Potter | 2000   |