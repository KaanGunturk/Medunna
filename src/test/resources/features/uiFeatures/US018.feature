@US018
Feature: US018 Admin olarak yeni Physician olustur gunceller goruntule ve sil
  Background:
    Given admin "baseUrl" anasayfasinda
    And profil sembolune tiklar
    And singIn sekmesi tiklar
    And user gecerli "userNameAdmin" ve "sifreAdmin" ile giris yapar
    And singin butonuna basar

  Scenario:TC001 Admin, SSN kimliğine göre kayıtlı bir kişiyi seçebilir arayabilir.
    And admin administration sekmesine basar
    And admin user management sekmesine basar
    And admin create a new user sekmesine basar
    And admin login "ay1" firstname "ayberk" lastname "ayberk" mail "ayberk1@ayberk.com" SSN "343-39-9658" rol olarak doktor girer
    And admin save tusuna basar
    And admin items&titles sekmesine basar
    And admin physician sekmesine basar
    And admin create a new physician sekmesine basar
    Then admin kayitli SSN "343-39-9658" girer ve dogrulama mesajinin geldigini test eder

    #333-39-9658 manuel için kullanılan ssn
  Scenario:TC002 Kişilerin "firstname, lastname birth date .." bilgileri doldurulabilmeli.
    And admin items&titles sekmesine basar
    And admin physician sekmesine basar
    And admin create a new physician sekmesine basar
    And admin create a new physician sekmesine basar
    Then admin kayitli SSN "343-39-9658" girer ve dogrulama mesajinin geldigini test eder
    And admin use search check box tiklar
    And admin tarih girer
    And admin telefon 5555555555 girer
    And admin adres "sparta zeus" girer
    And admin cinsiyet belirler
    And admin uzmanlik belirler
    And admin description "aaaaaayyyyyy" girer
    And admin fotograf yukler
    And admin ucret belirler
    And admin country secer
    And admin save tusuna basar
    Then dogrulama mesajinin gorundugunu test eder


  Scenario:TC003 Admin, bütün doctorların bilgilerini görebilmelidir
    And admin items&titles sekmesine basar
    And admin physician sekmesine basar
    Then admin bütün doktorların bilgilerinin görüldügünü test eder

  Scenario:TC004 Admin, doktorun profil resmini sağlayabilir.
    And admin items&titles sekmesine basar
    And admin physician sekmesine basar
    And admin "321-48-7891" SSN numarali kisiyi bulur ve idsinin "2051" oldugunu dogrular ve tiklar
    And admin doktorun resmini degistirebilir

  Scenario:TC005 Admin, doktorun profil resmini sağlayabilir.
    And admin items&titles sekmesine basar
    And admin physician sekmesine basar
    And admin "321-48-7891" SSN numarali kisiyi bulur ve idsinin "2051" oldugunu dogrular ve tiklar
    And admin doktorun resmini degistirebilir
