/*
Xpath
============
-path of element from XML/HTML page
-Xpath identify element from DOM

Types
=========
1.Absolute
2.Relative

operator /indexing
======================

Methods
=============
1.text()
2.normalize-space()
3.contains()
4.starts-with()

Xpath Axies
================


AutoWait
===========
Playwright performs a range of actionability checks on the elements before making actions to ensure these actions behave as expected. 
It auto-waits for all the relevant checks to pass and only then performs the requested action. 

https://playwright.dev/docs/actionability

For all actionable commands 30sec autowait is provided by pW
For assertion 5sec autowait is provided by PW
*/

import {test,expect} from "@playwright/test";

test("Test for Oranghrm login and logout scenario",async({page})=>{

    await page.goto("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

    //username
    await page.locator("//input[@name='username']").fill("Admin");

    //password
    await page.locator("//input[@placeholder='Password']").fill("admin123");

    //login: xpath with contains()
    await page.locator("//button[contains(@class,'orangehrm-login-button')]").click();

    //assertion
    await expect(page).toHaveURL(/dashboard/);
    console.log("Login completed and User Navigated to dashboard page!");
    
    //dropdown
    await page.locator("//i[contains(@class,'oxd-userdropdown-icon')]").click();
    await page.locator("//a[text()='Logout']").click();


await page.waitForTimeout(2000);

})





