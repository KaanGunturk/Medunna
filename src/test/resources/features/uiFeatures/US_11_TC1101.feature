@2
Feature: US_11 "My Appointments" Physician (Doctor) tarafından düzenlenebilmeli

  Scenario: US_11_TC1101


  Given Kullanici medunna sayfasina gider
  Then HIaccount menu’ye tiklar
  Then HIsign in tiklar
  Then HIusername and password girer
  And HIOnay icin Sign in tiklar
  And HIMy Pages tiklar
  And HIMy Appointments tiklar
  And HIEdit tiklar
  And HIid, start and end date, Status, physician and patient gorunur
  And HIAnamnesis, Treatment, and Diagnosis kutucuklarina bilgi girebilir
  Then HIprescription and description kutucuklarini bos gecebilir
  Then HIStatus olarak yalnizca  Pending, Completed, Canceled secilebilir
    Then HISave butonuna tiklar
    Then HIRandevu olusuturuldu mesaji gorunur