@US018api
Feature: US018 Admin olarak yeni Physician olustur gunceller goruntule ve sil

  Scenario:TC007 DB kullanarak doktorlari dogrulayın
    Given Admin connects to the database
    Then Admin gets the "*" from "jhi_user" table
    And  verify "jhi_user" table "ssn" column contains "123-56-9424" data
    Then close the database connection