
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

let c=90;
let d=c++;
console.log(c);//91
console.log(d);//90


let i=189;
let j=++i;
console.log(i);//190
console.log(j);//190

let r=49;
let s=r--;
console.log(r);//48
console.log(s);//49

let k=67;
let l=--k;
console.log(k);//66
console.log(l);//66

console.log("====Relational operators======");
/*
Test Data:
c=91,d=90,i=j=190,r=48,k=l=66
*/

console.log("less than <: "+(r<c));//true
console.log("less than equal to: <=: "+(k<=l));//true
console.log(c<=l);//false
console.log("greater than >: "+(i>d));//true
console.log("greater than equal to >=: "+(i>=j));//true
console.log(c>=j);//false
console.log(k!=l);//false
/*
To test equality
========================
1.loose equality
=========================
In loose equality value will automatically cocerced and then compared 
==

2.strict equality
=========================
In strict equality values as it compared no coercion.
===

*/


console.log("100" == 100);//true

console.log("100" === 100);//false

console.log("chrome" === "chrome");//true

console.log("=====Logical Operators======");

/*
c1      c2        &&(AND)       ||(OR)      !(NOT)
true    true        true        true        false
false   true        false       true        true
true    false       false       true        false
false   false       false       false        true

Test Data:
c=91,d=90,i=j=190,r=48,k=l=66

*/

console.log("=====&&=====");
console.log(i===j  && k===l);//true
console.log(d<r && c>d);//false
console.log(r<d && k>c);//false
console.log(j<=l && d>=i);//false

console.log("=====||=====");
console.log(i===j  || k===l);//true
console.log(d<r || c>d);//true
console.log(r<d || k>c);//true
console.log(j<=l || d>=i);//false

console.log("=========!NOT=======");

console.log(c>d);//true
console.log(!(c>d));//false





























































