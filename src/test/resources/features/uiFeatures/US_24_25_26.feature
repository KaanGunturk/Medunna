Feature: US_24 My Appointments (Randevular) (Patient)

  Scenario: US_24 TC01 Test sonuclari
    Given ZH Hasta medunna adresi gider
    And ZH Hasta Sign in1 butonuna tiklar
    And ZH Hasta username ve sifresini girer
    And ZH Hasta My Pages butonuna tiklar
    And ZH Kullanici My Appointments butonuna tiklar
    And ZH Kullanici gecerli bir tarih girer
    And ZH Kullanici Show Tests butonuna tiklar
    Then ZH Kullanici View Results butonuna tiklar
    And ZH Kullanici acilan sayfada kan tahlili bolumlerinin gorunur oldugunu test eder

  Scenario: US24 TC02 My Appointments Recete Bilgisi
    Given ZH Hasta medunna adresi gider
    And ZH Hasta Sign in1 butonuna tiklar
    And ZH Hasta username ve sifresini girer
    And ZH Hasta My Pages butonuna tiklar
    And ZH Kullanici My Appointments butonuna tiklar
    Then ZH Kullanici gecerli bir tarih girer
    And ZH Kullanici Show Invoice butonuna tiklar
    And ZH Kullanici Invoice'in gorunur oldugunu test eder


  Scenario: US25_TC01 My Appointments by Patient in the account
    Given ZH Hasta medunna adresi gider
    And ZH Kullanici Make an Appointment butonuna tiklar
    And ZH Kullanici First Name girer
    And ZH Kullanici Last Name girer
    And ZH Kullanıcı SSN numarası (kayıtlı SSN) girer
    And ZH Kullanici Email adresi girer
    And ZH Kullanıcı telefon numarası girer
    And ZH Kullanici randevu icin tarih secer
    Then ZH Kullanici Send an Appointment Request butonuna tiklar
    Then ZH Kullanici randevunun olustugunu dogrular


  Scenario: US26_TC01 İletişim Mesajı (Contact messages)
    Given ZH Hasta medunna adresi gider
    And ZH Kullanici mesaj icin gerekli olan name kutucugu doldurur
    And ZH Kullanici mesaj icin gerekli olan email kutucugu doldurur
    And ZH Kullanici mesaj icin gerekli olan Subject kutucugu doldurur
    And ZH Kullanici mesaj icin gerekli olan Message kutucugu doldurur
    Then ZH Kullanici Send butonuna taklar
    Then ZH Kullanici sayfayi kapatir