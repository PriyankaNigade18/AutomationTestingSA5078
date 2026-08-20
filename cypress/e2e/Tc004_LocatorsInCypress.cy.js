/*
Locator:
------------
Address of webelement from webpage

Cypress support 3 locator strategies
====================================
1.By default Cypress use cssSelector
---------------------------------
-cssSelector is locator to identify elements based on css properties
-cssSelector can travel in one direction
-cssSelector is faster than xpath

Syntax
==========
1.tagname with id
------------------------
tagname#id

2.tagname with className
---------------------------
tagname.className

3.tagname with attribute
-------------------------
tagname[attribute='value']

4.tagname with id,className,attribute
----------------------------
tagname#id.className[attribute='value']

cssSelector with Special characters/substring match
-----------------------------------------------------
*,^,$
1.contains(*)
------------------
tagname[attribute *='partial value']

2.startsWith(^)
--------------------
tagname[attribute ^='prefix value']


2.endsWith($)
--------------------
tagname[attribute $='suffix value']

parent to child node
------------------------
1. white space
Parentnode childnode......direct +indirect childs we can identify

2.>
parentnode>childnode .....direct child

Css with indexing
-----------------------
parentnode>childNode:nth-child(index)

------------------------------------------------------

2.contains()
------------------
To identify element based on visible test cypress use contains()
cy.contains("visible text");

<span>Visible Text</span>


3.using tagname
-------------------
tagname will help to identify multiple element match
number of inputboxes
Number of images
Number of links

syntax:
-----------------
cy.get(Locator tagname/cssselector)

4.using xpath(depecrated for cypress)

Actions commands
-------------------
textbox,inputbox: type("data")
link,button: click()
checkbox,radiobutton: check() and uncheck()

*/


describe("Test for Locators",()=>{

it("Test for CRM application login and logout functionality",()=>{

    //open application
    cy.visit("https://automationplayground.com/crm/");

    //click on Sign In link: contains()
    cy.contains("Sign In").click();

    //assertion on navigation to next page
    cy.title().should("include","Login");
    cy.log("Title match...User navigated to login page!");

    //login
    //enter email cssselector with id
    cy.get("#email-id").type("test@gmail.com");

    //enter password cssSelector with attribute
    cy.get("input[placeholder='Password']").type("test123");

    //to check the checkbox
    //check():Check checkbox(es) or radio(s). This element must be an <input> with type checkbox or radio.
    cy.get("#remember").check();

    //static wait Pause
    cy.wait(2000);

    //uncheck the checkbox
    cy.get("#remember").uncheck();

    //click on submit:cssselector with classname
    cy.get("button.btn").click();

    //assertion on next pageurl
    cy.url().should("include","customers");
    cy.log("Login Completed! User navigated to customers page!");


})



it.only("Test for Orangehrm login functionality",()=>{

//open application
cy.visit("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

//username
cy.get("input[name='username']").type("Admin");

//password
cy.get("input[name='password']").type("admin123");

//login
cy.get("button[type='submit']").click();




})




})



