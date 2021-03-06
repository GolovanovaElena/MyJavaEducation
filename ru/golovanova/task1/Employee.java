package ru.golovanova.task1;

public class Employee {
    private int id = 0;
    private String firstName;
    private String lastName;
    private int salary = 0;

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getID() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return "'" + firstName +
                " " + lastName + "'";
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualSalary() {
        int annualSalary = 0;
        return annualSalary = salary * 12;
    }

    public int raiseSalary(int percent) {
        int raiseSalary = 0;
        return raiseSalary = salary + salary * percent / 100;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + firstName + '\'' + lastName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
