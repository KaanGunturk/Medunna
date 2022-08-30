Feature: US_05 Hasta Randevulari DB test
  @US05DB
  Scenario: TC_005 Kullanici, DB ile Appointment dogrular

    Given kullanici database ile baglanti kurar
    And kullanici appointment dogrular
    And kullanici database baglantisini kapatir