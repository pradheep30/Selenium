Feature: Automation Practice Application

Scenario: Login Functionality
Given user Launch The Automation Practice Application
When user Clicks The Login Button
Then it Navigates InTo Authetication Page

Scenario: Authentication Functionality
When user Enters The Email Id In The InputBox
And user Clicks The Create Login Button
Then it Then it Navigates InTo Create Account Page

Scenario: Create An Account Functionality
When user Clicks The Gender In The Radio Button
And user Enters The FirstName In The InputBox
And user Enters The LastName In The InputBox
And user Enters The Password In The InputBox
And user Selects The Day In The DropDown Box
And user Selects The Month In The DropDown Box
And user Selects The Year In The DropDown Box
And user Clicks The News Button
And user Clicks The Options Button
And user Enters The FirstName In The InputBox
And user Enters The LastName In The InputBox
And user Enters The Company Name In The InputBox
And user Enters The Address1 In The InputBox
And user Enters The Addr2 In The InputBox
And user Enters The City In The InputBox
And user Enters The State In The InputBox
And user Enters The Postal Code In The InputBox
And user Enters The Phone Number In The InputBox
And user Enters The Mobile Number In The InputBox
And user Enters The Alias In The InputBox
And user Clicks The Submit Btn
Then It Navigates InTo LogOut Page

Scenario: LogOut Functionality 
When user Clicks The LogOut Btn
And Then It Navigates InTo LogIn Page

Scenario: Account Re-LogIn Functionality 
When user Enters The User In The InputBox
And user Enters The Pwd In The InputBox
And user Clicks The Log Btn
Then It Navigates InTo Menu Page

Scenario: Add To Cart Functionality 
When user Clicks The TShirt button
And user Clicks The Image Button
And user Double Clicks The Pass Btn
And user Clicks The Group Button
And user Clicks The Colour Button
And user Clicks The Exclusive Button
Then it Navigates InTo The CheckOut Page
















































