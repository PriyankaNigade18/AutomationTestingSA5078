/*
Xpath
===========
xpath is path of the element from xml or html document

Syntax:
===========
//tagname[@attribute='value']



*/

describe("Test for Xpath Locator",()=>{

    it("Test for Orangehrm login using xpath",()=>{

    //open app
    cy.visit("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

    //username
    cy.xpath("//input[@name='username']").type("Admin");

    //password
    cy.xpath("//input[@type='password']").type("admin123");

    //login
    cy.xpath("//button[@type='submit']").click();



    })
})




