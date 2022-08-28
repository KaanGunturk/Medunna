Feature: US_017 Test items(öğe) Oluştur / Güncelle / Sil
@US17db
  Scenario: US17_TC_007

    Given Admin Nhl DB ile baglanti olusturur

     And Admin Nhl DB'e sorgu gonderir id ile test item bilgilerini alir

     Then Admin Nhl bilgileri dogrular
