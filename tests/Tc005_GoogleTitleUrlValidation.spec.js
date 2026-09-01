
/*
Assertion
----------------
To validate current state of application we use assertion

Playwright support two types of assertion
1.Hard assertion
----------------------
If assertion fail test will stop on that line, you will get error
expect()

2.Soft assertion
--------------------
If assertion fail test will continue execution with error
expect.soft()


Note:
---------
Playwright has auto for assertion, means any assertion fail PW will wait for 5sec
and after 5sec you will get assertion error
*/




import {test,expect} from "@playwright/test"

test("Test for google title and url validation",async({page})=>{

    //open application
    await page.goto("https://www.google.com/");

    //title validation: title should match with Google
    //toHaveTitle():Ensures the page has the given title.

    await expect(page).toHaveTitle("Google");//hard assertion
    console.log('Title matched: '+await page.title());
    

    //url validation full match
    //toHaveUrl():Ensures the page is navigated to the given URL.
    await expect(page).toHaveURL("https://www.google.com/");
    console.log("Page URL matched!");
    
    //partial match: pattern matching /partil match/
    await expect(page).toHaveURL(/google/);
    console.log("Url is: "+page.url());
    



})








