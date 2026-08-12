/*
JSON string--->Js Object: JSON.parse()

Js Object--->JSON String: JSON.stringyfy()

*/

let user={
    id:1010,
    name:"Sarang"
}
console.log(typeof user);//object
console.log(user);


//object--->Json string
//stringify():Converts a JavaScript value to a JavaScript Object Notation (JSON) string.
let jsonString=JSON.stringify(user);
console.log(jsonString);
console.log(typeof jsonString);//string


console.log("------------------");

let payload=`{
  "name": "Apple MacBook Pro 16",
  "data": {
    "year": 2019,
    "price": 1849.99,
    "CPU model": "Intel Core i9",
    "Hard disk size": "1 TB"
  }
}`;
console.log(typeof payload);//string
console.log(payload);

//JsonString====>Js object
//parse():Converts a JavaScript Object Notation (JSON) string into an object.
let jsObject=JSON.parse(payload);
console.log(jsObject);
console.log(typeof jsObject);






