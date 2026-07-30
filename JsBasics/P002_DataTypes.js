/*

Variable:
--------------
Variable is name of storage location where we can store data

-In JS we declare variable without any data types
-As Js is dynamically types data types are not required

We declare variable using 3 keywords
---------------------------------------
1.var(older/not recommended)  ModernJs==> 2.let(mutable data)  3. const(immutable data)

Syntax:
-----------
keyword variableName=value

let id=101;
let name="Jay";

DataTypes
-----------------
Datatypes defines what type of data we store into variable
1.Primitive
--------------
1.number
2.string
3.boolean
4.undefined
5.null
After ES6
6.BigInt
7.Symbol

2.Nonprimitive
-----------------------
In Js everything is dynamic object
-Object
-array


typeof operator
=================
To get the datatype for variable where we store data In Js we have typeOf operetor


*/

console.log("======number type===========");
/*
Any number which is positive integer,negative integer , any decimal digit number 
is just number type

*/

let num1=90;
console.log("Number 1 is: "+num1);//90
console.log(typeof num1);//number

let num2=-90;
console.log("Number 2 is:",num2);//-90
console.log(typeof num2);//number

let num3=89.66;
console.log("Number 3 is:"+ num3);
console.log(typeof num3);//number

console.log("======boolean type=======");
/*
boolean type is true or false
*/

let isActive=true;
console.log("Boolean type data: "+isActive);//true
console.log(typeof isActive);//boolean

let isEmployed=false;
console.log("IsEmployed?: "+isEmployed);
console.log(typeof isEmployed);


console.log("====string type======");
/*
-String is primitive data type and String is Dynamic object also
-Collection of characters is String
-String support different methods

We declare string in Js using 3 syntax
---------------------------------------
1. single quote 'hello'
2. double quote "hello"
3. template string `hello` ES6

*/

let fname='H';
console.log("First name is: "+fname);
console.log(typeof fname);//string


const email="hiteshi@gmail.com";
console.log("Email id is: "+email);
console.log(typeof email);//string

//template string
let location=`US`;
console.log("Location is: "+location);
console.log(typeof location);//string


const profile=`My name is Priyanka
 I have completed Masters in Computer Engg, 
I am having over 15 years experience in IT, I am ISTQB certified.`

console.log(profile);

let currentYear=2026;
//When we read variable data into template string use ${variable name}
        
let requestPayload=`{
  "name": "Apple MacBook Pro 16",
  "data": {
    "year": ${currentYear},
    "price": 1849.99,
    "CPU model": "Intel Core i9",
    "Hard disk size": "1 TB"
  }
}`

console.log(requestPayload);

console.log("======undefined type========");

/*
When we declare variable without any value then such variable
default value and type will be undefined
*/

let age;
console.log(age);//undefined
console.log(typeof age);//undefined


console.log("======null type========");
/*
null means unknown value
In Js when we declare variable value as null and then typeof 
that variable will be object type
which is bug in Js


*/

let address=null;
console.log(address);//null
console.log(typeof address);//object


console.log("--------");
//BigInt: add suffix n into number
console.log(Number.MAX_VALUE);//1.7976931348623157e+308

let num4=17976931348623157n;
console.log(typeof num4);//bigint




console.log("=====NonPrimitive========");
/*
Javascript Object
====================
- Any real word entity which has certain state and behaviour
are called object
- In Js Everything is dynamic object
- In Js Object represented with key value pair 
- In Js {} defined Object literal
Ways
==========
1.Object literal
2.Using class (ES6)
3.Using constructor function (ES6)
4.Using Object prototype (create())

*/

//Object literal
let userData={};
console.log(userData);//{}
console.log(typeof userData);//object

//Array is Dynamic object

let id=[];
console.log(id);//[]
console.log(typeof id);//object


console.log("----Object Literal------");

let personData={
    id:101,
    name:"Smita",
    profile:"QA",
    location:"Us"
}

console.log(personData);
console.log(typeof personData);

/*
To read properties of Object we used
1.dot notation objectname.key
2.bracket notation objectname["key"]
*/

console.log(personData.name);
console.log(personData["id"]);

//modify existing key value
personData.id=2020;

console.log(personData);




console.log("--------------------");

//Symbol type is used to store uniquely any property of object
//NA in Automation

let pid=Symbol("id");
console.log(typeof pid);//symbol


let empData={
    [pid]:1010,
    name:"kiran"
}

console.log(empData);//{ name: 'kiran', [Symbol(id)]: 1010 }

empData.pid=2020;

console.log(empData);//{ name: 'kiran', pid: 2020, [Symbol(id)]: 1010 }























































