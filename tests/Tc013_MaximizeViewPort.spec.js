
import {test} from "@playwright/test";


test("test For maximize viewport",async({page})=>{

const size = await page.evaluate(() => ({
    width: window.screen.availWidth,
    height: window.screen.availHeight
}));

await page.setViewportSize(size);

await page.goto("https://www.google.com");

})