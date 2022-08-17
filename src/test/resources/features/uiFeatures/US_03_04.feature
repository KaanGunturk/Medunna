@1
Feature: US_003 Registration sayfasında güçlü şifre girilmeli ve "Password strength" seviyeleri görülebilmelidir.
  US_004 Giriş sayfası yalnızca geçerli kimlik bilgileriyle erişilebilir olmalıdır.


  Scenario: TC_001 "Daha güçlü şifre için
  en az 1 küçük harf olmalı ve "Password strength:" seviyesinin değiştiği görülebilmelidir.
  Şifre en az 1 büyük harf içermeli ve "Password strength:" seviyesinin değiştiği görülebilmelidir.
  Şifre en az 1 rakam içermeli ve "Password strength:" seviyesinin değiştiği görülebilmelidir.
  Şifre en az 1 özel karakter içermeli ve"Password strength:" seviyesinin değiştiği görülebilmelidir.
  Güçlü bir parola için şifre en az 7 karakterden oluşmalıdır."


    Given YS Kullanici medunna.com adresine gider

    And YS Kullanici Profil butonuna tiklar

    And YS Kullanici Register butonuna tiklar

    Then YS Kullanici New password kutusuna en az bir kucuk harfli sifre girer

    And YS Password strength seviyesinin degistigi test edilir

    Then YS Kullanici New password kutusuna en az bir buyuk harfli sifre girer

    And YS Password strength seviyesinin degistigi test edilir

    Then YS Kullanici New password kutusuna en az bir rakamli sifre girer

    And YS Password strength seviyesinin degistigi test edilir

    Then YS Kullanici New password kutusuna en az bir ozel karakterli sifre girer

    And YS Password strength seviyesinin degistigi test edilir

    Then YS Kullanici New password kutusuna en az yedi karakterli bir sifre girer

    And YS Password strength seviyesinin guclu oldugu test edilir

  @US_004
  Scenario: TC_001 "Giriş yapmak için başarı mesajını doğrulayan, geçerli bir kullanıcı adı ve şifre olmalıdır.
  Kullanıcının mevcut kimlik bilgilerini her zaman kullanabileceği bir beni hatırla seçeneği olmali
  Eğer şifre unutulursa diye ""Did you forget your password?" seçeneği olmalı
  "You don't have an account yet? Register a new account" seçeneği olmalı
  "Cancel"" seçeneği olmalı"

  Given YS Kullanici medunna.com adresine gider

  Then YS Kullanici Profil butonuna tiklar

  And YS Kullanici Sign in butonuna tiklar

  Then YS Remember me kutusunun gorunurlulugu kontrol edilir

  And YS Did you forget your password? butonunun gorunurlulugu test edilir

  And YS 'You don't have an account yet? Register a new account' butonunun gorunurlulugu test edilir

  And YS Cancel butonunun gorunurlulugu test edilir

  Then YS Kullanici Username kutusuna gecerli kullanici adi girer

  And YS Kullanici Password kutusuna gecerli sifre girer

  And YS Kullanici ikinci Sign in butonuna tiklar

  And YS Basarili giris mesajinin gorunurlulugu test edilir

  And kullanici sayfayi kapatir























