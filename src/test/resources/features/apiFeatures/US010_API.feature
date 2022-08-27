Feature: US_010 Doktor Randevulari API Test
  @US10
  Scenario: US_10_TC003  Doktor API test ile hasta randevularini dogrular

   Given Doktor Nihal hasta randevulari icin GetRequest yapar

    And Doktor Nihal gelen datayi deserialize eder

    Then Doktor Nihal hasta randevulari test eder

