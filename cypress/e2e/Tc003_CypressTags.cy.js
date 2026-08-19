/*
these tags we can add at test case level and suite level as well
only()
skip()
*/
describe.skip("This is suite for Cypress attribute/tags",()=>{

it.only("Test for crm app title validation",()=>{

    cy.visit("https://automationplayground.com/crm/");
    //assert the title
    cy.title().should("include","Service");
    cy.log("Title matched!");
    
})

it("Test for opencart app title validation",()=>{

    cy.visit("https://tutorialsninja.com/demo/index.php?");
    //assertion
    cy.title().should("eq","Your Store");
    cy.log("Title matched!");
})

it.skip("Test for orangehrm app title validation",()=>{

    cy.visit("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

    //assertion
    cy.title().should("eq","OrangeHRM");
    cy.log("Title matched!");
})

})


//suite 2
describe.only("This is suite2",()=>{
    it("Test for Google app title validation",()=>{

    cy.visit("https://www.google.com");
    //assertion
    cy.title().should("eq","Google");
    cy.log("Title matched!");
})
})