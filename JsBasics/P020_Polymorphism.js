/*

Polymorphism
==================
One thing we can reuse in multiple form that is polymorphism

What is purpose:
--------------------
- Method Reusability

Real time examples
--------------------------
-Payment gateways/ola/uber/swiggy

Types
============
1.Compile time polymophism(Method Overloading)
-----------------------------
In Js we donthave any compilation phase and that is a reason 
method overloading/compile time polymorphism not supported in Js

What is Method overloading
=============================
Method can be overloaded only when same name method declare in same
class multiple time with different signature

what is different signature
-----------------------
1.Number of parameters
2. type of parameters
3.Change order of parameters


Runtime polymorphism
============================
- classes must be in Is-A
- if we declare same name method with signature in both 
parent and child classes the child class override parent class method

*/


class App{

login()
{
    console.log("Login with default credentials");
    
}

login(un,psw)
{
    console.log("Login with username: "+un+" & password: "+psw);
    
}

login(otp)
{
console.log("Login with otp:"+otp);

}

}

//object
let a1=new App();
a1.login("Parag","test123");


console.log("---------------");



function print()
{
    console.log("Hello");
    
}



// function print(msg)//SyntaxError: Identifier 'print' has already been declared
// {
//     console.log(msg);
    
// }



print();

console.log("==================");

class Parent
{
    color()
    {
        console.log("Blue...");
        
    }
}

class Child extends Parent
{
    color()
    {
        console.log("Yellow...");
        
    }
}


//object
let ch=new Child();
ch.color(); //yellow


let p1=new Parent();
p1.color();//blue