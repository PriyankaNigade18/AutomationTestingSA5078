/*

Locator
============
an Address of webelement from the webpge

To automate webelement first we find locator and then we perform operation on those element

Playwright support 3 Locator strategies
------------------------------------------
1.CssSelector
2.Xpath
3.Built In locators

These are the recommended built-in locators.

page.getByRole() to locate by explicit and implicit accessibility attributes.
page.getByText() to locate by text content.
page.getByLabel() to locate a form control by associated label's text.
page.getByPlaceholder() to locate an input by placeholder.
page.getByAltText() to locate an element, usually image, by its text alternative.
page.getByTitle() to locate an element by its title attribute.
page.getByTestId() to locate an element based on its data-testid attribute (other attributes can be configured).


==============================
Working with cssselector and xpath use locator()
page.locator("css/xpath")

For actions
==================
textbox/serachbox--->type text--->fill():Promise<void>
button/link--->click---->click():Promise<void>
checkbox/radiobutton---->check()/uncheck():Promise<void>



*/

 import {test,expect} from "@playwright/test";


 test("Test for Login functionality with CssSelector",async({page})=>{

    await page.goto("https://www.saucedemo.com/");

    //username: css with id
   let usernameEle= page.locator("#user-name");

   //Returns whether the element is visible.
   console.log("Is element visible?: "+await usernameEle.isVisible());
   //Returns whether the element is enabled.
   console.log("Is element enbled?: "+await usernameEle.isEnabled());
   //Returns whether the element is editable.
   console.log("Is element is editable?: "+await usernameEle.isEditable());
   

   await usernameEle.fill("standard_user");

    //password: tagname with attribute
    await page.locator("input[name='password']").fill("secret_sauce");

    //button
    await page.locator("input.submit-button").click();


    await page.waitForTimeout(2000);


 })

test.only("Test for Crm application with css selector",async({page})=>{

//open application
await page.goto("https://automationplayground.com/crm/");

//tagname with id
await page.locator("#SignIn").click();

//email: tagname with attribute
await page.locator("input[name='email-name']").fill("test@gmail.com");

//password: tagname with attribute
await page.locator("input[placeholder='Password']").fill("test123");

//checkbox: check() uncheck()
await page.locator("#remember").check();

//submit: tagname with class
await page.locator("button.btn-primary").click();

//assertion
await expect(page).toHaveTitle("Customers");
console.log("User navigated to customers page!");

await page.waitForTimeout(2000);
})
