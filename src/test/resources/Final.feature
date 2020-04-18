Feature: Smarttech final project
Scenario: User go to the link and add a dress to the cart to verify the total price

Given User url Auomationpractice website
When User click on login Button, enter valid credential & submit login
And User get a home page and on that page verify website title
Then User click on upper dresses button
And User print all price values in sorted order(descending order) on the console
And User need to select the second dress on that list
When User on the next page click on add to cart
And User on the next page, verify there is a total price with shipping, logout & close the window