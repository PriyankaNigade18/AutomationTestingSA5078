/*
Class
==========
- class is collection of similar types of Object
- Class is template or  blueprint to store properties of Object(data/method)

Object
============
- It is real time entity which has state and behavior
- Object is instance of a class
- In Js Object creates with new keyword

Constructor
==============
- Constructor is Special method suse dto initialize Object
- constructor get execute/run at the time of creation of object
- Js allows only one constructor
- constructor overloding is not supported

this keyword
==============
- this keyword use to refer current class object


In Js functions and methods are different
--------------------------------
In class we declare method
function can be become method but method can not become function

getData()
{

}



*/







class StudentData
{

    //public data
     id;
     sname;
     address;

     //private data #variableName
     #phno;

     //constructor
     constructor(id,sname,address,phno)//local data
     {
        this.id=id;
        this.sname=sname;
        this.address=address;
        this.#phno=phno;

     }

     /*//SyntaxError: A class may only have one constructor
     constructor(id,name)
     {
        this.id=id;
        this.sname=name;

     }*/

     //Method

     getData()
     {
        console.log("Student Detail is: ",this.sname,this.id,this.address,this.#phno);
        
     }


}

//object

const s1=new StudentData(101,"Sarang","Pune",8909809);
s1.getData();

let s2=new StudentData(201,"Pooja");
s2.getData();








