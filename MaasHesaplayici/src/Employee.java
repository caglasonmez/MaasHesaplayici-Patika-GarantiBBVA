import java.time.Year;
public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee (String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (salary < 1000) {
            return 0;
        } else {
            return salary * 0.03;
        }
    }

    public double bonus() {
        if (workHours > 40) {
            int extraHours = workHours - 40;
            return extraHours * 30;
        } else {
            return 0;
        }
    }

    public void raiseSalary() {
        int yearsWorked = Year.now().getValue() - hireYear;
        if (yearsWorked < 10) {
            salary *= 1.05;
        } else if (yearsWorked >= 10 && yearsWorked < 20) {
            salary *= 1.10;
        } else {
            salary *= 1.15;
        }
    }

    public double getSalary() {
        return salary;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", workHours=" + workHours +
                ", hireYear=" + hireYear +
                '}';
    }

}
