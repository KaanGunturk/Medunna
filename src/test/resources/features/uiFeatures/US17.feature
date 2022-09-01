Feature: US_17 Test items(öğe) Oluştur / Güncelle / Sil

 Scenario: US17_TC_001 Admin yeni test öğeleri oluşturabilir

    Given Nhl Admin Medunna adresine gider

     And Nhl Admin profil butonuna tiklar

     Then Nhl Admin giris yapmak icin sign in butonuna basar

     And Nhl Admin username ile sifresini girer

     Then Nhl Admin sign in butonuna basar

     And Nhl Admin Item-Titles butonuna tiklar

     And Nhl Admin Test Item butonuna tiklar

     Then Nhl Admin acilan sayfada Create a new Test Item butonuna tiklar

     And  Nhl Admin "test items; Name, Description, price Default min value Default max value ve created date bilgilerini girer

     Then Nhl Admin Save butonuna tiklar

     And Nhl Admin sayfayi kapatir


 Scenario: US17_TC_002 Admin, "test items; Name, Description, price Default min value, Default max value ve
                         created date (Gün/Ay/Yıl) oluşturabilir ve güncelleyebilir.

    Given Nhl Admin Medunna adresine gider

     And Nhl Admin profil butonuna tiklar

     Then Nhl Admin giris yapmak icin sign in butonuna basar

     And Nhl Admin username ile sifresini girer

     Then Nhl Admin sign in butonuna basar

     And Nhl Admin Item-Titles butonuna tiklar

     Then Nhl Admin Test Item butonuna tiklar

     And Nhl Admin acilan sayfada Edit butonuna tiklar

     Then Nhl Admin  test items bilgilerini gunceller

     And Nhl Admin kaydet butonuna basar

     Then Nhl Admin sayfayi kapatir


 Scenario: US17_TC_003 Admin test öğelerini görüntüleyebilir

     Given Nhl Admin Medunna adresine gider

     And Nhl Admin profil butonuna tiklar

     Then Nhl Admin giris yapmak icin sign in butonuna basar

     And Nhl Admin username ile sifresini girer

     Then Nhl Admin sign in butonuna basar

     And Nhl Admin Item-Titles butonuna tiklar

     And Nhl Admin Test Item butonuna tiklar

     Then Nhl Admin view butonuna tiklar

     And Nhl Admin istedigi test ögelerini görüntüler

     Then Nhl Admin sayfayi kapatir


 Scenario: US17_TC_004 Admin test öğelerini silebilir.

   Given Nhl Admin Medunna adresine gider

   And Nhl Admin profil butonuna tiklar

   Then Nhl Admin giris yapmak icin sign in butonuna basar

   And Nhl Admin username ile sifresini girer

   Then Nhl Admin sign in butonuna basar

   And Nhl Admin Item-Titles butonuna tiklar

   And Nhl Admin Test Item butonuna tiklar

   Then Nhl Admin Delete butonuna tiklar

   And Nhl Admin cikan ekranda tekrar Delete butonuna tiklar

   Then Nhl Admin sayfayi kapatir



