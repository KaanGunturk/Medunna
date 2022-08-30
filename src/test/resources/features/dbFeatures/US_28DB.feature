Feature: US_28

  Scenario: US028_TC05-Kullanıcı bunları DB ile doğrulamalıdır
    Given Kullanici  database baglanir
    And Kullanici database query gonderir
    Then Kullanici expected data ile actual datayi karsilastirir