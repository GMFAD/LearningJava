public class Main {
   static void main() {
       int baseSalary = 50_000;
       int overtime = 10;
       int hourly = 20;

       int wage = calculateWage(baseSalary, overtime, hourly);
       System.out.println(wage);
    }

    public static int calculateWage(
            int baseSalary,
            int overtime,
            int hourly
    ) {
       return baseSalary + (overtime * hourly);
    }
}
