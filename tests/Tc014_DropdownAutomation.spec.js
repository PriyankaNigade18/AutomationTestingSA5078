

import {test,expect} from "@playwright/test"



test("Test for <select> based dropdown",async({page})=>{

await page.goto("https://formy-project.herokuapp.com/form");

//page scrolldown
// await page.evaluate(()=>{
// window.scrollTo(0,document.body.scrollHeight);
// })

//scroll upto dropdown
await page.getByLabel("Years of experience:").scrollIntoViewIfNeeded();

//visible text
await page.locator("#select-menu").selectOption("10+");

await page.waitForTimeout(1000);

//select by label
await page.locator("#select-menu").selectOption({label:"2-4"});

await page.waitForTimeout(1000);

//select by value
await page.locator("#select-menu").selectOption({value:"1"});
await page.waitForTimeout(1000);

//select by index
await page.locator("#select-menu").selectOption({index:3});


await page.waitForTimeout(3000);
})


test.only("Test for Bootstrap dropdown",async({page})=>{

    await page.goto("https://www.redbus.in/");

    //from
    await page.locator("#srcinput").fill("Pune");

    await page.waitForTimeout(1500);

    let allOptions=await page.locator("div[class^='listHeader']").all();
    console.log("Total options are: "+allOptions.length);

    for(let option of allOptions)
    {
        console.log(await option.innerText());

        if((await option.innerText()).includes("Katraj, Pune"))
        {
            console.log("Expected option found!");
            
            await option.click();
            break;
        }
        
    }
    



await page.waitForTimeout(2000);

})