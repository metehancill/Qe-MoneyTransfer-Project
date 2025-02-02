Feature: Para Transfer

  @ParaTransfer
  Scenario: Bir başka hesaba para transferi gerçekleştirilmesi
    When Transfer Money butonuna tıklanır
    And Recivier account seçilir
    And Transfer amountu girilir
    Then Send butonuna tıklanır