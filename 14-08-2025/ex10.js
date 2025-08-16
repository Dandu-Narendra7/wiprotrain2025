function sumNumbers(...numbers) {
  return numbers.reduce((total, num) => total + num, 0);
}
console.log(sumNumbers(1, 2, 3));  
