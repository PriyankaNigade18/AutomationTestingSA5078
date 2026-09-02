/*
These are the recommended built-in locators.

page.getByRole() to locate by explicit and implicit accessibility attributes.
page.getByText() to locate by text content.
page.getByLabel() to locate a form control by associated label's text.
page.getByPlaceholder() to locate an input by placeholder.

page.getByAltText() to locate an element, usually image, by its text alternative.
page.getByTitle() to locate an element by its title attribute.
page.getByTestId() to locate an element based on its data-testid attribute (other attributes can be configured).
*/

import {test,expect} from "@playwright/test";


test("Test for getByRole()",async({page})=>{

    await page.goto("https://automationplayground.com/crm/");

    //signIn link
    await page.getByRole('link',{name:'Sign In'}).click();


    //email: textbox
    await page.getByRole('textbox',{name:'Enter email'}).fill("test@gmail.com");


    //password
    await page.getByRole('textbox',{name:"Password"}).fill("test123");

    //checkbox
    await page.getByRole('checkbox',{name:"Remember me"}).check();

    //submit
    await page.getByRole("button",{name:'Submit'}).click();



})



test("Test for builtInlocators for Pw",async({page})=>{

await page.goto("https://tutorialsninja.com/demo/index.php?route=account/login");

//email: getByPlaceholder()
await page.getByPlaceholder("E-Mail Address").fill("test2525@gmail.com");

//password:getByLabel()
await page.getByLabel("Password").fill("test123");

//button:getByRole()
await page.getByRole('button',{name:'Login'}).click();

//click on Edit your account information: getByText()
await page.getByText("Edit your account information").click();




await page.waitForTimeout(2000);



})


test("Test for getByAltText() and getByTitle()",async({page})=>{

await page.goto("https://tutorialsninja.com/demo/index.php?");

//image: getByAltText()
await page.getByAltText("MacBook").highlight();

//title="MacBook":getByTitle()
await page.getByTitle("MacBook").click();


await page.waitForTimeout(2000);

})

test.only("Test for getByTestId()",async({page})=>{

    await page.goto("https://testautomationpractice.blogspot.com/p/playwrightpractice.html");


/*
In Pw to get element text use innerText():Promise<string>
*/

    //get the email: data-testid="profile-email" -->getByTestId()
    let emailText=await page.getByTestId('profile-email').innerText();

    console.log("Email is: "+emailText);
    

})