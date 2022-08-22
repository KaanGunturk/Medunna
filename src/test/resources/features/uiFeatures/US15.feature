@UIyasemin15
Feature: US_15 - Create or Edit Patient by just Admin and Validate with API

  @TC01501
  Scenario Outline: TC01501 - New patients can only be created by admin
    Given Launch web browser and navigate to the home page
    And Click Account Menu dropbox sign and click Sign In Text
    And Click User Name textbox and enter admin user name "<AdminUsername>"
    And Click Password textbox and enter admin password "<AdminPassword>"
    And Click Sign In button
    And Click Items&Titles button and Patient from dropdown box
    And Click Create a new Patient button
    And Fill in or select these informations "<firstname>","<lastname>","<birthdate>","<email>","<phone>","<address>","<description>"
    Then Verify the new patient was created by admin successfully Toast Container


    Examples:
      |AdminUsername       |AdminPassword  |firstname|lastname|birthdate|email                       |phone       |    address             |description    |
      |healthprojectteam54 |AiGAYmJSJp.EN98 |Yasemin  |Patient |18/11/1991|yasemin.aktoprak91@gmail.com|100-200-3000|1232 Sandia ave. Fremont|Yasemin Patient|

  @TC01502
  Scenario Outline: TC01502 - Admin can see patient's all information such as; SSN, First Name, Last Name, Birth Date,Phone, Gender, Blood Group, Address, Description, Created Date, User, Country and state / City

    Given Launch web browser and navigate to the home page
    And Click Account Menu dropbox sign and click Sign In Text
    And Click User Name textbox and enter admin user name "<AdminUsername>"
    And Click Password textbox and enter admin password "<AdminPassword>"
    And Click Sign In button
    Given Click Items&Titles button and select Patient from dropdown box
    And Select id of any patient and click
    Then Verify admin can see patient SSN
    Then Verify admin can see patient First Name and Last Name
    Then Verify admin can see patient Birth Date and Phone
    Then Verify admin can see patient Gender and Blood Group
    Then Verify admin can see patient Address and Description
    Then Verify admin can see patient Created Date and User
    Then Verify admin can see patient Country and State City

    Examples: Test Data
      |AdminUsername          |AdminPassword|
      |healthprojectteam54    |AiGAYmJSJp.EN98      |

  @TC01503
  Scenario Outline: TC01503 - When creating or updating patient data, you have above items and following new item;  id.
  Also Only admin can assign patient their doctor.
    Given Launch web browser and navigate to the home page
    And Click Account Menu dropbox sign and click Sign In Text
    And Click User Name textbox and enter admin user name "<AdminUsername>"
    And Click Password textbox and enter admin password "<AdminPassword>"
    And Click Sign In button
    Given Click Items&Titles and click Patients
    And Click Created Date and click first patient's ID number which is new created patient
    Then Verify it has correct ID which is same with new created patient's id number
    And Click Edit button, Enter a new data to Description and save
    Then Verify admin can not assign patient to a doctor. Negative test BUG there is not a Doctor Assign web element
    And Click Items&Titles and click Patients
    And Click Created Date and click first patient's ID number
    Then Verify ID is correct

    Examples: Test Data
      |AdminUsername          |AdminPassword|
      |healthprojectteam54    |AiGAYmJSJp.EN98      |


  Scenario Outline: TC01504 - State should be provided country as USA and cannot be blank

    Given Launch web browser and navigate to the home page
    And Click Account Menu dropbox sign and click Sign In Text
    And Click User Name textbox and enter admin user name "<AdminUsername>"
    And Click Password textbox and enter admin password "<AdminPassword>"
    And Click Sign In button
    Given Click Items&Titles button and select Patient from dropdown box
    And Click Created Date and select first id which is new created patient
    Then Verify Country is selected USA
    Then Verify Country data is not blank
    Examples: Test Data
      |AdminUsername          |AdminPassword|
      |healthprojectteam54    |AiGAYmJSJp.EN98      |

  Scenario Outline:  TC01505 - Admin can delete any patient

    Given Launch web browser and navigate to the home page
    And Click Account Menu dropbox sign and click Sign In Text
    And Click User Name textbox and enter admin user name "<AdminUsername>"
    And Click Password textbox and enter admin password "<AdminPassword>"
    And Click Sign In button
    Given Click Items&Titles button and select Patient from dropdown box
    And Click Created Date and click first patient's ID number which is new created patient
    And Click Delete button and click Delete button on the alert
    Then Verify if you get a successful deleted message

    Examples: Test Data
      |AdminUsername          |AdminPassword|
      |healthprojectteam54    |AiGAYmJSJp.EN98      |
