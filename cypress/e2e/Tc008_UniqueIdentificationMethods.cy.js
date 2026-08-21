/*
To identify elements uniquely 
-----------------------------------
first(): Get the first DOM element within a set of DOM elements.
last():Get the last DOM element within a set of DOM elements.
eq(index):Get A DOM element at a specific index in an array of elements.
*/


describe("Test for Uniquly identification of elements",()=>{


    it("Test for radio button scenario",()=>{

        cy.visit("https://www.letskodeit.com/practice");

        //first radio button
        cy.get("input[type='radio']").first().check();

        cy.wait(2000);

        //last radio button
        cy.get("input[type='radio']").last().click();

        cy.wait(2000);

        cy.get("input[type='radio']").eq(1).check();




    })



it.only("Test for checkbox scenario",()=>{

        cy.visit("https://www.letskodeit.com/practice");

        cy.get("div#checkbox-example-div input[type='checkbox']").first().check();

        cy.wait(2000);

         cy.get("div#checkbox-example-div input[type='checkbox']").eq(1).check();

            cy.wait(2000);
            
          cy.get("div#checkbox-example-div input[type='checkbox']").last().check();



    })




})