Feature: US_19 Admin Olarak; Yeni Staff (Personel) Oluşturma,Güncelleme,Silme

  @US_19_TC_03
  Scenario: Admin Olarak; Yeni Staff (Personel)  Silme
    When ht Kullanıcı https://medunna.com adresine gidilir
    And ht Kullanıcı profil isaretine tıklanır.
    And ht Sign in butonuna tıklanır.
    And ht Username girer
    And ht Password girer
    And ht Sign in butonuna tıklar
    And ht Never i secer
    And ht Tems&titles tıkalr
    And ht Staff i secer
    And ht Delete butonuna tıklar
    And ht Api ile kişinin silindiğini kontrol eder
