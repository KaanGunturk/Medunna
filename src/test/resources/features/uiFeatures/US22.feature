Feature: TC01 kullanici ssn ile hasta arayabilir


  Scenario: Kullanıcı (Staff) test sonuclarını gorebilmelidir.
    Given Kullanici "baseUrl" anasayfasinda
    Then  Kullanıcı profil isaretine tıklar
    Then  Kullanici giris yapmak icin Sign in sekmesine tiklar
    Then  Kullanici Staff olarak username "userNameStaff" ve sifresini "sifreStaff" girer
    Then  Kullanici ikinci Sign in butonuna tiklar
    Then  Kullanici my pages butonuna tiklar
    Then  Kullanici Search Patient butonuna tiklar
    And   SSN numarasini girer
    And   Show appoinmant butonuna tiklar
    And   show test butonuna tiklar
    And   view results butonuna tiklar
    Then  test sonuclarinin gorulebilir oldugunu test eder
    And   KG sayfayi kapatir

  Scenario: Kullanici (Staff) "ID, Date, Result, description, Created date, ..." gibi sonuc bilgileini gorebilmeli ve
  guncelleyebilmelidir

    Given Kullanici "baseUrl" anasayfasinda
    Then  Kullanıcı profil isaretine tıklar
    Then  Kullanici giris yapmak icin Sign in sekmesine tiklar
    Then  Kullanici Staff olarak username "userNameStaff" ve sifresini "sifreStaff" girer
    Then  Kullanici ikinci Sign in butonuna tiklar
    Then  Kullanici my pages butonuna tiklar
    Then  Kullanici Search Patient butonuna tiklar
    And   SSN numarasini girer
    And   Show appoinmant butonuna tiklar
    And   show test butonuna tiklar
    And   view results butonuna
    And   edit butonuna tiklar
    And   result texboxa tiklar
    And   descripcion texboxuna tiklar
    And   save butomuna tiklar
    And   kullanici oturumu kapatir



