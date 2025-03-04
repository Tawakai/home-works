package kz.kaznu.amir.HW8;

import java.util.ArrayList;

public class EmployeeMethods {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Peter", 45));
        employees.add(new Employee("Lois", 41));
        employees.add(new Employee("Meg", 18));
        employees.add(new Employee("Chris", 14));
        employees.add(new Employee("Stewie", 1));
        employees.add(new Employee("Brian", 6));
        System.out.println(getTheirNames(employees));
        System.out.println(findOldEnough(employees, 15));
        System.out.println(areTheyOldEnough(employees, 20));
        System.out.println(findYoungestEmployee(employees));
    }


    public static ArrayList<String> getTheirNames (ArrayList<Employee> employees) {
        ArrayList<String> names = new ArrayList<>();
        for (Employee employee : employees) {
            names.add(employee.getName());
        }
        return names;
    }


    public static ArrayList<String> findOldEnough (ArrayList<Employee> employees, int minAge) {
        ArrayList<String> names = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getAge()>=minAge) {
                names.add(employee.getName());
            }
        }
        return names;
    }


    public static boolean areTheyOldEnough (ArrayList<Employee> employees, int minAverageAge) {
        int ageOfAll = 0;
        for (Employee employee : employees) {
            ageOfAll += employee.getAge();
        }
        int averageAge = ageOfAll/employees.size();
        return averageAge>=minAverageAge;
    }


    public static String findYoungestEmployee (ArrayList<Employee> employees) {
        Employee youngest = employees.get(0);
        for (Employee employee : employees) {
            if (employee.getAge() < youngest.getAge()) {
                youngest = employee;
            }

        }
        return youngest.getName();
    }
}
