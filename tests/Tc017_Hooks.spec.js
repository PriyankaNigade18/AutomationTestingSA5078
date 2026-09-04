/*
Hooks are usefull for Define some preconditions and postconditions for test case
test.beforeAll()

test.afterAll()

test.beforeEach()

test.afterEach()



Groups/Suite
----------------
test.describe("suite",()=>{
    test()

    test()

    test()
    
    
    })
*/

import {test,expect} from "@playwright/test";


test.describe.serial("Test fof hooks : suite1",()=>{

//hooks

test.beforeAll(()=>{
    console.log("beforeAll executes one time before all the test cases");
    
})


test.afterAll(()=>{
    console.log("afterAll executes one time after all the test cases");
    
})

test.beforeEach(()=>{
    console.log("beforeEach executes before every test case");
    
})

test.afterEach(()=>{
    console.log("afterEach executes after every test case");
    
})


test("Test case 1: User registration process",async({page})=>{

console.log("User registaration is completed!");


})


test("Test case 2: User Login process",async({page})=>{

console.log("User Login is completed!");


})


test("Test case 3: User search process",async({page})=>{

console.log("User search  is completed!");


})




})










