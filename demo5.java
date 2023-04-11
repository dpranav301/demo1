class a {
  final void method1(int a,int b) {
    System.out.println("super class");
    int d = a+ b;
    System.out.println(d);
  }
}
class b extends a{
   void method1(int a) {
    System.out.println("sub class");
    System.out.println(a);
  }
}
public class demo5 {
  public static void main(String ar[]) {
    b m = new b();
    m.method1(10);
  }
}