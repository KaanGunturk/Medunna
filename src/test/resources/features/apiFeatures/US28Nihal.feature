Feature: Admin olarak; Country oluşturma / Okuma ve Silme

  Scenario: US28_TC003 Kullanici Api ile Country dogrulayin

    Given Nhl Admin Country icin GET request yapar

    And   Nhl Admin gelen datayi deserialize eder

    Then  Nhl Admin Country dogrular


   Scenario: US28_TC004 Kullanıcı, API kullanarak mevcut ülkeleri güncelleyebilmelir.

    # Given Nhl Admin mevcut ulkeler icin Get request yapar

     And Nhl Admin mevcut ulkeyi gunceller

     Then Nhl Admin guncellenen ulkeyi dogrular
