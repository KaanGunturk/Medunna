Feature:US15 Admin tarafından hasta oluşturma ve düzenleme

  Scenario:US15_TC01 Yeni hastalar yalnızca yönetici tarafından olusturulabilmeli

    Given YY Kullanici "medunna" anasayfaya gider
    And YY Kullanici Sag ust kosede bulunan icona tiklar
    And YY Kullanici Sign-in butonuna tiklar
    And YY Kullanici Admin Username girer
    And YY Kullanici Admin Password girer
    And YY Kullanici ikinci Sign-in butonuna tiklar
    And YY Kullanici Items&Titles bolumune tiklar
    And YY Kullanici Patient bolumune tiklar
    And YY Kullanici acilan Patient sayfasindan Create or edit a Patient kutusuna tiklar
    And YY Kullanici hasta kaydi olusturabilmek icin gerekli olan First Name,Last Name, Birt Date, Email, Phone, Gender, Blood Group, Adress,Description, User, Country, StateCity bolumlere veri girisi yapar
    And YY Kullanici Save butonun tiklar

  Scenario:US15_TC02 Yönetici "SSN, First Name, Last Name,
  Birth Date, Phone, Gender, Blood Group, Address,
  Description, Created Date, User, Country and state / City"
  gibi hasta bilgilerini gorebilir.

    Given YY Kullanici "medunna" anasayfaya gider
    And YY Kullanici Sag ust kosede bulunan icona tiklar
    And YY Kullanici admin olarak oturum acar
    And YY Kullanici Items&Titles bolumune tiklar
    And YY Kullanici Patient bolumune tiklar
    And YY Kullanici Created Date bolumune tiklar
    And YY Kullanici ilk sirada gelen hastanin ID numarasina tiklar
    And YY Kullanici SSN, First Name, Last Name, Birth Date, Phone, Gender, Blood Group,Address,Description, Created Date, User, Country and stateCity bilgilerinin gorunurlugunu test eder

  Scenario:US15_TC03 Hasta oluşturulduğunda veya güncellendiginde
  yukarıdaki ogelere data girisi yapilabilmeli.

    Given YY Kullanici "medunna" anasayfaya gider
    And YY Kullanici Sag ust kosede bulunan icona tiklar
    And YY Kullanici admin olarak oturum acar
    And YY Kullanici Items&Titles bolumune tiklar
    And YY Kullanici Patient bolumune tiklar
    And YY Kullanici Created Date bolumune tiklar
    And YY Kullanici ilk sirada gelen hastanin ID numarasina tiklar
    And YY Kullanici edit butonuna tiklar
    And YY Kullanici Acilan sayfada  SSN, First Name, Last Name, Birth Date, Phone, Gender, Blood Group, Address, Description, Created Date, User, Country and stateCity gibi bilgilerden bazilarinda degisiklik yapar
    And YY Kullanici Save butonuna tiklar
    And YY Kullanici hasta bilgilerinin guncellendigi dogrulanir

  Scenario:US15_TC04 Hastaya doktoru sadece Admin atayabilir.

    Given YY Kullanici "medunna" anasayfaya gider
    And YY Kullanici Sag ust kosede bulunan icona tiklar
    And YY Kullanici admin olarak oturum acar
    And YY Kullanici Items&Titles bolumune tiklar
    And YY Kullanici Appointment bolumune tiklar
    And YY Kullanici Create a new Appointment butonuna tiklar
    And YY Kullanici Start DateTime ve End Date Time bilgileri girer
    And YY Kullanici Status kismi secer
    And YY Kullanici Physician kismindan Doktor bilgisi secer
    And YY Kullanici Patient kismindan Hasta bilgisi secer
    And YY Kullanici islemlerin ardindan Save butonuna tiklar


  Scenario:US15_TC05 "State", "US state" olmalı ve boş bırakılmamalı

    Given YY Kullanici "medunna" anasayfaya gider
    And YY Kullanici Sag ust kosede bulunan icona tiklar
    And YY Kullanici admin olarak oturum acar
    And YY Kullanici Items&Titles bolumune tiklar
    And YY Kullanici StateCity bolumune tiklar ve verileri kaydeder
    And YY StatesCities sayfasinda StateCity bolumunun US oldugu test edilir
    And YY StatesCities sayfasinda StateCity bolumunun bos olmamasi gerektigi test edilir

  Scenario:US15_TC06 Yönetici herhangi bir hastayı silebilir

    Given YY Kullanici "medunna" anasayfaya gider
    And YY Kullanici Sag ust kosede bulunan icona tiklar
    And YY Kullanici admin olarak oturum acar
    And YY Kullanici Items&Titles bolumune tiklar
    And YY Kullanici Patient bolumune tiklar
    And YY Kullanici acilan Patient sayfasindan Create or edit a Patient kutusuna tiklar
    And YY Kullanici hasta kaydi olusturabilmek icin gerekli olan First Name,Last Name, Birt Date, Email, Phone, Gender, Blood Group, Adress,Description, User, Country, StateCity bolumlere veri girisi yapar
    And YY Kullanici Save butonun tiklar
    And YY Kullanici Created Date bolumune tiklar
    And YY Kullanici Ilk sirada gelen hasta ile ayni satirda bulunan Delete butonuna tiklar
