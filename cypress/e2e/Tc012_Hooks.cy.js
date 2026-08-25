
describe("Test for Cypress Hooks",()=>{

    before(()=>{
        cy.log("BeforeHook will run only one time before all test cases!")
    })

    after(()=>{
        cy.log("AfterHook will execute one time after all test cases!")
    })

    beforeEach(()=>{
    cy.log("BeforeEach hook will execute before every testcase");
    cy.visit("https://automationplayground.com/crm/");
    //print the url
        cy.url().then((appUrl)=>{
            cy.log("AppUrl: "+appUrl);
        })
    })

    afterEach(()=>{
        cy.log("AfterEach hook will execute after every testcase");

//print the title
        cy.title().then((appTitle)=>{
            cy.log("AppTitle: "+appTitle);
        })

    })

    it("Test for signIn link validation",()=>{

        //cy.visit("https://automationplayground.com/crm/");
        cy.get("#SignIn").should("be.visible").click();
        cy.log("Link is validated!");

    })

    it("Test for CRM login",()=>{
        //cy.visit("https://automationplayground.com/crm/");
        cy.get("#SignIn").click();
        cy.get("#email-id").type("test@gmail.com");
        cy.get("#password").type("test1232");
        cy.get("#submit-id").click();

    })


})
