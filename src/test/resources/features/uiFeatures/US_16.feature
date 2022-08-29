Feature: US016 Oda Oluşturma / Görüntüleme / Güncelleme /Silme (Admin)
@US16TC01
Scenario: US016_TC001_Admin yatan hastalar için yeni oda oluşturabilmeli
Given Admin www.medunna.com adresine gitmelidir
Then Admin profil butonuna tiklar
And Admin giris yapmak icin Sign In butonuna tiklar
And Admin username ve sifreyi girer
And Admin Sing In butonuna tiklar
And Admin Item-Titles butonuna tiklar
And Admin acilan sayfada room butonuna tiklar
And Admin açılan sayfada create a new room butonunun görünürlüğünü test eder
And Admin create a new room butonuna tıklar
And AdminRoom Number, Room Type, Price, Status' e tik koyar, Description ve Created Date bilgilerini girip kaydet butonunu tiklar
And Admin basarili sekilde kaydetilip kaydettilmedigini kontrol eder

  @US16TC02

  Scenario: US016_TC002_Oda oluşturulurken "Room Number" mutlaka olmalı, "Room Type"; TWIN, DELUXE, PREMIUM_DELUXE, SUIT ve DAYCARE olmalı
    Given Admin www.medunna.com adresine gitmelidir
    Then Admin profil butonuna tiklar
    And Admin giris yapmak icin Sign In butonuna tiklar
    And Admin username ve sifreyi girer
    And Admin Sing In butonuna tiklar
    And Admin Item-Titles butonuna tiklar
    And Admin acilan sayfada room butonuna tiklar
    And Admin create a new room butonuna tıklar
    And Admin "Room Number" seceneğinin görünürlüğünü test eder
    And Admin "room number" bir oda numarası girer ve enique olmalıdır
    And Admin "Room Type" seçeneğini tıklar
    And Admin TWIN, DELUXE, PREMIUM_DELUXE, SUIT ve DAYCARE seçeneklerinin görünürlüğünü test eder
    And Admin TWIN, DELUXE, PREMIUM_DELUXE, SUIT ve DAYCARE seçeneklerini listeler
    And Admin çıkan seçenekelrden herhangi birini seçer

  @US16TC03
  Scenario: US016_TC003_Oda için "Status" ayarlanabilir olmalı.
    Given Admin www.medunna.com adresine gitmelidir
    Then Admin profil butonuna tiklar
    And Admin giris yapmak icin Sign In butonuna tiklar
    And Admin username ve sifreyi girer
    And Admin Sing In butonuna tiklar
    And Admin Item-Titles butonuna tiklar
    And Admin acilan sayfada room butonuna tiklar
    And Admin create a new room butonuna tıklar
    And Admin Status butonuna tiklar ve Status'u full olarak belirler
    And Kullanici Status butonunu bos birakir ve Status'u available olarak belirler

  @US16TC04
  Scenario: US016_TC004_Fiyat eklenebilir olmalı ve boş bırakılamamalı.
    Given Admin www.medunna.com adresine gitmelidir
    Then Admin profil butonuna tiklar
    And Admin giris yapmak icin Sign In butonuna tiklar
    And Admin username ve sifreyi girer
    And Admin Sing In butonuna tiklar
    And Admin Item-Titles butonuna tiklar
    And Admin acilan sayfada room butonuna tiklar
    And Admin create a new room butonuna tıklar
    And Admin price kısmına gecerli bir fiyat eklendiğini test eder
    And Admin Price kutusunu bos birakir ve Save bastiktan sonra "This field is required." uyari yazisini gorur


  @US16TC05
  Scenario: US016_TC005_"Description" isteğe bağlı olarak doldurulmalı.
    Given Admin www.medunna.com adresine gitmelidir
    Then Admin profil butonuna tiklar
    And Admin giris yapmak icin Sign In butonuna tiklar
    And Admin username ve sifreyi girer
    And Admin Sing In butonuna tiklar
    And Admin Item-Titles butonuna tiklar
    And Admin acilan sayfada room butonuna tiklar
    And Admin create a new room butonuna tıklar
    And Admin "Description" kutusunu bos birakir ve Save butonuna tiklar
    And Admin "A new Room is created with identifier"mesajinin görünürlüğünü test eder
    And Admin "Description" kutusunu doldurur ve Save butonuna tiklar
    And Admin "A new Room is created with identifier"mesajinin görünürlüğünü test eder


  @US16TC06
  Scenario: US016_TC006_Created Date"" Gün/Ay/Yıl şeklinde olmalı ve geçmiş tarih seçilememeli.
    Given Admin www.medunna.com adresine gitmelidir
    Then Admin profil butonuna tiklar
    And Admin giris yapmak icin Sign In butonuna tiklar
    And Admin username ve sifreyi girer
    And Admin Sing In butonuna tiklar
    And Admin Item-Titles butonuna tiklar
    And Admin acilan sayfada room butonuna tiklar
    And Admin create a new room butonuna tıklar
    And Admin "created date" kısmına güncel tarih girer ve save tuşuna basar
    And Admin "A new Room is created with identifier"mesajinin görünürlüğünü test eder
    And Admin "created date" kısmına geçmiş tarih girer ve save tuşuna basar
    And Admin "A new Room is created with identifier"mesajinin görünürlüğünü test eder

  @US16TC07
  Scenario: US016_TC007_Admin aynı tür odaları görebilir.
    Given Admin www.medunna.com adresine gitmelidir
    Then Admin profil butonuna tiklar
    And Admin giris yapmak icin Sign In butonuna tiklar
    And Admin username ve sifreyi girer
    And Admin Sing In butonuna tiklar
    And Admin Item-Titles butonuna tiklar
    And Admin acilan sayfada room butonuna tiklar
    And Admin "Room Type" kismina tiklar ve gorunen sayfalarin "TWIN" ve "DAYCARE" oldugunu goruntuler

  @US16TC08
  Scenario: US016_TC008_Admin mevcut odaları düzenleyebilir ve güncelleyebilir.
    Given Admin www.medunna.com adresine gitmelidir
    Then Admin profil butonuna tiklar
    And Admin giris yapmak icin Sign In butonuna tiklar
    And Admin username ve sifreyi girer
    And Admin Sing In butonuna tiklar
    And Admin Item-Titles butonuna tiklar
    And Admin acilan sayfada room butonuna tiklar
    And Admin açılan sayfada kayıtlı odalardan birinin "EDİT" butonuna tıklar
    And Admin açılan sayfada oda türünü düzenleyip save tuşuna basar
    And Admin "a new room is created with identifier" yazısının görünürlüğünü test eder

  @US16TC09
  Scenario: US016_TC009_Odalar Admin tarafından silinebilir.
    Given Admin www.medunna.com adresine gitmelidir
    Then Admin profil butonuna tiklar
    And Admin giris yapmak icin Sign In butonuna tiklar
    And Admin username ve sifreyi girer
    And Admin Sing In butonuna tiklar
    And Admin Item-Titles butonuna tiklar
    And Admin acilan sayfada room butonuna tiklar
    And Admin Delete tusuna basar
    And Admin Confirm Delete Operation uyarisini gorur
    And Admin Delete butonuna tiklar
    And Admin "A Room is deleted..."yazan uyarının görünürlüğünü test eder











