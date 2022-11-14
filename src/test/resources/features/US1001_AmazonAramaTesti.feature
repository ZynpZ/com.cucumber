Feature: US1001 Amazon arama testi

  Scenario: TC01 Kullanıcı Amazon'da arama yapabilmeli

    Given Kullanıcı amazon anasayfaya gider
    When Arama çubuğuna nutella yazıp aratır
    Then Arama sonuçlarının Nutella içerdiğini test eder
    And Sayfayı kapatır