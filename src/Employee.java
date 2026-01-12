public class Employee {
    private int baseSalary;
    public int hourlyRate;

    public int calculateWage (int extraHours) {
        return baseSalary + (hourlyRate * extraHours);
    }

    public void setBaseSalary(int baseSalary) {
        if (baseSalary <= 0)
            throw new IllegalArgumentException("Salary cannot be less than or equal to 0");
        this.baseSalary = baseSalary;
    }

    public int getBaseSalary() {
        return baseSalary;
    }
}
