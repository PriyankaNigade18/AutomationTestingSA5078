/*
first()
------------
Returns locator to the first matching element.

last()
------------
Returns locator to the last matching element.

nth(index)
--------------
eturns locator to the n-th matching element. It's zero based, nth(0) selects the first element.
*/

import {test,expect} from "@playwright/test"


test("Test for multiple checkboxes",async({page})=>{

    await page.goto("https://formy-project.herokuapp.com/form");

    await page.locator("input[type='checkbox']").first().check();

    await page.locator("input[type='checkbox']").nth(1).check();

    await page.locator("input[type='checkbox']").last().check();


    await page.waitForTimeout(2000);
})