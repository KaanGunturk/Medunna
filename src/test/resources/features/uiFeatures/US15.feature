@UIyasemin15
Feature: US15 Create or Edit Patient by just Admin and Validate with API

  @TC01501
  Scenario Outline: TC01501 New patients can only be created by admin
    Given yyLaunch web browser and navigate to the home page
    And yyClick Account Menu dropbox sign and click Sign In Text
    And yyClick User Name textbox and enter admin user name "<AdminUsername>"
    And yyClick Password textbox and enter admin password "<AdminPassword>"
    And yyClick Sign In button
    And yyClick Items&Titles button and Patient from dropdown box
    And yyClick Create a new Patient button
    And yyFill in or select these informations "<firstname>","<lastname>","<birthdate>","<email>","<phone>","<address>","<description>"
    Then yyVerify the new patient was created by admin successfully Toast Container


    Examples:
      |AdminUsername       |AdminPassword  |firstname|lastname|birthdate|email                       |phone       |    address             |description    |
      |healthprojectteam54 |AiGAYmJSJp.EN98 |Yasemin  |Patient |18/11/1991|yasemin.aktoprak91@gmail.com|100-200-3000|1232 Sandia ave. Fremont|Yasemin Patient|

  @TC01502
  Scenario Outline: TC01502 - Admin can see patient's all information such as; SSN, First Name, Last Name, Birth Date,Phone, Gender, Blood Group, Address, Description, Created Date, User, Country and state / City

    Given yyLaunch web browser and navigate to the home page
    And yyClick Account Menu dropbox sign and click Sign In Text
    And yyClick User Name textbox and enter admin user name "<AdminUsername>"
    And yyClick Password textbox and enter admin password "<AdminPassword>"
    And yyClick Sign In button
    Given yyClick Items&Titles button and select Patient from dropdown box
    And yySelect id of any patient and click
    Then yyVerify admin can see patient SSN
    Then yyVerify admin can see patient First Name and Last Name
    Then yyVerify admin can see patient Birth Date and Phone
    Then yyVerify admin can see patient Gender and Blood Group
    Then yyVerify admin can see patient Address and Description
    Then yyVerify admin can see patient Created Date and User
    Then yyVerify admin can see patient Country and State City

    Examples: Test Data
      |AdminUsername          |AdminPassword|
      |healthprojectteam54    |AiGAYmJSJp.EN98      |

  @TC01503
  Scenario Outline: TC01503 - When creating or updating patient data, you have above items and following new item;  id.
  Also Only admin can assign patient their doctor.
    Given yyLaunch web browser and navigate to the home page
    And yyClick Account Menu dropbox sign and click Sign In Text
    And yyClick User Name textbox and enter admin user name "<AdminUsername>"
    And yyClick Password textbox and enter admin password "<AdminPassword>"
    And yyClick Sign In button
    Given yyClick Items&Titles and click Patients
    And yyClick Created Date and click first patient's ID number which is new created patient
    Then yyVerify it has correct ID which is same with new created patient's id number
    And yyClick Edit button, Enter a new data to Description and save
    Then yyVerify admin can not assign patient to a doctor. Negative test BUG there is not a Doctor Assign web element
    And yyClick Items&Titles and click Patients
    And yyClick Created Date and click first patient's ID number
    Then yyVerify ID is correct

    Examples: Test Data
      |AdminUsername          |AdminPassword|
      |healthprojectteam54    |AiGAYmJSJp.EN98      |


  Scenario Outline: TC01504 - State should be provided country as USA and cannot be blank

    Given yyLaunch web browser and navigate to the home page
    And yyClick Account Menu dropbox sign and click Sign In Text
    And yyClick User Name textbox and enter admin user name "<AdminUsername>"
    And yyClick Password textbox and enter admin password "<AdminPassword>"
    And yyClick Sign In button
    Given yyClick Items&Titles button and select Patient from dropdown box
    And yyClick Created Date and select first id which is new created patient
    Then yyVerify Country is selected USA
    Then yyVerify Country data is not blank
    Examples: Test Data
      |AdminUsername          |AdminPassword|
      |healthprojectteam54    |AiGAYmJSJp.EN98      |

  Scenario Outline:  TC01505 - Admin can delete any patient

    Given yyLaunch web browser and navigate to the home page
    And yyClick Account Menu dropbox sign and click Sign In Text
    And yyClick User Name textbox and enter admin user name "<AdminUsername>"
    And yyClick Password textbox and enter admin password "<AdminPassword>"
    And yyClick Sign In button
    Given yyClick Items&Titles button and select Patient from dropdown box
    And yyClick Created Date and click first patient's ID number which is new created patient yenimethod
    And yyClick Delete button and click Delete button on the alert
    Then yyVerify if you get a successful deleted message

    Examples: Test Data
      |AdminUsername          |AdminPassword|
      |healthprojectteam54    |AiGAYmJSJp.EN98      |
