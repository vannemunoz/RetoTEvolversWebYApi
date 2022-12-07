Feature: Search and add products to the shopping cart
  As a user of Advantage online store
  I want to search and add products
  To view them in the shopping cart

  Scenario: Add and search products to shopping cart
    When you select products to add to the shopping cart
    Then the products are displayed in the shopping cart with the total price of the products.
