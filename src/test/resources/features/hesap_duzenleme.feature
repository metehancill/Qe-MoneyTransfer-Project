Feature: Hesap Duzenleme

  @HesapDuzenleme
  Scenario: Hesap isimi düzenleme
    When Edit Account butonuna tıklanır
    And Account Name input alanına tıklanır
    And Account Name alanı doldurulur
    Then Update butonuna tıklanır

  @HesapDuzenleme
  Scenario: Hesap Adının Sadece numara olarak girilmesi
    When Edit Account butonuna tıklanır
    And Account Name input alanına tıklanır
    And Account Name alanı numara ile doldurulur
    Then Update butonuna tıklanır