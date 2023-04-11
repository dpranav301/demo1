import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class ComparableDemo {
    public static void main(String[] args) {
        ArrayList<Employee> al = new ArrayList<>();
        al.add(new Employee(1, "Pranav", 10000));
        al.add(new Employee(2, "Tanveer", 200000));
        al.add(new Employee(3, "Siddhesh", 3000));
        Collections.sort(al, new idComparator());
        System.out.println(al);
        Collections.sort(al, new nameComparator());
        System.out.println(al);
    }

}

// class Employee implements Comparable<Employee> {
// int empid;
// String empname;
// int salary;

// @Override
// public String toString() {
// return "Employee [empid=" + empid + ", empname=" + empname + ", salary=" +
// salary + "]";
// }

// public Employee(int empid, String empname, int salary) {
// this.empid = empid;
// this.empname = empname;
// this.salary = salary;
// }

// @Override
// public int compareTo(Employee o) {
// return this.salary - o.salary;

// }

// }
class Employee {
    int empid;
    String empname;
    int salary;

    @Override
    public String toString() {
        return "Employee [empid=" + empid + ", empname=" + empname + ", salary=" + salary + "]";
    }

    public Employee(int empid, String empname, int salary) {
        this.empid = empid;
        this.empname = empname;
        this.salary = salary;
    }
}

class idComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.salary - o2.salary;
        // throw new UnsupportedOperationException("Unimplemented method 'compare'");
    }

}

class nameComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.empname.compareTo(o2.empname);

    }

}
