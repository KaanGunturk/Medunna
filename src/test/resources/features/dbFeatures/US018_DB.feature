@US018
Feature: US018 Admin olarak yeni Physician olustur gunceller goruntule ve sil

  Scenario:TC007 DB kullanarak doktorlari dogrulayın
    Given Admin connects to the database
    And Admin gets the "select * from physician" table
    Then  Admin set the expected data and verify it
    Then close the database connection