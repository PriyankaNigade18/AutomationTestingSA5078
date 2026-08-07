/*
Array is Dynamic data structure or Object
Array can store any type of data/object

Types:
-----------
1.single dimensional(1D)
2.Multi dimensional(2D)


Iteration
==============
1.simple for loop
2.for...of loop

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

let a1=[];
console.log(a1);//[]
console.log(typeof a1);//object

console.log("-------Single D array------------");


let arr=[10,20,30,40,50];
console.log("Total elements are: "+arr.length);//5
console.log(arr);//[10,20,30,40,50]
//how to retrieve single entry from array
console.log(arr[3]);//40

//wrong index:undefined
console.log(arr[9]);//undefined


console.log("-------Multi D array------------");

let userData=[
    ["Admin","admin123"],
    ["Kiran","test123"],
    ["Abhi","abhi123"],
    ["Geeta","geeta123"]
]

console.log("Total rows are: "+userData.length);//4
console.log("Total columns are: "+userData[0].length);//2
console.log(userData);

//single entry
console.log(userData[2][0]);//Abhi

console.log(userData[3][2]);//undefined

console.log("---------------------------");

//mix type data
let data=[1234,"Sarang","pune",'A',89.867];
console.log(data);

let location=["Pune","Delhi","Mumbai"];
console.log(location);

console.log("---------------Itearation------------");

console.log("====simple for loop====");

for(let i=0;i<location.length;i++)
{
    console.log(location[i]);
    
}

console.log("====for of loop====");
//iterates over values
for(let i of location)
{
    console.log(i);
    
}
console.log("====for in loop====");
//Iterate over indexes
for(let i in location)
{
    console.log(i);
    
}

console.log("=======");

for(let i in location)
{
    console.log("at index: "+i+" value is: "+location[i]);
    
}





