
describe("Test for Mouse Operations",()=>{


    it("Test for Rightclick and doubleclick ",()=>{

    cy.visit("https://demo.guru99.com/test/simple_context_menu.html");

    //right click
    cy.get("span.context-menu-one").rightclick();

    cy.screenshot("Rightclick.png");
    cy.get("ul.context-menu-list>li>span").each(($option)=>{

        if($option.text().includes("Copy"))
        {
            cy.wrap($option).click();
        }
    })

    cy.get("button").dblclick();


    })
})