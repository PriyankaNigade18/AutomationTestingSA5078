


import {test} from "@playwright/test"


//change playwright configuration select Mobile viewPort

test("Test Mobile web application",async({page})=>{

    await page.goto("https://www.saucedemo.com/");

    console.log("Title is: "+await page.title());
    

    await page.waitForTimeout(4000);

})