Feature: calculate operations
  Scenario Outline: Addition
    Given User entered two numbers <x> and <y>
    And User select the operation
    When the operation is addition
    Then User should have result <result>
    Examples:
    | x | y  | result|
    | 0 | 0  | 0     |
    | 5 | 5  | 10    |
    | 5 | -5 | 0     |
