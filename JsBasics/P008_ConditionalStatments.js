/*
Conditional statement
==========================
1.simple If: one true condition
2.If-else: true/false
3.Ladder if: multiple conditions
4.Nested If: multiple conditions
5.SwitchCase:multiple conditions
*/

console.log("----------Simple if-------------");
//validate current year

console.log("Program started....");

let year=2027;

if(year===2026)
{
    console.log("Valid year...Current year is: "+year);
    
}

console.log("Program ends....");
/*
Url should not be null
Url must contains https protocol

String equality
====================
For string equality we use ===
For string partial match: includes()

*/
//Url must contains https protocol
let actUrl="https://www.google.com";

if(actUrl.includes("https")||actUrl.includes("http"))
{
    console.log("Url is valid");
    
}

console.log("----------IfElse---------");

//validate number is even or odd

let num=25;

if(num%2===0)
{
    console.log(num+" is even number");
    
}else{
    console.log(num+" is odd number");
    
}

console.log("--------------");
//let actUrl="https://www.google.com";
let expUrl="https://www.google.com";

if(actUrl===expUrl)
{
    console.log("Url matched...."+actUrl);
    
}else{
    console.log("Url is not matched!");
    
}

console.log("----------LadderIf---------");
//greater of equality between number
let a=100,b=500,c=400;

if(a>b && a>c)
{
    console.log(a+" is greater than "+b+" & "+c);
    
}else if(b>a && b>c)
{
    console.log(b+" is greater than "+a+" & "+c);
}else if(a===b && b===c)
{
    console.log("All numbers are equal!");
    
}else{
        console.log(c+" is greater than "+a+" & "+b);

}

console.log("------------------");

//browser scenario
let bname="chrome".toLowerCase().trim();

if(bname==="chrome")
{
    console.log("Test case is executing on chrome!");
    
}else if(bname==="edge")
{
        console.log("Test case is executing on edge!");

}else if(bname==="firefox")
{
    console.log("Test case is executing on Firefox!");

}
else{
    console.log("Wrong choice!");
    
}

console.log("----Nested if---------");

/*
score >=90===>A
score >=95===>A++
otherwise B grade
*/

let score=93;

if(score>=90)
{
    if(score>=95)
    {
        console.log("A++");
        
    }else{
        console.log("A");
        
    }

}else{
console.log("B");

}


console.log("=======Switch Case======");
/*
key === value

*/
let num1=10,num2=5;
let operator="/";

switch (operator) {
    case"+" :
        console.log("Addition is: "+(num1+num2));
        break;
    case"-" :
        console.log("Sutraction is: "+(num1-num2));
        break;
    case"*" :
        console.log("Multiplication is: "+(num1*num2));
        break;
    case"/" :
        console.log("Division is: "+(num1/num2));
        break;
    case"%" :
        console.log("Modulus is: "+(num1%num2));
        break;
    default:
    console.log("Wrong operator!");
        
        break;
}






















