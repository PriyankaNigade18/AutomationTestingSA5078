/*
Encapsulation:
---------------
Process of binding data and function together in single unit is called Encapsulation

What is Purpose?
---------------------
Data hiding/data security

Real time Example
-------------------
capsule,ATM,password

How to implement in Js
-----------------------------
-hiding data is possible by declaring private data
-In Js we use # before variable to declare private data
-And provide access of data by creating setters and getters public method

setter: set the data
getter: get the data

*/

class Employee
{
    id;
    name;
    //private data in Js
    #salary;

    constructor(id,name)
    {
        this.id=id;
        this.name=name;
    }

    //setter
    setSalary(salary)
    {
    this.#salary=salary;
    }

    //getter
    getSalary()
    {
        return this.#salary;
    }

    getData()
    {
        console.log("Employee id and name: ",this.id+" : "+this.name);
        console.log("Salary is: "+this.#salary);
        
        
    }
}

//Object
let emp1=new Employee(101,"Geeta");

emp1.setSalary(80000);
emp1.getData();

// emp1.#salary=80000;//SyntaxError: Private field '#salary' must be declared in an enclosing class
// console.log(emp1.#salary);











