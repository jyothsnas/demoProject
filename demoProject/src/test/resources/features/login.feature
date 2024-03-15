#Feature:  New customer registration
#
# Scenario Outline: Verify error messages, when user trying to register with invalid details
# Given user clicked on the new customer link
# And user is on the registration page
# And user enters "<firstname>" "<Mobilenumber>" "<email>" "<password>" "<confirm password>"
# When user clicks on submit
# Then user should see "<error message>" displayed
# Examples:
# | firstname | Mobilenumber         | email            | password | confirm password | error message                             |
# | test     | https://www.teja.com | abc@gmail.com | Pass1234 | pass12345        | Your passwords did not match                   |
# | test     | 12345                | abc@gmail.com | Pass1234 | Pass1234         | You must provide a valid web address           |
# | test     | 12345                | abc@gmail.com | Pass1234 | Pass1234         | You must provide at least one job interest.    |