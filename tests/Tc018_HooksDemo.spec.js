

import {test,expect, chromium} from "@playwright/test";

let page;
test.beforeEach(async({})=>{

    let browser=await chromium.launch({headless:false,channel:'msedge'});
    let context=await browser.newContext();
    page=await context.newPage();
    await page.goto("https://www.google.com");

})


test("Test for Google url",async({})=>{

console.log("application Url is: "+page.url());


})


test("Test for Google title",async({})=>{

    
    console.log("application title is: "+ await page.title());


    
})