Feature: US_027 Messages by Admin Validate with API and DB
  @US27DB
  Scenario: TC_004 Admin, DB ile mesajlari dogrular

    Given Admin database ile baglanti kurar
    And Admin mesajlari dogrular
    And Admin database baglantisini kapatir

