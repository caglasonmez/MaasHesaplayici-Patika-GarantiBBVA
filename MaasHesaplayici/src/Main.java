public class Main {

    public static void main(String[] args) {
        Employee employee = new Employee("Çağla Sönmez", 17000, 45, 2015);

        double tax = employee.tax();
        System.out.println("Tax: " + tax);

        double bonus = employee.bonus();
        System.out.println("Bonus: " + bonus);

        employee.raiseSalary();
        System.out.println("Updated Salary: " + employee.getSalary());

        System.out.println(employee.toString());
    }
}