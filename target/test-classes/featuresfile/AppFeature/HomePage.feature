#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Home Page feature file
Background: 
Given user has already logged on
|username|password|
|8320251548|Amit@0911|

  @tag1
  Scenario: HomePage Title
    Given user is on Homepage
    When user gets Homepage title
    Then HomePage title shold be "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"
    
    Scenario: HomePage Tabs
    Given user is on HomePage
    When user clicks on account name
     When user clicks on searchbar
    When  user clicks on delivery tab
    
    Scenario: HomePage Headerlinks
    Given user is on HomePage
    When user checks all Headerlink
    Then  Header link count Should be "31"
    Scenario: HomePage footerlinks
    Given user is on HomePage
    When user check all footerlink
    Then footer link count should be "21"
    
    
    
    
    
   

  
