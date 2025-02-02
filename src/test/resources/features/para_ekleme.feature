Feature: Para ekleme

  @ParaEkleme
  Scenario: Hesaba Para Eklenmesi
    When Add Money butonuna tıklanır
    And Card Number inputu girilir
    And Card Holder inputu girilir
    And Expiry Date inputu girilir
    And CVV inputu girilir
    And Amount inputuna tutar girilir
    Then Add butonuna tıklanır