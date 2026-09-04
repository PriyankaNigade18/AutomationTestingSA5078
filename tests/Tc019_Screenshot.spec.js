

import {test,expect} from "@playwright/test";

test("Test for screenshot: ",async({page})=>{

await page.goto("https://www.amazon.in");
await page.waitForTimeout(2000);

await page.screenshot({path:"./screenshot/amazonhomePage.png"})

//full page
await page.screenshot({path:"./screenshot/amazonFullPage.png",fullPage:true})

})


