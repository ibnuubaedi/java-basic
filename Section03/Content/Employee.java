package Section03.Content;

/**
 * Detail data employee
 */
public class Employee {

    /**
     * Name of employee.
     */
    private String name;

    /**
     * Salary of employee.
     */
    private double salary;

    /**
     * Construct data employee with name employee and current salary.
     */
    public Employee(String nameEmployee, double currentSalary){
        this.name = nameEmployee;
        this.salary = currentSalary;
    }

    /**
     * Get employee name.
     * @return
     */
    public String getName(){
        return this.name;
    }

    /**
     * Get employee salary.
     * @return
     */
    public double getSalary(){
        return this.salary;
    }

    /**
     * Raise salary employee,
     * @param byPercent from current salary.
     */
    public void raiseSalary(double byPercent){
        double raise = this.salary * byPercent / 100;
        this.salary = this.salary + raise;
    }

}
