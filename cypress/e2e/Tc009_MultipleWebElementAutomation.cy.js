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

----------------------------------------------
To automate multiple webelements use each()

Syntax
--------------
cy.get("locator").each(($variableName)=>{

    cy.wrap($variableName).click();

    })
   


*/





describe("Test for Multiple WebElement automation",()=>{

it("Test for Google scenario",()=>{

cy.visit("https://www.google.com/");

cy.get("textarea[name='q']").type("Jenkins");

//ul[role='listbox']>li div[role='option']>div[role='presentation']
cy.get("ul[role='listbox']>li  div.pcTkSc div[role='option']").each(($option)=>{

    cy.log("Option is: "+$option.text());
})


})

it("Test for footer links",()=>{

    cy.visit("https://tutorialsninja.com/demo/index.php?route=account/login");


    cy.get("footer a").each(($links)=>{

        cy.log("Link Text is: "+$links.text());
        let text=$links.text();
        if(text.includes("Gift Certificates"))
        {
            //click
            cy.wrap($links).click();
        }

    })
})

it.only("Test for list",()=>{

    cy.visit("https://tutorialsninja.com/demo/index.php?route=account/login");

    cy.get("div.list-group>a").each(($option)=>{

        let optionText=$option.text();
        cy.log("Option text is: "+optionText);

        if(optionText.includes("Forgotten Password"))
        {
            //click
            cy.wrap($option).click();
        }


    })
    
})


})






