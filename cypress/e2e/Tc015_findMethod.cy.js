

describe("Test for find()",()=>{



it("TestCase for find()",()=>{

cy.visit("https://tutorialsninja.com/demo/index.php?route=account/login");

cy.get("aside>div.list-group").find("a").each(($option)=>{

    cy.log("Text is: "+$option.text());
})



})


})