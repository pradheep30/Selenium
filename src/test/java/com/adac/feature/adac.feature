Feature: Adactin Hotel Application

@smoketest
Scenario Outline: Login Functionality
Given user Launch The Adactin Application
When user Enter The "<username>" username In The InputBox
And user Enter The "<password>" Password In The InputBox
Then User Clicks On The LoginPage And It Navigates In To Search Page

Examples:
|username|password|
|pradheep30|123456|
|pradh21546|1234561144|
|pradh21nbbb546|1234ffnnf561144|
|pragg3g4dh21546|123456rr1144|



