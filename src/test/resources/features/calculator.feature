Feature: Calculator operations

  Scenario Outline: Addition of two numbers
    Given I have a calculator
    When I add <number1> and <number2>
    Then the result should be <result>


    Examples:
      | number1 | number2 | result |
      | 1       | 2       | 3      |
      | 10      | 15      | 25     |
      | 5       | 7       | 12     |

  Scenario Outline: Subtraction of two numbers
    Given I have a calculator
    When I subtract <number1> from <number2>
    Then the result should be <result>

    Examples:
      | number1 | number2 | result |
      | 10      | 5       | 5      |
      | 20      | 15      | 5      |
      | 50      | 30      | 20     |
