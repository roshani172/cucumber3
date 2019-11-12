Feature: Purchase product
Scenario: To purchase a product on Testmeapp
Given user launches chromebrowser and opens Testmeapp
When user clicks on signin
And user enters "lalitha" in username field
And user enters "password123" in password field
And user clicks on Login
And user points to All Categories
And user selects Electronics
And user selects Headphone
Then user searches for headphone
Then user adds headphone to cart
Then user clicks on cart
Then user clicks on  checkout
