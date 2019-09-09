
Feature: Verifying the functionality of the web sites  

Background: Setting up the driver
	Given I set up the driver and open chrome

   #@Gmail
  Scenario Outline: Verifying the Gmail 
    Given I launch the gmail
    When I  enter the <username> and <password>
    And I click on the login button
    Then I validate gmail inbox page for <username>
		When I check the number of mail in the inbox 
    Then I click on the first mail
    
		Examples: 
      | username 					| password 							| 
      | testuser275275    |     TESTuser275275    |
      | 275275testuser   |     TESTuser275275   | 
    
  