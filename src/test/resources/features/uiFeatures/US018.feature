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
    And admin login "ay9" firstname "ayberk9" lastname "ayberk9" mail "ayberk9@ayberk.com" SSN "393-69-9654" rol olarak doktor girer
    And admin save tusuna basar
    And admin items&titles sekmesine basar
    And admin physician sekmesine basar
    And admin create a new physician sekmesine basar
    Then admin kayitli SSN "393-69-9654" girer ve dogrulama mesajinin geldigini test eder

    #333-39-9658 manuel için kullanılan ssn
  Scenario:TC002 Kişilerin "firstname, lastname birth date .." bilgileri doldurulabilmeli.
    #And admin administration sekmesine basar
    #And admin user management sekmesine basar
    #And admin 531 sayfaya gecer
    #And admin logini "ay9" olan doktorun idisini alir
    And admin items&titles sekmesine basar
    And admin physician sekmesine basar
    And admin create a new physician sekmesine basar
    Then admin kayitli SSN "393-69-9654" girer ve dogrulama mesajinin geldigini test eder
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


  Scenario:TC003 Admin, bütün doctorların bilgilerini görebilmelidir
    And admin items&titles sekmesine basar
    And admin physician sekmesine basar
    Then admin bütün doktorların bilgilerinin görüldügünü test eder


  Scenario:TC004 Admin, Doktorların bilgilerini düzenleyebilir.
    And admin items&titles sekmesine basar
    And admin physician sekmesine basar
    And admin 23 sayfaya gecer
    And admin firstname "ayberk9" olan doktorun idisini alir
    And admin firstname "ayberk9" olan doktorun edit butona tiklar
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

  Scenario:TC005 Admin mevcut doktorları silebilir
    And admin items&titles sekmesine basar
    And admin physician sekmesine basar
    And admin 23 sayfaya gecer
    And admin firstname "ayberk9" olan doktorun idisini alir
    And admin firstname "ayberk9" olan doktorun delete butona tiklar
    And admin cikan uyari mesajinda delete butonuna basar
    Then delete icin dogrulama mesajinin gorundugunu test eder

