Feature: Validate the login functionality of my facebook
Background:
# Given User should open the browser and lauch the url -- due to hooks Before annotation

@Smoke
Scenario: Validate with invalid username and invalid password

When User should enter invalid username and invalid Password
#   2D Map -->  Header
		|Fruits|Actor    |Comedy|SciFic    |Movie |Cartoons  |
		|Apple |Apple@123|Orange|Orange@123|Grapes|Grapes@123|
		|Hello |Hello@123|Vinay |Vinay@123 |Ajay  |Ajay@123  |
		|Kumar |Kumar@123|Vinod |Vinod@123 |Suriya|Suriya@123|
		
		
		
And User should get the title of the page
And User should get the current url of the page
And User should click login button
Then Validate user should navigate to incorrect credential page

@Regression @Sanity
Scenario Outline: Validate the valid username and invalid password

When User should enter valid username "<name>" and invalid password "<pass>"
And User should click login button
Then Validate user should navigate to incorrect credential page

Examples:
            |name			 |pass          |
            |greenstech|greenstech@123|
 