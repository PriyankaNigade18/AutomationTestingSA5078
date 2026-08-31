
/*
1.open application
page.goto("url")

2.To get title of application
title():Promise<string>

3.to get current page url
url():string

 */

//start/open playwright test runner

import {test,expect} from "@playwright/test"

test("Test for launch Google application",async({page})=>{

await page.goto("https://www.google.com");

//get the title and store it ,print
let appTitle=await page.title();
console.log("Application title is: "+appTitle);


//get the current url and print
let appUrl=page.url();
console.log("Application current url is: "+appUrl);

})