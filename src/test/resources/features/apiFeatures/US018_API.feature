@US018
Feature: US018 Admin olarak yeni Physician olustur gunceller goruntule ve sil

  Scenario:TC006 API kullanarak doktorlari dogrulayın
    Given Admin sends the GET request and gets the response with "https://medunna.com/api/physicians/203613" endpoint
    Then verify expected data equals to actual data


