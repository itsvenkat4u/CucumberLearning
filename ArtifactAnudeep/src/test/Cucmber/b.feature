Feature: Send email functionality in accounts page

  Scenario: Check send email checkbox is unselected by default
    Given I am on accounts page
    Then checkbox should be unselected

  Scenario Outline: Check send email checkbox is unselected by default in all pages
    Given i am on "<page_name>" page
    Then checkbox should be unselected
    And print the <value>
    When print the colour as "<color>"
    And print the color as "<color1>"
      #| color1 |
      #| blue   |

    Examples: 
      | page_name   | value | color  |
      | client page |     5 | Yellow |
      | Bond page   |     6 | pink   |
