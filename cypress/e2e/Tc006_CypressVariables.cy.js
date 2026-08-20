/*

Cypress Variable
======================

-To interact with single element,multiple elements
-To get the title and url and print it inside cypress runner
-For explicit type assertion we need cypress variable

Note:
-------------
then(): title,url,single element,single assertion

each(): multiple webelement automation

To get title and print it
--------------------------------
Syntax:
---------------
cy.title().then((variableName)=>{ //get the title and store it into variable

    cy.log("Application title is: "+variableName)
    })

To get the url and print it in cypress console
------------------------------------------------
cy.url().then((variableName)=>{
    cy.log("Application url is: "+variableName);
    })


   To get any single element from application and store it into variable:$variableName
   - To perform action 
   ------------------
   To get the text of element
   ------------------------------
   text()

   To perform click or type action on element
   --------------------------------------------
    cy.wrap($element).click()
    cy.wrap($element).type("")

   ----------------------------------------------------------------------
   syntax:
   -----------
   cy.get("locator").then(($variableName)=>{

    //get the text
    $variableName.text()

    //click
    cy.wrap($variableName).click()

    })


   


*/


describe("Test for Cypress Variable",()=>{


    it("Test for Title and url of application",()=>{


        //open application
        cy.visit("https://tutorialsninja.com/demo/index.php?route=account/login");

        //get thet title and print it

        cy.title().then((appTitle)=>{ //here appTitle is variable name
            cy.log("Application title is: "+appTitle);
        })

        //To get the url and store and print
        cy.url().then((appUrl)=>{ //here appUrl is variable name
            cy.log("Application url is: "+appUrl);
        })
    })


    it.only("Test for cypress variable for single webelement",()=>{

        cy.visit("https://tutorialsninja.com/demo/index.php?route=account/login");

        cy.get("h2").last().then(($heading)=>{
            cy.log("Heading text is: "+$heading.text());
        })

        //email
        cy.get("#input-email").then(($emailId)=>{

            //click
           cy.wrap($emailId).click();

            //type
            cy.wrap($emailId).type("test2525@gmail.com");


        })
    })

})



