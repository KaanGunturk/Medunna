Feature:US_013_014Physician "Test Results" işlemleri yapabilmeli


  Background: Ortak adim
    Given Physician Medunna adresine gider
    And Physician Sign in1 butonuna tiklar
    And Physician username ve sifresini girer
    Then Physician My Pages butonuna tiklar

  Scenario: US13_TC01  Physician "Test Results" sonuclarini gorebilmeli

   And Physician My Appointments butonuna tiklar
   And Physician acilan sayfadaki istenen hastanin edit butonun tiklar
   And Physician Show Test Results butonuna tiklar
   And Physician acilan pencere de View Results butonuna tiklar
   Then Physician hastaya ait secenekleri gorebilir


  Scenario: US13_TC02 Physician "Request Impatient" isteğinde bulunabilmeli

  And Physician My Appointments butonuna tiklar
  And Physician acilan sayfadaki istenen hastanin Appointments edit butonun tiklar
  And Physician Request Inpatient seceneginin tiklanabilir oldugunu dogrular


  Scenario: US14_TC01 Physician "Edit Inpatient" işlemleri yapabilmeli
  Then Kullanici My Inpatients butonuna tiklar
  Then Kullanici bilgilerin gorunurlugunu kontrol eder.


  Scenario: US014_TC02 Physician rezerve edilmiş odayı güncelleyebilmeli
  And Physician My inpatients sekmesine tiklar
  And Physician Edit butonuna tiklar
  And Physician Status'u günceller
  Then Pyhsician rezerve edilmiş odayı günceller