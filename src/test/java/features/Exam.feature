
@BackgroundColor
Feature: Background color change Functionality

Background: 
Given background color change in the provided url page

  @Scenario1  
  Scenario: Sky Blue Background color change
  
    When Set SkyBlue Background button exists
    When I click on the button
   	Then The background color will change to sky blue
    

  
  Scenario: White Background color Change 
  
    When Set SkyWhite Background button exists
    When I click on the button
    Then the background color will change to white
    
