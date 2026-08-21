

describe("Test for Navigation in Cypress",()=>{


it("Test for Navigation, refresh webpage",()=>{


    cy.visit("https://www.amazon.in/");

    cy.wait(2000);

    cy.title().then((title)=>{
        cy.log("Home page title: "+title)
    })


    //navigate to mobiles page
    cy.contains("Mobiles").click();

    cy.title().then((title)=>{
        cy.log("Mobile page title: "+title)

        cy.wait(1500);

    //refresh mobile page
    cy.reload();

    //go back to home page
    cy.go('back');
    cy.wait(1500);

    //got forward
    cy.go('forward');

    })






})



})