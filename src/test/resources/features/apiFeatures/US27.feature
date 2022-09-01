Feature: US_027 Messages by Admin Validate with API and DB

  Scenario:TC_002 Admin API kullanarak Message olusturur

    Given kullanici post request yapar


  Scenario: TC_003 API testi ile Message dogrular

    Given kullanici message okumak icin get request yapar
    And kullanici gelen message deserialize eder
    And kullanici message dogrular
