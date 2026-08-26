

describe("Test for Select tag and Bootstrap dropdown",()=>{

it("Test for Select tag based dropdown",()=>{

    /*
    For <select> based dropdown we have select()
    we can select options based on visible text,index,value
    */
cy.visit("https://formy-project.herokuapp.com/form");

//select by visible text
cy.get("#select-menu").select('10+');

cy.wait(2000);

//select by value
cy.get("#select-menu").select("2");

cy.wait(2000);

//select by index as per <select> not starting with 0
cy.get("#select-menu").select(3);


})

it.only("Test for boostrap dropdown",()=>{

cy.visit("https://formy-project.herokuapp.com/dropdown");

cy.get("#dropdownMenuButton").click();

cy.get("div.dropdown-menu.show>a").each(($option)=>{


    cy.log("Text is: "+$option.text());

    if($option.text().includes("Radio Button"))
    {
        cy.wrap($option).click();
    }
})



})






})