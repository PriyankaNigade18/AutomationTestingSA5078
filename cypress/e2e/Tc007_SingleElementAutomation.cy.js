

describe("Test for Single WebElement",()=>{


it("Test for Cypress variable for single WebElement",()=>{

    //open application
    cy.visit("https://tutorialsninja.com/demo/index.php?route=account/login");

    //email
    cy.get("#input-email").then(($emailId)=>{

        cy.wrap($emailId).type("test2525@gmail.com");

    })


    //password
    cy.get("#input-password").then(($password)=>{

        cy.wrap($password).type("test123");
    })


    //button
    cy.get("input.btn.btn-primary").then(($loginButton)=>{

        cy.wrap($loginButton).click();
    })


    //assertion
    cy.url().should("include","account");
    cy.log("Login completed and user navigated to account page!");
    


})



})