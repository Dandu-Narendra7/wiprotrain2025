var employee = [{
        id: 101, name: "Mahesh", salary: 25000.0
    },
    { id: 102, name: "Rajesh", salary: 20100.0 },
    {
        id: 103, name: "Narendra", salary: 20000.0
    }
];
function printEmployees(empList) {
    console.log("Employee List:");
    empList.forEach(function (emp) {
        console.log("ID: ".concat(emp.id, ", Name: ").concat(emp.name, ", Salary: \u20B9").concat(emp.salary));
    });
    return empList.length;
}
var totalEmployees = printEmployees(employee);
console.log("Total Employees: ".concat(totalEmployees));
