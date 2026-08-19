


/*
suite(describe())--->testcase(it())

Open any website
----------------
cy.visit("url");
*/

 //  /// <reference types="Cypress" />

describe("This is test suite",()=>{

it("This is testcase1: to lauch Google application",()=>{

       cy.visit("https://www.google.com");

})

it("Test for Opencart application",()=>{

    cy.visit("https://tutorialsninja.com/demo/index.php?");
})




})




