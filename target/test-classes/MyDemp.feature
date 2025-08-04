
Feature: demo
 

@tc
  Scenario: Rediffmail account
  Given user do intial setup
  When I click on "GET AHEAD" label
    
@TC01
 Scenario: orangehrm Application
 Given user do intial setup
 When user fills infromation in the following fields
 |Admin|admin123|
 And I click on "LOGIN" button
 When I navigate to "menu__Performance->performance_ManageReviews->performance_myPerformanceReview"
 
 @TC02
 Scenario: MakeMyTrip Application
 Given user do intial setup
 
  


