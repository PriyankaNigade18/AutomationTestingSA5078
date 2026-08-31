

//synchronus: One task at a time
for(let i=1;i<=5;i++)
{
    console.log(i);
    
}

console.log("----------");

/*Asynchronous: 
some task required extra time to finish , but Js code does not required to wait till that 
task complete, it will execute all task

*/
console.log("Program started.....");

setTimeout(() => {
    console.log("Waiting for 3seconds");
    
},3000);

console.log("Program ends.....");

console.log("-----------------------");



// let apiResponse=fetch("https://api.restful-api.dev/collections");
// console.log(apiResponse);//Promise { <pending> }

/*
Promise
---------------
Promise is Js Object which has certain value
It has 3 states
1.pending
2.resolve
3.reject

If any method retruns promise then in Js we handle promise 
with asynchrouns method and using await keyword

which method is called asynchronus method?
-------------------------------------
-Method design with async keyword is asynchronus method
-method automatically return promise and it can
handle asynchrous task
- await is keywrod which will wait for that task to finish 
so before method which returns promise you can add await
*/

//solution

async function testAPI()
{
let apiResponse=await fetch("https://api.restful-api.dev/collections");
console.log(apiResponse);
}

//call
testAPI();





