
Feature: US06 Kullanıcı bilgisi sekmesi (Setting) Ana Sayfada düzenlenebilir olmalıdır.
  US07 Hastalar randevu tarihi oluşturabilmelidir.

@US06
  Scenario: US_06 TC001 Kullanıcı bilgileri "firstname, lastname, email and language" girerken doldurulan kullanıcı bilgileri olmalıdır.
 Given  medunna sayfasında
  Then kullanici  profil simgesine tiklar
  And Kullanici sign in sekmesine tiklar
  And Kullanici valid username ve valid password girisi yapar
  And Kullanici sign in butonuna tiklar
  And Kullanıcı bilgi sekmesine tıklar acılan DDM-den Setting seçeneğine tıklar
  And "Firstname -lastname-email ve language " kutucukları görünür olmalı
  And Kullanıcı "firstname" secenegini güncelleyebilmeli
  And Kullanıcı "lasttname" secenegini güncelleyebilmeli
  And Kullanıcı "email" secenegini güncelleyebilmeli
  And Kullanıcı güncelleme işlemini yaptığında "setting saven " yazısının görünürlügünü kaydeder

  @US0701
    Scenario: US_07 TC001 Kullanici gecerli tarih girmeli (guncel veya gelecekteki tarihleri secebilmeli)
    Given medunna sayfasında
    Then kullanici  profil simgesine tiklar
    And Kullanici sign in sekmesine tiklar
    And Kullanici valid username ve valid password girisi yapar
    And Kullanici sign in butonuna tiklar
    And Kullanici My Pages secenegine tiklar
    And Kullanici acilan dropdownda "Make an Appointment"secenegine tiklar
    And Kullanici "First Name,LastName,SSN,Email,Phone"textbox'larini doldurur
    And Kullanici "Appointment Date Time"kismina guncel tarih girer
    And Kullanici "send an Appointment request " tiklar
    And Kullanici "Appointment registration saved"yazisini gorur

    @US0702
      Scenario: US_07 TC002 Kullanici gecerli tarih girmeli (guncel veya gelecekteki tarihleri secebilmeli)
        Given medunna sayfasında
      Then kullanici  profil simgesine tiklar
      And Kullanici sign in sekmesine tiklar
      And Kullanici valid username ve valid password girisi yapar
      And Kullanici sign in butonuna tiklar
      And Kullanici My Pages secenegine tiklar
      And Kullanici acilan dropdownda "Make an Appointment"secenegine tiklar
      And Kullanici "First Name,LastName,SSN,Email,Phone"textbox'larini doldurur
      And Kullanici "Appointment Date Time"kismina ileri bir tarih girer
      And Kullanici "send an Appointment request " tiklar
      And Kullanici girdiginiz tarih uygun degil uyarisi alir

  @US0703

        Scenario: US_07 TC003 Kullanici gecerli tarih girmeli (guncel veya gelecekteki tarihleri secebilmeli)

        Given medunna sayfasında
        Then kullanici  profil simgesine tiklar
        And Kullanici sign in sekmesine tiklar
        And Kullanici valid username ve valid password girisi yapar
        And Kullanici sign in butonuna tiklar
        And Kullanici My Pages secenegine tiklar
        And Kullanici acilan dropdownda "Make an Appointment"secenegine tiklar
        And Kullanici "First Name,LastName,SSN,Email,Phone"textbox'larini doldurur
        And Kullanici "Appointment Date Time"kismina gecmis bir tarih girer
        And Kullanici "Appointment date can not be past date!" uyari yazisini gorur
        And Kullanici "Send an Appointment Request" butonuna tikladiginda kayit etmemeli veya tiklanamamali

@US0704
          Scenario: US_07 TC004 Tarih sirasi gun/ay/yil (ay/gun/yil) seklinde olmalidir
          Given medunna sayfasında
          Then kullanici  profil simgesine tiklar
          And Kullanici sign in sekmesine tiklar
          And Kullanici valid username ve valid password girisi yapar
          And Kullanici sign in butonuna tiklar
          And Kullanici My Pages secenegine tiklar
          And Kullanici valid username ve valid password girisi yapar
          And Kullanici acilan dropdownda "Make an Appointment"secenegine tiklar
          And Kullanici textbox'lari doldurur, tarih textbox'ini gg/aa/yy formatinda girer
          And Kullanici "send an Appointment request " tiklar
          And Kullanici My Pages secenegine tikla
          And Kullanici acilan dropdownda "My Appointment"secenegine tiklar
          And Kullanici girdigi tarih formatiyla "My Appointment" deki formatin ayni oldugunu dogrular
