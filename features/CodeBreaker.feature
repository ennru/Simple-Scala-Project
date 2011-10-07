Feature: Marking a guess
  In order to get more information about the secret code
  As a code breaker
  I would like to see marks for my guess

  Background:
    Given the secret "r g y b"

  Scenario Outline: Lots of tests
    When I guess "<guess>"
    Then I should get "<mark>"

  Examples:
    |guess   |mark    |
    |c c c c |        |
    |b c c c |m       |
    |y b c c |m m     |
    |y b r c |m m m   |
    |y b r g |m m m m |
    |r c c c |p       |
    |r g c c |p p     |
    |r g y c |p p p   |
    |r g y b |p p p p |
    |r b c c |p m     |
    |r g b c |p p m   |
    |r b y g |p p m m |
    |r g b r |p p m   |
