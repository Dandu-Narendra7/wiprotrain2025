var x=10;
let y=5;
const z=4;
function f1()
{
    console.log(x);
    console.log(y);
    console.log(z);
}
f1();
function f2(){ 
    let y=10;
    console.log(y);
    console.log(x)
    console.log(z);

}
f2();
z=6;
function f3(){
    console.log(y);
    console.log(x)
    console.log(z);

}