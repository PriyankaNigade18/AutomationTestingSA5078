/*
1. open application
----------------------
cy.visit()

2.To get the title
----------------------
cy.title()

3.To get the url
--------------------
cy.url()

To print any message in Cypress use
----------------------------------
cy.log()

Assertion
----------------- 
Using assertion we can validate certain state of application
-In cypress two types of assertion is available
1.Implicit (Inbuilt)
---------------
should()
and()

2.Explicit 
-------------
Explicit assertion is possibe in cypress using cypress variable
assert()
expect()



*/


describe("Test for Google app assertion",()=>{

it("Test for Google title assertion",()=>{

    //open application
    cy.visit("https://www.google.com");

   let appTitle=cy.title();
   cy.log("Application title: "+appTitle);

   cy.log("Application title is: "+cy.title());

   //assert the title
   cy.title().should("eq","google");//Timed out retrying after 4000ms: expected 'Google' to equal 'google'
   cy.log("Title is validated!");
   
  
})

it("Test for google url validation",()=>{

    cy.visit("https://www.google.com/");

    cy.log("Application url is: "+cy.url());//to print cypress variables required

    //assert
    //exact match: eq
    cy.url().should("eq","https://www.google.com/");
    cy.log("Url matched!");

    //for partial match include
    cy.url().should("include","google");
    cy.log("Partial url matched!");

})



})

