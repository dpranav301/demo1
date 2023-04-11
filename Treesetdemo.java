import java.util.TreeSet;

class Employee implements Comparable {
    private int empid;
    private String empname;

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public Employee(int empid, String empname) {
        this.empid = empid;
        this.empname = empname;
    }

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee [empid=" + empid + ", empname=" + empname + "]";
    }

    @Override
    public int compareTo(Object o) {
        Employee x = (Employee) o;
        return this.empid - x.empid;
    }

}

public class Treesetdemo {
    public static void main(String[] args) {
        TreeSet<Employee> ts = new TreeSet<>();

        ts.add(new Employee(1, "ABC"));
        ts.add(new Employee(2, "PQR"));
        ts.add(new Employee(3, "XYZ"));
        System.out.println(ts);

    }

}
