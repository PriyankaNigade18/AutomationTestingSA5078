/*
-JavaScript moves variable declarations to the top of their scope (hoisting)
-Only declarations are hoisted, not initializations
-Hoisting is the behavior where you can able to access variable before even declaring it.
- for var type variable and function declaration it is fully applicable

- modern syntax: let and const , function expression this type of hoisting not allowed 
before declaration if you try to call data then you will get error

By default let and const data always in TDZ Temporal dead zone


*/


test1();

//test2();//ReferenceError: Cannot access 'test2' before initialization
console.log("----variable hoisting----");


console.log(a);//undefined
var a=100;
console.log(a);//100

// console.log(b);//ReferenceError: Cannot access 'b' before initialization
 let b=200;
 console.log(b);//200
 
//console.log(c);//ReferenceError: Cannot access 'c' before initialization
 const c=90;
 console.log(c);//90
 
console.log("--------function hoisting--");


//function declaration
function test1()
{
    console.log("test1 is calling.....");
    
}

//anonymous function
let test2=function()
{
    console.log("test2 is calling.....");
    
}
