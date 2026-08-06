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
