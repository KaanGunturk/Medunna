@negative
Feature: US_08 Kullanıcı giriş yaptığında Password sekmesi düzenlenebilir olmalıdır.

  @negatif
  Scenario Outline: TC_01 "New password confirmation" onaylanabilmelidir.
    Given AEE Kullanici medunna.com adresine gider
    Then  AEE Kullanici Profil butonuna tiklar
    Then  AEE Kullanici Sign in butonuna tiklar
    And   AEE Kullanici "<username>" username ve "<password>" sifresini girer
    Then  AEE Kullanici Hesap butonuna tiklar
    Then  AEE Kullanici Password butonuna tiklar
    And   AEE New password confirmation kisminin kullanilabilir oldugu test edilir
    And   AEE Kullanici sayfayi kapatir

    Examples:
      |username           |password       |
      |healthprojectteam54|AiGAYmJSJp.EN98|
      |PhysicianTeam54    |PhysicianTeam54|
      |UserTeam54         |UserTeam54     |
      |PatientTeam54      |PatientTeam54  |
      |StaffTeam54        |StaffTeam54    |


  @US_08_TC_02
  Scenario Outline: TC_02 Daha güçlü şifre için en az 1 küçük harf olmalı ve "Password strength:" seviyesinin değiştiği görülebilmelidir.
    Given AEE Kullanici medunna.com adresine gider
    Then  AEE Kullanici Profil butonuna tiklar
    Then  AEE Kullanici Sign in butonuna tiklar
    And   AEE Kullanici "<username>" username ve "<password>" sifresini girer
    Then  AEE Kullanici Hesap butonuna tiklar
    Then  AEE Kullanici Password butonuna tiklar
    And   AEE Kullanici New password kismina "<onemsiz>" yazar
    And   AEE Kullanici New password kisminin devamina bir kucuk harf yazar
    Then  AEE Password strength seviyesinin degisikligi test edilir
    And   AEE Kullanici sayfayi kapatir

    Examples:
      |username           |password       |onemsiz|
      |healthprojectteam54|AiGAYmJSJp.EN98|.......|
      |PhysicianTeam54    |PhysicianTeam54|ABCDEFG|
      |UserTeam54         |UserTeam54     |.......|
      |PatientTeam54      |PatientTeam54  |1234567|
      |StaffTeam54        |StaffTeam54    |.......|


  @US_08_TC_03
  Scenario Outline: TC_03 Şifre en az 1 büyük harf içermeli ve "Password strength:" seviyesinin değiştiği görülebilmelidir.
    Given AEE Kullanici medunna.com adresine gider
    Then  AEE Kullanici Profil butonuna tiklar
    Then  AEE Kullanici Sign in butonuna tiklar
    And   AEE Kullanici "<username>" username ve "<password>" sifresini girer
    Then  AEE Kullanici Hesap butonuna tiklar
    Then  AEE Kullanici Password butonuna tiklar
    And   AEE Kullanici New password kismina "<onemsiz>" yazar
    And   AEE Kullanici New password kisminin devamina bir buyuk harf yazar
    Then  AEE Password strength seviyesinin degisikligi test edilir
    And   AEE Kullanici sayfayi kapatir

    Examples:
      |username           |password       |onemsiz|
      |healthprojectteam54|AiGAYmJSJp.EN98|.......|
      |PhysicianTeam54    |PhysicianTeam54|abcdefg|
      |UserTeam54         |UserTeam54     |.......|
      |PatientTeam54      |PatientTeam54  |1234567|
      |StaffTeam54        |StaffTeam54    |.......|


  @US_08_TC_04
  Scenario Outline: TC_04 Şifre en az 1 rakam içermeli ve "Password strength:" seviyesinin değiştiği görülebilmelidir.
    Given AEE Kullanici medunna.com adresine gider
    Then  AEE Kullanici Profil butonuna tiklar
    Then  AEE Kullanici Sign in butonuna tiklar
    And   AEE Kullanici "<username>" username ve "<password>" sifresini girer
    Then  AEE Kullanici Hesap butonuna tiklar
    Then  AEE Kullanici Password butonuna tiklar
    And   AEE Kullanici New password kismina "<onemsiz>" yazar
    And   AEE Kullanici New password kisminin devamina bir rakam yazar
    Then  AEE Password strength seviyesinin degisikligi test edilir
    And   AEE Kullanici sayfayi kapatir

    Examples:
      |username           |password       |onemsiz|
      |healthprojectteam54|AiGAYmJSJp.EN98|.......|
      |PhysicianTeam54    |PhysicianTeam54|abcdefg|
      |UserTeam54         |UserTeam54     |.......|
      |PatientTeam54      |PatientTeam54  |ABCDEFG|
      |StaffTeam54        |StaffTeam54    |.......|


  @US_08_TC_05
  Scenario Outline: TC_05 Şifre en az 1 ozel karakter içermeli ve "Password strength:" seviyesinin değiştiği görülebilmelidir.
    Given AEE Kullanici medunna.com adresine gider
    Then  AEE Kullanici Profil butonuna tiklar
    Then  AEE Kullanici Sign in butonuna tiklar
    And   AEE Kullanici "<username>" username ve "<password>" sifresini girer
    Then  AEE Kullanici Hesap butonuna tiklar
    Then  AEE Kullanici Password butonuna tiklar
    And   AEE Kullanici New password kismina "<onemsiz>" yazar
    And   AEE Kullanici New password kisminin devamina bir ozel karakter yazar
    Then  AEE Password strength seviyesinin degisikligi test edilir
    And   AEE Kullanici sayfayi kapatir

    Examples:
      |username           |password       |onemsiz|
      |healthprojectteam54|AiGAYmJSJp.EN98|abcdefg|
      |PhysicianTeam54    |PhysicianTeam54|1234567|
      |UserTeam54         |UserTeam54     |abcdefg|
      |PatientTeam54      |PatientTeam54  |ABCDEFG|
      |StaffTeam54        |StaffTeam54    |ABCDEFG|


  @US_08_TC_06
  Scenario Outline: TC_06 Şifre en az 1 ozel karakter içermeli ve "Password strength:" seviyesinin değiştiği görülebilmelidir.
    Given AEE Kullanici medunna.com adresine gider
    Then  AEE Kullanici Profil butonuna tiklar
    Then  AEE Kullanici Sign in butonuna tiklar
    And   AEE Kullanici "<username>" username ve "<password>" sifresini girer
    Then  AEE Kullanici Hesap butonuna tiklar
    Then  AEE Kullanici Password butonuna tiklar
    And   AEE Kullanici New password kismina "<onemsiz>" yazar
    Then  AEE Password strength seviyesi ilk kutuda oldugu test edilir
    And   AEE Kullanici New password kisminin devamina bir buyuk harf yazar
    Then  AEE Password strength seviyesin guclu oldugu test edilir
    And   AEE Kullanici sayfayi kapatir

    Examples:
      |username           |password       |onemsiz|
      |healthprojectteam54|AiGAYmJSJp.EN98|aCVe3.|
      |PhysicianTeam54    |PhysicianTeam54|?M3a67|
      |UserTeam54         |UserTeam54     |aK56e.|
      |PatientTeam54      |PatientTeam54  |4c/3F6|
      |StaffTeam54        |StaffTeam54    |BCDe7.|


  @US_08_TC_07
  Scenario Outline: TC_07 Eski şifre kullanılmamalıdır.
    Given AEE Kullanici medunna.com adresine gider
    Then  AEE Kullanici Profil butonuna tiklar
    Then  AEE Kullanici Sign in butonuna tiklar
    And   AEE Kullanici "<username>" username ve "<password>" sifresini girer
    Then  AEE Kullanici Hesap butonuna tiklar
    Then  AEE Kullanici Password butonuna tiklar
    And   AEE Kullanici Current password kismina "<password>" eski sifreyi girer
    And   AEE Kullanici New password kismina "<password>" eski sifreyi girer
    And   AEE Kullanici New password confirmation kismina "<password>" eski sifreyi girer
    And   AEE Kullanici Save butonuna tiklar
    And   AEE Kullanici Password Changed yazisini gorur
    And   AEE Kullanici sayfayi kapatir


    Examples:
      |username           |password       |
      |healthprojectteam54|AiGAYmJSJp.EN98|
      |PhysicianTeam54    |PhysicianTeam54|
      |UserTeam54         |UserTeam54     |
      |PatientTeam54      |PatientTeam54  |
      |StaffTeam54        |StaffTeam54    |