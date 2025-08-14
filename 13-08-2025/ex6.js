let names=["Narendra","jayanth","Mahesh","Rajesh"];
let result= names
  .filter(name => name.length > 5)
  .map(name => name.toUpperCase());
  console.log(result);
