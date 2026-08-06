/*

break
=========
-break is applicable with switchcase and loop
-break will exit from switch and loop body

continue
===========
-continueis applicable with loop
-continue with skip certain part of code and continue with the execution


return
==========
- return is applicable for functions
- return keyword is used to return some value from function
*/

console.log("-------break------");
for(let i=1;i<=10;i++)
{
    if(i>=5)
    {
        break;
    }else{
        console.log(i);
        
    }
}
console.log("-------continue------");

for(let i=1;i<=10;i++)
{
    if(i===8)
    {
        continue;
    }else{
        console.log(i);
        
    }
}