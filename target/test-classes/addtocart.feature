Feature: To add a product to the cart

  Scenario Outline: To Login and search a product and add a product to the cart
    Given To Launch a browser and login in to a product
    When To Search a "<product>" and add the <one>product to the cart
    Then To verify whether the product is added to the cart

    Examples: 
      | product         | one |
      | Samsung mobiles |   2 |
      | Dell Laptops    |   5 |
      | Mens perfumes   |   9 |
      | Projectors      |   7 |
      | Fans            |   6 |
