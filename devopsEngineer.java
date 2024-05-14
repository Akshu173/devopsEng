
public class devopsEngineer extends employee {
    float bonus;

   public devopsEngineer(String name, int employeeId, double salary, float bonus) {
       super(name, employeeId, salary);
       this.bonus = bonus;
   }

   @Override
   public void displayDetails() {
       System.out.println("Employee Name: " + getName());
       System.out.println("Employee ID: " + getEmployeeId());
       System.out.println("Salary: $" + getSalary());
       System.out.println("Bonus: $" + bonus);
       System.out.println("Total Salary: $" + (getSalary() + bonus));
   }
}
