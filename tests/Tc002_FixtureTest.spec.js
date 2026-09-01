


import {test,expect, chromium} from "@playwright/test";



test("test for page fixture",async({page})=>{

   await page.goto("https://www.google.com");
   console.log("Application title is: "+await page.title());
   

})


test("Test for browser-->context--->page",async({})=>{

    //start new chrome browser
    let browser=await chromium.launch({headless:false,channel:'chrome'});
    
    //newContext():Creates a new browser context. It won't share cookies/cache with other browser contexts.
    //open new context for chrome browser
    let context1=await browser.newContext();
     let context2=await browser.newContext();

    //context1-->page1 newPage():Creates a new page in the browser context.
    let page1=await context1.newPage();
    
    //to open new tab(page2)
    let page2=await context1.newPage();

    //context2--->page3
    let page3=await context2.newPage();

    //page1--->app
    await page1.goto("https://www.google.com");
    //page2--->app
    await page2.goto("https://www.facebook.com");

    //page3-->app
    await page3.goto("https://www.amazon.com");


    await page1.waitForTimeout(4000);

})


//api testing
test.only("Test for GET request",async({request})=>{

let response=await request.get("https://restful-booker.herokuapp.com/booking");

console.log("status code: "+response.status());//code

//json response
let jsonReasponse=await response.json();
console.log(jsonReasponse);



})