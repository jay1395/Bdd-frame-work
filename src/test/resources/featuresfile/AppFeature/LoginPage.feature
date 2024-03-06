Feature: Login page feature
Scenario: Login page title
Given user is on login page
When user gets the title of the page
Then page title should be "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"


Scenario: Login with correct credentials
Given user is on login page
And user clicks on Signinbtn
When user enters username "8320251548"
And user clicks on continuebtn
And user enters password "Amit@0911"

And user clicks on Login button
Then user gets the title of the page
And page title should be "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"