Feature: Book Ticket

  Scenario Outline: Booking a ticket
    Given a movie "<movie>" at "<venue>" venue on "<date>" date at "<time>" time
    When a user tries to book a seat '<seat>'
    Then the booking should be "<expected>"

    Examples:
      | movie   | venue  | date       | time  | seat | expected |
      | Movie 1 | Venue 1| 2023-05-18 | 18:00 | B    | true     |
      | Movie 1 | Venue 1| 2023-05-18 | 18:00 | A    | false    |
      | Movie 2 | Venue 2| 2023-05-19 | 19:00 | C    | true     |
      | Movie 2 | Venue 2| 2023-05-19 | 19:00 | B    | false    |
      | Movie 3 | Venue 3| 2023-05-20 | 20:00 | A    | true     |
