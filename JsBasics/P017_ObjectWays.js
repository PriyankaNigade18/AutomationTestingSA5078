
/*
Object
============
- It is real time entity which has state and behavior
- Object is instance of a class
- In Js Object creates with new keyword

Ways
===========
1.Using Object literal
2.Using class
3.Using constructor Function
4.Using prototype Object.create()

*/
console.log("=============Object Literal=======");



let user={ }
console.log(user);
console.log(typeof user);//Object

let person={
    name:"Sarang",
    location:"Mumbai",
    phno:79890
}

console.log(person);
console.log(typeof person);

//add new property
person.jobRole='QA';

console.log(person);

//existing property
person.phno=888888;

console.log(person);

//delete property
delete person.jobRole;

console.log(person);


console.log("===========Using Class============");



class Employee
{

    id;
    name;

    constructor(id,name)
    {
        this.id=id;
        this.name=name;
    }

    getInfo()
    {
        console.log("Employee id is: "+this.id);
        console.log("Employee name is: "+this.name);
        
     }

}

//object
let emp1=new Employee(111,"Kiran");
emp1.getInfo();

console.log("=========Constructor Function=========");

/*
Constructor function is used to create and initilaize object
*/
function ClassTest(marks,subject)
{
    this.marks=marks;
    this.subject=subject;

    //method
    this.getData=()=>
    {
        console.log("Subject is: "+this.subject);
        console.log("Marks are: "+this.marks);
        
        
    }

}

//object
let t1=new ClassTest(90,"testing");
t1.getData();

console.log("======Prototype based Object=====");

//literal object
let browserTest={
    bname:"Chrome",
    bversion:150
}
//create():Creates an object that has the specified prototype or that has null prototype.
let obj=Object.create(browserTest);
console.log(obj.bname);
console.log(obj.bversion);
















