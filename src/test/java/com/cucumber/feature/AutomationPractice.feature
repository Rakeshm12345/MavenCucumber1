Feature: AutomationPractice End To End Test Case

Scenario: Verify The Customer or User is able to LogIn the Application

Given User Launch the AutomationPractice application
When User Click on Signin Button in the Header
And User Enter email id in signin Page
And User Enter Password in signin Page
And User Click signin button in signin page
Then User Verify the username displayed in the header

Scenario: Verify the Product able to select based on the navigation bar

Given User logged in to Menu Page and view the Product
When User Select the Product selection
And User able to select the quantity,size,color Preference
And User able to select the quantity Preference
And user able to add the product to cart 
Then Product added to the cart

Scenario:  Verify the user selected product on the checkout screen

Given User is on the Add to cart screen
When User added the product to card
And User able to click the proceed to check out button
And User able to continue Shopping
Then user is on the Your shopping cart screen

Scenario: Verify the user details on the shopping cart

When User clicked on Proceed to check out button
And User checks all the selected details
And User checks the Delevery address
And User checks the invoice addresss 
Then user able to Proceed to check out

Scenario: Verify the user able to Sign out

When user logged in to site
And User able to click the signout button
Then user need to be at sign out screen


Scenario: Verify the user able to Sign out

When user logged in to site
And User able to click the signout button
Then user need to be at sign out screen