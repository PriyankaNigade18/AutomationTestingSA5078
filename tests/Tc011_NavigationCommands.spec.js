

import {test,expect} from "@playwright/test"



test("Test for Navigation commands in PW",async({page})=>{

//open app
await page.goto("https://www.google.com");
console.log("Title is: "+await page.title());

await expect(page).toHaveTitle("Google");


//open facebook
await page.goto("https://www.facebook.com");
console.log("Title is: "+await page.title());
await expect(page).toHaveTitle("Facebook");

await page.waitForTimeout(1500);
//goback()
await page.goBack();
await expect(page).toHaveTitle("Google");
await page.waitForTimeout(1500);

//goForward()
await page.goForward();
await expect(page).toHaveTitle("Facebook");
await page.waitForTimeout(1500);

//refresh: reload()
await page.reload();

await page.waitForTimeout(2000);

})