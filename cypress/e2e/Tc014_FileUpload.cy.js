


describe("Test for File Upload Scenario",()=>{

it("Test for File Upload",()=>{
    cy.visit("https://the-internet.herokuapp.com/upload");
    cy.screenshot("FileUpload.png");
    
    cy.get("#file-upload").selectFile("cypress/fixtures/Appiumsetup.txt");

    //upload
    cy.get("#file-submit").click();

    cy.get("h3").should("have.text","File Uploaded!");

    //print this message in console/runner
cy.get("h3").then(($ele)=>{

    cy.log("Text is: "+$ele.text())
})

})



})