Feature:
  Scenario:Staff can only update appointments
    Given Kullanici "baseUrl" anasayfasinda
    Then  Kullanıcı profil isaretine tıklar
    Then  Kullanici giris yapmak icin Sign in sekmesine tiklar
    Then  Kullanici Staff olarak username "userNameStaff" ve sifresini "sifreStaff" girer
    Then  Kullanici ikinci Sign in butonuna tiklar
    Then  Kullanici my pages butonuna tiklar
    Then  Kullanici Search Patient butonuna tiklar
    And   Show appointments butonuna tiklar
    And   Appointmen'i duzenlemek icin edit butonuna tiklar
    Then  Appointment duzenleme sayfasinda oldugunu test eder
    And   KG sayfayi kapatir

  Scenario: Staff can make the status UNAPPROVED, PENDING or CANCELLED, but cannot make
  it COMPLETED
    Given Kullanici "baseUrl" anasayfasinda
    Then  Kullanıcı profil isaretine tıklar
    Then  Kullanici giris yapmak icin Sign in sekmesine tiklar
    Then  Kullanici Staff olarak username "userNameStaff" ve sifresini "sifreStaff" girer
    Then  Kullanici ikinci Sign in butonuna tiklar
    Then  Kullanici my pages butonuna tiklar
    Then  Kullanici Search Patient butonuna tiklar
    And   Show appointments butonuna tiklar
    And   Appointmen'i duzenlemek icin edit butonuna tiklar
    And   Status acilir menusune tiklar
    Then  Menude UNAPPROVED, PENDING or CANCELLED opsiyonlarinin aktif oldugunu test eder
    And   KG sayfayi kapatir

  Scenario: Staff does not need to provide Anamnesis, Treatment or Diagnosis as required fields
    Given Kullanici "baseUrl" anasayfasinda
    Then  Kullanıcı profil isaretine tıklar
    Then  Kullanici giris yapmak icin Sign in sekmesine tiklar
    Then  Kullanici Staff olarak username "userNameStaff" ve sifresini "sifreStaff" girer
    Then  Kullanici ikinci Sign in butonuna tiklar
    Then  Kullanici my pages butonuna tiklar
    Then  Kullanici Search Patient butonuna tiklar
    And   Show appointments butonuna tiklar
    And   Appointmen'i duzenlemek icin edit butonuna tiklar
    Then  Anamnesis, Treatment or Diagnosis bolumlerini bos birakabildigini test eder
    And   KG sayfayi kapatir

  Scenario: They can select the current doctor that needs to be selected for the patient
    Given Kullanici "baseUrl" anasayfasinda
    Then  Kullanıcı profil isaretine tıklar
    Then  Kullanici giris yapmak icin Sign in sekmesine tiklar
    Then  Kullanici Staff olarak username "userNameStaff" ve sifresini "sifreStaff" girer
    Then  Kullanici ikinci Sign in butonuna tiklar
    Then  Kullanici my pages butonuna tiklar
    Then  Kullanici Search Patient butonuna tiklar
    And   Show appointments butonuna tiklar
    And   Appointmen'i duzenlemek icin edit butonuna tiklar
    And   Hasta icin bir doktor secebilecegini test eder
    And   KG sayfayi kapatir

  Scenario: They can view the patients test results
    Given Kullanici "baseUrl" anasayfasinda
    Then  Kullanıcı profil isaretine tıklar
    Then  Kullanici giris yapmak icin Sign in sekmesine tiklar
    Then  Kullanici Staff olarak username "userNameStaff" ve sifresini "sifreStaff" girer
    Then  Kullanici ikinci Sign in butonuna tiklar
    Then  Kullanici my pages butonuna tiklar
    Then  Kullanici Search Patient butonuna tiklar
    And   Show appointments butonuna tiklar
    And   Show tests butonuna tiklar
    And   Kullanicinin test sonuclari sayfasinda oldugunu test eder
    And   KG sayfayi kapatir