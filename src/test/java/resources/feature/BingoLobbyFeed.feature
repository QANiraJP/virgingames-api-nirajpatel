Feature: Test and verify request for Bingo Lobby

#  Scenario: As a user I want to check Bingo Lobby Feed request and verify
#    When I send GET request to list endpoint
#    And  I must get back valid status code 200
#    Then I verify TicketPrice is not in negative


  Scenario: As a user I want to send request and verify available data
    When I send GET request
    And I get valid status code 200
    Then I verify that number of player is greater than zero