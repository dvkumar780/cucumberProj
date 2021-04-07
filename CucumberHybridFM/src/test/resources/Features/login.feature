Feature: Login page Feature

Scenario: Login page title
Given user is on login page
When user gets the title page
Then page title should be "Login - My Store"

Scenario: Login with valid credentials
When user login to the app
Then validate logged in user