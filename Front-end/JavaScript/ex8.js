let emplyoee=[
    {name:"mahesh",department:"Manager", Salary:56000},
    {name:"rajesh",department:"Manager", Salary:75000},
    {name:"narendra",department:"developer", Salary:26000},
     {name:"hari",department:"tester", Salary:24000},
];
let totalManagerSalary=emplyoee.filter(emp=>department=="Manager")
.reduce((sum, emp) => sum + emp.salary, 0);
console.log("Total salary drawn by all managers:", totalManagerSalary);

