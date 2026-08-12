/*

Inheritance
================
Aquring properties of one class into another class is possible with the inheritance

What is Purpose
================
-To avoid code duplication
- for Reusability
- To achieve run time polymorphism

Real Time Example
=================
Parent and child relation

Types
===========
1.Single level
2.Multilevel
3.Heirarchical

In Js we use extends keyword

*/

class Vehical
{
    breakFeature()
    {
        console.log("Vehical.....break()");
        
    }
}

class Car extends Vehical//multilevel
{

    price()
    {
        console.log("Car.....1L");
        
    }

    start()
    {
        console.log("Car....start()");
        
    }

    refule()
    {
        console.log("Car....refule()");
        
    }

    stop()
    {
        console.log("Car....stop()");
        
    }
}

class BMW extends Car //single level
{
    autoEngine()
    {
        console.log("BMW......autoEngine()");
        
    }

     price()
    {
        console.log("BMW.....50L");
        
    }
}

class Audi extends Car //Hierarchical
{
    autoGear()
    {
        console.log("Audi....autoGear()");
        
    }
     price()
    {
        console.log("audi.....70L");
        
    }
}

//object
//parent class object
let c1=new Car();
c1.start();//individual 
c1.refule();//individual 
c1.stop();//individual 
c1.breakFeature();//inherited
c1.price();

console.log("---------");

//child class object
let b1=new BMW();
b1.autoEngine();//individual
b1.start();//inherited
b1.refule();//inherited
b1.stop();//inherited
b1.breakFeature();
b1.price();

console.log("---------");
//audi class object

let a1=new Audi();
a1.autoGear();//individual
a1.start();//inherited
a1.stop();//inherited
a1.refule();//inherited
a1.breakFeature();
a1.price();











