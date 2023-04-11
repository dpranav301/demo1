import java.util.ArrayList;
import java.util.List;

class Mobile {
    private String mobname;
    private int id;

    public String getMobname() {
        return mobname;
    }

    public void setMobname(String mobname) {
        this.mobname = mobname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Mobile [mobname=" + mobname + ", id=" + id + "]";
    }

}

class MobileStore {
    private String store_name;
    private List<Mobile> product;

    public String getStore_name() {
        return store_name;
    }

    public void setStore_name(String store_name) {
        this.store_name = store_name;
    }

    public List<Mobile> getProduct() {
        return product;
    }

    public void setProduct(List<Mobile> product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "MobileStore [store_name=" + store_name + ", product=" + product + "]";
    }

}

public class Composition {

    public static void main(String[] args) {

        Mobile m1 = new Mobile();

        m1.setId(1);
        m1.setMobname("Nokia");
        Mobile m2 = new Mobile();
        m2.setId(2);
        m2.setMobname("LG");

        List<Mobile> al = new ArrayList<>();
        al.add(m1);
        al.add(m2);

        MobileStore ms = new MobileStore();
        ms.setStore_name("A");
        ms.setProduct(al);

        System.out.println(ms.getStore_name() + " " + ms.getProduct());
    }
}
