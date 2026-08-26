//https://docs.cypress.io/api/cypress-api/catalog-of-events

describe("Test for Alerts",()=>{

it("Test for Simple alert",()=>{

//event call for validation
cy.on("window:alert",(popup)=>{

    expect(popup).to.equals("I am a JS Alert");

})


    cy.visit("https://the-internet.herokuapp.com/javascript_alerts");

    cy.get("button").first().click();
    //cypress will automatically accept the alert

    //assertion
    cy.get("#result").should("have.text","You successfully clicked an alert");
    cy.log("Simple alert handled!");
})

it("Test for confirmation alert with cypress base behavior",()=>{
    cy.visit("https://the-internet.herokuapp.com/javascript_alerts");

    cy.get("button").eq(1).click();
    //alert will appear and accept by cypress

    //assertion
    cy.get("#result").should("have.text","You clicked: Ok");
    cy.log('cypress auto accepted alert!');


})


it("Test for confirmation alert with cancel",()=>{

cy.on("window:confirm",()=>false);

    cy.visit("https://the-internet.herokuapp.com/javascript_alerts");

    cy.get("button").eq(1).click();
    //alert will appear and clicked on cancel

    //assertion
    cy.get("#result").should("have.text","You clicked: Cancel");
    cy.log('Confirmationalert automated!');


})

it.only("Test for Prompt alert",()=>{



    
    cy.visit("https://the-internet.herokuapp.com/javascript_alerts");


   cy.window().then((win)=>{
    cy.stub(win,"prompt").returns("Hello All");
    })


     cy.get("button").last().click();
     //promp alert will appear

     //assert it
     cy.get("#result").should("have.text","You entered: Hello All");
     cy.log("Prompt alert automated!");

})

})