Feature: Adactin Hotel Application
Scenario: Login Functionality
Given user Launch The Adactin Application
When user Enters The Username In The InputBox
And user Enters The Password In The InputBox
Then user Click The LoginBtn And It Navigates InTo Search Page

Scenario: Search Functionality
When user Selects The Location From The DropDown
And user Selects The Hotel From The DropDown
And user user Selects The RoomType From The DropDown
And user Selects The NumberOfRooms From The DropDown
And user Selects The Location From The DropDown
And user Enters The CheckInDate In The InputBox
And user Enters The CheckOutDate In The InputBox
And user Selects The AdultsPerRoom From The DropDown
And user Selects The childrensPerRoom From The DropDown
Then user Clicks SubmitBtn And It Navigates InTo Select         

Scenario: Select Functionality
When user Clicks The RadioBtn
Then user Clicks The ContinueBtn And It Navigates InTo Booking Page

Scenario: Booking Functionality
When user Enters The Firstname In The InputBox
And user Enters The Lastname In The InputBox
And user Enters The Billing Address In The InputBox
And user Enters The Credit CardNo In The InputBox
And user user Selects The Credit CardType From The DropDown
And user user Selects The Expiry Month From The DropDown
And user user Selects The Expiry Year From The DropDown
And user Enters The CvvNo In The InputBox
Then user Clicks The BookNow Btn And It Navigates InTo Booking Confirmation Page

Scenario: Booking Confirmation Functionality
When user Clicks The ItineraryBtn And It Navigates InTo Booked Itinerary Page

Scenario: Booking Itinerary Functionality
When user Clicks The LogoutBtn And It Navigates InTo Logout Page


























