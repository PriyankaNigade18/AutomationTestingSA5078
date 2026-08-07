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

ArrayMethods
==================
//insert data
push()
unshift()
//remove data
shift()
pop()

splice()
map()
*/

let color=["red","blue","orange","pink"];
console.log(color);
console.log("Total colors: "+color.length);

//push():Appends new elements to the end of an array, and returns the new length of the array.

color.push("Black");
console.log(color);


//unshift():Inserts new elements at the start of an array, and returns the new length of the array.
color.unshift("white");
console.log(color);

//pop():Removes the last element from an array and returns it. If the array is empty, undefined is returned and the array is not modified.
let removeColor1=color.pop();
console.log(removeColor1);
console.log(color);

//shift():Removes the first element from an array and returns it. If the array is empty, undefined is returned and the array is not modified.
let removeColor2=color.shift();
console.log(removeColor2);
console.log(color);
console.log("----------------------");


/*
To insert/delete from inbetween element: splice() 

splice(starting index,delete count,insertelementname);

Removes elements from an array and, if necessary, inserts new elements in their place, returning the deleted elements.

*/

console.log(color);//[ 'red', 'blue', 'orange', 'pink' ]
               //index    0        1        2       3


//scenario1: start with 2 delete 1 color / delete Orange color

let deletedColor1=color.splice(2,1);//starts with 2index and delete 1 color
console.log(deletedColor1);//[ 'orange' ]
console.log(color);//[ 'red', 'blue', 'pink' ]

let deletedColor2=color.splice(1,2,"white","black","DarkBlue");
console.log(deletedColor2);//[ 'blue', 'pink' ]
console.log(color);//[ 'red', 'white', 'black', 'DarkBlue' ]

//dont delete 
color.splice(1,0,"pink","blue");
console.log(color);

console.log("============");
//map():tranform the array elememt

let footerLink=['AboutUs','PrivacyPolicy'];

//add for every link prefix value 'amazon'
let result=footerLink.map((link)=>{//link is variable name who represent footerlinks
 return "Amazon"+link;
})

console.log(result);


console.log("===============");

//filter(): filter the element

let ids=[1,2,3,4,5,6,7,8,9,10];
//return all even number

let res=ids.filter((num)=>{
return num%2===0;
})

console.log(res);











