Feature:US_005 Hastalar (patients), hastahaneden randevu (Appointment) oluşturabilmelidir.
  @US05UI
  Scenario: TC_001 kullanici randevu olustururken firs name last name ssn email phone
  bilgilerini girmelidir bos birakilamaz

    Given kullanici "baseUrl" anasayfasinda
    Then kullanici Make an Appointment butonuna tiklar
    Then kullanici First Name girmeli bos birakilamaz
    Then kullanici Last Name girmeli bos birakilamaz
    Then kullanici kayitli SSN numarasi girmeli bos birakilamaz
    And kullanici email adresi girmeli bos birakilamaz
    And kullanici telefon numarasi girmeli bos birakilamaz
    And kullanici tum bilgileri girmeden randevu olusturamayacagini gorur
    And kullanici sayfayi kapatir


  Scenario: TC_002 kullanici randevu olustururken firs name last name ssn email phone
  bilgilerini girmelidir

    Given kullanici "baseUrl" anasayfasinda
    Then kullanici Make an Appointment butonuna tiklar
    Then kullanici herhangi bir karakter iceren First Name girer
    Then kullanici herhangi bir karakter iceren Last Name girer
    Then kullanici kayitli SSN numarasi girer
    And kullanici . ve @ iceren email adresi girer
    And kullanici ucuncu ve altinci rakamdan sonra - olan on rakamli telefon no girer
    And kullanici Send an Appointment Request butonuna tiklar
    And kullanici basarili bir sekilde randevu olusturdugunu gorur
    And kullanici sayfayi kapatir


  Scenario: TC_003 kullanici aldigi randevuyu profil sayfasinda gorur

    Given kullanici "baseUrl" anasayfasinda
    Then kullanici profil butonuna tiklar
    Then kullanici sing in butonuna tiklar
    Then kullanici username girer
    Then kullanici Password girer
    And kullanici sign in butonuna tiklar
    And kullanici My Pages butonuna tiklar
    And kullanici My Appointments butonuna tiklar
    And kullanici aldigi randevuyu profil sayfasinda gorur
    And kullanici sayfayi kapatir

