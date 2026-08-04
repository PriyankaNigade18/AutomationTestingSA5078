/*
Type Casting
================
conversion of one type of data into other type if is compatible.

In Js type casting is applicable for string,number and boolean

1.Type Cocercion(Implicit casting)
=====================
- It is automatic casting of datatypes 
-It is taken case by Js engine
-It is also refered as implicit casting

2.Explicit casting
=======================
- It is manual conversion
- Explicit casting is possible with Js Constructors
Number()
String()
Boolean()


truthy vs falsy values?
==============================
truthy
=============
Any true value in boolean context is called truthy
Examples: any non zero number, non empty string

falsy
============
Any false value in boolean context is falsy value
-In JS 5 falsy values are available

Exmaple: 0,""(empty string),null,NaN,undefined

*/

console.log("======string coercion=========");
/*
if there is expression with number,string ,boolean and + operator is used
with string then other data type(number and boolean ) change its type
to string.

*/

//number/boolean -=====>string

let a="Hello"+100+true;//here 100 and true cocerced into string
console.log(a);//Hello100true
console.log(typeof a);//string

let b=100+30+"50";//here 100+30=130 then 130 cocerced into string
console.log(b);//13050
console.log(typeof b);//string


let c=80+true+20+"100";//80+1=81+20=101+"100" here 101 will cocerced into string
console.log(c);//101100
console.log(typeof c);//string

let d=200+true+"100"+false;
console.log(d);
console.log(typeof d);

console.log("=========Number coercion============");
/*
if there is expression with number,string,boolean and arithemetic (*,/,-) operators is used
with string then other string and boolean will convert into number
*/

//string/boolean ====>number
//here string is not compatible
console.log("hello"*100);//NaN

let x="100"*10;//here "100" will corced into number 100*10=1000
console.log(x);//1000
console.log(typeof x);//number

let y=100+67+"200"-100;
console.log(y);//167100
console.log(typeof y);//number

let k=90-10*"10";//BODMAS: "10" coerced intio number 10*10=100
//90-100=-10
console.log(k);//-10
console.log(typeof k);//number

let p=200+true+"10"-100-false; 
console.log(p);//20010
console.log(typeof p);//number

console.log("=======Explicit casting============");

let num=190;
console.log(num);//190
console.log(typeof num);//number
//number into string
let numToString=String(num);
console.log(numToString);//190
console.log(typeof numToString);//string

console.log("--------------");

let i="1010";
console.log(typeof i);//string
//string to number
let stringToNum=Number(i);
console.log(stringToNum);//1010
console.log(typeof stringToNum);//number

/*
Scenario:
=============
amount should be less than 10000

*/

let bill="Your total bill is 5000";
//extract only amount from string
let data=bill.split(" ")[4];


//amount will be initially its string

console.log(typeof data);//string
//string to number
let amount=Number(data);
console.log(typeof amount);//number
//compare 

if(amount<10000)
{
    console.log("Test Pass....amount matched");
    
}else{
    console.log("Test Fail....amount not matched!");
    
}


console.log("====Boolean conversion======");

/*
truthy vs falsy values?
==============================
truthy
=============
Any true value in boolean context is called truthy
Examples: any non zero number, non empty string

falsy
============
Any false value in boolean context is falsy value
-In JS 5 falsy values are available

Exmaple: 0,""(empty string),null,NaN,undefined
*/

console.log(Boolean("Jay"));//true
console.log(Boolean(100));//true
console.log(Boolean(28.44));//true
console.log(Boolean(-89));//true
console.log(Boolean('A'));//true
console.log(Boolean(" "));//true

console.log("-------------");

console.log(Boolean(""));//false

console.log(Boolean(0));//false

console.log(Boolean(null));//false


console.log(Boolean(undefined));//false

console.log(Boolean(NaN));//false

























