public class Comparable2 {
    public static void main(String[] args) {
        {
            Employee e1 = new Employee();
            e1.setId(1);
            e1.setName("Pranav");

            Employee e2 = new Employee();
            e2.setId(1);
            e2.setName("Pranav");

            System.out.println("The shallow copy " + (e1 == e2));
            // System.out.println("The deep copy " + (e1.equals(e2)));

        }
    }
}

class Employee {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
