Feature: US_28 Admin olarak; Country oluşturma / Okuma ve Silme

  @US_28_TC_01 @US_28
  Scenario: TC_01 Kullanıcı yeni bir ülke oluşturabilir
    Given AEE Kullanici medunna.com adresine gider
    Then  AEE Kullanici Profil butonuna tiklar
    Then  AEE Kullanici Sign in butonuna tiklar
    And   AEE Kullanici Admin olarak giris yapar
    And   AEE Kullanici Items&Titles butonuna tiklar
    Then  AEE Kullanici Country butonuna tiklar
    And   AEE Kullanici Creat a new Country butonuna tiklar
    And   AEE Kullanici Name kismina eklemek istedigi ulke ismini yazar
    And   AEE Kullanici Creat Country Save butonuna tiklar
    Then  AEE Creat Country Basari mesaji geldigi test edilir
    And   AEE Kullanici sayfayi kapatir

  @US_28_TC_02 @US_28
  Scenario: TC_02 Kullanıcı, ülkeye göre ilgili eyaletler veya şehirler oluşturabilmelidir.
    Given AEE Kullanici medunna.com adresine gider
    Then  AEE Kullanici Profil butonuna tiklar
    Then  AEE Kullanici Sign in butonuna tiklar
    And   AEE Kullanici Admin olarak giris yapar
    And   AEE Kullanici Items&Titles butonuna tiklar
    And   AEE Kullanici State/City butonuna tiklar
    And   AEE Kullanici Creat a new State/City butonuna tiklar
    And   AEE Kullanici Name kismina eklemek istedigi eyalet veya sehir ismini yazar
    And   AEE Kullanici State/City kisminda uzerine eklemek istedigi ulkeyi secer
    And   AEE Kullanici Creat City Save butonuna tiklar
    Then  AEE Creat Ctiy Basari mesaji geldigi test edilir
    And   AEE Kullanici sayfayi kapatir

  @US_28_TC_06 @US_28
  Scenario: TC_06 Kullanıcı ülkeleri silebilmelidir.
    Given AEE Kullanici medunna.com adresine gider
    Then  AEE Kullanici Profil butonuna tiklar
    Then  AEE Kullanici Sign in butonuna tiklar
    And   AEE Kullanici Admin olarak giris yapar
    And   AEE Kullanici Items&Titles butonuna tiklar
    Then  AEE Kullanici Country butonuna tiklar
    Then  AEE Kullanici silmek istedigi ulkenin Delete butonuna tiklar
    And   AEE Kullanici acilan pencerede Delete butonuna tiklar
    Then  AEE Delete Country Basari mesaji geldigi test edilir
    And   AEE Kullanici sayfayi kapatir
