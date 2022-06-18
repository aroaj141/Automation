Feature: Verify Facebook Details

  Scenario Outline: Verify Facebook login
    When I should perform login "<username>", "<password>"

    Examples: 
      | username | password |
      | aro      | aro#1441 |
