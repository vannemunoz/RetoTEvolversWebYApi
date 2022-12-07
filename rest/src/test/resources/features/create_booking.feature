Feature: create bookings
  i as user need to create booking
  for save his information

  Background:
    Given the services https://restful-booker.herokuapp.com

  Scenario: create bookings successful
    When the user try create booking
      | firstname | lastname | totalprice | depositpaid | checkin    | checkout   | additionalneeds |
      | James     | Brown    | 111        | true        | 2017-01-01 | 2017-01-02 | Breakfast       |
    Then the user will see the status code 200
    And the user will see  totalprice 111

  Scenario: Get bookgins successful
    Given the user try create booking
      | firstname | lastname | totalprice | depositpaid | checkin    | checkout   | additionalneeds |
      | James     | Brown    | 111        | true        | 2017-01-01 | 2017-01-02 | Breakfast       |
    When  the user want get booking with id
    Then the user will see the status code 200

  Scenario: Update booking successfull
    Given the user try create booking
      | firstname | lastname | totalprice | depositpaid | checkin    | checkout   | additionalneeds |
      | James     | Brown    | 111        | true        | 2017-01-01 | 2017-01-02 | Breakfast       |
    And create token
    When the user want Update booking
      | firstname | lastname | totalprice | depositpaid | checkin    | checkout   | additionalneeds |
      | James     | Browns    | 112        | true        | 2018-01-01 | 2018-01-02 | Breakfast       |
    Then the user will see the status code 200
    And the user wll see the information after update

