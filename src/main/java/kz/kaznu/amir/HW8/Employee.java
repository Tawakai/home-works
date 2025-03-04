package kz.kaznu.amir.HW8;

public class Employee {
    private String name;
    private int age;
    public Employee (String name, int age) {
        this.name = name;
        this.age=age;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
}
