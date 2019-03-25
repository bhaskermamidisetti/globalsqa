Feature: Verify the features in Home page in globalsqa website

 
 Scenario: Verify the functionality of Contactus tab
Given User is on the web Page
Then click on the contactus tab 
  And close the browser
 
Scenario: Verify the functionality of Home tab
 Given User is on the web Page
When verify the title of the globalsqa webpage
 
Scenario: Verify the functionality of About Us 
  Given User is on the web Page
 And verify the functionality by click on sub menu our process 
 Then verify the functionality by click on sub menu mission and values
  Then verify the functionality by click on sub menu Reviews
  Then verify the functionality by click on sub menu carrers
  And close the browser
  
 Scenario: Verify the functionality for tab Tester’s Hub
Given User is on the web Page
Then verify the functionality by click on sub menu demotesting
And verify the functionality by click on sub menu AngularJS Protractor practise site
And verify the functionality by click on sub menu sample page test
Then verify the functionality by click on sub menu Flash website
And close the browser 
 
Scenario: Verify the functionality for tab Tester’s Hub and its submenu demotesting site avilable options
  Given User is on the web Page
 And verify the functionality by click on tooltip option avilable under submenu demotesting 
 And verify the functionality by click on AlertBox option avilable under submenu demotesting
 And verify the functionality by click on DatePicker option avilable under submenu demotesting
 And verify the functionality by click on dialogboxes option avilable under submenu demotesting
 And verify the functionality by click on progressbar option avilable under submenu demotesting
  And verify the functionality by click on DragandDrop option avilable under submenu demotesting
  Then verify the functionality by click on DragableBoxes option avilable under submenu demotesting
  And close the browser
  
  Scenario: Verify the functionality for tab Tester’s Hub and its submenu AngularJS Protractor practise site avilable options
  Given User is on the web Page
 And verify the functionality by click on Filter option avilable under AngularJS Protractor practise site 
 And verify the functionality by click on Scrollable option avilable under AngularJS Protractor practise site 
 And verify the functionality by click on MultiForm option avilable under AngularJS Protractor practise site 
 And verify the functionality by click on Webtable option avilable under AngularJS Protractor practise site 
 And verify the functionality by click on RegistrationForm option avilable under AngularJS Protractor practise site 
  And verify the functionality by click on simplecalculator option avilable under AngularJS Protractor practise site  
  Then verify the functionality by click on BankingProject option avilable under AngularJS Protractor practise site 
  And close the browser
  
 
  Scenario: Verify the functionality of all the submenus avilable in Traning tab
  Given User is on the web Page
 And verify the functionality by click on onlinetraining option avilable under Traning tab
 And verify the functionality by click on campustraning option avilable under Traning tab
  Then verify the functionality by click on corporatetraning option avilable under Traning tab
   And close the browser