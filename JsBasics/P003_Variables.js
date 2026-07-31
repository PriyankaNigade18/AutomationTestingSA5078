/*
Variable
==========
Name of storage location wher we can store data is called variable

In Js we declare variable using 3 keywords
---------------------------------------
1. var (older/ not recommended to use in Modern Js)
----------------------
Scope: Global +Function 
Redelcaration is allowed
Reassignment is allowed
var is fully hoisted(before declaration we can call it)

Modern Syntax
----------------------
2.let
-----------------
- Scope: Global+Block
- Mutable data we store into let
- Redelaration is not allowed
- Reassignment allowed
-let is not fully hoisted(It declare into TDZ and before
declaration if you call you will error)


3.const  (final keyword in java)
-----------------------------
- Scope: Global+Block
- Immutable data we store into const
- Redelaration is not allowed
- Reassignment is not allowed
-const is not fully hoisted(It declare into TDZ and before
declaration if you call you will error)


Scope:
==========
1.Global
----------------
variable declared inside Js file and we use it anywhere in that file 
we can use within file and inside, outside any function


2.Function 
------------------------
variable declare inside function we can called it within function 
then it is function scope 
-applicable for var type
-It is local scope


3.Block scope
--------------------------
Variable declared inside any if else,switchcase,loop those are block scope
and we can called it inside block only
- applicable for let and const

*/

console.log("-----Global scope-------");
var fname="Shital";
let email="shital@gmail.com";
const location="Us";

console.log("Firstname is: ",fname);
console.log("Email id is: ", email);
console.log("location is: ",location);

//global data from function

function show()
{
    console.log("---Global data calling though function-----");
    
console.log("Firstname is: ",fname);
console.log("Email id is: ", email);
console.log("location is: ",location);
}

//call
show();

console.log('------Function scope-----');

function test1()
{
    //local
    var browserName="Chrome";
    let browserVersion=150;
    const vendorName="Google";

    console.log(browserName);
    console.log(browserVersion);
    console.log(vendorName);
    
      
}

//call
test1();

console.log("---calling outside the function----");
    //console.log(browserName);//ReferenceError: browserName is not defined
    //console.log(browserVersion);//ReferenceError: browserVersion is not defined
    //console.log(vendorName);//ReferenceError: vendorName is not defined

console.log("-----Block scope-----");

if(true)
{
//block scope
let toolName="Playwright";
const vendorName="Microsoft";

console.log(toolName);
console.log(vendorName);


}

//console.log(toolName);//ReferenceError: toolName is not defined
//console.log(vendorName);//ReferenceError: vendorName is not defined

console.log("--------------");

var a=10;
console.log(a);
function test3()
{
    var a=20;
    console.log(a);

    if(true)
    {
        var a=30;
        console.log(a);
        
    }
    console.log(a);
    
    
}
test3();

console.log("----Redeclaration & reassignment----");

//var: Redeclaration and Reassignment allow
var bookName="Let us learn Java";
var bookName="Let us learn python";
var bookName="Let us learn Javascript";
bookName="typescript";
console.log(bookName);

//let : redeclaration not allowed reassignment allowed


let toolName="Selenium";
//let toolName="Selenium";//SyntaxError: Identifier 'toolName' has already been declared

toolName="Playwright";
console.log(toolName);

//const : redeclaration and reassignment not allowed

const pi=3.14;
//const pi=3.14;//SyntaxError: Identifier 'pi' has already been declared
//pi=3.20;//TypeError: Assignment to constant variable.

console.log("----------");


let b=10;
console.log(b);
function test3()
{
    let b=20;
    console.log(b);

    if(true)
    {
        let b=30;
        console.log(b);
        
    }
     b=40;
    console.log(b);
    
    
}
test3();






























