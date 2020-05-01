@RunMe
Feature: Using Tags 
#This is how background can be used to eliminate duplicate steps 

Scenario: Not Tagged
   Given user navigates to Facebook
   When I enter Username as "broham" and Password as "lickity-split"
   Then the user should be redirected to login retry
 
@SmokeTest  
Scenario: Tagged as Smoke Test
   Given a method is called
   #When I enter Username as "broham" and Password as "lickity-split"
   #Then the user should be redirected to login retry
   
@RegressionTest  
 Scenario: Tagged as Regression Test
   Given a method is called
   #When I enter Username as "broham" and Password as "lickity-split"
   #Then the user should be redirected to login retry
   
@SmokeTest @RegressionTest   
Scenario: Tagged as Smoke and Regression Test
   Given a method is called
   #When I enter Username as "broham" and Password as "lickity-split"
   #Then the user should be redirected to login retry        