


import {test,expect} from "@playwright/test"


//change playwright configuration to msedge
test("Test from playwright configuration",async({page})=>{

    await page.goto("https://www.facebook.com");

    console.log("Current url: "+page.url());
    

    await page.waitForTimeout(2000);

})