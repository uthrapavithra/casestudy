Feature: Register Test
Description: User register in the application

Scenario Outline: Register to the application
Given user opens sign up page in testme application
When user enters username as "<username>" 
And user enters firstname as "<firstname>"
And user enters lastname as "<lastname>"
And user enters password as "<password>"
And user enters confirm password as "<conf_password>"
And user enters gender
And user enters email as "<email>"
And user enters mobile number as "<mob>"
And user enters dob as "<dob>"
And user enters address as "<address>"
And user enters security question
And user enters security answer as "<sec_ans>"
And Click submit button
Then verify login success
And close application
   
Examples:

|username|firstname|lastname|password|conf_password|email|mob|dob|address|sec_ans|
|newname|uthra|whales|qwerty|qwerty|merc@gmail.com|1234567890|12-12-1997|perungalathur,chennai|orange|
|shwesam|lalitha|abcdef|password123|password123|lali@gmail.com|2345678901|23-02-1987|coimbatore|red|

