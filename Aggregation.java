import java.util.ArrayList;
import java.util.List;

class Person {
    private String name;
    private List<Mobile> numbers;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Mobile> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<Mobile> numbers) {
        this.numbers = numbers;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", numbers=" + numbers + "]";
    }

}

class Mobile {
    private String mobile_no;

    public String getMobile_no() {
        return mobile_no;
    }

    public void setMobile_no(String mobile_no) {
        this.mobile_no = mobile_no;
    }

    @Override
    public String toString() {
        return "Mobile [mobile_no=" + mobile_no + "]";
    }

}

public class Aggregation {

    public static void main(String[] args) {

        Person p1 = new Person();
        p1.setName("Pranav");
        Mobile m1 = new Mobile();
        m1.setMobile_no("12345");
        Mobile m2 = new Mobile();
        m2.setMobile_no("23456");

        List<Mobile> al = new ArrayList<>();
        al.add(m1);
        al.add(m2);

        p1.setNumbers(al);

        System.out.println("The mobile number of person is=" + p1.getNumbers());

    }
}
