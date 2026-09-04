

import {test,expect} from "@playwright/test";


test("Tets for File upload",async({page})=>{

    await page.goto("https://the-internet.herokuapp.com/upload");

    await page.locator("#file-upload").setInputFiles("TestData/Appiumsetup.txt");

    //upload
    await page.locator('#file-submit').click();

    await page.waitForURL("https://the-internet.herokuapp.com/upload");

    //assertion
    await expect(page.getByRole('heading',{name:'File Uploaded!',level:3})).toHaveText("File Uploaded!")

    await page.waitForTimeout(2000);
})