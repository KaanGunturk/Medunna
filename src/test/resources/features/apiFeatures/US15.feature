Feature: api test patient
#Featuredan calismiyor
  Scenario Outline: api test icin hasta kayit
  Given EA Kullanici "https://www.medunna.com/api/patients" Medunna Api Endpointinden hastalari goruntuler
    And EA Kullanici "https://www.medunna.com/api/patients" Medunna Api Endpointine,"<id>" li hastanin bilgilerinin  "<firstName>", "<lastName>", "<email>", "<phone>", "<address>" oldugunu dogrular
    #  And gereksiz bir step
    Examples:
      |id|  firstName | lastName | email | phone | address |
      | 89893   | tonette.bradtke | Bergnaum | boris.terry@gmail.com | 9405976038 | Ankara/Turkey |