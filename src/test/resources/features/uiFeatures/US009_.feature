Feature:US_009_Staff (Personel),hasta bilgilerini görebilmeli, düzenleyebilmeli ve silebilmelidir.


  Scenario:US009_TC001 My Pages sekmesinden hasta bilgilerini görebilmelidir.

    Given Kullanici "baseUrl" anasayfasinda
    Then  Kullanıcı profil isaretine tıklar
    Then  Kullanici giris yapmak icin Sign in sekmesine tiklar
    Then  Kullanici Staff olarak username "userNameStaff" ve sifresini "sifreStaff" girer
    Then  Kullanici ikinci Sign in butonuna tiklar
    Then  Kullanici my pages butonuna tiklar
    Then  Kullanici Search Patient butonuna tiklar
    Then  Patients tablosunun ve hasta bilgilerinin gorunur oldugunu test eder

  Scenario: TC02_Staff bütün hasta bilgilerini düzenleyebilmelidir.
    Given Kullanici "baseUrl" anasayfasinda
    Then  Kullanıcı profil isaretine tıklar
    Then  Kullanici giris yapmak icin Sign in sekmesine tiklar
    Then  Kullanici Staff olarak username "userNameStaff" ve sifresini "sifreStaff" girer
    Then  Kullanici ikinci Sign in butonuna tiklar
    Then  Kullanici my pages butonuna tiklar
    Then  Kullanici Search Patient butonuna tiklar
    Then  Tabloda bilgilerini düzenlenmek istedigi hastanın yanındaki edit butonuna tıklar
    Then  Hasta bilgilerinin düzenlenebilir oldugunu test eder


  Scenario: TC03_Staff, SSN'lerine göre yeni bir başvuru sahibi arayabilmeli ve tüm kayıt bilgilerinin doldurulduğunu görebilmelidir.
    Given Kullanici "baseUrl" anasayfasinda
    Then  Kullanıcı profil isaretine tıklar
    Then  Kullanici giris yapmak icin Sign in sekmesine tiklar
    Then  Kullanici Staff olarak username "userNameStaff" ve sifresini "sifreStaff" girer
    Then  Kullanici ikinci Sign in butonuna tiklar
    Then  Kullanici my pages butonuna tiklar
    Then  Kullanici Search Patient butonuna tiklar
    And   Kullanici Patient SSN kısmına hastanın SSN bilgisini girer
    Then  Kullanici Ilgili hastanın yanındaki view butonuna tıklar
    And   Kullanici kayit bilgilerinin gorunur oldugunu test eder

  @yasir
  Scenario: TC04_Staff herhangi bir hasta bilgisini silebilir.
    Given Kullanici "baseUrl" anasayfasinda
    Then  Kullanıcı profil isaretine tıklar
    Then  Kullanici giris yapmak icin Sign in sekmesine tiklar
    Then  Kullanici Staff olarak username "userNameStaff" ve sifresini "sifreStaff" girer
    Then  Kullanici ikinci Sign in butonuna tiklar
    Then  Kullanici my pages butonuna tiklar
    Then  Kullanici Search Patient butonuna tiklar
    Then  Kullanici Tabloda bilgilerini düzenlenmek istedigi hastanın yanındaki edit butonuna tıklar
    And   Kullanici 1 saniye bekler
    And   Kullanici kayit bilgilerini siler ve Save butonuna tıklar
    And   Kullanici bilgilerin silinip silinmedigini test eder





















