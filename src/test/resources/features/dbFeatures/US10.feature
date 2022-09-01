Feature: US_010 Doktor randevu bilgileri dB
    @US10dB
  Scenario: US10_TC_004

    Given Doktor Nhl DB ile baglanti olusturur

     And  Doktor Nhl DB'e sorgu gonderir randevu id si ile hasta bilgilerini alir

     Then Doktor Nhl bilgileri dogrular


