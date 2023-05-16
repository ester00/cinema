Feature: Make Payment

  Scenario Outline: Successful payment processing
    Given a user with id "<userId>" wants to make a payment of <amount>
    When the user confirms the transaction
    Then the payment should be processed successfully

    Examples:
      | userId | amount |
      | 001    | 100.00 |
      | 002    | 200.00 |
      | 003    | 300.00 |
      | 004    | 400.00 |
      | 005    | 500.00 |

  Scenario Outline: Successful payment cancellation
    Given a user with id "<userId>" has made a payment of <amount>
    When the user cancels the transaction
    Then the payment should be cancelled successfully

    Examples:
      | userId | amount |
      | 001    | 100.00 |
      | 002    | 200.00 |
      | 003    | 300.00 |
      | 004    | 400.00 |
      | 005    | 500.00 |
