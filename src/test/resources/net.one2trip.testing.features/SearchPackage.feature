
#Author: joselito.and@gmail.com


Feature: Find a Plan in one2trip.net
I as a user want to find a package in one2trip portal


  Scenario: successful search

    Given User enters one2trip site page

    When he is looking for vacation package "Plan Bahamas Hotel Riu Palace Paradise Island ( 3 noches - 4 dias)"

    Then He sees in detail the title "Plan Bahamas Hotel Riu Palace Paradise Island ( 3 noches - 4 dias)"