import java.util.ArrayList;
import java.util.List;

class Mobile {
    private String mobileno;

    public String getMobileno() {
        return mobileno;
    }

    public void setMobileno(String mobileno) {
        this.mobileno = mobileno;
    }

    @Override
    public String toString() {
        return "Mobile [mobileno=" + mobileno + "]";
    }

}

class Person {
    private String name;
    List<Mobile> mob_no;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Mobile> getMob_no() {
        return mob_no;
    }

    public void setMob_no(List<Mobile> mob_no) {
        this.mob_no = mob_no;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", mob_no=" + mob_no + "]";
    }

}

public class AbstractionDemo {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("ABC");

        Mobile m1 = new Mobile();
        m1.setMobileno("1234");
        Mobile m2 = new Mobile();
        m2.setMobileno("3456");
        List<Mobile> al = new ArrayList<>();
        al.add(m1);
        al.add(m2);
        p1.setMob_no(al);

        System.out.println(p1);
    }
}
