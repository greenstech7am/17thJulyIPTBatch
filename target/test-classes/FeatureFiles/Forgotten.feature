
@Sanity
Feature: Validate the forgotten password functionality
Scenario: Validate the forgotten functionality by giving invalid mobile number
# Given User should launch chrome and open url (due to hooks Before annotation)
When User should click the forgotten password link
And User should enter invalid mobile number
And User should click the search button
Then User should navigate to password reset page
