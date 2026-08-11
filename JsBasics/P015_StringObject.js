/* 
String is primitive data type and it is an immutable object in Js

*/


let s1="Hello All";
console.log(typeof s1);//string
console.log(s1);//Hello All

//length property: Returns the length of a String object.
console.log("Total characters are: "+s1.length);//9

//Convert string: uppercase/lowercase : toLowerCase() toUpperCase()
console.log(s1.toUpperCase());
console.log(s1.toLowerCase());


/*
String equality
=== strict equality
*/

let s2="Hello All";
console.log(s1 === s2);//true

/*
Partial match/substring match
includes()
*/

let s3="Cypress is webui automation tool";
console.log("search for webui?: "+s3.includes("webui"));//true


//trim(): ignore white space before and after the string
let s4="    welcome all    ";
console.log(s4);
console.log(s4.trim());

//chatAt():string to extract single character as string from string 
let s5="Hello";
console.log(s5.charAt(0));//H
console.log(s5.charAt(4));//o

//replace

let s6="Automation Testing is evolve with Ai Testing"

console.log(s6.replace('e','*'));
console.log(s6.replaceAll('e',"*"));

//split("regular expression")

let tools="Selenium,Appium,Cypress,Playwright,Postman";
console.log(tools);

let allTools=tools.split(",");


for(let i of allTools)
{
    console.log(i);
    
}

console.log(allTools[2]);//Cypress
//OR

let modernTool=tools.split(",")[3];
console.log(modernTool);//Playwright

console.log("------------------");

//validate amount

let bill="Your total amount is 5000";

//extract split()
let data=bill.split(" ")[4];
console.log(data);//5000
console.log(typeof data);//string

//string--->number
let amount=Number(data);
console.log(amount);
console.log(typeof amount);//number

if(amount<10000)
{
    console.log("valid amount!");
    
}

console.log("------------");

let s7="Playwright Automation";
console.log(s7.length);
console.log("Original string is:"+ s7);

let lastIndex=s7.length-1;
let res="";

for(let i=lastIndex;i>=0;i--)
{
    res=res+s7.charAt(i);
}

console.log("Reverse string is: "+res);

































