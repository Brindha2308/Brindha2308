Feature: LeafTaps login functionality

Scenario: Login with appropriate credential
Given Enter user name as 'Demosalesmanager'
And Enter password as 'crmsfa'
When Click on login button
Then Homepage should displayed
