
Feature: Verifying the functionality of the Web Sites
Background: Setting up the driver
	Given I set up the driver and open chrome
  #@Hris
  Scenario: Verifying the Hris
  	Given I launch the hris
  	When I  enter credentials to login   	
  	| harishahi   |     Hari@101$#    |