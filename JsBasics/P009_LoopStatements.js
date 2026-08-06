/*
1.for loop
--------------
- When number of iteration are known then use for loop
- Example: Calendar(30/31/28),dropdown with fixed number of options

2.while loop
--------------------
- while loop is entry controlled loop
- When number of iterations are unknown then use while loop
-Example: list with unknown option,Pegination,month selection

3.do-while loop
----------------
-do while loop is exit controlled loop
- when one time execution is expected 


Array/Object
====================
1.for...of loop
--------------------
- for...of loop iterates over values
- this is applicable for string/array

2.for...in loop
----------------
-for...in loop iterates over keys or indexes
- It is applicable for Object



*/


console.log("=====For loop========");

//print hello statement 5 times
for(let i=1;i<=5;i++)
{
console.log("Hello");

}

console.log("-------");
//print 1 to 10 number

for(let i=1;i<=10;i++)
{
    console.log(i);
    
}

console.log("-------");
//10 to 1
for(let i=10;i>=1;i--)
{
    console.log(i);
    
}
console.log("-------");

//by default for loop condition is always true
// for(;;)
// {
//     console.log("hi");
    
// }

//this code will run infinite times

console.log("=======while loop=======");

let i=1;

while(i<=5)
{
    console.log("Hello");
    i++;
    
}


console.log("-------------");
//sum of 100 naturals number 1+2+3+4....+100=5050

let j=1;
let sum=0;
while(j<=100)
{
sum=sum+j;
j++;
}

console.log("Sum of 100 natural numbers : "+sum);

console.log("---------------");
let k=1;
while(k<=10)
{
    console.log("welcome");
    k++;//if this is not available then code will run infinite time
}

console.log("========do while=====");
//one time testing/iteration

let n=1;
do{
    console.log("Hi....");
    n++;
}while(n<=5);


console.log("----------");

let r=1;
do{
    console.log("hi");
    r++;
}while(r>=5);







