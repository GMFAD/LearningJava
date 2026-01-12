public class Main {
   static void main() {
       var employee = new Employee();
       employee.baseSalary = 50_000;
       employee.hourlyRate = 20;
       int wage = employee.calculateWage(10);
       System.out.println(wage);
    }
}
