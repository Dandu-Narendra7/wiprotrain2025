interface Employee{
    id: number;
    name: string;
    salary: number;
}
const employee:Employee[]=[{
    id:101,name:"Mahesh",salary:25000.0},
    {id:102,name:"Rajesh",salary:20100.0},
    {
        id:103,name:"Narendra",salary:20000.0}
];
function printEmployees(empList: Employee[]): number {
  console.log("Employee List:");
  empList.forEach(emp => {
    console.log(`ID: ${emp.id}, Name: ${emp.name}, Salary: ₹${emp.salary}`);
  });

  return empList.length;
}

const totalEmployees = printEmployees(employee);
console.log(`Total Employees: ${totalEmployees}`);
