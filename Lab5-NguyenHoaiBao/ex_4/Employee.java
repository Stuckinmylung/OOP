package lab_5.ex_4;

public class Employee {
    private int id, salary;
    private String firstName, lastName;

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.salary = salary;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return this.getFirstName() + " " + this.getLastName();
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualSalary() {
        return this.salary * 12;
    }

    public int raiseSalary(int percent) {
        this.setSalary((int) (this.salary * (1 + percent / 100.0)));
        return this.salary;
    }

    @Override
    public String toString() {
        return "Employee[id = " + id + " , name = " + getName() + " , salary = " + salary + "]";
    }
}
