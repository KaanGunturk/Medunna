Feature: US_017 Test Items Api Test
@US1717
  Scenario: US_17 TC_005 Api Testi ile Test items(öğe) dogrulayin

    Given Nhl Admin Test Items  icin GET request yapar

      And Nhl Admin gelen Test Items  datayi deserialize eder

     Then Nhl Admin Test Items i dogrular


  Scenario: US_17 TC_006 API ile test items oluşturun.

    Given Nhl Admin ExpectedData olusturur ve POST request yapar

    Then Nlh Admin olusturdugu datayi GetRequest yapar

    And Nhl Admin ExpectedData ile ActualData ara   sinda dogrulama yapar