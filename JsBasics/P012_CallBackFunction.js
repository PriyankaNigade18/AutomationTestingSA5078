/*
Call back function/higher order function
======================================
- When we pass any function itself as a parmater to other function
then it becomes call back function or higher order function

*/

function doGreet(name)
{
console.log("Hello "+name+" Welcome to learn Functions!");

}

//business logic
function greet(name,callBackFun)//here callBackFun is function parameter
{
    //calling
callBackFun(name);
}


//calling
greet("Sumit",doGreet);


console.log("-------------------------------");

function add(a,b)
{
    console.log("Addition is: "+(a+b));
    
}


function sub(a,b)
{
    console.log("Subtraction is: "+(a-b));
    
}

function mul(a,b)
{
    console.log("Multiplication is: "+(a*b));
    
}

function div(a,b)
{
    console.log("Division is: "+(a/b));
    
}

//business logic
function calculator(a,b,callBackFun)
{
callBackFun(a,b);
}


//calling
calculator(100,10,add);
calculator(100,10,mul);
calculator(100,10,sub);
calculator(100,10,div);
//here add,sub,div,mul are called call back functions








