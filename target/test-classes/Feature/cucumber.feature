Feature: verifying adactin hotel details
@chennai
  Scenario Outline: verifying adactinhotel login with invalid details
    Given I am on adactinHOtel Login page
    When I should enter "<userName>"  ,"<password>"
    And i should search the "<location>","<hotels>","<room_type>"
    And I should select the hotel
    And I should enter "<firstName>","<lastName>","<Address>","<CcNum>","<crdType>","<CcExp>","<CcYear>","<Cvv>"
    Then I should verify success login message

    Examples: 
      | userName   | password     | location | hotels      | room_type | firstName | lastName | Address | CcNum            | crdType | CcExp | CcYear | Cvv |
      | MusthaqHam | Musthaq@1996 | Paris    | Hotel Creek | Double    | Aro       | Akash    | chennai | 2594585964496365 | VISA    | May   |   2022 | 231 |


@super

      Scenario Outline: Verify Facebook login
    When I should perform login "<username>", "<password>"

    Examples: 
      | username | password |
      | aro      | aro#1441 |