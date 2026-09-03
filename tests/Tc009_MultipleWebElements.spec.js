
/*

1. allInnerTexts():Promise<string[]>

2. all():Promise<Locator[]>


*/

import {test,expect} from "@playwright/test";


test("Test for all footer link count using count()",async({page})=>{

//open application
await page.goto("https://tutorialsninja.com/demo/index.php?");

//get the total footer link: count()
let totalLinks=await page.locator("footer a").count();
console.log("Total links are: "+totalLinks);


await page.waitForTimeout(2000);

})


test("Test for Footer links text using allInnerTexts()",async({page})=>{

    await page.goto("https://tutorialsninja.com/demo/index.php?");

    let allLinks=await page.locator("footer a").allInnerTexts();
    console.log("Total Footer links are: "+allLinks.length);
    
    for(let link of allLinks)
    {
        console.log(link);
               
    }

await page.waitForTimeout(2000);
})


test("Test for all() where element action is possible",async({page})=>{

    await page.goto("https://tutorialsninja.com/demo/index.php?");

    let allLinks=await page.locator("footer a").all();
    console.log("Total Footer links are: "+allLinks.length);

    for(let link of allLinks)
    {
        console.log(await link.innerText());
        if((await link.innerText()).includes("Brands"))
        {
            await link.click();
            break;
        }
        
    }


await page.waitForTimeout(2000);


})


test.only("Test for Google search scenario",async({page})=>{

    await page.goto("https://www.google.com/");

   await page.waitForLoadState('domcontentloaded');
    //search
    await page.getByTitle("Search").fill("Jenkins");

    await page.waitForTimeout(1500);

    let allOptions=await page.locator("ul[role='listbox']>li").all();
    console.log("Total options are: "+allOptions.length);

    for(let option of allOptions)
    {
        console.log(await option.innerText());
        
    }
    



})
