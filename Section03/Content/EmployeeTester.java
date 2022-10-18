package Section03.Content;

public class EmployeeTester {

    public static void main(String[] args) {

        Employee firstEmployee = new Employee("Nur Inayah",5000000.00);
        System.out.println(firstEmployee.getName());
        System.out.println(firstEmployee.getSalary());
        firstEmployee.raiseSalary(10);
        System.out.println(firstEmployee.getName());
        System.out.println(firstEmployee.getSalary());
    }

}
