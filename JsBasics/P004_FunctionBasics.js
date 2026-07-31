/*
1. Function declaration
2. Function Expression
    2.1. Anonymous function: function without name
    2.2. Arrow Function: shorthand function


*/

console.log("----function declaration------");

function test1()
{
    console.log("This is function declaration calling....");
    
}


//call
test1();
console.log(typeof test1);//function

console.log("----Anonymous function------");

let test2=function()
            {
            console.log("This is Anonymous function calling....");

            }

//call
test2();
console.log(typeof test2);//function

console.log("----Arrow function------");

let test3=()=>{
            console.log("This is arrow function calling");
            }

//call
test3();
console.log(typeof test3);//function








