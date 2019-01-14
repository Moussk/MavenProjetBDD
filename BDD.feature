Feature: MonpremierBDD



  Scenario Outline: Recherche google
Given a web browser is on the Google page
When the search phrase "aws" is entered
Then results for "aws" are shown



    Examples:
      | phrase |
      | aws |
      | docker |
      | ansible |
      | Rest|
      | Soap |
      | java|