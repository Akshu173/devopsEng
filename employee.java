public class employee {
     String name;
     int employeeId;
     double salary;

    public employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: $" + salary);
    }

}
class Program{
    public static void main(String[] args) {
        // Create an employee
        employee employee = new employee("Jane Smith", 456, 60000);
        System.out.println("Employee Details:");
        employee.displayDetails();

       

        
}
}
