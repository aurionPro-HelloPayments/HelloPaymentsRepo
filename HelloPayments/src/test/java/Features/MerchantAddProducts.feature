Feature: Merchant Portal Login

@RegressionTest
  Scenario: Verify successful Add Product to Merchant Portal
    Given User open Browser and launched the Admin portal Url
    When User enters "<UserName>" in UserName field
    And User enters "<Password>" in Password field
    And User clicks on Login button
    Then Admin Portal Home page should be displayed
    And User clicks on AddProduct button
    And User enters "<ProductName>" in ProductName field
    And User enters "<UnitPrice>" in UnitPrice field
    And User enters "<Description>" in Description field
    And User clicks on Save button
    Then User close the brower
    
    
    
   Examples: 
    | UserName           | Password | ProductName |UnitPrice |Description |
    | ABMerchant | ABmerchant03 | Gold | 10.00 | This is a 1st product added by automation |
    | ABMerchant | ABmerchant03 | Silver | 20.00 | This is a 2nd  product added by automation |

    

  
    