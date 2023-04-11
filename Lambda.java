interface A {
    void show();
}

public class Lambda {

    public static void main(String[] args) {
        A a = () -> {

            {
                System.out.println("Hello");
            }
        };
        a.show();
    }
}
