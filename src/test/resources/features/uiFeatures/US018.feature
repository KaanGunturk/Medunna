@US018
Feature: US018 Admin olarak yeni Physician olustur gunceller goruntule ve sil

  Background:
    Given admin "baseUrl" anasayfasinda
    And profil sembolune tiklar
    And singIn sekmesi tiklar
    And user gecerli "userNameAdmin" ve "sifreAdmin" ile giris yapar
    And singin butonuna basar

  Scenario:TC001 Admin, SSN kimligine gore kayitli bir kisiyi secebilir arayabilir.
    And admin administration sekmesine basar
    And admin user management sekmesine basar
    And admin create a new user sekmesine basar
    And admin login "ay14" firstname "ayberk14" lastname "ayberk14" mail "ayberk14@ayberk.com" SSN "393-14-9654" rol olarak doktor girer
    And admin save tusuna basar
    And admin items&titles sekmesine basar
    And admin physician sekmesine basar
    And admin create a new physician sekmesine basar
    Then admin kayitli SSN "393-10-9654" girer ve dogrulama mesajinin geldigini test eder


    #333-39-9658 manuel icin kullanilan ssn
  Scenario:TC002 Kisilerin "firstname, lastname birth date .." bilgileri doldurulabilmeli.
    And admin administration sekmesine basar
    And admin user management sekmesine basar
    And admin 567 sayfaya gecer
    And admin logini "ay14" olan doktorun idisini alir
    And admin items&titles sekmesine basar
    And admin physician sekmesine basar
    And admin create a new physician sekmesine basar
    Then admin kayitli SSN "393-14-9654" girer ve dogrulama mesajinin geldigini test eder
    And admin use search check box tiklar
    And admin tarih "10.10.1980" girer
    And admin telefon "5555655555" girer
    And admin adres "sparta zeus2" girer
    And admin cinsiyet "MALE" belirler
    And admin uzmanlik "Pediatrics" belirler
    And admin kan grubu "B+" secer
    And admin description "aaaaaayyyyyy2" girer
    And admin fotograf yukler
    And admin "59" dolar ucret belirler
    And admin country "Germany" secer
    And admin save tusuna basar
    Then create icin dogrulama mesajinin gorundugunu test eder


  Scenario:TC003 Admin, butun doctorlarin bilgilerini gorebilmelidir
    And admin items&titles sekmesine basar
    And admin physician sekmesine basar
    Then admin butun doktorlarin bilgilerinin goruldugunu test eder


  @US018tc4
  Scenario:TC004 Admin, Doktorlarin bilgilerini duzenleyebilir.
    And admin items&titles sekmesine basar
    And admin physician sekmesine basar
    And admin 25 sayfaya gecer
    And admin firstname "ayberk14" olan doktorun idisini alir
    And admin firstname "ayberk14" olan doktorun edit butona tiklar
    And admin tarih "10.11.1981" girer
    And admin telefon "5355557575" girer
    And admin adres "Meow York" girer
    And admin cinsiyet "MALE" belirler
    And admin uzmanlik "Nuclear_medicine" belirler
    And admin kan grubu "AB-" secer
    And admin description "Nuclear Doctor" girer
    And admin fotograf yukler
    And admin "595" dolar ucret belirler
    And admin country "Afghanistan" secer
    And admin save tusuna basar
    Then edit icin dogrulama mesajinin gorundugunu test eder


  Scenario:TC005 Admin mevcut doktorlari silebilir
    And admin items&titles sekmesine basar
    And admin physician sekmesine basar
    And admin 25 sayfaya gecer
    And admin firstname "ayberk14" olan doktorun idisini alir
    And admin firstname "ayberk14" olan doktorun delete butona tiklar
    And admin cikan uyari mesajinda delete butonuna basar
    Then delete icin dogrulama mesajinin gorundugunu test eder


