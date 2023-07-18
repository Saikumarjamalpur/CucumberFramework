Feature: My Project Document
  @amazon @uid
  Scenario: Amazon userid test scenario
    Given browser "chrome" is open url is "http://www.amazon.in"
    And click on signin
    When enter valid userid "paragguide@yahoo.co.in"
    And click continue button
    Then password textbox must come
   @amazon @pwd 
   Scenario: Amazon password test scenario
  	Given userid is correct
  	When i enter valid password "RMinfotech"
  	Then i should login
    @google  
    Scenario Outline: 
    	Given I went to <url>
    	When I search the <keyword>
    	Then result must come

    Examples: 
    	| url  | keyword | 
    	| http://www.google.com | pizza | 
    	| http://www.google.com | burger |
  