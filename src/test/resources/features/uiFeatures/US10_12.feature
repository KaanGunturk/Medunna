
Feature: US10 Doktor Randevulari


  Scenario: US10_TC_001 Doktor randevu listesini ve zaman dilimlerini "My Appointments" sekmesinden görebilmelidir.

    Given Doktor Medunna adresine gider

    And Doktor profil butonuna tiklar

    Then Doktor giris yapmak icin sign in butonuna basar

    And Doktor username ile sifresini girer

    Then Doktor sign in butonuna basar

    And Doktor MyPages butonuna tiklar

    Then Doktor MyAppointments butonuna tiklar

    And Doktor randevu listesini ve zaman dilimlerini My Appointments sekmesinden görebilmelidir.

    Then Doktor sayfayi kapatir


  Scenario: US10_TC_002 Doktor "patient id, start date, end date, status" bilgilerini görebilmeli

    Given Doktor Medunna adresine gider

    And Doktor profil butonuna tiklar

    Then Doktor giris yapmak icin sign in butonuna basar

    And Doktor username ile sifresini girer

    Then Doktor sign in butonuna basar

    And Doktor MyPages butonuna tiklar

    Then Doktor MyAppointments butonuna tiklar

    And Doktor patient id, start date, end date, status bilgilerini görebilmeli

    Then Doktor sayfayi kapatir


    #***************** _US_12_(Doktor)Physician  test isteyebilmeli*******************

  Scenario: US12_TC_001 (Doktor)Physician  test isteyebilmeli

    Given Doktor Medunna adresine gider

    And Doktor profil butonuna tiklar

    Then Doktor giris yapmak icin sign in butonuna basar

    And Doktor username ile sifresini girer

    Then Doktor sign in butonuna basar

    And Doktor MyPages butonuna tiklar

    Then Doktor MyAppointments butonuna tiklar

    And Doktor acilan sayfadaki istenen hastanin edit butonun tiklar

    Then Doktor acilan sayfada Request A Test butonuna tiklar

    And  Test items tablosunun gorunur oldugunu test eder

    Then Doktor sayfayi kapatir


  Scenario: US12_TC_002 Test iceriginde "Glucose, Urea, Creatinine, Sodium,Potassium,
                        Total protein, Albumin, Hemoglobin" secenekleri olmali

    Given Doktor Medunna adresine gider

    And Doktor profil butonuna tiklar

    Then Doktor giris yapmak icin sign in butonuna basar

    And Doktor username ile sifresini girer

    Then Doktor sign in butonuna basar

    And Doktor MyPages butonuna tiklar

    Then Doktor MyAppointments butonuna tiklar

    And Doktor acilan sayfadaki istenen hastanin edit butonun tiklar

    Then Doktor acilan sayfada Request A Test butonuna tiklar

    And  Doktor Glucose, Urea, Creatinine,Sodium,Potassium,Total protein, Albumin, Hemoglobin seceneklerini gormeli

    Then Doktor sayfayi kapatir




