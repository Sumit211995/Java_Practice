public class StringPool {
    public static void main(String[] args) {
        String a = "Hello".intern();
        String b = "Hello".intern();
        String c = new String("Hello").intern();
        System.out.println(a == b);
        System.out.println(a == c);
        Ref.mainRef();
    }
}
 class Ref {// extends Object {
    public static void mainRef() {
        Ref ref = new Ref(); // new is a keyword , to allocate a memory for object
        System.out.println(ref); // ref.toString()
        System.out.println(ref.toString());
        String name = "Amit";
        System.out.println(name); // name.toString()
        System.out.println(name.toString());

        String a = "Java"; // String Literal
        String b = "Java";
        String c = new String("Java");
        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(b == c);

        String r = "Amit";
        String m = "Amit";
        System.out.println("******************************");
        System.out.println(name == r);
        System.out.println(name == m);
        System.out.println(m == r);
        name = "Ram";
        System.out.println(name);
        System.out.println("After Change");
        System.out.println(name == r);
        System.out.println(name == m);
        System.out.println(m == r);

    }
}