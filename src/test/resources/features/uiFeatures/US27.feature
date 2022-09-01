Feature: US_027 Messages by Admin Validate with API and DB

  Scenario: TC_001 Admin, mesaj portalina gidebilir tum mesajlari, yazarlarini
  ve e-postalarini goruntuleyebilir,mesaj olusturabilir, guncelleyebilir, silebilir

    Given kullanici "baseUrl" anasayfasinda
    Then kullanici profil butonuna tiklar
    Then kullanici sing in butonuna tiklar
    Then Kullanici username girer
    Then Kullanici Password girer
    Then kullanici sign in butonuna tiklar
    Then kullanici Items&Titles butonuna tiklar
    Then kullanici Messages butonuna tiklar
    Then Kullanici tum mesajlari yazarlarini ve e-postalarini gorur
    And kullanici Create a new Message butonuna tiklar
    And kullanici mesaj bilgilerini girip save botonuna tiklar
    And kullanici yeni mesaj olusturdugunu gorur
    And kullanici mesajin sagindaki edit butonuna tiklar
    And kullanici mesaji guncelleyip save butonuna tiklar
    And kullanici mesaji guncelledigini gorur
    And kullanici mesajin sagindaki delete butonuna tiklar
    And kullanici gelen mesajda tekrar delete butonuna tiklar
    And kullanici mesajin silindigini gorur
    And kullanici sayfayi kapatir
