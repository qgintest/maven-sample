Feature: Scenario Outline Example 


Scenario Outline: Login functionality for a social networking site for
   Given user navigates to Facebook
   When I enter Username as "<username>" and Password as "<password>"
   Then login should be unsuccessful
   
   
 	Examples:
	| username    | password | 
	| email       | password | 
	| phonenumber | password | 
   
#Scenario: Test username and password
#   Given user navigates to Facebook
#   When I enter correct username and password
#   Then login should be successful

#Scenario: test email and password
#   Given user navigates to Facebook
#   When I enter correct email address and password
#   Then login should be successful

#Scenario: test phone number and password
#   Given user navigates to Facebook
#   When I enter correct phone number and password
#   Then login should be successful   