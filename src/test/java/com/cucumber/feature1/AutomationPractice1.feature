Feature:    AutomationPractice End To End Test Case

Scenario:  Verify The customer Able to Log in The Application

Given      User launch The AutomationPractice Application 
And        User Enter email id in signin page
And        user Enter password in sign in page
And        user Click signin button in signin page
Then       user Verify the username  Displayed in the Header    

@LoginWithStepData
Scenario:  Verify The user Able to Log in The Application withStepData
Given      User launch The AutomationPractice Application 
When       User Click on the SignIn button in the header

And        User Enter email id 'abcabc@gmail.com'in signin page
And        user Enter password in sign in page
And        user Click signin button in signin page
Then       user Verify the username  Displayed in the Header   

Scenario:   Verify The  User is  Able to Select Product  Based on Menu Navigation

Given      User Log in Application
When       User Click on The menu Navigation in the Header
And        User Click on The Product Selection In The Menu Navigation
And        User Click on The product in The Page  
Then       User Verify The product in The page To given Product


Scenario:   Verify The user is Able to Place Order

Given      User to view the Product
When       User Able to Select The Product   
And        User Able to Click The Product Which  Customer Want
And        User Able to Select The Size,quantity And Color 
And        User Able to Proceed  Checkout 
And        User verify The Delivery Address    
And        User verify The Product which is Customer Selected

Scenario:  Verify The User is Able to Click on Payment 
Given     User to View the Payment page
When      User Able to Select the Payment Mode on The payment page     
And       User Click on the Payment Mode which Customer Want
And       User Click on the confirm Order 
Then      user Verify The Order is Placd or Not


Scenario: Verify The Customer or User Able to Logout The Application


Given User Able to logout The Application
When  User Click on the SignOut Button
Then  user Verify The Signout Session