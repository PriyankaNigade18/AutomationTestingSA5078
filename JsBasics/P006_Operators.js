
/*
1.Arithemetic Operators
-------------------------------
+,-,*,/,%
2.Unary Operators
--------------------------
++  --
3.Relational Operators
------------------------------
>,>=,<,<= !=(not equal)

loose equality
==  
Here type of variable value will automatically coerced(type will convert) and then
compared 

strict equality
===
Here as it is value get compared  and it is recommended

4.Logical operators
------------------------
&&(AND) ||(OR) !(NOT)

*/


console.log("-----Arithemetic operators--------");

let a=100, b=20;

console.log(a+b);//120
console.log("Addition is: "+a+b);//Addition is: 10020
console.log("Addition is: "+(a+b));//Addition is: 120
console.log("Subtraction is: "+(a-b));
console.log("Multiplication is: "+(a*b));
console.log("Division is: "+(a/b));
console.log("Modulus is: "+(a%b));

console.log("----Interview Question-----");

console.log(90/0);//Infinity
console.log(-90/0);//-Infinity
console.log("Hello"/2);//NaN(Not a number)
console.log(0/5);//0
console.log(undefined/3);//NaN

console.log(Number(null));//0
console.log(Number(true));//1
console.log(Number(false));//0
console.log(Number(undefined));//NaN

console.log(null/3);//0

console.log(0/0);//NaN

console.log("------Unary Operators------");
/*
Increement ++
-------------------
1.preIncrement ++a a=a+1; 
-----------------------
value will increment first and then used

2.postIncrement a++ a=a+1
--------------------------------
value will used first and then increment

Decrement --
------------------------
1.predecrement --a   a=a-1
---------------------------------
value will decrement first and then used 

2.postdecrement a--  a=a-1
------------------------------------
value will used first and then decrement

*/

//post increment
let x=100;
console.log(x);//100
console.log(x++);//100
console.log(x);//101


//preIncrement
let y=200;
console.log(y);//200
console.log(++y);//201

//predecrement
let z=90;
console.log(z);//90
console.log(--z);//89

//postdecrement
let w=180;
console.log(w);//180
console.log(w--);//180
console.log(w);//179



























