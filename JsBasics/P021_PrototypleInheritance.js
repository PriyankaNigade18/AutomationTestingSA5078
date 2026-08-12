

let laptop={
    model:"core",
    name:"HP"
}

let ipad={
    os:"android",
    //__proto__:laptop
}

Object.setPrototypeOf(ipad,laptop);
console.log(ipad);
console.log(laptop);

console.log(ipad.name);
console.log(ipad.model);


// console.log(ipad.__proto__.model);
// console.log(ipad.__proto__.name);


