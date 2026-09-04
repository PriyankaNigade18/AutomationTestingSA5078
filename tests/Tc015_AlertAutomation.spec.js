/*
Dialog automation
--------------------
page.on('dialog') listener must handle the dialog.

By default, dialogs are auto-dismissed by Playwright
1.simple alert
2.confirmation alerts

Alert types
============
1.Simple alert
2.Confirmation alert
3.Prompt alert

Methods
----------------
1.To get the type of alert: type()
2.To get the alert message: message()
3.To simulate OK button action: accept()
4.To simulate cancel button : dismiss()
5.To simulate prompt: accept("prompt")

*/

import {test,expect} from "@playwright/test";
import { log } from "console";

test("Simple alert auto dismiss by PW",async({page})=>{

    await page.goto("https://the-internet.herokuapp.com/javascript_alerts");

    await page.locator("button").first().click();

    //alert will appear and handled by Pw

    //assertion
    await expect(page.locator("#result")).toHaveText("You successfully clicked an alert");
    console.log("Playwright auto dismissed simple alert!");
    
})

test("Simple alert with page.on listener",async({page})=>{

    page.on('dialog',async(alertBox)=>{

        console.log("Type of alert: "+alertBox.type());
        console.log("Alert mesagge is: "+alertBox.message());

        //OK
        await alertBox.accept();
        
        
    })


    await page.goto("https://the-internet.herokuapp.com/javascript_alerts");

    await page.locator("button").first().click();

    //alert will appear and event will triggered to handle it

    //assertion
    await expect(page.locator("#result")).toHaveText("You successfully clicked an alert");
    console.log("Playwright auto dismissed simple alert!");
    
    await page.waitForTimeout(2000);
})


test("Confirmation alert auto dismiss by PW",async({page})=>{

await page.goto("https://the-internet.herokuapp.com/javascript_alerts");

await page.locator("button").nth(1).click();

//alert will appear and handled by Pw ---click on cancel

//assertion
await expect(page.locator("#result")).toHaveText("You clicked: Cancel");

await page.waitForTimeout(2000);

})

test("Confirmation alert by event",async({page})=>{

page.on('dialog',async(alertBox)=>{//alertBox is name of variable

console.log("Type of alert: "+alertBox.type());
console.log("Text of alert: "+alertBox.message());

//cancel
await alertBox.dismiss();

})

await page.goto("https://the-internet.herokuapp.com/javascript_alerts");

await page.locator("button").nth(1).click();

//alert will appear and handled by event

//assertion
await expect(page.locator("#result")).toHaveText("You clicked: Cancel");

await page.waitForTimeout(2000);

})




test.only("Prompt Alert automation",async({page})=>{

page.on('dialog',async(alertBox)=>{

    console.log("Type of alert is: "+alertBox.type());
    console.log("Alert text is: "+alertBox.message());

    //prompt
    await alertBox.accept("Hello All");
    
    
})


await page.goto("https://the-internet.herokuapp.com/javascript_alerts");

await page.locator("button").last().click();

//assertion
await expect(page.locator("#result")).toHaveText("You entered: Hello All");
console.log("Prompt alert handled!");

await page.waitForTimeout(2000);
})


