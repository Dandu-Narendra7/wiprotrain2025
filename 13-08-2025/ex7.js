let details=[{
     name:"Rajesh", age:20, city:"chennai"
    },
    {name:"mahesh", age:17,city:"Andhra Pradesh"},
    {name:"Rahul",age:25,city:"Tamil Nadu"},
    {name:"Naredra",age:23,city:"Telegana"},

];
// const eligibleToVote = details.filter(person => person.age >= 18);
// console.log("Eligible Voters:");
// eligibleToVote.forEach(person => {
//   console.log(details);
// });

 //Excersise-9
//  for(let i = 0; i < details.length; i++) {
//     if(i.age>=18)
//     {
//         details[i].status="adult";
//     }else
//     {
//         details[i].status= "Minor";
//     }
 
   
//  }
//  console.log(details);
details.map(i)
{
    if(i.age>=18)
    {
        details[i].status="adult";
    }else
    {
        details[i].status= "Minor";
    }
 
}
 console.log(details);

