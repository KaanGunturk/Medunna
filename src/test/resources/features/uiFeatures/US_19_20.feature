Feature: US_19 Admin Olarak; Yeni Staff (Personel) Oluşturma,Güncelleme,Silme
  US_20 Admin; "User management" menüsünden,
  kullanıcı Active eder ve gerekli rolleri oluşturur.

  @US_19_TC_01
  Scenario:Admin Olarak; Yeni Staff (Personel) Oluşturma
    When ht Kullanıcı https://medunna.com adresine gidilir
    And ht Kullanıcı profil isaretine tıklanır.
    And ht Sign in butonuna tıklanır.
    And ht Username girer
    And ht Password girer
    And ht Sign in butonuna tıklar
    And ht Tems&titles tıkalr
    And ht Staff i secer
    And ht tum ssn numaralarını alir.
    And ht Create a new staff e tıklar
    And ht Ssn numarası girer
    And ht Use search tıklar
    And ht Search user e tıklar
    And ht First Name, Last name,Birth Date,Phone,Gender,Blood Group,Address,Description,Created Date,User,Country,State/City kısımlarını doldurur."
    And ht Save butonuna tıklar.

    @US_19_TC_02
    Scenario: Admin Olarak; Yeni Staff (Personel) Güncelleme
      When ht Kullanıcı https://medunna.com adresine gidilir
      And ht Kullanıcı profil isaretine tıklanır.
      And ht Sign in butonuna tıklanır.
      And ht Username girer
      And ht Password girer
      And ht Sign in butonuna tıklar
      And ht Tems&titles tıkalr
      And ht Staff i secer
      And ht view butonundan herhangi birini görüntüler
      And ht Edit butonuna tıklar
      And ht Herhangi bir bilgiyi degistirir
      And ht Save butonuna tıklar.
      And ht Delete butonuna tıklar

      @US_20_TC_01
      Scenario: Admin; "User management" menüsünden,kullanıcı Active eder
        When ht Kullanıcı https://medunna.com adresine gidilir
        And ht Kullanıcı profil isaretine tıklanır.
        And ht Sign in butonuna tıklanır.
        And ht Username girer
        And ht Password girer
        And ht Sign in butonuna tıklar
        And ht Administration a tıklar
        And ht Usere managment secer
        And ht Kayıtlı kişilerin görünürlüğünü kontrol eder

        @US_20_TC_02
        Scenario: Admin; "User management" menüsünden,kullanıcı  gerekli rolleri oluşturur.
          When ht Kullanıcı https://medunna.com adresine gidilir
          And ht Kullanıcı profil isaretine tıklanır.
          And ht Sign in butonuna tıklanır.
          And ht Username girer
          And ht Password girer
          And ht Sign in butonuna tıklar
          And ht Administration a tıklar
          And ht Usere managment secer
          And ht Deavtivated olan kısımı activedet yapabilir
          And ht Edit butonuna tıklar
          And ht Profiles kısmından rol ataması yapar
          And ht Save butonuna tıklar.
          And ht Herhangi bir kişinin delete butonuna tıklar






