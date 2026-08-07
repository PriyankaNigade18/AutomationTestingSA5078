

/*
1. Function declaration
2. Function Expression
    2.1. Anonymous function: function without name
    2.2. Arrow Function: shorthand function

return Keyword
=================
- it returns some value from function
-It returns the value to the calling function
-return statment should be last statement of the function

*/
console.log("-----function declaration without parameter--------");

function test1()
{
    console.log("This is function declaration calling....");
    
}

//call
test1();

console.log("-----function declaration with parameter--------");

/**
 * 
 * @param {number} a 
 * @param {number} b 
 */
function add(a,b)//2 parameters 
{
console.log("Addition is: "+(a+b));

}
//calling
add(10,20);

console.log("-----function declaration with parameter and return keyword--------");


function test2(msg)
{
    return msg;
}


//calling
let res=test2('Playwright is webUi automation framework!');

console.log(res);

//OR

console.log(test2('Playwright is webUi & API automation framework!'));

console.log("-----Anonymous function without parameter--------");

let test3=function()
{
    console.log("This is Anonymous function is calling....");
    
}

//call

test3();
console.log("-----Anonymous function with parameter--------");

/**
 * 
 * @param {number} a 
 * @param {number} b 
 */
let test4=function(a,b)//2 parameters
{
console.log("Multiplication is: "+(a*b));

}

//call
test4(10,20);
test4("hi",10);

console.log("-----Anonymous function with parameter & return keyword--------");


let test5=function(a,b)
{
return a+b;
}


//call
console.log("Addition is:"+test5(100,200));

console.log("----Arrow function without parameter--------");

let test6=()=>{
    console.log("This is arrow function is calling.....");
    
}

//call
test6();

console.log("----Arrow function with parameter--------");

//single parameter: without () bracket we can add parameter
let test7= msg=>{console.log("Message is: "+msg);}

//multiple parameters () required
let test8=(a,b)=>{
console.log("Addition is: "+(a+b));

}

//call
test7("Cypress is webui automation tool....");
test8(100,400);

console.log("----Arrow function with parameter & return statement-------");


let test9=(a,b)=>{
    return a*b;
}


console.log("Multiplication is: "+test9(10,30));

console.log(test9("100",5));

let result=test9(100,30);
console.log(result);












