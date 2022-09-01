Feature: US_05 Hasta Randevulari API Test
  @US05API
  Scenario: TC_004  Kullanici API test ile hasta randevularini dogrular

    Given kullanici hasta randevulari icin GetRequest yapar
    And kullanici gelen datayi deserialize eder
    Then kullanici hasta randevulari test eder
