package university;

import java.util.*;

class Employee2 implements Comparable<Employee2> {
    private int id;
    private String name;

    public Employee2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int compareTo(Employee2 e) {
        return this.id - id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

class EmployeeNameComparator implements Comparator<Employee2> {
    @Override
    public int compare(Employee2 e1, Employee2 e2) {
        return e1.getName().compareTo(e2.getName());
    }
}
