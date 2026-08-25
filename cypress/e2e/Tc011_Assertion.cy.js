
/*
Assertion
===============
To validate current state of the application we use assertions

Cypress support two types of assertion
-------------------------------------------
1.Implicit Assertion(Inbuild assertion)
-------------------------
 1.should()
 2.and(): combine multiple assertions together we use and()+should()

2.Explicit assertion
----------------------------
In Cypress using variable we can use these assertion
assert():TDD
expect():BDD

*/


describe("Test for Assertions types",()=>{

it("Test for Implicit Assertion ",()=>{

    cy.visit("https://tutorialsninja.com/demo/index.php?route=account/login");

    //header should have text Returning Customer
    //have.text: Assert that the text of the first element of the selection is equal to the given text
    cy.get("h2").last().should("have.text","Returning Customer");
    cy.log("Header text is matching!");
    
    //emailId web element

    cy.get("#input-email").should("be.visible");
    cy.log('Element is visible!')
    cy.get("#input-email").should("be.enabled");
    cy.log('Element is Enable!')
    cy.get("#input-email").type("test@gmail.com");

    cy.get("#input-email").should("have.value","test@gmail.com");
 
    cy.log('Element value matched!');

    //and(): help to combine multiple assertions together and+should

    cy.get("#input-email").should("be.visible").and("be.enabled").and("have.value","test@gmail.com");

//footer validation
cy.get("footer a").should("have.length",16);
cy.log("Total footers are 16!");

//login button validate attribute value
cy.get("input.btn-primary").should("have.attr","value");
cy.log("Attribute value is available at Loginbutton!");


})


it("Test for Checkbox Assertion",()=>{
    //checkbox scenario
cy.visit("https://the-internet.herokuapp.com/checkboxes");

//first checkbox should be unchecked
cy.get("input[type='checkbox']").first().should("not.be.checked");

//second checkbox should be checked
cy.get("input[type='checkbox']").last().should("be.checked");

cy.log("Checkbox initial status validated!");

})

it.only("Test for Explicit Assertions",()=>{

cy.visit("https://tutorialsninja.com/demo/index.php?route=account/login");

cy.get("#input-email").type("test2525@gmail.com");

//validate email value
cy.get("#input-email").then(($emailEle)=>{//emailEle is variable

    //get the value : val():current value of the first element 
    let value=$emailEle.val();

    //validate value : should be test2525@gmail.com

    expect(value).eql("test2525@gmail.com");

    assert.equal(value,"test2525@gmail.com");

})




})






})




