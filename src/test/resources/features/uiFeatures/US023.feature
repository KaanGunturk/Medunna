Feature: US023

  Scenario: Staff can navigate to payment invoice process
    Given Kullanici "baseUrl" anasayfasinda
    Then  Kullanıcı profil isaretine tıklar
    Then  Kullanici giris yapmak icin Sign in sekmesine tiklar
    Then  Kullanici Staff olarak username "userNameStaff" ve sifresini "sifreStaff" girer
    Then  Kullanici ikinci Sign in butonuna tiklar
    Then  Kullanici my pages butonuna tiklar
    Then  Kullanici Search Patient butonuna tiklar
    And   Onceden tedavisi biten hastasini bulur ve show appointmentsa tiklar
    And   Payment Invoice Processesin tiklanabilir oldugunu test eder ve tiklar
    And   Examfee ve toplam tutarin gorulebildigini test eder
    Then  Create Invoice tiklanabilir oldugunu test eder
    And   KG sayfayi kapatir


  Scenario: Staff can check up on old Payments
    Given Kullanici "baseUrl" anasayfasinda
    Then  Kullanıcı profil isaretine tıklar
    Then  Kullanici giris yapmak icin Sign in sekmesine tiklar
    Then  Kullanici Staff olarak username "userNameStaff" ve sifresini "sifreStaff" girer
    Then  Kullanici ikinci Sign in butonuna tiklar
    Then  Kullanici my pages butonuna tiklar
    Then  Kullanici Search Patient butonuna tiklar
    And   Odemesi tamamlanmis olan eski hastayi bulur ve appointmentsa tiklar
    And   Payment Invoice Processesin tiklanabilir oldugunu test eder ve tiklar
    Then  show invoice in tiklanabilir oldugunu test eder
    And   show invoice a tiklar
    Then  invoice sayfasinda oldugunu ve gorebildigini test eder
    And   KG sayfayi kapatir





