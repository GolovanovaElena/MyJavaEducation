package ru.golovanova.Interface;

public class Employee implements Measurable{
    private String name;
    private double salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public double getMeasure() {
        return this.salary;
    }

    @Override
    public double average(Measurable[] objects) {
        double result = 0;
        for (int i = 0; i < objects.length; i++)
            result = result + objects[i].getMeasure();
        return (result / objects.length);
    }

    @Override
    public Measurable largest(Measurable[] objects) {
        int index = 0;
        for (int i = 1; i <objects.length; i++) {
            if (objects[index].getMeasure() < objects[i].getMeasure())
                index = i;
        }
        return objects [index];
    }

    public static void main (String[] args) {
        Employee[] example = new Employee[2];
        example[0] = new Employee("one", 10);
        example[1] = new Employee("two", 15);
        System.out.println("Average function:" + example[0].average(example));
        System.out.println("Largest function:" + ((Employee)example[0].largest(example)).getName());
    }
}
