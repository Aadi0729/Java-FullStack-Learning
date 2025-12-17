package Day02;

public class Methods {
    public static void main(String[] args) {
        sayHello("Aditya");

        System.out.println("Add: " + add(5, 4));
    }

    private static void sayHello(String name) {
        System.out.println("Hello " + name);
    }

    private static int add(int a, int b) {
        return a + b;
    }
}
