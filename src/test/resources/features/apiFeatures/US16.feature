@ikisi
Feature:API ile oda oluşturma, okuma, güncellme ve silme doğrulayabilmeli



  @RoomPost
  Scenario:Rooms api with POST request
    Given kullanici roomlar icin post request yapar
    And kullanici olusturdugu datayi okumak icin get request yapar
    Then kullanici post request validation yapar


  @RoomPut
  Scenario:Rooms api with PUT request
    Given kullanici roomlar icin put request yapar
    Then kullanici put request validation yapar
