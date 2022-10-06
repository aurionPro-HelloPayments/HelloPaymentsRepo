Feature: Merchant Portal Login

@RegressionTest
  Scenario: Verify successful Login to Merchant Portal
    Given User open Browser and launched the Admin portal Url
    When User enters "<UserName>" in UserName field
    And User enters "<Password>" in Password field
    And User clicks on Login button
    Then Admin Portal Home page should be displayed
    Then User close the brower
    
    
   Examples: 
    | UserName           | Password |
    | globalmerchantnew | globalmerchantnew02 | 


@InvalidMerchantLogin
  Scenario: Verify Invalid Login to Merchant Portal
    Given User open Browser and launched the Admin portal Url
    When User enters "<UserName>" in UserName field
    And User enters "<Password>" in Password field
    And User clicks on Login button
    Then Admin Portal Home page should NOT be displayed
    Then User close the brower 
    
       Examples: 
    | UserName           | Password |
    | globalmerchantnews | globalmerchantnew02 | 
    

  
    