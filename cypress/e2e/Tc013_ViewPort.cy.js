
/*
To simulate behavior of browser window for maximize and minimize we have viewport in cypress
*/

describe("Test for viewport",()=>{

it("Test for browser viewport",()=>{

    cy.visit("https://www.amazon.in/");
    //for full HD screen : cy.viewport(1920, 1080) 
    cy.viewport(1920,1080);


    //smaller size
    cy.viewport(100,100);

    //responsive view
    cy.viewport('iphone-se2');

    //orintation
    cy.viewport('iphone-se2','landscape');

    cy.viewport('iphone-se2','portrait');
})


})