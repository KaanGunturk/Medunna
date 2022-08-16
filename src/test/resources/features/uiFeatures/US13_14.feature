
Feature:US_013_014Physician "Test Results" işlemleri yapabilmeli


  Scenario: US13_TC01  Physician "Test Results" sonuclarini gorebilmeli

    Given ZH Physician Medunna adresine gider
    And ZH Physician Sign in1 butonuna tiklar
    And ZH Physician username ve sifresini girer
    Then ZH Physician My Pages butonuna tiklar
    And ZH Physician My Appointments butonuna tiklar
    Then ZH Physician 3 sn bekler
    And ZH Physician acilan sayfadaki istenen hastanin edit butonun tiklar
    Then ZH Physician 5 sn bekler
    And ZH Physician Show Test Results butonuna tiklar
    Then ZH Physician 6 sn bekler
    And ZH Physician acilan pencere de View Results butonuna tiklar
    Then ZH Physician hastaya ait Show Test Results secenekleri gorebilir


  Scenario: US13_TC02 Physician "Request Impatient" isteğinde bulunabilmeli

    Then ZH Physician My Pages butonuna tiklar
    And ZH Physician My Appointments butonuna tiklar
    And ZH Physician acilan sayfadaki istenen hastanin Appointments edit butonun tiklar
    And ZH Physician Request Inpatient seceneginin tiklanabilir oldugunu dogrular


  Scenario: US14_TC01 Physician "Edit Inpatient" işlemleri yapabilmeli

    Then ZH Physician My Pages butonuna tiklar
    Then ZH Kullanici My Inpatients butonuna tiklar
    Then ZH Kullanici In Patients bilgilerin gorunurlugunu kontrol eder.


  Scenario: US014_TC02 Physician rezerve edilmiş odayı güncelleyebilmeli

    And ZH Physician Edit butonuna tiklar
    Then ZH Physician 5 sn bekler
    Then ZH Physician "Status" günceller
    Then ZH Physician 5 sn bekler
    Then ZH Physician oda numarasini günceller
    Then ZH save butonuna basar
    Then ZH sayfayi kapatir


