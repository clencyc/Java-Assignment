package OverloadingAndOverriding;

public class MethodOverloading {
    // Overloaded method with one int parameter
    private static void display(int a) {
        System.out.println("Arguments: " + a);
    }

    // Overloaded method with two int parameters
    private static void display(int a, int b) {
        System.out.println("Arguments: " + a + " and " + b);
    }

    // Overloaded method with one double parameter
    private static void display(double a) {
        System.out.println("Arguments: " + a);
    }

    // Overloaded method with one String parameter
    private static void display(String a) {
        System.out.println("Arguments: " + a);
    }

    // Overloaded method with one int and one String parameter
    private static void display(int a, String b) {
        System.out.println("Arguments: " + a + " and " + b);
    }

    // Overloaded method with one String and one int parameter
    private static void display(String a, int b) {
        System.out.println("Arguments: " + a + " and " + b);
    }

    public static void main(String[] args) {
        display(1);
        display(1, 4);
        display(3.14);
        display("Hello");
        display(2, "World");
        display("Java", 8);
    }
}