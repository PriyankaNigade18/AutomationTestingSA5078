/*
Assertion
----------------
To validate current state of application we use assertion

Playwright support two types of assertion
1.Hard assertion
----------------------
If assertion fail test will stop on that line, you will get error
expect()

2.Soft assertion
--------------------
If assertion fail test will continue execution with error
expect.soft()


Note:
---------
Playwright has auto for assertion, means any assertion fail PW will wait for 5sec
and after 5sec you will get assertion error
*/


import {test,expect} from "@playwright/test";


test("Test for Hard assertion",async({page})=>{

await page.goto("https://tutorialsninja.com/demo/index.php?route=account/login");

let heading1=await page.getByRole('heading',{name:"Returning Customer",level:2}).innerText();

//asertion test heading text
expect(heading1).toBe("Returning Customer");

await expect(page.getByRole('heading',{name:"Returning Customer",level:2})).toHaveText("Returning Customer");
console.log("Heading text matched!: "+heading1);


//title assertion
await expect(page).toHaveTitle("Account Login");
console.log("Application title matched..."+await page.title());

//url assertion
await expect(page).toHaveURL("https://tutorialsninja.com/demo/index.php?route=account/login");
await expect(page).toHaveURL(/tutorialsninja/);
console.log("App url matched!");


//elements
let emailEle=page.getByPlaceholder("E-Mail Address");
if(await emailEle.isVisible() && await emailEle.isEditable() && await emailEle.isEnabled())
{
    //action
    emailEle.fill('jay20@gmail.com');

}


//assert value
await expect(emailEle).toHaveValue("jay20@gmail.com");
console.log("Email value is matched!");



await page.waitForTimeout(2000);

})


test("Test for Soft assertion",async({page})=>{

await page.goto("https://tutorialsninja.com/demo/index.php?route=account/login");

let heading1=await page.getByRole('heading',{name:"Returning Customer",level:2}).innerText();

//asertion test heading text
expect.soft(heading1).toBe("Returning Customer");

await expect.soft(page.getByRole('heading',{name:"Returning Customer",level:2})).toHaveText("Returning Customer");
console.log("Heading text matched!: "+heading1);


//title assertion
await expect.soft(page).toHaveTitle("Account Login$$");
console.log("Application title matched..."+await page.title());

//url assertion
await expect.soft(page).toHaveURL("https://tutorialsninja.com/demo/index.php?route=account/login");
await expect.soft(page).toHaveURL(/tutorialsninja/);
console.log("App url matched!");


//elements
let emailEle=page.getByPlaceholder("E-Mail Address");
if(await emailEle.isVisible() && await emailEle.isEditable() && await emailEle.isEnabled())
{
    //action
    emailEle.fill('jay20@gmail.com');

}


//assert value
await expect.soft(emailEle).toHaveValue("jay20@gmail.com");
console.log("Email value is matched!");



await page.waitForTimeout(2000);

})


test.only("Test for checkbox current status assertion",async({page})=>{

await page.goto("https://the-internet.herokuapp.com/checkboxes");

//checkbox 1 should not be checked
let checkbox1=page.locator("input[type='checkbox']").first();
await expect(checkbox1).not.toBeChecked();


//checkbox 2 should be checked
let checkbox2=page.locator("input[type='checkbox']").last();
await expect(checkbox2).toBeChecked();


await page.waitForTimeout(2000);
})






